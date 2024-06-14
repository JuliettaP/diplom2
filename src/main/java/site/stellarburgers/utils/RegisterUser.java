package site.stellarburgers.utils;

import lombok.Data;

@Data
public class RegisterUser {
    private final String email;
    private final String password;
    private final String name;
}
