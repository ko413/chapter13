public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミナト");
        System.out.println(h.getName() + "の現在のHP: " + h.setHp(40));
        King k = new King();
        k.talk(h);
        Inn i = new Inn();
        i.checkIn(h);
        h.sleep();
        Matango m = new Matango();
        m.suffix = 'A';
        h.attack(m);
    }
}