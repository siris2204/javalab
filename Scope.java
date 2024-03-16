class Scope
{  
    public static void main(String[] ar)
    {    
         int x=10;
         if(x==10)
         {
             int y=20;
             System.out.println("x is "+x+" and y is "+y);
             x=y*2;
          }
         System.out.println("x is "+x);
    }
}
