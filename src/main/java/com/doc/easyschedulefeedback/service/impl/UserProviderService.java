package com.doc.easyschedulefeedback.service.impl;

import com.doc.genericarchitecturesecurity.dto.CredentialDTO;
import com.doc.genericarchitecturesecurity.service.IUserProviderService;
import org.springframework.stereotype.Service;

@Service
public class UserProviderService implements IUserProviderService {
    @Override
    public CredentialDTO getCredentialByLogin(String username) {
        return null;
    }

    @Override
    public CredentialDTO getCredentialByEmail(String email) {
        return null;
    }

    @Override
    public void recordLog(CredentialDTO credentialDTO, String action) {

    }
}
