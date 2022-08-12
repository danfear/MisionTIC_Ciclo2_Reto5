package misiontic2022.reto5.Model.vo;

public class Reporte2vo {
    
    private int idProyecto;
    private String constructora;
    private double habitaciones;
    private String ciudad;
    
    public Reporte2vo() {
    }

    public Reporte2vo(int IdProyecto, String Constructora, double Habitaciones, String Ciudad) { 
        this.idProyecto = IdProyecto; 
        constructora = Constructora;
        habitaciones = Habitaciones;
        ciudad = Ciudad;
    }

    public int getIdProyecto() { 
        return idProyecto;
    }
    public void setIdProyecto(int IdProyecto) { 
        idProyecto = IdProyecto;
    }

    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String Constructora) {
    	constructora = Constructora;
    }

    public double getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(double Habitaciones) {
    	habitaciones = Habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String Ciudad) {
        ciudad = Ciudad;
    }
  
}