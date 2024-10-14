package com.luckraw.voltus.mapper;

import com.luckraw.voltus.domain.dtos.UserDTO;
import com.luckraw.voltus.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO map(User user);

    List<UserDTO> map(List<User> users);
}
