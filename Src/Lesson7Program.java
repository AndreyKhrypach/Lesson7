import java.util.Arrays;
import java.util.Scanner;

public class Lesson7Program {
    public static final int MY_NUM = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введи число");
        int bbbbb = sc.nextInt();
        System.out.println(bbbbb);
        Integer a = new Integer(1);
        Long long1 = new Long(1234);
        long long2 = long1;
        Double dbl = new Double(234.6678);
        double dbl2 = dbl;
        Character c = new Character('A');
        char c2 = c;
        Boolean b12 = new Boolean(true);
        boolean b13 = b12;
        Integer a14 = 14;
//        if(a14 == null)
//            a14 = 14;
        int a15 = a14;
        int b = a;
        a = a +3;
        int[] arr1 = new int[]{1,2,3,4,5};
        Integer[] arr2 = new Integer[arr1.length];

        System.out.println(Arrays.toString(arr2));
        Arrays.setAll(arr2, i -> arr1[i]);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr2.length];
        //Arrays.setAll(arr3, i -> arr2[i]);

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr2[i];
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//        Dog dog = new Dog();
//        dog.voice();
//        dog.name = "Sharik";
//        dog.age = 2;
//        System.out.println(dog.name + " " + dog.age);
//
//        Lesson7Program lesson = new Lesson7Program();
//        int a = 1;
//        System.out.println(a);
//        String str = incrementValue(a, 9);
//        System.out.println(a);
//        System.out.println(str);
//
//        int b = lesson.incrementValue();
//        System.out.println(b);
    }
    public int incrementValue(){
        return MY_NUM + 1;
    }
    static String incrementValue(int value, int cycleNum){
        for (int i = 0; i < cycleNum; i++) {
            value++;
        }
        return String.valueOf(value);
    }
}
