package resetinterfacciagrafica;

import java.awt.event.*;  //ActionListener
import javax.swing.*;  //JFrame

public class GiocoReset extends JFrame implements ActionListener{
    private CodiceGiocoReset tmp;
    private JButton BottoneReset; 
    private int x = 800;
    private int y = 800;
    private int volte = 0;
    
    public GiocoReset(){
        this.setVisible(true);
        this.setSize(x, y);
        this.setTitle("Premi il tasto per 500€");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);  //ti toglie il layout predefinito di java
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tmp = new CodiceGiocoReset();
        
        BottoneReset = new JButton("Reset");
        BottoneReset.setSize(100, 50);
        BottoneReset.setLocation(350, 350);
        BottoneReset.addActionListener(this);
        
        this.add(BottoneReset);
        this.add(tmp);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==BottoneReset){
            volte++;
            this.remove(tmp); //si rimuove il gioco dal frame
            tmp = new CodiceGiocoReset(); //si istanzia il codice di gioco
            this.add(tmp); //si rimette il codice nel frame
            SwingUtilities.updateComponentTreeUI(this); //serve per aggiornare il frame, prova a non usarlo, ricordati di togliere la riga 16 (setResizable) e prova a ridimensionare il frame
            System.out.println("Hai premuto il bottone: "+volte+" volte"); 
        }
    }    
}
