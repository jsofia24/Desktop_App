/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.SQLException;
import java.util.List;
import modelo.Consulta1Dao;
import modelo.Consulta1Vo;
import modelo.Consulta2Dao;
import modelo.Consulta2Vo;
import modelo.Consulta3Dao;
import modelo.Consulta3Vo;

/**
 *
 * @author jsofi
 */
public class ReportesController {
    private final Consulta1Dao consulta1Dao;
    private final Consulta2Dao consulta2Dao;
    private final Consulta3Dao consulta3Dao;
    
    
    public ReportesController() {
        consulta1Dao=new Consulta1Dao();
        consulta2Dao=new Consulta2Dao();
        consulta3Dao=new Consulta3Dao();   
    }

    public List<Consulta1Vo> listarLider() throws SQLException {
        return consulta1Dao.listar1();
    }
    public List<Consulta2Vo> listarProyecto() throws SQLException {
        return consulta2Dao.listar2();
    }
    public List<Consulta3Vo> listarCompra() throws SQLException {
        return consulta3Dao.listar3();
    }
}