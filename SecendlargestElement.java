import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int max=a[0];
            int max2=Integer.MIN_VALUE;
            for(int j=0;j<a.length;j++){
                if(a[j]>max){
                    max2=max;
                    max=a[j];
                }
                else if(a[j]>max2 && a[j]!=max){
                    max2=a[j];
                }
            }
            int sum=max+max2;
            System.out.println(sum);
        }
    }
}
