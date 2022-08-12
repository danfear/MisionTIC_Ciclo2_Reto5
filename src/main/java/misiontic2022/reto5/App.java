package misiontic2022.reto5;

import java.awt.EventQueue;

import misiontic2022.reto5.View.ReportesView;

public class App 
{
    public static void main( String[] args )
    {
    	// Ejecutar Swing en otro hilo (QUÉ?)
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                	ReportesView frame = new ReportesView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}