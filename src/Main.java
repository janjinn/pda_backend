public class Main {
    public static void main(String[] args) {
        Job jobPhone = new Job("잡스", "애플");
        Yong youngPhone = new Yong("재용", "삼송");

        jobPhone.buy();
        jobPhone.turnOn();
        jobPhone.alarm();

        System.out.println();

        youngPhone.buy();
        youngPhone.turnOn();
        jobPhone.alarm();
    }
}
