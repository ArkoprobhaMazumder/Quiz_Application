
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    
    JButton rules;
    JButton back;
    JTextField tfname;
    
    Login(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        
        JLabel heading= new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.ITALIC,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        
        JLabel name =new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        
        tfname=new JTextField();
        tfname.setBounds(730,200,350,40);
        tfname.setFont(new Font("Times new Roman",Font.BOLD,20));
        add(tfname);
        
        
        
        rules=new JButton("Rules");
        rules.setBounds(750,270,100,30);
        rules.setBackground(new Color(30,144,154));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        
        back=new JButton("Exit");
        back.setBounds(950,270,100,30);
        back.setBackground(new Color(30,144,154));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(200,150,1200,500);
       setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==rules){
            String name= tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
        
        
    }
    
    public static void main(String[]args){
         new Login();
    }
}
