package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class quiz
{
	void meth1() throws Exception
	{
		Scanner d=new Scanner(System.in);
		System.out.println("*****WELCOME TO QUIZ COMPITION*****\n");
		System.out.println("Enter your login \n1.Teacher\n2.Student");
		int id=  (d.nextInt());
		d.nextLine();
		System.out.println("Enter your name");
		String name=d.nextLine();
		if(id==1)
		{
			System.out.println("Welcome Teacher Mr/Miss. "+name+" To Quiz Compition");
		}
		if(id==2) 
		{
			System.out.println("Welcome "+name+" Student from ZPHS school");
		}
		switch(id)
		{
		case 1:
			{
			System.out.println("Teacher now perform any operation :\n1.write data\n2.Read data");
			int a=d.nextInt();
			d.nextLine();
			switch(a)
			{
			case 1:
			{
				System.out.println("Connected to quiz complition\n");
			FileOutputStream f=new FileOutputStream("C:\\Users\\USER\\Downloads\\text1.txt");
			System.out.println("write question to students\n");
		 String msg=(d.nextLine());
			byte arr[]=msg.getBytes();
			f.write(arr);
			f.close();
			System.out.println("Your Question Successfully saved");
			break;
			}
			case 2:
			{
			System.out.println("Teacher Mr/Miss "+name+" Read the Answers and Evolute it\n");
			FileInputStream fi=new FileInputStream("C:\\Users\\USER\\Downloads\\text1.txt");
			int i;
			while((i=fi.read())!=-1)
			{
				System.out.print((char)i);
			}
			fi.close();break;
			}}break;}
		case 2:
			System.out.println("student\n");
			System.out.println("hello "+name+" welcome to Quiz Complition ");
			FileInputStream fa=new FileInputStream("C:\\Users\\USER\\Downloads\\text1.txt");
			System.out.println("connected to read data");
			int i;
			while((i=fa.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			FileOutputStream f1=new FileOutputStream("C:\\Users\\USER\\Downloads\\text1.txt",true);
			System.out.println("connected to quiz complition");
			System.out.println("write the answer to above question");
			String msg1=d.nextLine();
			byte arr1[]=msg1.getBytes();
			f1.write(arr1);
			f1.close();
			break;}
		d.close();
	}
	static
	{
		System.out.println("HELLO WELCOME TO QUIZ WITH STATIC BLOCK IT IS OK GUYS...");
	}
	public static void main(String[] args) throws Exception
	{
		new quiz().meth1();
	}
}
