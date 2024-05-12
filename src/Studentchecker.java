package src;

public class Studentchecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student Student1 = new Student();
        Student1.imie = "Ania";
        Student1.nazwisko = "Rybacka";
        Student1.nick = "angie";
        Student1.email = "angie@ais.pl";
        Student1.numerIndeksu = 8;
        String uczelniaAni = Student1.nazwaUczelni;
        Student1.infoUczelnia();

        Student Student2 = new Student();
        Student2.imie = "Wiktoria";
        Student2.nazwisko = "Musialska";
        Student2.nick = "Victoria";
        Student2.email = "Victoria@ais.pl";
        Student2.numerIndeksu = 9;

        Student Student3 = new Student();
        Student3.imie = "Dawid";
        Student3.nazwisko = "Rybacki";
        Student3.nick = "Ryba";
        Student3.email = "dawid@rybacki.pl";
        Student3.numerIndeksu = 10;


        Student [] Studenci = new Student[3];
        Studenci[0] = Student1;
        Studenci[1] = Student2;
        Studenci[2] = Student3;

        for (int i=0; i<Studenci.length; i++) { //lub i<3 - wywoluje  wszystkich studentow, i=0 bo zaczynam od 0 liczyc
            System.out.println(i);
            System.out.println(Studenci[i]);

            Studenci[i].przedstawSie();
            Studenci[i].zalogujSie();
            Studenci[i].podajEmail();
            Studenci[i].podajNrIndeksu();
        }


    }
}






