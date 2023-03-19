/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ItsSammy.java.controladores.dao;

import ItsSammy.java.controladores.jpaControl.InformacionPacienteJpaController;
import ItsSammy.java.controladores.jpaControl.PacienteJpaController;
import ItsSammy.java.controladores.modelos.InformacionPaciente;
import ItsSammy.java.controladores.modelos.Paciente;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author administrador
 */
public class pacienteDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MedisysPU");
    PacienteJpaController pacienteJpa = new PacienteJpaController(emf);
    InformacionPacienteJpaController infoPacienteJpa = new InformacionPacienteJpaController(emf);
    Paciente paciente = new Paciente();
    InformacionPaciente infoPaciente = new InformacionPaciente();
    String mensaje = "";
    
    public String registrarPaciente (String nombrePaciente, String apellidoPaciente, String cedulaPaciente, String sexoPaciente,
            int edadPaciente, double alturaPaciente, double pesoPaciente, double presionPaciente, String notaPaciente,
            String correoPaciente, Date fechaNacimiento, String numeroTelefono, String direccionPaciente )
    {
        try {
           
            paciente.setIdPaciente(Integer.SIZE);
            paciente.setNombrePaciente(nombrePaciente);
            paciente.setApellidoPaciente(apellidoPaciente);
            paciente.setCedulaPaciente(cedulaPaciente);
            paciente.setSexoPaciente(sexoPaciente);
            paciente.setEdadPaciente(edadPaciente);
            paciente.setAlturaPaciente(alturaPaciente);
            paciente.setPesoPaciente(pesoPaciente);
            paciente.setPresionPaciente(presionPaciente);
            paciente.setNotaPaciente(notaPaciente);
            paciente.setIdInfoPaciente(infoPaciente);
            infoPaciente.setIdInfoPaciente(Integer.SIZE);
            infoPaciente.setCorreoPaciente(correoPaciente);
            infoPaciente.setFechaNacimiento(fechaNacimiento);
            infoPaciente.setNumeroTelefono(numeroTelefono);
            infoPaciente.setDireccionPaciente(direccionPaciente);
            infoPacienteJpa.create(infoPaciente);
            pacienteJpa.create(paciente);
            mensaje = "Se ha registrado correctamente!";
            
            
        } catch (Exception e) 
        {
            mensaje = "ERROR> No se ha registrado el paciente!";
            System.out.println("ERROR>"+ e.getMessage());
            
        }
        return mensaje;
    }
    
}
