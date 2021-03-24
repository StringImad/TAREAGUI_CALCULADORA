/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author imad
 */
public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;

    // Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents() {
        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos el área de texto
        areaTexto = new JTextArea(10, 50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

       for (JButton boton: this.botonera.getgrupoBotones()){
            boton.addActionListener(this);
        }


    }
    


         @Override
    public void actionPerformed(ActionEvent ae) {
	// Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();
	// Si es un botón
        if (o instanceof JButton){
            System.out.println(((JButton) o).getText());
            areaTexto.setText(((JButton) o).getText());
        }
	
	// RESTO DEL CÓDIGO DE LA LÓGICA DE LA CALCULADORA

         
         
//        Random rd = new Random();
        // Este ejemplo es tan básico que no hemos usado el objeto ae
// Indicamos el texto que queremos mostrar en el área de texto
        // Si el botón pulsado es botonSaludar
//        if (ae.getSource() == botonera.grupoBotones) {
//            texto.setBackground(Color.white);
//            texto.setText("Imad");
//        } else if (ae.getSource() == botonDespedir) {
//            texto.setBackground(Color.cyan);
//            texto.setText("El Fahssi");
//        } else if (ae.getSource() == botonGenerar) {
//            texto.setBackground(Color.cyan);
//            int aleatorio = rd.nextInt(11);
//
////            String aleatorioStr = String.valueOf(aleatorio);
////            texto.setText(aleatorioStr);
//            this.etiqueta.setText("" + aleatorio);
    }

}
