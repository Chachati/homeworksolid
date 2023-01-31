package modelo;

import java.util.ArrayList;

public class EstudianteAdministracion extends Estudiante{
    Envio envio = new Envio();

    public EstudianteAdministracion(String nombre, String carrera) {
        super(nombre, carrera);
    }
    @Override
    public Envio EnviarMaterial(Envio envio) {
        return null;
    }

    @Override
    public String EnviarCarreras() {
        return "Negocios, Administracion I, Historia de la Administracion";
    }

}
