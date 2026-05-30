package Day7;

public class Day7 {
    public static void main(String[] args) {
//        Airplane boing = new Airplane("Boeing", 2010, 200, 2000);
//        Airplane scat = new Airplane("Scat", 2012, 190, 1800);
//
//        boing.fillUp(20);
//        scat.fillUp(20);
//
//        Airplane.compareAirplanes(boing, scat);

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();

        int stam = p1.getStamina();

        Player.info();
        System.out.println(p1.getStamina());
        for(int i=0; i<stam; i++){
            p1.run();
        }
        Player.info();
        Player p7 = new Player();
        Player.info();
        System.out.println(p1.getId());
        System.out.println(p2.getId());
        System.out.println(p3.getId());
        System.out.println(p4.getId());
        System.out.println(p5.getId());
        System.out.println(p6.getId());

        System.out.println(Player.getCountPlayers());

    }
}
