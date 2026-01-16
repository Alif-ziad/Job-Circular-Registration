package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel text1;
	JButton jb1,jb2,jb3;
	Color c1,c2,c3;
	Font f1,f2;
	public Login()
	{
		super("Login");
		super.setBounds(400,300,370,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(243,173,112);
		c2=new Color(236,135,135);
		c3=new Color(107,236,255);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1=new Font("Comic Sans MS",Font.BOLD,20);
		text1=new JLabel("Login as");
		text1.setBounds(105,30,200,30);
		text1.setFont(f1);
		panel.add(text1);
		
		f2=new Font("Comic Sans MS",Font.BOLD,12);
		jb1=new JButton("Security Applicant");
		jb1.setBounds(10,70,150,30);
		jb1.addActionListener(this);
		jb1.setFont(f2);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		panel.add(jb1);
		
		jb2=new JButton("Electrician Applicant");
		jb2.setBounds(170,70,170,30);
		jb2.addActionListener(this);
		jb2.setFont(f2);
		jb2.addMouseListener(this);
		jb2.setBackground(c2);
		panel.add(jb2);
		
		jb3=new JButton("Return");
		jb3.setBounds(115,110,100,30);
		jb3.addActionListener(this);
		jb3.setFont(f2);
		jb3.addMouseListener(this);
		jb3.setBackground(c2);
		panel.add(jb2);
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
		jb1.setBackground(c3);
		jb1.setForeground(Color.WHITE);
		}
		else if(me.getSource()==jb2)
		{
		jb2.setBackground(c3);
		jb2.setForeground(Color.WHITE);
		}
		else if(me.getSource()==jb3)
		{
		jb3.setBackground(Color.BLACK);
		jb3.setForeground(Color.WHITE);
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
		Slogin obj1=new Slogin();
		obj1.setVisible(true);
		this.setVisible(false);
	}
	else if(ae.getSource()==jb2)
	{
		Elogin obj2=new Elogin();
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