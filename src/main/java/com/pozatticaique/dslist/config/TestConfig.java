package com.pozatticaique.dslist.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pozatticaique.dslist.Repositories.BelongingRepository;
import com.pozatticaique.dslist.Repositories.GameListRepository;
import com.pozatticaique.dslist.Repositories.GameRepository;
import com.pozatticaique.dslist.entities.Belonging;
import com.pozatticaique.dslist.entities.Game;
import com.pozatticaique.dslist.entities.GameList;

@Configuration
@Profile("prod")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private BelongingRepository belongingRepository;

	@Override
	public void run(String... args) throws Exception {
		
		 Game g1 = new Game(null,"Mass Effect Trilogy", 2012, "Role-playing (RPG), Shooter", "XBox, Playstation, PC", 4.8, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g2 = new Game(null,"Red Dead Redemption 2", 2018, "Role-playing (RPG), Adventure", "XBox, Playstation, PC", 4.7, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g3 = new Game(null,"The Witcher 3: Wild Hunt", 2014, "Role-playing (RPG), Adventure", "XBox, Playstation, PC", 4.7, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/3.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g4 = new Game(null,"Sekiro: Shadows Die Twice", 2019, "Role-playing (RPG), Adventure", "XBox, Playstation, PC", 3.8, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/4.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g5 = new Game(null,"Ghost of Tsushima", 2012, "Role-playing (RPG), Adventure", "XBox, Playstation, PC", 4.6, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/5.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g6 = new Game(null,"Super Mario World", 1990, "Platform", "Super Ness, PC", 4.7, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/6.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g7 = new Game(null,"Hollow Knight", 2017, "Platform", "XBox, Playstation, PC", 4.6, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/7.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g8 = new Game(null,"Ori and the Blind Forest", 2015, "Platform", "XBox, Playstation, PC", 4.0, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/8.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g9 = new Game(null,"Cuphead", 2017, "Platform", "XBox, Playstation, PC", 4.6, "'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/9.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 Game g10 = new Game(null,"Sonic CD", 1993, "Platform", "Sega CD, PC", 4.0, "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/10.png", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Odit esse officiis corrupti unde repellat non quibusdam! Id nihil itaque ipsum!", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Delectus dolorum illum placeat eligendi, quis maiores veniam. Incidunt dolorum, nisi deleniti dicta odit voluptatem nam provident temporibus reprehenderit blanditiis consectetur tenetur. Dignissimos blanditiis quod corporis iste, aliquid perspiciatis architecto quasi tempore ipsam voluptates ea ad distinctio, sapiente qui, amet quidem culpa.");
		 
		 gameRepository.saveAll(Arrays.asList(g1,g2,g3,g4,g5,g6,g7,g8,g9,g10));
		 
		 GameList gl1 = new GameList(null,"Aventura e RPG");
		 GameList gl2 = new GameList(null,"Jogos de plataforma");
		 
		 gameListRepository.saveAll(Arrays.asList(gl1,gl2));
		 
		 Belonging b1 = new Belonging(g1,gl1,0);
		 Belonging b2 = new Belonging(g2,gl1,1);
		 Belonging b3 = new Belonging(g3,gl1,2);
		 Belonging b4 = new Belonging(g4,gl1,3);
		 Belonging b5 = new Belonging(g5,gl1,4);
		 Belonging b6 = new Belonging(g6,gl2,0);
		 Belonging b7 = new Belonging(g7,gl2,1);
		 Belonging b8 = new Belonging(g8,gl2,2);
		 Belonging b9 = new Belonging(g9,gl2,3);
		 Belonging b10 = new Belonging(g10,gl2,4);
		 
		 belongingRepository.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10));		 
	}

}
