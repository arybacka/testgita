package src;

public class LoopsCheck {
    public static void main(String[] args) {

      /*  for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }  */
        int[] numbers = new int[] {1,3,5};
        System.out.println(numbers [0]);
        System.out.println(numbers [1]);
        System.out.println(numbers [2]);

        numbers[0]=5;
       // System.out.println(numbers[0]);
        numbers[2]=1;
       // System.out.println(numbers[2]);

        System.out.println("nowa kolejnosc");
        System.out.println(numbers [0]);
        System.out.println(numbers [1]);
        System.out.println(numbers [2]);
    }
}