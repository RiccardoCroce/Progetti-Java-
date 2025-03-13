package resetinterfacciagrafica;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class CodiceGiocoReset extends JPanel{
    private int r, g, b;
    private int x = 800;
    private int y = 800;
    Random random; 
    
    public CodiceGiocoReset(){
        random = new Random();
        
        r = random.nextInt(256);
        g = random.nextInt(256);
        b = random.nextInt(256);
        
        this.setSize(x, y);
        this.setBackground(new Color(r,g,b));
    }
}
