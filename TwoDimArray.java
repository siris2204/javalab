import java.util.*;
public class TwoDimArray{
    public static void main(String[] args){
        int marks [][]= new int[10][2];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter roll.no and marks");
        for (int i=0;i<marks.length;i++)
        {
            System.out.println("roll.no");
            marks[i][0]=sc.nextInt();
            System.out.println("marks");
            marks[i][1]=sc.nextInt();
        }
        for(int i=0; i<marks.length;i++){
            System.out.println("roll no "+marks[i][0]+"marks "+marks[i][1]);
        }
    }
}