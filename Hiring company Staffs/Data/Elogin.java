package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Elogin extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel text1,text2,text3;
	JTextField tf1,tf2;
	JButton jb1,jb2;
	Color c1,c2;
	Font f1,f2;
	
	public Elogin()
	{
		super("Electrician applicant login");
		super.setBounds(500,275,250,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(243,173,112);
		c2=new Color(236,135,135);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1=new Font("Comic Sans MS",Font.BOLD,24);
		text1=new JLabel("applicant Login");
		text1.setBounds(22,30,200,35);
		text1.setFont(f1);
		panel.add(text1);
		
		f2=new Font("Comic Sans MS",Font.BOLD,16);
		text2=new JLabel("E-mail:");
		text2.setBounds(20,80,110,20);
		text2.setFont(f2);
		panel.add(text2);
		
		tf1=new JTextField();
		tf1.setBounds(85,80,100,20);
		panel.add(tf1);
		
		text3=new JLabel("Password:");
		text3.setBounds(20,120,95,20);
		text3.setFont(f2);
		panel.add(text3);
		
		tf2=new JTextField();
		tf2.setBounds(115,120,100,20);
		panel.add(tf2);
		
		jb1=new JButton("Return");
		jb1.setBounds(10,170,100,30);
		jb1.addActionListener(this);
		jb1.setFont(f2);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		panel.add(jb1);
		
		jb2=new JButton("Login");
		jb2.setBounds(120,170,100,30);
		jb2.addActionListener(this);
		jb2.setFont(f2);
		jb2.addMouseListener(this);
		jb2.setBackground(c2);
		panel.add(jb2);
		
		this.add(panel);
}
    public void mouseClicked(MouseEvent me)
	{
	}
	public void mousePressed(MouseEvent me) 
	{
	}
	public void mouseReleased(MouseEvent me) 
	{
	}
	public void mouseEntered(MouseEvent me) 
	{
		if(me.getSource()==jb1)
		{
		jb1.setBackground(Color.BLACK);
		jb1.setForeground(Color.WHITE);
		jb1.setText("Back");
		}
		else if(me.getSource()==jb2)
		{
		jb2.setBackground(Color.BLACK);
		jb2.setForeground(Color.WHITE);
		}
		else
		{
		}	
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==jb1)
		{
		jb1.setBackground(c2);
		jb1.setForeground(Color.BLACK);
		jb1.setText("Return");	
		}
		else if(me.getSource()==jb2)
		{
		jb2.setBackground(c2);
		jb2.setForeground(Color.BLACK);
		}
		else
		{
		}
	}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==jb1)
	{
		Main obj1=new Main();
		obj1.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==jb2)
	{       
     String email=tf1.getText();
	 String pass=tf2.getText();
			Estore a1=new Estore();
			
			if(a1.getEstore(email,pass)==true)
			{
				JOptionPane.showMessageDialog(null,"Sucessfull");
				
				Edashboard obj2=new Edashboard();
				obj2.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorrect");
			}
		
	}
	else
	{
	}
}
}