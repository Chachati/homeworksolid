package modelo;

public abstract class Estudiante {

    public String nombre;
    public String carrera;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }
    public abstract Envio EnviarMaterial(Envio envio);
    public abstract String EnviarCarreras();

}
