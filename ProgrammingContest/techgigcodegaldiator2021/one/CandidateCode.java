/*

coronavirus
3
abcde
crnas
onarous

*/

/*
outer loop
let w=first blood composition
tempviruscomposition=viruscomposition
10 for each character c in w
   check the presence of c in tempviruscomposition
         if c is present in tempviruscomposition
             delete c in tempviruscomposition
         else
             exit inner loop
        goto 10           

*/



import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	Scanner in=new Scanner(System.in);

	String virusComposition="";
while(true)
{
        virusComposition=in.next();
	int len=virusComposition.length();
         if(len>=1 && len<=100000)
         break;
         System.out.println("the total number of characters for virusComposition must be in the range of 1-100000");                     
}


        

int peopleCount=0;

while(true)
{
	peopleCount=in.nextInt();
         if(peopleCount>=1 && peopleCount<=10)
         break;
         System.out.println("Number of People must be in the range of 1-10");                     
}

         
        String []bloodCompositions=new String[peopleCount];
        String []bloodCompositionResults=new String[peopleCount];

       for(int k=0;k<peopleCount;k++)
        {
		while(true)
		{
		bloodCompositions[k]=(in.next()).toLowerCase();
	         if(bloodCompositions[k].length()>=1 && bloodCompositions[k].length()<=virusComposition.length())
         break;
         System.out.println("the total number of characters for bloodcomposition must be in the range of 1-100000");                     
		}
        }



for(int k=0;k<peopleCount;k++)
{
String tempVirusComposition=virusComposition;
String currentBloodComposition=bloodCompositions[k];
char currentBloodCompositionChars[]=currentBloodComposition.toCharArray();

boolean flag=false;
 for(int m=0;m<currentBloodCompositionChars.length;m++)
   {
    char ch=currentBloodCompositionChars[m];
    int indexOfCh=	tempVirusComposition.indexOf(ch);

    if(indexOfCh==-1)
     {
     flag=true;    
     break;       
     }
     else
     {
     tempVirusComposition=tempVirusComposition.replace(Character.toString(ch),"");
     }
   }
   if(flag)
     bloodCompositionResults[k]="NEGATIVE";
   else
     bloodCompositionResults[k]="POSITIVE"; 
   }

        for(int k=0;k<peopleCount;k++)
        {
        System.out.println(bloodCompositionResults[k]);
        }

   }

}

