package ornek1;

public class Main {
    public static void main(String[] args) {
        Hund angelo = new Hund("Angelo", "Pitbull");
        angelo.laufen();
        angelo.setLaufverhalten(new LangsamesLaufen());
        angelo.laufen();



    }
}
