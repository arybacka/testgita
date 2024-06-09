package src;

public class Student2Test {
    public static void main(String[] args) {
    Student2 it = new ITStudent();
    sayHello("John", it, 21);

    Student2 med = new Student2() {
        @Override
        public void sayHello(String name, int age) {
            System.out.println("I will be a doctor");
            System.out.println("My name is " + name);
        }
    };
    sayHello("Kate", med, 31);

    //lambda: parametr -> sout("My name is " + name);
        //jezeli przekazujemy dwa parametry to np. (name, age)

    Student2 noStudent = (name, age) -> {
        System.out.println("I am not a student, My name is " + name + " I am " + age);
    if(age>18) {
        System.out.println("You can buy a beer");
    }
    };
        sayHello("Tom", noStudent, 21);

    }

        public static void sayHello(String name, Student2 student, int age) {
            student.sayHello(name, age);
        }
    }

