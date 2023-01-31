package service;

import modelo.Envio;
import modelo.Estudiante;
import java.util.ArrayList;

public class EnvioMaterial {

    public void enviarMaterialEstudiante(Estudiante estudiante, EmailOutlook email, Envio envio) {
        email.enviarEmail(estudiante.EnviarMaterial(envio));
    }
}
