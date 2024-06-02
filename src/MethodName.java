package src;

public class MethodName {
    public void add (int a, int b) {
        System.out.println(a +b);
    }

    public void add(int a, int b, int c) { //dwie metody o tej samej nazwie ale o innych parametrach nazywa sie przeciazanie metod
        System.out.println(a+b+c);
    }

    public void add (int a) {
        System.out.println(a);
    }

    public void add (String a) {
        System.out.println(a);
    }

    public void add () {
            System.out.println(2+1);
    }
    }

