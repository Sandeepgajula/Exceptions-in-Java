import java.io.*;
import java.lang.*;

class exceptionp10
{
       public static void main(String args[])
       {
               System.out.println("open files");
                int size=args.length;
                try
                {
                      int parameters=50/size;
                 }
                catch(ArithmeticException ae)
                 {
                       System.out.println(ae);
                       ae.printStackTrace();
                  }
            int b[]={1,2,3,4,5};
                   try { 
                         b[50]=100;
                    }
             catch(ArrayIndexOutOfBoundsException ae)
              {
                  ae.printStackTrace();
              }
            
                 finally {
                              System.out.println("close files");
                        }
          }
}
