import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= nums[0] && nums[i] <= n) {
                count++;
            }
        }

        
        System.out.println(count);
    }
}
