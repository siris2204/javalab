import java.util.*;
class StringBuff{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String s1= sc.next();
        s1.concat("hey");
        System.out.println("String after concatenation is "+s1);
        StringBuffer sb=new StringBuffer("hello");
        sb.append("hi");
        System.out.println("String after appending is "+sb);
        StringBuffer sb1= new StringBuffer("world");
        sb1.insert(0,"wide");
        System.out.println("String after INSERTING is "+sb1);
        sb.reverse();
        System.out.println("reversed string is "+sb);
        StringBuffer sb3= new StringBuffer("hello oak");
        sb3.replace(6,9,"java");
        System.out.println("String after REPLACEMENT is "+sb3);
    }
}