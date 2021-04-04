import java.io.*;
import java.util.*;

public class CandidateCode2 {

static boolean isPrime(int num)
{
boolean flag=true;

for(int k=2;k<=Math.sqrt(num);k++)
{
	if(num%k==0)
	{
	flag=false;
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

for(int k=0;k<totalLines;k++)
{
int min=arr[k][0];
int max=arr[k][1];

int difference=max-min;
ArrayList al=new ArrayList(difference);


for(int m=min;m<=max;m++)
{
boolean checkPrime=isPrime(m);

if(checkPrime)
al.add(m);

}

Collections.sort(al);
if (al.size()==0)
{
results[k]=-1;
}
else if(al.size()==1)
{
results[k]=0;
}
else if(al.size()>1)
{
int smallPrime=(int)al.get(0);
int bigPrime=(int)al.get(al.size()-1);
results[k]=bigPrime-smallPrime;
}

}


for(int k=0;k<totalLines;k++)
{
System.out.println(results[k]);
}

}

   
}
