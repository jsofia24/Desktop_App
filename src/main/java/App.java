
import java.awt.FlowLayout;
import vista.ReportesView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jsofi
 */
public class App {
    public static void main( String[] args ){

       System.out.println("Consulta 1");
       ReportesView reporte1=new ReportesView();
       reporte1.Consulta1();
       
       System.out.println("Consulta 2");
       ReportesView reporte2=new ReportesView();
       reporte2.Consulta2();
       
       System.out.println("Consulta 3");
       ReportesView reporte3=new ReportesView();
       reporte3.Consulta3();
       
    }
}
