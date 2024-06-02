package src;

public class CompanyTest {

    public static void main(String[] args) {
        MCO MCO = new MCO("Kasia", "Kowalska");
        AIS AIS = new AIS("Żaneta", "Jagodzka");

        AIS.hobby();
        AIS.money();
        MCO.hobby();
        MCO.money();
    }

}
