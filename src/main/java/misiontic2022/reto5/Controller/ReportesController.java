package misiontic2022.reto5.Controller;

import java.sql.*;
import java.util.ArrayList;

//Conexion con modelo
import misiontic2022.reto5.Model.dao.*;
import misiontic2022.reto5.Model.vo.*;

public class ReportesController {       
 
	private final Reporte1dao consulta1;
	private final Reporte2dao consulta2;
	private final Reporte3dao consulta3;
	
  public ReportesController(){
	  
	  consulta1 = new Reporte1dao();
	  consulta2 = new Reporte2dao();
	  consulta3 = new Reporte3dao();
  }

  public ArrayList<Reporte1vo> reporte1() throws SQLException {
      return this.consulta1.listaconsulta1();
  }

  public ArrayList<Reporte2vo> reporte2() throws SQLException {
      return this.consulta2.listaconsulta2();
  }
  
  public ArrayList<Reporte3vo> reporte3() throws SQLException {
      return this.consulta3.listaconsulta3();
  }
  
}
