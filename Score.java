
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener{
    
    JButton exit;
    
    Score(String name,int score){
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image1= new JLabel(i3);
        image1.setBounds(0,200,300,250);
        add(image1);
        
        
        JLabel heading= new JLabel("Thank you "+name+" for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("SAN SERIF",Font.BOLD,26));
        add(heading);
        
        
        JLabel lblscore= new JLabel("Your Score is "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("SAN SERIF",Font.BOLD,26));
        add(lblscore);
        
        JButton submit=new JButton("Play Again");
        submit.setBounds(380,270,120,30);
        submit.setFont(new Font("Tahoma",Font.PLAIN,15));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
         
        exit=new JButton("Exit");
        exit.setBounds(380,320,120,30);
        exit.setFont(new Font("Tahoma",Font.PLAIN,15));
        exit.setBackground(new Color(30,144,255));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        if(ae.getSource()==exit){
            setVisible(false);
        }
    }
    public static void main(String[]args){
        new Score("User",0);
    }
}
