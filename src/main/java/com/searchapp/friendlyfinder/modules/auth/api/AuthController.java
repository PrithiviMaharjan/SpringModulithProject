package com.searchapp.friendlyfinder.modules.auth.api;

import com.searchapp.friendlyfinder.modules.auth.domain.User;
import com.searchapp.friendlyfinder.modules.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
//    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
//        return ResponseEntity.ok(authService.registerUser(user));
        return null;
    }
}
