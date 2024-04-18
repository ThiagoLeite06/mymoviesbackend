package br.com.thiagoleite6.mymovie;

import br.com.thiagoleite6.mymovie.model.Serie;
import br.com.thiagoleite6.mymovie.service.IDataConvert;
import br.com.thiagoleite6.mymovie.service.MyMovieService;
import br.com.thiagoleite6.mymovie.service.SeriesDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MymovieApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MymovieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var service = new MyMovieService();
		var json = service.getData("https://www.omdbapi.com/?t=friends&apikey=3dac087c");
		SeriesDTO seriesDto = new SeriesDTO();
		Serie serie = seriesDto.getData(json, Serie.class);
		System.out.println(serie);
	}
}


