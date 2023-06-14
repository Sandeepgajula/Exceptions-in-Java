import java.io.*;
class sample
{
     private String name;
     void accept() 
     {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("enter name");
                
               name=br.readLine();
        }
              void display()
             {
               System.out.println("name"+name);
              }
       }

 class exc
 {
      public static void main(String args[]) 
       {
                 sample s=new sample();
                     
                        s.accept();
                        s.display();
         }
}

            
