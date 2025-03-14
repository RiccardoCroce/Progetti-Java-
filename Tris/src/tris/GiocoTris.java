package tris;

import java.awt.*; //Label
import java.awt.event.*;  //ActionListener
import javax.swing.*;

public class GiocoTris extends JPanel{
    private int dimensione = 3;
    private int turni = 0;
    private String GiocatoreX = "X";
    private String GiocatoreO = "O";
    private String Giocatore = GiocatoreX;
    private boolean FineGioco = false;
    
    //implementazioni
    JButton[][] GrigliaBottoni = new JButton[dimensione][dimensione];
    JLabel Testo = new JLabel();
    public GiocoTris() {
        Testo.setBackground(Color.LIGHT_GRAY);
        Testo.setForeground(Color.black);
        Testo.setFont(new Font("Arial", Font.BOLD, 50));
        Testo.setHorizontalAlignment(JLabel.CENTER);  //Centro
        Testo.setText("--Tris in Java--");
        Testo.setOpaque(true);
        
        this.setSize(900, 900);
        this.add(Testo);
        this.setLayout(new GridLayout(3, 3));
        this.setBackground(Color.gray);
        
        //initGriglia();
    }
}
