import java.util.Scanner;
public class Pattern6 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if((j>=r-i-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
