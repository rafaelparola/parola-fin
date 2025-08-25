package org.parolafin.backend.controller;

import lombok.RequiredArgsConstructor;
import org.parolafin.backend.entity.AppUser;
import org.parolafin.backend.service.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/app-user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
class AppUserController {

    private final AppUserService appUserService;


    @PostMapping
    public ResponseEntity<AppUser> createAppUser(@RequestBody AppUser appUser) {
        AppUser saved = appUserService.createAppUser(appUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
