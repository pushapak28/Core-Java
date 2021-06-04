import java.util.Scanner;
class EvenSum{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count = 0;
      int i=0;
      while(i<n){
        count = count+(2*i);
        i++;
      }
      System.out.println(count);
      
    }
  
}
