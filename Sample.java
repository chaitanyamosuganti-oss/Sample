import java.util.*;
class Sample{
public static void main(String args[]){
System.out.print("To check given number is Prime or Not");
int n,i,count;
Scanner s1=new Scanner(System.in);
System.out.println("enter any number");
n=s1.nextInt();
for (i=2;i<n;i++)
{
	if(n%i==0)
		count++;
}
if(count==0)
	Sytem.out.println(n+"	is a prime number");
else
	System.out.println(n+"	is not a prime number");
}
}
