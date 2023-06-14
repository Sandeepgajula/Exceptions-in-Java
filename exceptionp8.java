import java.io.*;
import java.lang.*;

class MyException extends Exception
{
      private static int accno[]={1001,1002,1003,1004,1005};
      private static String name[]={"ram","naresh","suresh","mahesh","rakesh"};
      private static double bal[]={10000,20000,300,40000,50000};
      
      MyException()
      {}

     MyException(String str)
     {
            super(str);
     }
   public static void main(String args[])
   {
       
   
             for(int i=0;i<5;i++)
             {
                  System.out.println(accno[i]+"  "+name[i]+"  "+bal[i]);
                   try{
                  if(bal[i]<1000)
                  {
                         MyException me=new MyException("Balanace is less ");
                         throw me;
                   } }
 catch(MyException me)
         {
                    me.printStackTrace();
         }
                
            
            }
       
    }
} 
