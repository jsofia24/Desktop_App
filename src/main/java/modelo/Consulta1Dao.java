/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;

/**
 *
 * @author jsofi
 */
public class Consulta1Dao {
  public List<Consulta1Vo> listar1()throws SQLException {
        ArrayList<Consulta1Vo> a=new ArrayList<>();
        Connection conn=JDBCUtilities.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String consulta= "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia "
                        +"FROM Lider l "
                        +"ORDER BY Ciudad_Residencia ASC"; 
try{
    pstmt=conn.prepareStatement(consulta);
    //pstmt.setString(1,lider);
    rs=pstmt.executeQuery();
    while(rs.next()){
        Consulta1Vo vo=new Consulta1Vo();
        vo.setId(rs.getInt("ID_Lider"));
        vo.setNombre(rs.getString("Nombre"));
        vo.setPrimer_apellido(rs.getString("Primer_Apellido"));
        vo.setCiudad_residencia(rs.getString("Ciudad_Residencia"));
        a.add(vo);
    }
}finally{
            if (rs != null){
                 rs.close();
                    }
            if (pstmt != null) {
                 pstmt.close();
                }
            if (conn != null){
                 conn.close();
                }

    }
return a;
 } 
}