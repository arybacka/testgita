package src;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "university");
      /*  teacher.name = "Tom";
        teacher.age = 29;
        teacher.school = "university"; */
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();

        Footballer footballer = new Footballer("Mike", 21, "Lech Poznan");
      /*  footballer.name = "Mike";
        footballer.age = 21; */
        footballer.walk();
        footballer.eat();
     //   footballer.footballClub= "Lech Poznan";
        footballer.playFootbal();
    }
}
