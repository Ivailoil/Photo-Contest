package com.photocontest.photogenic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
public class Photo {

    private Integer id;

    private User user;

    private String photoURL;

    private String title;

    private String story;

    private Integer points;

    private Set<Review> reviews;
}
