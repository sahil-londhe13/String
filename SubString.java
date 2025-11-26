import java.util.Scanner; 
public class SubString
{
    public static String Substring(String s,int start,int end)
    {
        String s1="";
        for(int i=start;i<end;i++)
        {
            s1=s1+s.charAt(i);
        }
        return s1;

    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s="Bright Path";
        System.out.println("Enter the start of string");
        int start=sc.nextInt();
        System.out.println("Enter the end of string");
        int end=sc.nextInt();
        System.out.println(Substring(s,start,end));
    }

}
