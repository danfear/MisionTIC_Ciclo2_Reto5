package misiontic2022.reto5.Model.dao;

import java.sql.*;
import java.util.ArrayList;

import misiontic2022.reto5.Utilities.JDBCUtilities;
import misiontic2022.reto5.Model.vo.Reporte2vo;

//reporte 2. Casas campestres en Santa Marta, Cartagena y Barranquilla
public class Reporte2dao { 

  public ArrayList<Reporte2vo> listaconsulta2() throws SQLException {

      ArrayList<Reporte2vo> respuesta = new ArrayList<Reporte2vo>(); 
      
      Connection conexion = JDBCUtilities.getConnection();

      try{       
          String consultaBD =  "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion='Casa Campestre' AND Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla');";


          PreparedStatement statement = conexion.prepareStatement(consultaBD);
          ResultSet resultSet = statement.executeQuery();

          while(resultSet.next()){
              Reporte2vo registro = new Reporte2vo(); 
              registro.setIdProyecto(resultSet.getInt("ID_Proyecto"));
              registro.setConstructora(resultSet.getString("Constructora"));
              registro.setHabitaciones(resultSet.getDouble("Numero_Habitaciones")); //habitaciones es float
              registro.setCiudad(resultSet.getString("Ciudad"));

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
