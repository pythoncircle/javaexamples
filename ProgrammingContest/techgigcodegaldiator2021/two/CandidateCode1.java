
import java.io.*;
import java.util.*;
public class CandidateCode {

static boolean isPrime(int num)
{
boolean flag=false;

for(int k=2;k<=Math.sqrt(num);k++)
{

	if(num%k==0)
	{
	flag=true;
	break;
	}

}

return flag;
}


    public static void main(String args[] ) throws Exception {

Scanner in=new Scanner(System.in);
int totalLines=in.nextInt();

int [][]arr=new int[totalLines][2];

int []results=new int[totalLines];

//accepting
for(int k=0;k<totalLines;k++)
{

arr[k][0]=in.nextInt();
arr[k][1]=in.nextInt();

}

//displaying
for(int k=0;k<totalLines;k++)
{
System.out.print(arr[k][0]+" ");
System.out.println(arr[k][1]);
}



   }
}
