package videoclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import videoclub.entity.Genero;
import videoclub.entity.Pelicula;
import videoclub.repository.GeneroRepository;
import videoclub.repository.PeliculaRepository;
@SpringBootApplication
public class App implements CommandLineRunner {
    private final PeliculaRepository peliculaRepository;
    private final GeneroRepository generoRepository;
    public App (PeliculaRepository peliculaRepository, GeneroRepository generoRepository){
        this.peliculaRepository = peliculaRepository;
        this.generoRepository = generoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args){
        /*Pelicula titanic = new Pelicula("Titanic",1998);
        peliculaRepository.save(titanic);

        peliculaRepository.findAll().forEach(System.out::println);*/

        Genero horror = new Genero(1L,"HORROR");
        Genero comedia = new Genero(2L,"COMEDIA");
        Genero aventura = new Genero(3L,"AVENTURA");
        Genero romance = new Genero(4L,"ROMANCE");
        Genero drama = new Genero(5L,"DRAMA");
        Genero accion = new Genero(6L,"ACCION");
/*
        generoRepository.save(horror);
        generoRepository.save(comedia);
        generoRepository.save(aventura);
        generoRepository.save(romance);
        generoRepository.save(drama);
        generoRepository.save(accion);

        generoRepository.findAll().forEach(System.out::println);*/

        //Pelicula laListaDeSchindler = new Pelicula("La lista de Schindler",1993,drama);
        //peliculaRepository.save(laListaDeSchindler);
        peliculaRepository.findAll().forEach(System.out::println);
    }
}
