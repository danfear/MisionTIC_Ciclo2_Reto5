package misiontic2022.reto5.Model.vo;

public class Reporte1vo {
    
    private int Id;
    private String nombre;
    private String apellido;
    private String ciudadResidencia;
    
    public Reporte1vo() {
    }

    public Reporte1vo(int Id, String Nombre, String Apellido, String CiudadResidencia) { //constructor
        this.Id = Id; //propiedad de la clase=parámetro
        nombre = Nombre;
        apellido = Apellido;
        ciudadResidencia = CiudadResidencia;
    }

    public int getId() { //getter
        return Id;
    }
    public void setId(int Id) { //setter
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String Apellido) {
        apellido = Apellido;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }
    public void setCiudadResidencia(String CiudadResidencia) {
        ciudadResidencia = CiudadResidencia;
    }
  
}