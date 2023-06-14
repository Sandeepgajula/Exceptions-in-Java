import java.io.*;
import java.lang.*;

class sample
{
    static void demo() 
    {
            try {
                      System.out.println(" inside demo()");
                      throw new NullPointerException("exception details");
                }
             catch(NullPointerException ne)
             {
                     ne.printStackTrace();
             }
        }
}

class exceptionp6
{
       public static void main(String args[])
        {
              sample.demo();
         }
}
