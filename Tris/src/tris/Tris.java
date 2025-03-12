package tris;

import java.awt.*; //Label e Panel
import java.awt.event.*;  //ActionListener
import javax.swing.*;

public class Tris {
    //Variabili
    private int larghezza = 850;
    private int lunghezza = 850;
    private int dimensione = 3;
    private int turni = 0;
    private String GiocatoreX = "X";
    private String GiocatoreO = "O";
    private String Giocatore = GiocatoreX;
    private boolean FineGioco = false;
    
    //Implementazioni
    JFrame Finestra = new JFrame("Tris Con Interfaccia Grafica(Con Bottoni inclusi)");
    JLabel Testo = new JLabel();
    JPanel PannelloTitolo = new JPanel();  //il Pannello svolge il ruolo di contenitore, così non interferiamo il titolo con la griglia
    JPanel PannelloGriglia = new JPanel();
    JPanel PannelloAggiuntivo = new JPanel();
    
    JButton[][] GrigliaBottoni = new JButton[dimensione][dimensione];
    JButton Reset = new JButton("Reset");
    
    //Costruttore
    public Tris(){
        Finestra.setVisible(true);
        Finestra.setSize(larghezza, larghezza);
        Finestra.setLocationRelativeTo(null);  //la finestra è bloccata in centro all'avvio
        Finestra.setResizable(false);  //la finestra non si può ridimensionare
        Finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Testo.setBackground(Color.LIGHT_GRAY);
        Testo.setForeground(Color.black);
        Testo.setFont(new Font("Arial", Font.BOLD, 50));
        Testo.setHorizontalAlignment(JLabel.CENTER);  //Centro
        Testo.setText("--Tris Con Interfaccia Grafica--");
        Testo.setOpaque(true);
        
        PannelloTitolo.setLayout(new BorderLayout()); //creo il bordo del pannello
        PannelloTitolo.add(Testo);
        Finestra.add(PannelloTitolo, BorderLayout.NORTH); //metto sopra il testo scritto dal Label 
        
        PannelloGriglia.setLayout(new GridLayout(3, 3));
        PannelloGriglia.setBackground(Color.gray);
        Finestra.add(PannelloGriglia);
        
        PannelloAggiuntivo.setLayout(new BorderLayout());
        Reset.setPreferredSize(new Dimension(0, 40));
        PannelloAggiuntivo.setBackground(Color.red);
        PannelloAggiuntivo.add(Reset);
        Finestra.add(PannelloAggiuntivo, BorderLayout.AFTER_LAST_LINE);
        initGriglia();
    }
    
    //Creo Griglia da giocare
    private void initGriglia(){
        for (int i = 0; i < dimensione; i++) {
            for (int j = 0; j < dimensione; j++) {
               JButton cella = new JButton();
               GrigliaBottoni[i][j] = cella;
               PannelloGriglia.add(cella);
               
               cella.setBackground(Color.darkGray);
               cella.setForeground(Color.white);
               cella.setFont(new Font("Arial", Font.BOLD, 120));
               cella.setFocusable(false);
               
               cella.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       if (FineGioco) 
                           return;
                       JButton cella = (JButton) e.getSource();
                       if (cella.getText() == ""){
                           cella.setText(Giocatore);
                           turni++;
                           ControlloPartita();
                           if (!FineGioco){
                               Giocatore = Giocatore == GiocatoreX ? GiocatoreO : GiocatoreX; 
                                /*Si può anche scrivere
                                if (Giocatore == GiocatoreX){
                                    Giocatore = GiocatoreO;
                                }else{
                                    Giocatore = GiocatoreX
                                }
                                */
                               Testo.setText("Tocca a te: "+Giocatore);
                           }
                       }     
                   }
               
               });
            }
        }
        
    }
    private void ControlloPartita(){
        
    }
}
