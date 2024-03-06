import java.util.Scanner;

public class Timeconvert  

{

 public static void main(String[] args)  

 {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the minutes: ");
   int t=s.nextInt();
   int hr=t/60;
   int min=t%60;
   String result;
   result=""+hr;
   if(min<10)
     result=result +":0"+min;
   else
     result=result +":"+min;
   System.out.println(result);

 }

}