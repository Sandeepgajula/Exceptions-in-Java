import java.io.*;
import java.lang.*;

class exceptionp2
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
                 finally {
                              System.out.println("close files");
                        }
          }
}
