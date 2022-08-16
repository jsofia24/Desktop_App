/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ReportesController;
import java.sql.SQLException;
import java.util.List;
import modelo.Consulta1Vo;
import modelo.Consulta2Vo;
import modelo.Consulta3Vo;

/**
 *
 * @author jsofi
 */
public class ReportesView {
    private static ReportesController controlador;
    public ReportesView() {
        controlador= new ReportesController();
    }

    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
        }
        
        public void Consulta1(){
        System.out.println(repitaCaracter('=', 15) + " INFORMACION RESPECTO AL LIDER "
        + repitaCaracter('=', 25));
        System.out.println(String.format("%3s %-25s %-20s %-15s",
        "ID", "NOMBRE", "PRIMER APELLIDO", "CIUDAD RESIDENCIA"));
        System.out.println(repitaCaracter('-', 75));
        try{
            List<Consulta1Vo> proyecto=controlador.listarLider();
            for(Consulta1Vo proyec:proyecto){
                System.out.println(proyec);
            }
        }catch (SQLException ex){
            System.err.println("Error: "+ex);
        }
        }
        
        public void Consulta2() {
        System.out.println(repitaCaracter('=', 15) + " INFORMACION RESPECTO AL PROYECTO "
        + repitaCaracter('=', 25));
        System.out.println(String.format("%3s %-25s %-20s %-15s",
        "ID_PROYECTO", "CONSTRUCTORA", "NUMERO HABITACIONES", "CIUDAD"));
        System.out.println(repitaCaracter('-', 75));
        try{
            List<Consulta2Vo> proyecto=controlador.listarProyecto();
            for(Consulta2Vo proyec:proyecto){
                System.out.println(proyec);
            }
        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
        }
        
        public void Consulta3() {
        System.out.println(repitaCaracter('=', 15) + " INFORMACION RESPECTO A LA COMPRA "
        + repitaCaracter('=', 25));
        System.out.println(String.format("%3s %-25s %-20s",
        "ID_COMPRA", "CONSTRUCTORA", "BANCO VINCULADO"));
        System.out.println(repitaCaracter('-', 75));
        try{
            List<Consulta3Vo> proyecto=controlador.listarCompra();
            for(Consulta3Vo proyec:proyecto){
                System.out.println(proyec);
            }
        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
        }

  
        
        
}

        
        
       

