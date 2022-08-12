package misiontic2022.reto5.Model.dao;

import java.sql.*;
import java.util.ArrayList;

import misiontic2022.reto5.Utilities.JDBCUtilities;
import misiontic2022.reto5.Model.vo.Reporte3vo;

//reporte 3. Compras con el proveedor “Homecenter” para la ciudad de “Salento”
public class Reporte3dao { 

  public ArrayList<Reporte3vo> listaconsulta3() throws SQLException {

      ArrayList<Reporte3vo> respuesta = new ArrayList<Reporte3vo>(); 
      
      Connection conexion = JDBCUtilities.getConnection();

      try{       
          String consultaBD =  "SELECT ID_Compra, Proyecto.Constructora, Proyecto.Banco_Vinculado FROM Compra JOIN Proyecto ON Compra.ID_Proyecto=Proyecto.ID_Proyecto WHERE Compra.Proveedor='Homecenter' AND Proyecto.Ciudad='Salento';";


          PreparedStatement statement = conexion.prepareStatement(consultaBD);
          ResultSet resultSet = statement.executeQuery();

          while(resultSet.next()){
              Reporte3vo registro = new Reporte3vo(); 
              registro.setIdCompra(resultSet.getInt("ID_Compra"));
              registro.setConstructora(resultSet.getString("Constructora"));
              registro.setBanco(resultSet.getString("Banco_Vinculado"));

              respuesta.add(registro);
          }

          resultSet.close();
          statement.close();

      }catch(SQLException e){
          System.err.println("Error realizando la consulta: "+e);
      }finally{
          if(conexion != null){
              conexion.close();
          }
      }
      return respuesta; 
  }     
}
