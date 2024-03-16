class MulTable
{  
    public static void main(String[] ar)
    {    
         int n= Integer.parseInt(ar[0]);
         System.out.println("MULTIPLICATION TABLE OF "+ar[0]);
         for(int i=1; i<=10; i++)
         {
              System.out.println(n+"x"+i+"="+n*i);
          }
     }
}