package main;

import modelo.*;
import service.EmailOutlook;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new EstudianteInformatica("Daniel", "Informatica"),
                new EstudianteAdministracion("Monica", "Administracion"),
                new EstudianteIndustrial("Liliana", "Industrial")
        };
        verMateriasEstudiantes(listadoEstudiantes);
        EnvioMaterial material = new EnvioMaterial();
        material.enviarMaterialEstudiante(new EstudianteInformatica("Daniel", "Informatica"),new EmailOutlook(),new Envio());
    }

    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.printf(estudiante.EnviarCarreras() + "\n");
        }
        //Se utilizo Open/Close
    }
}
