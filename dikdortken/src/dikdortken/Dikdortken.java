package dikdortken;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Dikdortken {
    
   static int buyume = 0;
   static int kuculme = 0;
   static Node kok;
   private static String[] cemberdekiler = new String[30];
    
    public void inOrder(Node tmp) 
    {
        if(tmp !=  null) 
        {
            inOrder(tmp.getNode1());
            inOrder(tmp.getNode2());
            inOrder(tmp.getNode3());
            inOrder(tmp.getNode4());            
            System.out.println(tmp.getIsim());
        }
    }
    
    
    
    public void ara(Node gecici, double x, double x1, double y, double y1)
    {
        if(gecici!=null)
        if(gecici.getX() < x1 && gecici.getX() > x)
        {
           System.out.println("Merhaba");
            if(gecici.getY() < y && gecici.getY() > y1)
            {
                System.out.println(gecici.getIsim());
            }
            return;
        }
        //gecici=gecici.getNode1();
        if(gecici!=null)
        {
           ara(gecici.getNode1(), x, x1, y, y1);
            ara(gecici.getNode2(), x, x1, y, y1);
           ara(gecici.getNode3(), x, x1, y, y1);
           ara(gecici.getNode4(), x, x1, y, y1);
        }        
        return; 
    }
    
    
    
    /*public void cemberBul(int cx, int cy, int radius)
    {
        for(int i=0; i<=360; i++)
        {
            double radyan = i/180*Math.PI;
            
            double xcevre = cx + radius*Math.cos(radyan);
            double ycevre = cy + radius*Math.sin(radyan);
            
            double xcevre1 = cx + radius*Math.cos(radyan + Math.PI);
            double ycevre1 = cy + radius*Math.sin(radyan + Math.PI);
            ara(Dikdortken.kok, xcevre, xcevre1, ycevre, ycevre1);
            
        }    
    }*/
        
    
    public void addNode(String name,int x,int y)
    {
        BizimPencere a=new BizimPencere();
        Node node = new Node(name,x,y);
        if(kok == null)
        {       
            kok = node;
    
            kok.setX1(0);    kok.setX2(x);    kok.setX3(512);    kok.setX4(x);
            kok.setY1(y);    kok.setY2(0);    kok.setY3(y);      kok.setY4(512);
            
           a.cizme(node.getX1(), node.getX2(), node.getX3(), node.getX4(),
                   node.getY1(), node.getY2(), node.getY3(),node.getY4());
        }
        else
        {                          
            Node gecici = kok;
            Node parent;
            while(true)
            {
                
                parent = gecici;
                if(x<gecici.getX() && y<gecici.getY()) //birinci node
                {   
                    gecici = gecici.getNode1();
                    if(gecici == null)
                    {   
                        
                        node.setParent(parent);
  
                        node.setX1(node.getParent().getX1());    
                        node.setX2(x);    
                        node.setX3(node.getParent().getX());    
                        node.setX4(x);
                        node.setY1(y);    
                        node.setY2(node.getParent().getY2());    
                        node.setY3(y);      
                        node.setY4(node.getParent().getY());
                        
                        parent.setNode1(node);
                         
                        a.cizme(node.getX1(), node.getX2(), node.getX3(), node.getX4(),
                   node.getY1(), node.getY2(), node.getY3(),node.getY4());
                        
                        System.out.println( node.getIsim()+" ==node1== "+node.getParent().getIsim());
                        System.out.println(node.getX1()+" "+node.getX2()+" "+node.getX3()+" "+node.getX4()+" \n"+
                                node.getY1()+" "+node.getY2()+" "+node.getY3()+" "+node.getY4());
                        return;
                    }
                }
                else if(x>gecici.getX() && y<gecici.getY()) // ikinci Node
                {
                    gecici = gecici.getNode2();
                    if(gecici == null)
                    {                        
                        
                        node.setParent(parent);
                        
                        node.setX1(node.getParent().getX());    
                        node.setX2(x);    
                        node.setX3(node.getParent().getX3());    
                        node.setX4(x);
                        node.setY1(y);    
                        node.setY2(node.getParent().getY2());    
                        node.setY3(y);      
                        node.setY4(node.getParent().getY());
                        
                        a.cizme(node.getX1(), node.getX2(), node.getX3(), node.getX4(),
                   node.getY1(), node.getY2(), node.getY3(),node.getY4());
                        
                        parent.setNode2(node);
                        System.out.println( node.getIsim()+" ==node2== "+node.getParent().getIsim());
                        System.out.println(node.getX1()+" "+node.getX2()+" "+node.getX3()+" "+node.getX4()+" \n"+
                                node.getY1()+" "+node.getY2()+" "+node.getY3()+" "+node.getY4());
                        return;
                    }
                }
                else if(x<gecici.getX() && y>gecici.getY()) // ucuncu node
                {
                    gecici = gecici.getNode3();
                    if(gecici == null)
                    {
                        
                        node.setParent(parent);
                        
                        node.setX1(node.getParent().getX1());    
                        node.setX2(x);    
                        node.setX3(node.getParent().getX());    
                        node.setX4(x);
                        node.setY1(y);    
                        node.setY2(node.getParent().getY());    
                        node.setY3(y);      
                        node.setY4(node.getParent().getY4());
                        
                        a.cizme(node.getX1(), node.getX2(), node.getX3(), node.getX4(),
                   node.getY1(), node.getY2(), node.getY3(),node.getY4());
                        
                        parent.setNode3(node);
                        System.out.println( node.getIsim()+" ==node3== "+node.getParent().getIsim());
                        System.out.println(node.getX1()+" "+node.getX2()+" "+node.getX3()+" "+node.getX4()+" \n"+
                                node.getY1()+" "+node.getY2()+" "+node.getY3()+" "+node.getY4());
                        return;
                    }
                }
                else if(x>gecici.getX() && y>gecici.getY())
                {
                    gecici = gecici.getNode4();
                    if(gecici == null)
                    {
                       
                        node.setParent(parent);
                        
                        node.setX1(node.getParent().getX());    
                        node.setX2(x);    
                        node.setX3(node.getParent().getX3());
                        node.setX4(x);
                        node.setY1(y);    
                        node.setY2(node.getParent().getY());    
                        node.setY3(y);      
                        node.setY4(node.getParent().getY4());
                        
                        a.cizme(node.getX1(), node.getX2(), node.getX3(), node.getX4(),
                   node.getY1(), node.getY2(), node.getY3(),node.getY4());
                        
                         parent.setNode4(node);
                        System.out.println( node.getIsim()+" ==node4== "+node.getParent().getIsim());
                        System.out.println(node.getX1()+" "+node.getX2()+" "+node.getX3()+" "+node.getX4()+" \n"+
                                node.getY1()+" "+node.getY2()+" "+node.getY3()+" "+node.getY4());
                        return;
                    }
                }
                else
                    return;
            }
        }
    }
    
    public void randomAdd(int girilenRandom)
    {
        Random rx = new Random();
        Random ry = new Random();
        char ascii = 64;
        Dikdortken node = new Dikdortken();
        for(int sayac=0;sayac<girilenRandom;sayac++)
        {   
            ascii++;
            int x = rx.nextInt(512);
            int y = ry.nextInt(512);
            node.addNode(ascii+"",x,y);
        } 
    }
    
    static int i=0;
    public void noktaBul(Node tmp, int dairex, int dairey,int radius)
    {
        int uzaklik;
                
        while(tmp!=null)
        {
            uzaklik = (int) Math.sqrt((Math.pow(tmp.getX()-dairex, 2) + Math.pow(tmp.getY()-dairey, 2)));
            System.out.println("uzaklik="+uzaklik +" -- radius=" + radius);
            if(uzaklik<=radius)
            {
                System.out.println(tmp.getIsim());
                cemberdekiler[i] = tmp.getIsim();
                i++;                
            }
            noktaBul(tmp.getNode1(), dairex, dairey, radius);
            noktaBul(tmp.getNode2(), dairex, dairey, radius);
            noktaBul(tmp.getNode3(), dairex, dairey, radius);
            noktaBul(tmp.getNode4(), dairex, dairey, radius);
            break;
        } 
        
    }
    
    public void cemberdekileriYazdir()
    {
        for(int a = 0;a<i;a++)
        {
            System.out.println(cemberdekiler[a]);
        }
    }
    
    public static void main(String[] args) 
    {        
        BizimPencere pencere = new BizimPencere();
        pencere.setSize(650,512);
        Container content = pencere.getContentPane();
        content.setLayout(null);
        
        JButton reset = new JButton("RESET");
        JButton randomOnay = new JButton("RANDOM ATA");
        JButton yariCapArtir = new JButton("+");
        JButton yariCapAzalt = new JButton("-");
        JTextField randomSayi = new JTextField();
        
        reset.setBounds(512, 0, 120,30);
        randomSayi.setBounds(512, 35, 120, 30);
        randomOnay.setBounds(512, 70, 120, 30);        
        yariCapArtir.setBounds(547,120,50,30);
        yariCapAzalt.setBounds(547,155,50,30);
        
        
        randomOnay.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(randomSayi.getText()==null){
            JOptionPane.showMessageDialog(null, "Random sayi girilmedi!");
            }
            else{
            int girilenRandom = Integer.parseInt(randomSayi.getText());
            Dikdortken dik = new Dikdortken();
            dik.randomAdd(girilenRandom);}
        }
    });
        
        reset.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            kok = null;
            pencere.updateGraphics(150, 150);
        }
    });
        
        yariCapArtir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 buyume =+1;
            }
        });
        
        yariCapAzalt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 kuculme =+1;
            }
        });
        
        content.add(reset);
        content.add(randomSayi);
        content.add(randomOnay);
        content.add(yariCapArtir);
        content.add(yariCapAzalt);
        pencere.setVisible(true);
      
    }    
}
