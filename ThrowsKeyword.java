// throws keyword

class ThrowsKeyword
{
 void div(int a, int b) throws ArithmeticException
 {
    int c;
    if(b==1)
     {
       throw new ArithmeticException("/ by one");
     }
    else
     {
       c=a/b;
       System.out.println(c);
     }
 }

 public static void main(String args[])
 {
   ThrowsKeyword t1= new ThrowsKeyword();
   ThrowsKeyword t2= new ThrowsKeyword();
   try
    {
      t1.div(10,2);
      t2.div(10,1);
    }
 
  catch(ArithmeticException e)
   {
     System.out.println(e);
   }

 }
}