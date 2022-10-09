import java.util.Scanner;
public class VowelLowerandUpperCase {
public static void main(String[] args)
    {
        String word;
        int numberofvowels=0;

    Scanner kb = new Scanner(System.in);
    System.out.println("Input a one-word String: ");
    word=kb.next();
    word=word.toUpperCase();
   int acount=0;
   int ecount=0;
   int icount=0;
   int ocount=0;
   int ucount=0;

    for(int i=0;i<word.length();i++)
    {
        char ch=word.charAt(i);
    if(ch=='A' ||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
        {
            numberofvowels++;
        }
    if(ch=='A'){
        acount++;
    }
    if(ch=='E'){
        ecount++;
    }
        if(ch=='I'){
            icount++;
        }
        if(ch=='O'){
            ocount++;
        }
        if(ch=='U'){
            ucount++;
        }
    }
        System.out.print("The word "+word+" has "+numberofvowels+" vowels. It has "+acount+
                " A, "+ecount+" E ,"+icount+" I, "+ocount+" O, "+ucount+" U.");

    }}
