import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.math.*;
public class Calculator extends JFrame implements ActionListener
{
    private JButton btnull = new JButton("0");
    private JButton bteins = new JButton("1");
    private JButton btzwei = new JButton("2");
    private JButton btdrei = new JButton("3");
    private JButton btvier = new JButton("4");
    private JButton btfünf = new JButton("5");
    private JButton btsechs = new JButton("6");
    private JButton btsieben = new JButton("7");
    private JButton btacht = new JButton("8");
    private JButton btneun = new JButton("9");
    private JButton btans = new JButton("Ans");
    private JButton btC = new JButton("C");
    
    private JButton btplus = new JButton("+");
    private JButton btminus = new JButton("-");
    private JButton btdivision = new JButton("/");
    private JButton btmultiplication = new JButton("*");
    private JButton btsqroot = new JButton("squareroot");
    private JButton btgleich = new JButton("=");
    
    private JTextField txtvar1 = new JTextField();
    private JTextField txtErg = new JTextField();
    private JTextField txtrz = new JTextField();
    
    private JButton btexit = new JButton("Exit");
    
    double var1;
    double var2;
    
    String rz = null;
    
    public Calculator()
    {
        Container cp = getContentPane();
        cp.setLayout(null);
        setSize(400,400);
        
        txtvar1.setEditable(false);
        txtErg.setEditable(false);
        txtrz.setEditable(false);
        
        
        cp.add(txtvar1);
        cp.add(txtErg);
        cp.add(txtrz);
        
        cp.add(btplus);
        cp.add(btminus);
        cp.add(btdivision);
        cp.add(btmultiplication);
        cp.add(btsqroot);
        cp.add(btgleich);
        cp.add(btexit);
        
        cp.add(btnull);
        cp.add(bteins);
        cp.add(btzwei);
        cp.add(btdrei);
        cp.add(btvier);
        cp.add(btfünf);
        cp.add(btsechs);
        cp.add(btsieben);
        cp.add(btacht);
        cp.add(btneun);
        cp.add(btans);
        cp.add(btC);
        
        setTitle("Calculator");
        setVisible(true);
        btnull.addActionListener(this);
        bteins.addActionListener(this);
        btzwei.addActionListener(this);
        btdrei.addActionListener(this);
        btvier.addActionListener(this);
        btfünf.addActionListener(this);
        btsechs.addActionListener(this);
        btsieben.addActionListener(this);
        btacht.addActionListener(this);
        btneun.addActionListener(this);
        btplus.addActionListener(this);
        btminus.addActionListener(this);
        btdivision.addActionListener(this);
        btmultiplication.addActionListener(this);
        btsqroot.addActionListener(this);
        btgleich.addActionListener(this);
        btC.addActionListener(this);
        btans.addActionListener(this);
        btexit.addActionListener(this);
        
        
        bteins.setBounds(20,20,50,30);
        btzwei.setBounds(80,20,50,30);
        btdrei.setBounds(140,20,50,30);
        btvier.setBounds(20,60,50,30);
        btfünf.setBounds(80,60,50,30);
        btsechs.setBounds(140,60,50,30);
        btsieben.setBounds(20,100,50,30);
        btacht.setBounds(80,100,50,30);
        btneun.setBounds(140,100,50,30);
        btnull.setBounds(80,140,50,30);
        btans.setBounds(140,140,60,30);
        btC.setBounds(20,140,50,30);
        btplus.setBounds(230,20,50,30);
        btminus.setBounds(290,20,50,30);
        btdivision.setBounds(230,60,50,30);
        btmultiplication.setBounds(290,60,50,30);
        btsqroot.setBounds(230,100,110,30);
        btgleich.setBounds(230,140,110,30);
        btexit.setBounds(230,320,60,30);
        
        txtvar1.setBounds(20,190,320,30);
        txtErg.setBounds(20,270,320,30);
        txtrz.setBounds(120, 230,50,30);
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        btnull.setBackground(null);
        bteins.setBackground(null);
        btzwei.setBackground(null);
        btdrei.setBackground(null);
        btvier.setBackground(null);
        btfünf.setBackground(null);
        btsechs.setBackground(null);
        btsieben.setBackground(null);
        btacht.setBackground(null);
        btneun.setBackground(null);
        btplus.setBackground(null);
        btminus.setBackground(null);
        btmultiplication.setBackground(null);
        btdivision.setBackground(null);
        btC.setBackground(null);
        btsqroot.setBackground(null);
        btgleich.setBackground(null);
        btexit.setBackground(null);
        btans.setBackground(null);
        
        
         if(obj == btnull)
       {
               btnull.setBackground(Color.green);
               
               txtvar1.setText(txtvar1.getText()+"0");
            
         }
        
        if(obj == bteins)
       {
               bteins.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"1");
            
         }
        
