import java.util.Scanner;

class main {
    public static int arrangecoins(int n) {
        int k = 0;
        while (n >= k + 1) {
            n-= k+1;
            k++;
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int value= arrangecoins(n);
        System.out.println(value );
    }

}
