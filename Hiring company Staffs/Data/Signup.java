package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signup extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JButton jb1,jb2,jb3;
    Color c1,c2;
	Font f1,f2,f3;
	
	public Signup()
	{   super("Sign Up");
		super.setBounds(400,300,520,170);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(243,173,112);
		c2=new Color(236,135,135);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f2=new Font("Comic Sans MS",Font.BOLD,12);
		jb1=new JButton("Sign Up for Security");
		jb1.setBounds(40,40,200,30);
		jb1.addActionListener(this);
		jb1.setFont(f2);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		panel.add(jb1);
		
		jb2=new JButton("Sign Up for Electrician");
		jb2.setBounds(260,40,200,30);
		jb2.addActionListener(this);
		panel.add(jb2);
		jb2.setFont(f2);
		jb2.addMouseListener(this);
		jb2.setBackground(c2);
		panel.add(jb2);
		
		jb3=new JButton("Return");
		jb3.setBounds(200,90,100,30);
		jb3.addActionListener(this);
		jb3.setFont(f2);
		jb3.addMouseListener(this);
		jb3.setBackground(c2);
		panel.add(jb3);
		
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
		jb1.setBackground(Color.BLUE);
		jb1.setForeground(Color.WHITE);
		}
		else if(me.getSource()==jb2)
		{
		jb2.setBackground(Color.BLUE);
		jb2.setForeground(Color.WHITE);
		}
		else if(me.getSource()==jb3)
		{
		jb3.setBackground(Color.BLACK);
		jb3.setForeground(Color.WHITE);
		}
		}	

	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==jb1)
		{
		jb1.setBackground(c2);
		jb1.setForeground(Color.BLACK);
		}
		else if(me.getSource()==jb2)
		{
		jb2.setBackground(c2);
		jb2.setForeground(Color.BLACK);
		}
		else if(me.getSource()==jb3)
		{
		jb3.setBackground(c2);
		jb3.setForeground(Color.BLACK);
		}
		else
		{
		}
	}
public void actionPerformed(ActionEvent ae)
{
	
	if(ae.getSource()==jb1)
	{
		Ssignup obj1=new Ssignup();
		obj1.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==jb2)
	{
		Esignup obj2=new Esignup();
		obj2.setVisible(true);
		this.setVisible(false);
	}
	
	else if(ae.getSource()==jb3)
	{
		Main obj3=new Main();
		obj3.setVisible(true);
		this.setVisible(false);
	}
	else
	{
	}
}
}
