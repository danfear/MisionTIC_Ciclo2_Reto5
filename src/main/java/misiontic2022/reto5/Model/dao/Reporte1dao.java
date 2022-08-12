package misiontic2022.reto5.Model.dao;

import java.sql.*;
import java.util.ArrayList;

import misiontic2022.reto5.Utilities.JDBCUtilities;
import misiontic2022.reto5.Model.vo.Reporte1vo;

//reporte 1. Información respectiva al lider
public class Reporte1dao { 

  public ArrayList<Reporte1vo> listaconsulta1() throws SQLException {

      ArrayList<Reporte1vo> respuesta = new ArrayList<Reporte1vo>();
    //arrayList <tipodato> 
      
      Connection conexion = JDBCUtilities.getConnection();

      try{       
          String consultaBD =  "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";


          PreparedStatement statement = conexion.prepareStatement(consultaBD);
          ResultSet resultSet = statement.executeQuery();

          //Recorrer los registros en los VO específicos
          while(resultSet.next()){
              Reporte1vo registro = new Reporte1vo(); //instanciando clase
              registro.setId(resultSet.getInt("ID_Lider"));
              registro.setNombre(resultSet.getString("Nombre"));
              registro.setApellido(resultSet.getString("Primer_Apellido"));
              registro.setCiudadResidencia(resultSet.getString("Ciudad_Residencia"));

              //Agregar al array cada registro
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
      return respuesta; //listaconsulta1 retorna un array
  }     
}

