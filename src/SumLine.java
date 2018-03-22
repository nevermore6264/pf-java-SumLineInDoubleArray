import java.util.Scanner;

public class SumLine {
    public static void main(String[] args) {
        int n;  // bậc của ma trận vuông
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n : ");
        n = scanner.nextInt();

        int array[][] = new int[n][n];

        System.out.println("Enter element: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Output array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Sum diagonal line = " + sum);
    }
}
