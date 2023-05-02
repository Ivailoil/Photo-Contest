package com.photocontest.photogenic.model;

import com.photocontest.photogenic.model.enums.Phase;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Contest {

    private Integer id;

    private String title;

    private User createdBy;

    private Phase phase;

    private String coverPhotoURL;

    private LocalDateTime phaseOneStart;

    private LocalDateTime phaseOneEnd;

    private LocalDateTime phaseTwoStart;

    private LocalDateTime phaseTwoEnd;

    private Category category;

    private boolean isInvitational;

    private boolean isDeleted;

    private Set<User> jury;

    private Set<User> invitedUsers;

    private Set<User> winners;

    private Set<Photo> photos;
}
