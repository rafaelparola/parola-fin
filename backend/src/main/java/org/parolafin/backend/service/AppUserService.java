package org.parolafin.backend.service;

import lombok.RequiredArgsConstructor;
import org.parolafin.backend.entity.AppUser;
import org.parolafin.backend.repository.AppUserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserService {
    private final AppUserRepository appUserRepository;

    public AppUser createAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }
}
