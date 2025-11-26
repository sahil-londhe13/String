public class StringTest1{
    public static void main(String args[])
    {
        String s ="Bright"+"Path";
        String s1=new String("BrightPath");
        String s2=s1.concat("Institute");
        String s4=new String ("BrightPathInstitute");
        String s5=("BrightPath");
        System.out.println(s2==s4);
        System.out.println(s1==s4);
        System.out.println(s==s5);
        System.out.println(s2.equals(s4));
    }
}