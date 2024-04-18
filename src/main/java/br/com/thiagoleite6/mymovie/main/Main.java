package br.com.thiagoleite6.mymovie.main;

import br.com.thiagoleite6.mymovie.model.Season;
import br.com.thiagoleite6.mymovie.model.Serie;
import br.com.thiagoleite6.mymovie.service.ConverteDados;
import br.com.thiagoleite6.mymovie.service.MyMovieService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Scanner read = new Scanner(System.in);
    private MyMovieService service = new MyMovieService();

    private final String BASE_URL = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=3dac087c";

    ConverteDados conversor = new ConverteDados();

    public void startApp(){
        System.out.println("Digite o nome da série para a busca");
        var serieName = read.nextLine();
        var json = service.getData(BASE_URL + serieName + API_KEY);
        System.out.println(json);

        Serie serie = conversor.getData(json, Serie.class);
        System.out.println(serie);

        List<Season> temporadas = new ArrayList<>();

//		for(int i = 1; i<=dados.totalSeasons(); i++) {
//			json = service.getData("https://www.omdbapi.com/?t=friends&season=" + i + "&apikey=3dac087c");
//			Season season = conversor.getData(json, Season.class);
//			temporadas.add(season);
//		}
//
//        temporadas.forEach(System.out::println);
    }

}
