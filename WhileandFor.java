import java.util.*;
class WhileandFor
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the limit: ");
        int i=0;
        int n=sc.nextInt();
        System.out.println("enter the marks: ");
        int marks[] = new int[n];
        while(i<n)
        {
            marks[i]=sc.nextInt();
            i++;
        }
        System.out.println("the marks you entered are:");
        for(i=0;i<n;i++){
            System.out.println(marks[i]);
        }
    }
}