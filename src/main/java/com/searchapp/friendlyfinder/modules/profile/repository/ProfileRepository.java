package com.searchapp.friendlyfinder.modules.profile.repository;

import com.searchapp.friendlyfinder.modules.auth.domain.User;

import java.util.Optional;

public interface ProfileRepository {
    Optional<User> findById(Long id);
    User save(User user);
}
