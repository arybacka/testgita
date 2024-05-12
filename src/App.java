package src;

public class App {
    public String name;

    public App(String name) { // konstruktor
        System.out.println("jestem w konstruktorze name");
        this.name= name;
    }
    public void appInfo() {
        System.out.println("Jestem w metodzie AppInfo");
    }

}
