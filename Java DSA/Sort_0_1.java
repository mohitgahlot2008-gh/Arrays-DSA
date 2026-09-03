import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zeros=0;
        for(int i=0;i<n;i++) {
            if(sc.nextInt()==0) {
                zeros++;
            }
        }
        for(int i=0;i<zeros;i++) {
            System.out.print("0 ");
        }
        for(int i=zeros;i<n;i++) {
            System.out.print("1 ");
        }
    }
}
