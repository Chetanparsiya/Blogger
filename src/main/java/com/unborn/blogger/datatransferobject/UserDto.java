package com.unborn.blogger.datatransferobject;

import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private String about;
}
