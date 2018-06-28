import java.util.*;
public class Task
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strArray[]=str.split(" ");
        int c=0;
        for(int i=0;i<strArray.length;i++)
        {
            if(strArray[i].length()%2==0)
            {
                int ucount=0,lcount=0;c=0;
                for(int j=0;j<strArray[i].length();j++)
                {
                    if(strArray[i].charAt(j)>='A' && strArray[i].charAt(j)<='Z')
                    {
                        ucount++;
                        continue;
                    }
                    else if(strArray[i].charAt(j)>='a' && strArray[i].charAt(j)<='z')
                    {
                        lcount++;
                        continue;
                    }
                    else
                    {
                        c++;
                    }
                }
                System.out.println(ucount+" "+lcount);
                if(c==-1)
               {
                System.out.print(strArray[i]+" ");
               }
            }
        }
        
    }
}


/*Equal word

A sentence is given as input which contains multiple words. You need to find and print the Equal word.
Rules to find the Equal word in the given sentence is given below
1. Length of the word must be even.
2. Word should contains equal number of upper case and lower case letters.
3. Word should contains only alphabetic characters.

Note1: Each word in the sentence may be the combination of upper case letters,lower case letters, digits, special characters.
Note2: The given sentence contains only one Equal word

Example 1:
   Input: Waiting to fAcE New Challenges
         In the given input sentence the Equal word is fAcE because this is the only word satisfies all rules
Example 1:
   Input: Waiting To fA2cE New Challenges
         In the given input sentence the Equal word is To because this is the only word satisfies all rules.*/
