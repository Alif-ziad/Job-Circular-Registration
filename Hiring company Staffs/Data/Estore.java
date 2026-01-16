package Data;

import java.lang.*;
import java.util.*;
import java.io.*;
public class Estore
{
	private String email;
	private String pass;
	
	private File file;
	private FileWriter fw;
	private Scanner sc;
	
	public Estore()
	{
	}
	public Estore(String email, String pass)
	{
	
		this.email=email;
		this.pass=pass;
	}

	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPass()
	{
		return pass;
	}
	public void addestore()
	{
		try{
			file=new File("./EInformation.txt");
			file.createNewFile();
			fw=new FileWriter(file,true);
			fw.write(getEmail()+"\t");
			fw.write(getPass()+"\n");
			fw.flush();
			fw.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	public boolean getEstore(String email,String pass)
	{
		boolean flag=false;
		file=new File("./EInformation.txt");
		try{
			sc=new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[0].equals(email)&&value[1].equals(pass))
				{
					flag=true;
				}
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return flag;
	}
}