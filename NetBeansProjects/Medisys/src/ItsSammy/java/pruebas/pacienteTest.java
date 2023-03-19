/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ItsSammy.java.pruebas;

import ItsSammy.java.controladores.dao.pacienteDao;
import java.util.Date;

/**
 *
 * @author administrador
 */
public class pacienteTest {
    public static void main(String[] args) {
        
        pacienteDao pacienteDao = new pacienteDao();
        String nombrePaciente = "Samuel Luciano";
        String apellidoPaciente = "Beato Flete";
        String cedulaPaciente = "1-234-342-3424";
        String sexoPaciente = "F";
        int edadPaciente = 16;
        double alturaPaciente = 182.5;
        double pesoPaciente = 123;
        double presionPaciente = 88;
        String notaPaciente = "Tiene buena salud!";
        String correoPaciente = "";
        Date fechaNacimiento = new Date(2006, 07, 05);
        String numeroTelefono = "809-345-3424";
        String direccionPaciente = "";
        
        System.out.println(pacienteDao.registrarPaciente(nombrePaciente, apellidoPaciente, cedulaPaciente, sexoPaciente, edadPaciente, alturaPaciente, 
                pesoPaciente, presionPaciente, notaPaciente, correoPaciente, fechaNacimiento, numeroTelefono, direccionPaciente));
        
                }
}
