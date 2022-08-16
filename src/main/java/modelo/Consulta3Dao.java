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
public class Consulta3Dao {
  public List<Consulta3Vo> listar3()throws SQLException {
        ArrayList<Consulta3Vo> a=new ArrayList<>();
        Connection conn=JDBCUtilities.getConnection();
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String consulta="SELECT ID_Compra, p.Constructora, p.Banco_Vinculado "
                        +"FROM Compra c "
                        +"INNER JOIN Proyecto p ON c.ID_Proyecto =p.ID_Proyecto "
                        +"WHERE p.Ciudad ='Salento'"
                        +"AND c.Proveedor ='Homecenter'"; 
try{
    pstmt=conn.prepareStatement(consulta);
    //pstmt.setString(1,compra);
    rs=pstmt.executeQuery();
    while(rs.next()){
        Consulta3Vo vo=new Consulta3Vo();
        vo.setId_compra(rs.getInt("ID_Compra"));
        vo.setConstructora(rs.getString("Constructora"));
        vo.setBanco_vinculado(rs.getString("Banco_Vinculado"));
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

