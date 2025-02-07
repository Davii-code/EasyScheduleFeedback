package com.doc.easyschedulefeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.doc.genericarchitecturesecurity", "com.doc.easyschedulefeedback"})
public class EasyScheduleFeedbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyScheduleFeedbackApplication.class, args);
    }

}
