import java.util.Scanner;

public class tinhngay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("tháng nào bạn muốn đếm:");
        int moth = scanner.nextInt();

        switch (moth) {
            case 2:
                System.out.print("tháng 2 có 28 or 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("tháng " + moth + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11 :
                System.out.print("tháng " + moth + " có 30 ngày");
                break;

            default:
                System.out.println("sai rồi");
                break;

        }

    }
}

