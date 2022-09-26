import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap một số có 3 chữ số: ");
        int a, b, c;
        int num = scanner.nextInt();
        a = num / 100;
        b = (num % 100) / 10;
        c = (num % 100) % 10;
        switch (a) {
            case 0:
                System.out.println("không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốm");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("chín");
                break;
            default:
                System.out.println("khong co dau");
        }
        switch (b){
            case 0:
                System.out.println("không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốm");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("chín");
                break;
            default:
                System.out.println("khong co dau");
        }
        switch (c){
            case 0:
                System.out.println("không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốm");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("chín");
                break;
            default:
                System.out.println("khong co dau");
        }
    }
}