        if(obj == btzwei)
       {
               btzwei.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"2");
            
         }
        
        if(obj == btdrei)
       {
           btdrei.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"3");
            
         }
        
        if(obj == btvier)
       {
           btvier.setBackground(Color.green);
           txtvar1.setText(txtvar1.getText()+"4");
            
        }
        
        if(obj == btfünf)
       {
           btfünf.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"5");
            
        }
        
        if(obj == btsechs)
       {
            btsechs.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"6");
            
        }
        
        if(obj == btsieben)
       {
            btsieben.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"7");
            
        }
        
        if(obj == btacht)
       {
          btacht.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"8");
            
        }
        
        if(obj == btneun)
       {
           btneun.setBackground(Color.green);
               txtvar1.setText(txtvar1.getText()+"9");
            
        }
        
       if(obj == btplus)
       {
          btplus.setBackground(Color.green);
           txtrz.setText("+");
           rz = "+";
           var1 = Double.parseDouble(txtvar1.getText());
           txtvar1.setText("");
          
          
        }
        
        if(obj == btminus)
       {
          btminus.setBackground(Color.green);
           txtrz.setText("-");
          rz = "-";
          var1 = Double.parseDouble(txtvar1.getText());
           txtvar1.setText("");
        }
        
        if(obj == btmultiplication)
       {
           btmultiplication.setBackground(Color.green);
           txtrz.setText("*");
           rz = "*";
           var1 = Double.parseDouble(txtvar1.getText());
           txtvar1.setText("");
        }
        
        if(obj == btdivision)
       {
           btdivision.setBackground(Color.green);
           txtrz.setText("/");
           rz = "/";
           var1 = Double.parseDouble(txtvar1.getText());
           txtvar1.setText("");
        }
        
        if(obj == btgleich)
        {
            btgleich.setBackground(Color.green);
            var2 = Double.parseDouble(txtvar1.getText());
              if(rz == "+")
              {
                  txtErg.setText(String.valueOf(var1+var2));
                  txtrz.setText("");
                  txtvar1.setText("");
                  var1 = Double.parseDouble(txtErg.getText());
              }
              else if(rz == "-")
              {
                  txtErg.setText(String.valueOf(var1-var2));
                  txtrz.setText("");
                  txtvar1.setText("");
                  var1 = Double.parseDouble(txtErg.getText());
                }
                else if(rz == "*")
              {
                  txtErg.setText(String.valueOf(var1*var2));
                  txtrz.setText("");
                  txtvar1.setText("");
                  var1 = Double.parseDouble(txtErg.getText());
                }
                else if(rz == "/")
              {
                  txtErg.setText(String.valueOf(var1/var2));
                  txtrz.setText("");
                  txtvar1.setText("");
                  var1 = Double.parseDouble(txtErg.getText());
                }
        }
        
        if(obj == btsqroot)
       {
           btsqroot.setBackground(Color.green);
           var1 = Double.parseDouble(txtvar1.getText());
           txtErg.setText(String.valueOf(Math.sqrt(var1)));
           txtvar1.setText("");
        }
        
        if(obj == btC)
        {
            btC.setBackground(Color.green);
            c();
            }
            
        if(obj == btans)
        {
            btans.setBackground(Color.green);
            var1 = Double.parseDouble(txtErg.getText());
            var2 = 0;
            txtvar1.setText(String.valueOf(var1));
            txtErg.setText("");
        }
        
        if(obj == btexit)
        {
            btexit.setBackground(Color.green);
            System.exit(2);
            }
    }
    
    public void c()
    {
        txtvar1.setText("");
        txtrz.setText("");
        txtErg.setText("");
        var1 = 0;
        var2 = 0;
        }
        
        public void wait(int milliseconds)
        {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch(Exception e)
        {
        }
            }
}
