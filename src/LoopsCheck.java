package src;

public class LoopsCheck {
    public static void main(String[] args) {

      /*  for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
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
        System.out.println(numbers [2]);  */

        int[] numbers = new int[]{1, 3, 5, 7, 0};

        for (int i = 0; i < (numbers.length / 2); i++) {
            int temp = numbers[i]; // dla i=0 1 i=1  3
            System.out.println(numbers[i]);
            System.out.println(numbers[numbers.length - 1 -i]); //'numbers.length -1 oznacza ze wskazujesz na ostatnia liczbe w tablicy bo liczy sie od zera
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
            System.out.println("interacja numer " + i);}

            for (int i=0; i<numbers.length; i++){
                System.out.println(numbers[i]);
            }


        }
    }

