package videoclub.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "genero", fetch=FetchType.EAGER)
    private List<Pelicula> peliculas;
    public Genero() {
    }

    public Genero(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Genero(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
