package dikdortken;
import dikdortken.Dikdortken;
import dikdortken.Node;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BizimPencere extends JFrame implements MouseListener{
    
    static int deger = 0;
    public static Graphics g1;
    int x,y,cx,cy,cx1,cy1;
    static char harf = 64;
    static int  x1, x2,  x3, x4,y1, y2,  y3, y4;
    static int[] red = {102,198,151,74,72,139,139,255,255,132,0,0,0,192};
    static int[] green = {102,226,255,128,118,101,69,239,228,112,0,255,0,255};
    static int[] blue = {102,255,255,77,255,139,19,219,225,255,255,0,255,62};
    static int renkSayac = 0;
    int diametr = 20;
 
    
    public BizimPencere()
    {
        
        super();
        addMouseListener(this);
    }
    
    public void paint(Graphics g)
    {
        //super.paint(g);
        g1 = g; 
        g1.setColor(new Color(21, 78, 237));
        g1.setFont(new Font("Arial", Font.BOLD, 16));
        g1.drawLine(x1, y1, x3, y3);
        g1.drawLine(x2, y2, x4, y4);
        g1.drawString(harf+"", x+5, y-5);
        g1.setColor(new Color(red[renkSayac],green[renkSayac],blue[renkSayac]));
        g1.drawOval(cx, cy, diametr, diametr);
       
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
          
    }
    
    public void updateGraphics(int length,int width)
    {
        super.paint(g1);
        System.out.println("Demeli1");
        g1.setColor(Color.black);
        g1.drawRect(100, 150, length, width);
        System.out.println(length+ "  " + width);
        System.out.println("demeli2");
        System.out.println(g1);
        
    }
    
    public void cizme(int x1,int x2, int x3, int x4,int y1,int y2, int y3, int y4)
    {        
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.x4=x4;        
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
        this.y4=y4;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Dikdortken node=new Dikdortken();
        if(e.getButton()==e.BUTTON1)
        {
            x = e.getX();
            y = e.getY();
            System.out.println(x+" "+y);
            harf++;
            if(harf==91 ){
                harf=97;   
            }
            node.addNode(harf+"", x, y);
            Dikdortken a=new Dikdortken();
            a.noktaBul(Dikdortken.kok,cx1,cy1,diametr/2);
            
        }
        else if(e.getButton() == e.BUTTON3)
        {   
            Dikdortken a=new Dikdortken();
            
            diametr= diametr + a.buyume*10;// - a.kuculme*10;
            renkSayac++;
            cx = e.getX()-diametr/2;
            cy = e.getY()-diametr/2;
            cx1=e.getX();
            cy1=e.getY();
            
            a.noktaBul(Dikdortken.kok,cx1,cy1,diametr/2);
        }
        else if(e.getButton() == e.BUTTON2)
        {
            Dikdortken a=new Dikdortken();
            a.cemberdekileriYazdir();
        }
     
        repaint();
    }
    
    @Override
    public void mousePressed(MouseEvent e) {}    
    @Override
    public void mouseReleased(MouseEvent e) {}   
    @Override
    public void mouseEntered(MouseEvent e) {}   
    @Override
    public void mouseExited(MouseEvent e) {}  
    
}
