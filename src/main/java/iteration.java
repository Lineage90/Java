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

        int i = 0;
        int sum = 0;

        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            sum += (i + 1);
            i++;
        }
        System.out.println(sum);
    }
}
