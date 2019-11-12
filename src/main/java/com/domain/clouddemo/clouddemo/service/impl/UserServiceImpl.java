package com.domain.clouddemo.clouddemo.service.impl;

import com.domain.clouddemo.clouddemo.domain.User;
import com.domain.clouddemo.clouddemo.dto.UserDto;
import com.domain.clouddemo.clouddemo.repository.UserRepository;
import com.domain.clouddemo.clouddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    protected UserRepository userRepository;

    public Page<User> getPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public User load(Long id) {
        return this.userRepository.findOne(id);
    }

    @Transactional
    public User save(UserDto userDto) {
        User user = this.userRepository.findOne(userDto.getId());
        if(null == user) {
            user = new User();
        }
        user.setNickname(userDto.getNickname());
        user.setAvatar(userDto.getAvatar());
        return this.userRepository.save(user);
    }

    @Transactional
    public void delete(Long id) {
        this.userRepository.delete(id);
    }
}
