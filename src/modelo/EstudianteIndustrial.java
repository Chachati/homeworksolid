package modelo;

import java.util.ArrayList;

public class EstudianteIndustrial extends Estudiante {
    Envio envio = new Envio();

    public EstudianteIndustrial(String nombre, String carrera) {
        super(nombre, carrera);
    }
    @Override
    public Envio EnviarMaterial(Envio envio) {
        return envio;
    }

    @Override
    public String EnviarCarreras() {
        return "Procesos, Analitica de datos, Gestion de Calidad ";
    }
}
