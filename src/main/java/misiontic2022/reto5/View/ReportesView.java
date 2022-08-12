package misiontic2022.reto5.View;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.*;

import misiontic2022.reto5.Controller.ReportesController;
import misiontic2022.reto5.Model.vo.*;


public class ReportesView extends JFrame {
	
    public static final ReportesController controlador = new ReportesController();

    private static final long serialVersionUID = 1L;
    private JPanel Panel;
    private JTextArea textArea;

    public ReportesView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(350, 90, 650, 850);
        this.setTitle("Proyectos de Construcción");
        this.setResizable(false);
        Panel = new JPanel();
        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Panel);
        Panel.setLayout(null);

        JLabel label1 = new JLabel("Consulta en base de datos: Proyectos de Construcción");
        label1.setBounds(28, 30, 450, 18);
        label1.setFont(new Font("Calibri", Font.BOLD, 18));
        Panel.add(label1);

        JScrollPane scroll = new JScrollPane();
        scroll.setBounds(28, 180, 582, 550);
        Panel.add(scroll);

        textArea = new JTextArea();
        scroll.setViewportView(textArea);

        JButton botonConsuta1 = new JButton("Consulta 1");
        botonConsuta1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consulta1();
            }
        });
        botonConsuta1.setBounds(60, 120, 135, 29);
        Panel.add(botonConsuta1);

        JButton botonConsuta2 = new JButton("Consulta 2");
        botonConsuta2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consulta2();
            }
        });
        botonConsuta2.setBounds(250, 120, 135, 29);
        Panel.add(botonConsuta2);
        
        JButton botonConsuta3 = new JButton("Consulta 3");
        botonConsuta3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consulta3();
            }
        });
        botonConsuta3.setBounds(440, 120, 135, 29);
        Panel.add(botonConsuta3);

        //limpiar
        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        botonLimpiar.setBounds(470, 755, 135, 29);
        Panel.add(botonLimpiar);

    }
    
    
    //**********
    
    public void consulta1() {
        try {
            ArrayList<Reporte1vo> arrayconsulta1 = controlador.reporte1();
            String salida = "\t===== Información de los líderes. ===== \n\nID_Lider\tNombre\tApellido\t\tCiudad de Residencia\n\n";
            for (Reporte1vo x : arrayconsulta1) { //for each
                salida += x.getId();
                salida += "\t";
                salida += x.getNombre();
                salida += "\t";
                salida += x.getApellido();
                salida += "\t\t";
                salida += x.getCiudadResidencia();
                salida += "\n";
            }
            textArea.setText(salida);
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error, no se ha podido cargar la información correctamente." + e.getMessage());
        }
    }
    
    public void consulta2() {
        try {
            ArrayList<Reporte2vo> arrayconsulta2 = controlador.reporte2();
            String salida = "\t===== Proyectos de casa campestre en Santa Marta, Barranquilla y Cartagena. ===== \n\nID_Proyecto\tConstructora\t\tHabitaciones\tCiudad\n\n";
            for (Reporte2vo x : arrayconsulta2) {
                salida += x.getIdProyecto();
                salida += "\t";
                salida += x.getConstructora();
                if (x.getConstructora().length() <= 11) {
                    salida += "\t\t";
                } else {
                    salida += "\t";
                }
                salida += x.getHabitaciones();
                salida += "\t";
                salida += x.getCiudad();
                salida += "\n";
            }
            textArea.setText(salida);
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error, no se ha podido cargar la información correctamente." + e.getMessage());
        }
    }

    public void consulta3() {
        try {
            ArrayList<Reporte3vo> arrayconsulta3 = controlador.reporte3();
            String salida = "\t===== Compras con el proveedor Homecenter para la ciudad de Salento. ===== \n\nID_Compra\tConstructora\t\tBanco\n\n";
            for (Reporte3vo x : arrayconsulta3) {
                salida += x.getIdCompra();
                salida += "\t";
                salida += x.getConstructora();
                if (x.getConstructora().length() <= 11) {
                    salida += "\t\t";
                } else {
                    salida += "\t";
                }
                salida += x.getBanco();
                salida += "\n";
            }
            textArea.setText(salida);

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error, no se ha podido cargar la información correctamente." + e.getMessage());
        }
    }

}

