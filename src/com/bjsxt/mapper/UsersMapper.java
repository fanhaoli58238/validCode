package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {
    @Select("select * from users where username=#{username} and password=#{password}")
    Users selByUsersPwd(Users users);
}
