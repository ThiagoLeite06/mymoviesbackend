package br.com.thiagoleite6.mymovie.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Season(@JsonAlias("Season") Integer season,
                     @JsonAlias("Episodes") List<EpisodesDetails> episodes) {

}
