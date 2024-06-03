package src;

public class ReadOnly {
    private String name = "Ania";

    //opcja getter, wydobycia z prywatnego pola wartosc. Wartosc jest tylko do odczytu, nie mozna zmienic jej:
    public String getName() {
       return name + "jest ok";

}
    //metoda set: skrot klawiszowy alt+insert
public void setName(String name) {
        this.name = name;
}


}
