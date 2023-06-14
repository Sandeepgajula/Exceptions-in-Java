import java.io.*;
import java.lang.*;

class A
{
     void method1()
     {
            try
            {
                 String str="hello";
                  char ch=str.charAt(5);
             }
           catch(StringIndexOutOfBoundsException sie)
           {
               System.out.println("please see the index within the range");
                throw sie;
           }
      }
}

class exceptionp9
{
          public static void main(String args[])
           {
                  A a=new A();
                  try
                   {
                       a.method1();
                    }
              catch(StringIndexOutOfBoundsException sie)
           {
               System.out.println("caught the rethrown exception");
                
           }
        }
}
