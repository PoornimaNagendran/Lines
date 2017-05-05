package Guvi;
import java.util.Scanner;
public class Lines {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Count number of lines");
System.out.println("Enter the paragraph");
String a=s.nextLine();
int count=0;
for(int i=0;i<a.length();i++)
{
	if(a.charAt(i)=='.')
	{
		count++;
	}
}
System.out.println("Count is "+count);
	}

}
