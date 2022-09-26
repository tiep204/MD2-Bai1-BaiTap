
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhập tiền đô la chăm vào đây:");
        int tienDo = sc.nextInt();
        int tienViet = 23000*tienDo;
        System.out.println("so tien quy doi ma bạn doi dươc la:"+tienViet);
    }
}