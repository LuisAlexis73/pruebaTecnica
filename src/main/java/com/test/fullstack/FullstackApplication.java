package com.test.fullstack;

import com.test.fullstack.models.News;
import com.test.fullstack.repositories.NewsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class FullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(NewsRepository newsRepository) {

		return (args) -> {
/*			News news1 = new News("Nueva adquisición: SteticABC acaba de anunciar un acuerdo para" +
					"comprar SteticDEF con el objetivo de aumentar su presencia en el mercado alemán. El" +
					"acuerdo se estima en alrededor de 2 millones de euros Lea más en SteticNews o " +
					"NewsDaily","news dealy","Lanzamientos de productos","Portugal", LocalDateTime.now());
			newsRepository.save(news1);*/

/*			News news2 = new News("La empresa Body Health Group abrirá un centro de estética en pleno corazón de la" +
					" ciudad de Buenos Aires, con el que buscara atender a más de 500 personas al día, generando empleo" +
					" en Argentina y luchando contra la economía", "news dealy","Cooperaciones" ,
					"Argentina", LocalDateTime.now());
			newsRepository.save(news2);

			News news3 = new News("La empresa Almalaser ha finalizado operaciones en Argentina, no ha podido continuar con sus labores" +
					"dado que el mercado ha cambiado y no pudo competir con la tecnología que están usando hoy en día los equipos," +
					" quedando atrásen el mercado.", "news dealy", "Compras y Adquicisiones", "Italia", LocalDateTime.now());
			newsRepository.save(news3);*/
		};

	}

}
