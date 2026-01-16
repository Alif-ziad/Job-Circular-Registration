package Data;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Edashboard extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel t1;
	JButton jb1;
	Color c1,c2;
	Font f1;
	public Edashboard()
	{
		super("Profile");
		super.setBounds(400,250,460,170);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new Color(212,243,158);
		c2=new Color(236,135,135);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(c1);
		
		f1=new Font("Comic Sans MS",Font.BOLD,16);
		t1=new JLabel("Thank you for registaring. Please wait for our reply.");
		t1.setBounds(10,40,550,20);
		t1.setFont(f1);
		panel.add(t1);
		
		jb1=new JButton("Exit");
		jb1.setBounds(150,80,100,30);
		jb1.setFont(f1);
		jb1.addMouseListener(this);
		jb1.setBackground(c2);
		jb1.addActionListener(this);
		panel.add(jb1);
		
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
		else
		{
		}
	}
}

