import java.util.Scanner;
public class IndexString
{
    public static int index(String s,char ch)
    {
        for (int i=0;i<s.length();i++)
        {
            if(ch==s.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }
public static void main(String args[])
{
        Scanner sc =new Scanner(System.in);
        String s="Sahil Sudhir Londhe";
        System.out.println("Enter the character of string :");
        char ch=sc.next().charAt(0);
        System.out.println("Index of "+ch+" is :");
        System.out.println(index(s,ch));
        System.out.println(s.indexOf(ch));

    }
}