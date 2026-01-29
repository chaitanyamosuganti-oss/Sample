class Sample{
public static void main(String args[]){
System.out.print("To check given number is Prime or Not");
int n=6,i,count=0;
System.out.println("enter any number");
for (i=2;i<n;i++)
{
	if(n%i==0)
		count++;
}
if(count==0)
	System.out.println(n+"	is a prime number");
else
	System.out.println(n+"	is not a prime number");
}
}
