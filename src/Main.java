
public class Main {
    public static void main(String[] args) {
        Mannschaft Inter=new Mannschaft(new OffensiveStrategie(),"Inter");
        Mannschaft Roma=new Mannschaft(new DefensiveStrategie(),"Roma");

        Inter.fuehreStrategieAus();

        System.out.println(Inter.getMannschaftsname());


    }
}