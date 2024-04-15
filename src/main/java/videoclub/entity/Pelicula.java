package videoclub.entity;

import jakarta.persistence.*;

@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int anyo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_genero")
    private Genero genero;
    public Pelicula() {
    }

    public Pelicula(Long id, String nombre, int anyo) {
        this.id = id;
        this.nombre = nombre;
        this.anyo = anyo;
    }

    public Pelicula(String nombre, int anyo) {
        this.nombre = nombre;
        this.anyo = anyo;
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

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString(){
        return "ID: " + id + "\n\t NOMBRE: " + nombre
                + "AÑO: " + anyo;
    }
}
