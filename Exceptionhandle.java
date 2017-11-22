/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandle;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
 class derived {

    /**
     * @param args the command line arguments
     */
    public void trialfunction() throws Exception
    {
            String languages[] = { "C", "C++", "Java", "Perl", "Python" };
 

      //int a,b,c;
      Scanner s=new Scanner(System.in);
      int a=Integer.parseInt(s.next());
       int b=Integer.parseInt(s.next());
       //try
       //{
       int r=a/b;
   System.out.println(r);
       
       //int c1=Integer.parseInt(s.next());
    for (int c = 1; c <= 5; c++) {
       System.out.println(languages[c]);
    //}
  }
  
  /*catch (ArithmeticException e1)
  {
      System.out.println(e1);
  }
  catch (Exception e) {
    System.out.println(e);
  }*/
    }
       
        // TODO code application logic here
    
  }
     
class Exceptionhandle extends derived
{
    public void trialfunctionexception()
    {
       derived ee=new derived();
       try
       {
       ee.trialfunction();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       }
    
 public static void main(String[] args) {
Exceptionhandle d=new Exceptionhandle();
d.trialfunctionexception();
}
}    

