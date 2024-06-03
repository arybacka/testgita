package src;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b; //wykonanie dzialania ktorego wynikiem jest c. Pod spodem java konwertuje nam niejawnie int na double.
                        //jezeli byloby to na odwrot to stracilibysmy w b to co po przecinku


        //samodzielne konwertowanie double na int (wtedy tracimy to co po przecinku w b):
        int d = a/(int) b;

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();
    }
}
