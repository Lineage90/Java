import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5];
        System.out.println((Arrays.toString(stringEmptyArray)));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        String s = "spartan quiz";
        int a = 10;
        char c = 's';

        System.out.println(s);
        System.out.println(a);
        System.out.println(c);
        System.out.println((c + "" + a));

        int[] intArray_b = new int[] {10, 20, 30};
        System.out.println(intArray_b[intArray_b.length - 1]);
    }
}
