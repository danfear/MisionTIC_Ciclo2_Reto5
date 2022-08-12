package misiontic2022.reto5.Model.vo;

public class Reporte3vo {
    
    private int idCompra;
    private String constructora;
    private String banco;
    
    public Reporte3vo() {
    }

    public Reporte3vo(int IdCompra, String Constructora, String Banco) { 
        idCompra = IdCompra; 
        constructora = Constructora;
        banco = Banco;
    }

    public int getIdCompra() { //getter
        return idCompra;
    }
    public void setIdCompra(int IdCompra) { //setter
        this.idCompra = IdCompra;
    }

    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String Constructora) {
    	constructora = Constructora;
    }

    public String getBanco() {
        return banco;
    }
    public void setBanco(String Banco) {
    	banco = Banco;
    }
  
}