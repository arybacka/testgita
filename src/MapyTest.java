package src;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        //dodawanie elementow
        students.put(1, "Basia");
        students.put(2, "Tomek");
        students.put(3, "Basia");
        students.put(2, "Krysia");

        System.out.println(students.get(1));
        System.out.println(students.get(2));

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);

        //czy mapa zawiera jakis klucz
        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Pawel"));

        //sprawdzanie czy mapa jest pusta
        System.out.println(students.isEmpty());
        //sprawdzanie rozmiaru mapy
        System.out.println(students.size());

        //usuwanie elementu
        students.remove(1);
        System.out.println(students.size());

for(Integer key: students.keySet()) {
    System.out.println(key);
    System.out.println(students.get(key));
}

for(String student: students.values()); {
            System.out.println(students);
        }
    }
}
