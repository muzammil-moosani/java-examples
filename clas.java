import java.util.*;
public class clas
{
	public static void main(String args[])
	{
		int roll[]=new int[3];
		String name[]=new String[3];
		Double sub[][]=new Double[3][4];
		 int count,i,j;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			count=0;
			System.out.println("Enter details of student"+(i+1));
			System.out.println("Enter roll no:");
			roll[i]=sc.nextInt();
			System.out.println("Enter name:");
			name[i]=sc.next();
			for(j=0;j<4;j++)
			{
				System.out.println("Enter sub"+(j+1)+" marks:");
				sub[i][j]=sc.nextDouble();
				if(sub[i][j]>75)
				count++;
			}
			System.out.println("Number of subjects for student"+(i+1)+ " in which he has secured more than 75 marks are: "+count);
		}
	}
}
						
			
		