package com.domain.clouddemo.clouddemo.service;

import com.domain.clouddemo.clouddemo.domain.User;
import com.domain.clouddemo.clouddemo.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    public Page<User> getPage(Pageable pageable);
    public User load(Long id);
    public User save(UserDto userDto);
    public void delete(Long id);
}
