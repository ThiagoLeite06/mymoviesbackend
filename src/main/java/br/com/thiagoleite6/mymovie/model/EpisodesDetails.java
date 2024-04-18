package br.com.thiagoleite6.mymovie.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EpisodesDetails(@JsonAlias("Title") String title,
                              @JsonAlias("Episode")Integer episode,
                              @JsonAlias("imdbRating")String rating,
                              @JsonAlias("Released")String releaseDate) {
}
