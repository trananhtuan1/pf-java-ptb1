import java.util.Scanner;

public class ptbac1 {
        public static void main(String[] args) {
            System.out.println("giai phuong trinh");
            System.out.println("ta co pt 'ax + b = 0' hãy nhập các số");

            Scanner scanner = new Scanner(System.in);

            System.out.println("a=");
            double a = scanner.nextDouble();

            System.out.println("b");
            double b = scanner.nextDouble();

            if (a != 0) {
                double trunggian = -b/a ;
                System.out.println("ketqua = " + trunggian);
            }
            else {

                System.out.println("lỗi");

            }
        }

    }


