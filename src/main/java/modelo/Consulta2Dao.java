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
public class Consulta2Dao {
  public List<Consulta2Vo> listar2()throws SQLException {
        ArrayList<Consulta2Vo> a=new ArrayList<>();
        Connection conn=JDBCUtilities.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String consulta="SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad "
                        + "FROM Proyecto p "
                        + "WHERE  Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla') " 
                        + "AND  Clasificacion ='Casa Campestre'"; 
try{
    pstmt=conn.prepareStatement(consulta);
    //pstmt.setString();
    rs=pstmt.executeQuery();
    while(rs.next()){
        Consulta2Vo vo=new Consulta2Vo();
        vo.setId_proyecto(rs.getInt("ID_Proyecto"));
        vo.setConstructora(rs.getString("Constructora"));
        vo.setNumero_habitaciones(rs.getInt("Numero_Habitaciones"));
        vo.setCiudad(rs.getString("Ciudad"));
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

