package model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType userType;

}
