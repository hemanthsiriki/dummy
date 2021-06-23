package com.cisco.movieapp.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Movie {

    private String id;

    private String title;

    private float rating;

    private String genre;
}
