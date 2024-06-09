package src;

public enum DriverType {
    CHROME("chrome","C:\\Users\\aryba\\Downloads\\chromedriver-win64"),
    FIREFOX("firefox", "src/resources/firefox.exe");

    String name;
    String path;

    private DriverType(String name, String path) {
        this.name = name;
        this.path=path;
    }

}
