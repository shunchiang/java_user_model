package com.lambdaschool.usermodel.services;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class UserAuditing implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        String uname;
        uname = "PLACEHOLDER";
        return Optional.of(uname);
    }
}
