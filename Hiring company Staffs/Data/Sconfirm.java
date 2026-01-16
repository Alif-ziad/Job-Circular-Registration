package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Sconfirm extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JButton jb1, jb2;
	JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10;
	Color c1,c2,c3;
	Font f1;
public Sconfirm(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10)
	{
		super("Signup Confirmation");
		super.setBounds(400,100,380,330);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(180,242,242);
		c2=new Color(236,135,135);
		c3=new Color(246,220,87);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		lb1 = new JLabel("Full name: "+s1);
		lb1.setBounds(20,20, 500, 20);
		panel.add(lb1);
		
		lb2 = new JLabel("Phone number: "+s2);
		lb2.setBounds(20,40, 500, 20);
		panel.add(lb2);
		
		lb3 = new JLabel("E-mail: "+s3);
		lb3.setBounds(20,60, 500, 20);
		panel.add(lb3);
		
		lb4 = new JLabel("NID: "+s4);
		lb4.setBounds(20,80, 500, 20);
		panel.add(lb4);
		
		lb5 = new JLabel("Gender: "+s5);
		lb5.setBounds(20,100, 500, 20);
		panel.add(lb5);
		
		lb6 = new JLabel("Previous working place: "+s6);
		lb6.setBounds(20,120, 500, 20);
		panel.add(lb6);
		
		lb7 = new JLabel("Years of experience: "+s7+"years.");
		lb7.setBounds(20,140, 500, 20);
		panel.add(lb7);
		
		lb8 = new JLabel("Preferred Working Shift: "+s8);
		lb8.setBounds(20,160, 500, 20);
		panel.add(lb8);
		
		lb9 = new JLabel("Password: "+s9);
		lb9.setBounds(20,180, 500, 20);
		panel.add(lb9);
		
		lb10 = new JLabel("Confirm Password: "+s10);
		lb10.setBounds(20,200, 500, 20);
		panel.add(lb10);
		
		f1=new Font("Comic Sans MS",Font.BOLD,16);
		jb1=new JButton("Confirm Signup");
		jb1.setBounds(10,240,220,30);
		jb1.setFont(f1);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		jb1.addActionListener(this);
		panel.add(jb1);
		
		jb2=new JButton("Cancel");
		jb2.setBounds(250,240,100,30);
		jb2.setFont(f1);
		jb2.addMouseListener(this);
		jb2.setBackground(c2);
		jb2.addActionListener(this);
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
		jb1.setBackground(c3);
		jb1.setForeground(Color.WHITE);
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
		Ssignup obj2=new Ssignup();
		obj2.setVisible(true);
		this.setVisible(false);
	}
	else
	{
	}
}
}
