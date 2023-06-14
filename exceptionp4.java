import java.io.*;
class sample
{
     private String name;
     void accept() 
     {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("enter name");
              try{  
               name=br.readLine();}
              catch(Exception e){
                        e.printStackTrace();
                       // way to handle
                        }
        }
              void display()
             {
               System.out.println("name"+name);
              }
       }

 class exceptionp4
 {
      public static void main(String args[]) 
       {
                 sample s=new sample();
                     
                        s.accept();
                        s.display();
         }
}

            
