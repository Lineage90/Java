import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
//        int check = 100;
//        int num1 = 150;
//
//        if (num1 > check) {
//            System.out.println("100보다 큰 수 입니다");
//        } else if (num1 > 50) {
//            System.out.println("50보다 큽니다");
//
//        }

//        char score = 'A';
//        switch (score) {
//            case 'A':
//                System.out.println("A등급");
//                break;
//            case 'B':
//                System.out.println("B등급");
//        }

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A등급");
        } else if (score >= 80) {
            System.out.println("B등급");
        } else if (score >= 70) {
            System.out.println("C등급");
        } else  {
            System.out.println("D등급");
        }
    }
}
