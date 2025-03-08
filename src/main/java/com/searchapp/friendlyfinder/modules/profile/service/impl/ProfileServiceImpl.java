package com.searchapp.friendlyfinder.modules.profile.service.impl;

import com.searchapp.friendlyfinder.modules.auth.domain.User;
import com.searchapp.friendlyfinder.modules.profile.repository.ProfileRepository;
import com.searchapp.friendlyfinder.modules.profile.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    @Override
    public Optional<User> getUserProfile(Long id) {
        return profileRepository.findById(id);
    }

    @Override
    public User updateUserProfile(User user) {
        return profileRepository.save(user);
    }
}
