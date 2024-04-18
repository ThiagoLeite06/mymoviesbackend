package br.com.thiagoleite6.mymovie;

import br.com.thiagoleite6.mymovie.main.Main;
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
		Main main = new Main();
		main.startApp();
	}
}


