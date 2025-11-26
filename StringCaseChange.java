import java.util.Scanner;
public class StringCaseChange
{
    public static String CaseChange(String s)
    {
      String s1="";
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
        {
            s1=s1+((char)(s.charAt(i)+32));
        }
        else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
        {
            s1=s1+((char)(s.charAt(i)-32));
        }
      }  
      return s1;      
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String :");
    String s=sc.nextLine();
    System.out.println("After case change String is :");
    System.out.println(CaseChange(s));
}
}