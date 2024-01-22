import java.util.*;
public class main {
    public static void main(String[] args) {
    
      System.out.println("Enter two Numbers");
      int a;
      int b;
        Scanner sc = new Scanner(System.in);
      a= sc.nextInt();
      b= sc.nextInt();
      System.out.println("Select The Operation");
      System.out.println("\n 1)Addition\n 2)Substraction\n 3)Multiplication\n 4)Division");
      int select;
      select=sc.nextInt();
      switch (select){
          case 1:
              int ad;
              ad=a+b;
              System.out.println("Addition is "+ad);
              break;
          case 2:
              int sb;
              sb=a-b;
              System.out.println("Substraction is "+sb);
              break;
          case 3:
              double mu;
              mu=a*b;
              System.out.println("Multiplication is "+mu);
              break;
         case 4:
              float dv;
              dv=a/b;
              System.out.println("Division is "+dv);
              break;     
         default:
             System.out.println("Invalid Choice!!!!!!!!! Try Again");
      }
    }
    
}
