package src;

public class AppTest {
    public static void main(String[] args) {
        AndroidApp App = new AndroidApp("android");
        App.runAndroidApp();
        App.appInfo();


        IphoneApp App2 = new IphoneApp("IphoneApp");
        App2.runIphoneApp();
        App2.appInfo();
    }
}
