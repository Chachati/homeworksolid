package modelo;

import service.EmailOutlook;

import java.util.ArrayList;

public class EstudianteInformatica extends Estudiante{

    public EstudianteInformatica(String nombre, String carrera) {
        super(nombre, carrera);

    }

    @Override
    public Envio EnviarMaterial(Envio envio) {
        envio.material = new ArrayList<>();
        envio.material.add("Computador");
        envio.material.add("Mouse");
        envio.saludoDirector = "Jenny envia saludos";
        return envio;
    }

    @Override
    public String EnviarCarreras() {
        return "Programacion, Arquitectura, Base de datos";
    }

}
