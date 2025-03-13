package resetinterfacciagrafica;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class CodiceGiocoReset extends JPanel{
    private int r, g, b;
    private int x = 700;
    private int y = 700;
    Random random; 
    
    public CodiceGiocoReset(){
        random = new Random();
        
        r = random.nextInt(256);
        g = random.nextInt(256);
        b = random.nextInt(256);
        
        this.setSize(x, y);
        this.setLocation(110, 25);
        this.setBackground(new Color(r,g,b));
    }
}
