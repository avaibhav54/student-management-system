package studentmanagementsystem;
import java.io.*;
import java.util.*;
import java.lang.*;
import  com.student.manager.student;
import  com.student.manager.cp;
import com.student.manager.insertda;
public class start {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("hello vaibhav welcomes you to student management system\n");
		while(true) 
		{
			System.out.println("press 1 for add student \npress 2 for delete student \npress 3 to display student\npress 4 to exit\n--------------------------");
			int c=sc.nextInt();
			if(c==4)
			{
				System.out.println("Thank you");
				break;
			}
			else if(c==1) 
			{
				System.out.println("enter user name");
				String uname = sc.next();
				System.out.println("enter phone number");
				String unum = sc.next();
				System.out.println("enter city");
				String ucity = sc.next();
				student st=new student(uname,unum,ucity);
				boolean ans=insertda.insertto(st);
				if(ans)
				System.out.println("inserted successfully\n*********************");
			}
			else if(c==2)
			{
				System.out.println("enter user id ");
				int uid = sc.nextInt();
				boolean ans=insertda.deletestu(uid);
				if(ans)
				System.out.println("deleted successfully\n************************");
				
			}
			else if(c==3)
			{
				insertda.show();
			}
			else
			{
				System.out.println("invalid input\n----------------------------------");
			}
		}
		
	}

}
