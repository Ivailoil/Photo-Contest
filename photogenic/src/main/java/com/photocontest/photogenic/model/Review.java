package com.photocontest.photogenic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Review {

    private Integer id;

    private User juror;

    private String description;

    private Integer points;

    private boolean isWrongCategory;
}
