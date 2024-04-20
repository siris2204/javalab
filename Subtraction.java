package arithematic;
public class Subtraction
{   
    private int d1,d2;
    public Subtraction(int n1, int n2)
    {
        this.d1=n1;
        this.d2=n2;
    }
    public void difference()
    {
        System.out.println("difference of the given numbers is"+(d1-d2));
    }
}