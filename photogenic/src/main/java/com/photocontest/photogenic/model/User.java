package com.photocontest.photogenic.model;

import com.photocontest.photogenic.model.enums.Rank;
import com.photocontest.photogenic.model.enums.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private Integer id;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    private boolean isDeleted;

    private UserRole userRole;

    private Rank rank;

    private Integer score;

    private Set<Photo> photos;

}
