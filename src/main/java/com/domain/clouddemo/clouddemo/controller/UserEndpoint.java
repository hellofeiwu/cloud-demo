package com.domain.clouddemo.clouddemo.controller;

import com.domain.clouddemo.clouddemo.domain.User;
import com.domain.clouddemo.clouddemo.dto.UserDto;
import com.domain.clouddemo.clouddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserEndpoint {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public UserDto create(@RequestBody UserDto userDto) {
        User user = this.userService.create(userDto);
        return (null != user) ? new UserDto(user) : null;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> findAll(Pageable pageable) {
        Page<User> page = userService.getPage(pageable);
        if(null != page) {
            return page.getContent()
                    .stream()
                    .map((user)->{
                        return new UserDto(user);
                    })
                    .collect(Collectors.toList());
        }
        return Collections.EMPTY_LIST;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserDto detail(@PathVariable Long id) {
        User user = this.userService.load(id);
        return (null != user) ? new UserDto(user) : null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public UserDto update(@PathVariable Long id,
                          @RequestBody UserDto userDto) {
        userDto.setId(id);
        User user = this.userService.update(userDto);
        return (null != user) ? new UserDto(user) : null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean delete(@PathVariable Long id) {
        this.userService.delete(id);
        return true;
    }
}
