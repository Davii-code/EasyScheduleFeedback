package com.doc.easyschedulefeedback;

import com.doc.easyschedulefeedback.entities.Role;
import com.doc.easyschedulefeedback.entities.User;
import com.doc.easyschedulefeedback.entities.UserGroup;
import com.doc.easyschedulefeedback.repository.RoleRepository;
import com.doc.easyschedulefeedback.repository.UserGroupRepository;
import com.doc.easyschedulefeedback.repository.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class AppStartupRunner implements ApplicationRunner{
    private static final Logger LOG = LoggerFactory.getLogger(AppStartupRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserGroupRepository userGroupRepository;

    public void initData() {
        if (userRepository.count() == 0 && roleRepository.count() == 0 && userGroupRepository.count() == 0) {
            List<String> roles = Arrays.asList(
                    "ROLE_USER_CREATE",
                    "ROLE_USER_READ",
                    "ROLE_USER_UPDATE",
                    "ROLE_USER_DELETE",
                    "ROLE_USER_LISTALL",
                    "ROLE_PATIENT_CREATE",
                    "ROLE_PATIENT_READ",
                    "ROLE_PATIENT_UPDATE",
                    "ROLE_PATIENT_DELETE",
                    "ROLE_PATIENT_LISTALL");

            List<Role> roleList = new ArrayList<>();
            for (String role : roles) {
                Role userGroupRole = Role.builder().role(role).build();
                roleList.add(userGroupRole);
            }

            UserGroup userGroup = UserGroup.builder()
                    .name("admin")
                    .roles(roleList)
                    .build();

            User user = User.builder()
                    .name("Administrador")
                    .login("admin")
                    .password("$2y$10$1MgdNcIduZBhvlTym.PKje0nDX54UVS28jTa2U3lB3JvrqAj4fAdq") // Senha == admin
                    .email("teste@gmail.com")
                    .enabled(Boolean.TRUE)
                    .userGroup(userGroup)
                    .build();

            roleRepository.saveAll(roleList);
            userGroupRepository.save(userGroup);
            userRepository.save(user);
        }
    }

    public void run(ApplicationArguments args) {
        try {
            this.initData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
