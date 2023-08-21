public class iteration {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//

//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday"};
//
//        for (String day: days) {
//            System.out.println(day);
//        }

//        int i = 0;
//        int sum = 0;
//
//        while (i < 10){
//            sum += (i + 1);
//            i++;
//        }
//        System.out.println(sum);

//        int i = 0;
//        int sum = 0;
//
//        while (i < 10) {
//            if (i == 4) {
//                i++;
//                continue;
//            }
//            sum += (i + 1);
//            i++;
//        }
//        System.out.println(sum);

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//        for (int i = 5; i >= 0; i--) {
//            if (i == 0) {
//                System.out.println("발사 ~");
//                break;
//            }
//            System.out.println("카운트 다운 :" + i);
//        }

        int sumA = 0;
        int sumB = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                sumA += i;
            } else if (i % 2 != 0) {
                sumB += i;
            }

        }
        System.out.println(sumA);
        System.out.println(sumB);
    }
}
