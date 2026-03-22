import java.util.Scanner;
public class Pattern4 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==0&&j<c)||(i==r-1&&j<c)){
                    System.out.print("*");
                }
               else if((j==0&&j<r-2)||(j==c-1&&i>0&&i<r-1))
               System.out.print("*");
               else
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}
