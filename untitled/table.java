import java.util.Scanner;
 public class table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1 ;
        do{
            System.out.println(a*i);
            i = i +1;
        }while(i<=10);



    }
}
