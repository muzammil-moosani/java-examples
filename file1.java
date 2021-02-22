import java.io.*;
public class file1
{
	public static void main(String args[]) throws IOException
	{
		String record,choice,s,s1,ecode,enm,ed,es,er,ecode1,sec,s2,ecode2,enm2,ed2,es2;
		int count,i,ch;
		double it,sal; 
		DataInputStream obj=new DataInputStream(System.in);		
		System.out.println();
		System.out.println("**********FILE HANDLING MENU**********");
		System.out.println();
		System.out.println("Press 1 for Creation of file");
		System.out.println("Press 2 for Reading of file");
		System.out.println("Press 3 for Appending a record in a already existing file");
		System.out.println("Press 4 for Deleting a record from a file");
		System.out.println("Press 5 for Searching a record in a file");
		System.out.println("Press 6 for exit");
		System.out.println("Enter your choice:");
		ch=Integer.parseInt(obj.readLine());
		switch(ch)
		{
			case 1:
			FileWriter fw=new FileWriter("Employee1.dat");
			StringBuffer sb=new StringBuffer();
			do
			{
				System.out.println("Enter 4 digit Employee Code:");
				sb.append(obj.readLine());
				System.out.println("Enter Employee's Name:");
				sb.append(obj.readLine());
				count=24-sb.length();
				for(i=1;i<=count;i++)
				sb.append(" ");
				System.out.println("Enter Employee's Department:");
				sb.append(obj.readLine());
				count=39-sb.length();
				for(i=1;i<=count;i++)
				sb.append(" ");
				System.out.println("Enter Employee's Salary:");
				sb.append(obj.readLine());
				count=45-sb.length();
				sb.append(" ");
				record=sb.toString();
				fw.write(record);
				fw.write("\n");
				sb.delete(0,record.length());
				System.out.println("Do you want to enter more records(y/n):");
				choice=obj.readLine();
			}
			while(choice.equals("y"));
			fw.close();
			break;
			case 2:
			FileReader fr=new FileReader("Employee1.dat");
			BufferedReader br=new BufferedReader(fr);
			s=(br.readLine()).toString();
			try
			{
				do
				{
					ecode=s.substring(0,4);
					System.out.println("Employee Code:"+ecode);
					enm=s.substring(4,24);
					System.out.println("Employee Name:"+enm);
					ed=s.substring(24,39);
					System.out.println("Employee Department:"+ed);
					es=s.substring(39,45);
					System.out.println("Employee Salary:"+es);
					sal=Double.parseDouble(es);
					if(sal<=25000)
					it=0.1*sal;
					else if(sal>25000&&sal<=50000)
					it=0.2*sal;
					else
					it=0.3*sal;
					sal-=it;
					System.out.println("Income Tax:"+it);
					System.out.println("Net Salary:"+sal);
					
				}
				while((s=(br.readLine()).toString())!=null);	

			}
			catch(NullPointerException npe)
			{
				System.out.println("End of file encountered");
			}
			fr.close();
			break;
			case 3:
			FileWriter fw0=new FileWriter("Employee1.dat",true);
			StringBuffer sb0=new StringBuffer();
			do
			{
				System.out.println("Enter 4 digit Employee Code:");
				sb0.append(obj.readLine());
				System.out.println("Enter Employee's Name:");
				sb0.append(obj.readLine());
				count=24-sb0.length();
				for(i=1;i<=count;i++)
				sb0.append(" ");
				System.out.println("Enter Employee's Department:");
				sb0.append(obj.readLine());
				count=39-sb0.length();
				for(i=1;i<=count;i++)
				sb0.append(" ");
				System.out.println("Enter Employee's Salary:");
				sb0.append(obj.readLine());
				count=45-sb0.length();
				for(i=1;i<=count;i++)
				sb0.append(" ");
				record=sb0.toString();
				fw0.write(record);
				fw0.write("\n");
				sb0.delete(0,record.length());
				System.out.println("Do you want to enter more records(y/n):");
				choice=obj.readLine();
			}
			while(choice.equals("y"));
			fw0.close();
			break;
			case 4:
			FileReader fr1=new FileReader("Employee1.dat");
			FileWriter fw1=new FileWriter("temp1.dat");
			BufferedReader br1=new BufferedReader(fr1);
			System.out.println("Enter Employee code of record to delete:");
			er=obj.readLine();
			s1=(br1.readLine()).toString();
			try
			{
				do
				{
					ecode1=s1.substring(0,4);
					if(!er.equals(ecode1))
					{
						fw1.write(s1);
						fw1.write("\n");
					}
				}
				while((s1=(br1.readLine()).toString())!=null);
			}
			catch(NullPointerException npe)
			{
				System.out.println("End of file encountered");
			}
			fw1.close();
			fr1.close();
			File f1=new File("Employee1.dat");
			File f2=new File("temp1.dat");
			f1.delete();
			f2.renameTo(f1);
			break;
			case 5:
			FileReader fr2=new FileReader("Employee1.dat");
			BufferedReader br2=new BufferedReader(fr2);
			System.out.println("Enter Employee code for Searching:");
			sec=obj.readLine();
			s2=(br2.readLine()).toString();
			try
			{
				do
				{
					ecode2=s2.substring(0,4);
					if(sec.equals(ecode2))
					{
						ecode2=s2.substring(0,4);
						System.out.println("Employee Code:"+ecode2);
						enm2=s2.substring(4,24);
						System.out.println("Employee Name:"+enm2);
						ed2=s2.substring(24,39);
						System.out.println("Employee Department:"+ed2);
						es2=s2.substring(39,45);
						System.out.println("Employee Salary:"+es2);
					}
				}
				while((s2=(br2.readLine()).toString())!=null);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Reached end of file");
			}
			fr2.close();
			break;
			case 6:
			System.out.println("Terminating program");
			System.exit(0);
			break;
			default:
			System.out.println("Wrong Input");
		}
	}
}
			
							
			
			
									
					
			