package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel text1;
	JButton jb1,jb2,jb3,jb4,jb5;
	Color c1,c2;
	Font f1,f2,f3,f4,f5,f6;
	public Main()
	{
		super("Hiring Company Staffs");
		super.setBounds(450,275,400,220);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(243,173,112);
		c2=new Color(236,135,135);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1=new Font("Comic Sans MS",Font.BOLD,24);
		text1=new JLabel("Please choose to proceed");
		text1.setBounds(50,20,300,35);
		text1.setFont(f1);
		panel.add(text1);
		
		f2=new Font("Comic Sans MS",Font.BOLD,16);
		jb1=new JButton("Admin");
		jb1.setBounds(30,80,100,40);
		jb1.addActionListener(this);
		jb1.setFont(f2);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		panel.add(jb1);
		
		f3=new Font("Comic Sans MS",Font.BOLD,16);
		jb2=new JButton("Login");
		jb2.setBounds(260,80,100,40);
		jb2.addActionListener(this);
		jb2.setFont(f3);
		jb2.setBackground(c2);
		jb2.addMouseListener(this);
		panel.add(jb2);
		
		f4=new Font("Comic Sans MS",Font.BOLD,16);
		jb3=new JButton("About");
		jb3.setBounds(60,130,100,40);
		jb3.addActionListener(this);
		jb3.setFont(f4);
		jb3.setBackground(c2);
		jb3.addMouseListener(this);
		panel.add(jb3);
		
		f5=new Font("Comic Sans MS",Font.BOLD,16);
		jb4=new JButton("Exit");
		jb4.setBounds(230,130,100,40);
		jb4.addActionListener(this);
		jb4.setFont(f5);
		jb4.setBackground(c2);
		jb4.addMouseListener(this);
		panel.add(jb4);
		
		f6=new Font("Comic Sans MS",Font.BOLD,16);
		jb5=new JButton("Sign up");
		jb5.setBounds(145,80,100,40);
		jb5.addActionListener(this);
		jb5.setFont(f6);
		jb5.setBackground(c2);
		jb5.addMouseListener(this);
		panel.add(jb5);
		
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
		if(me.getSource() == jb5)
		{
		jb5.setBackground(Color.BLACK);
		jb5.setForeground(Color.WHITE);
		jb5.setText("Registar");
		}
		else if(me.getSource() == jb1)
		{
		jb1.setBackground(Color.BLACK);
		jb1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == jb2)
		{
		jb2.setBackground(Color.BLACK);
		jb2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == jb3)
		{
		jb3.setBackground(Color.BLACK);
		jb3.setForeground(Color.WHITE);
		}
		else if(me.getSource() == jb4)
		{
		jb4.setBackground(Color.BLACK);
		jb4.setForeground(Color.WHITE);
		}
		else
		{
		}	
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == jb5)
		{
		jb5.setBackground(c2);
		jb5.setForeground(Color.BLACK);
		jb5.setText("Sign up");	
		}
		else if(me.getSource() == jb1)
		{
		jb1.setBackground(c2);
		jb1.setForeground(Color.BLACK);
		}
		else if(me.getSource() == jb2)
		{
		jb2.setBackground(c2);
		jb2.setForeground(Color.BLACK);
		}
		else if(me.getSource() == jb3)
		{
		jb3.setBackground(c2);
		jb3.setForeground(Color.BLACK);
		}
		else if(me.getSource() == jb4)
		{
		jb4.setBackground(c2);
		jb4.setForeground(Color.BLACK);
		}
		else
		{
		}
	}
public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb1)
		{
		   Admin obj1=new Admin();
		   obj1.setVisible(true);
		   this.setVisible(false);
		}
		else if(ae.getSource()==jb2)
		{
		   Login obj2=new Login();
		   obj2.setVisible(true);
		   this.setVisible(false);
		}
			
		else if(ae.getSource()==jb3)
		{
			JOptionPane.showMessageDialog(this, "Currently we are short on Security and Expert Electricians. So we want to hire staffs for the vacancy. Please apply if you can.");
		}
		else if(ae.getSource()==jb4)
		{
			System.exit(0);
		}
		else if(ae.getSource()==jb5)
		{
		   Signup obj3=new Signup();
		   obj3.setVisible(true);
		   this.setVisible(false);
		}
		else
		{
		}
		
	}
}

		