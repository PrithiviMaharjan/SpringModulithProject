package com.searchapp.friendlyfinder.modules.profile.service;

import com.searchapp.friendlyfinder.modules.auth.domain.User;
import java.util.Optional;

public interface ProfileService {
    Optional<User> getUserProfile(Long id);
    User updateUserProfile(User user);
}