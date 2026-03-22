import java.util.Scanner;
public class Pattern5 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i>=j){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
