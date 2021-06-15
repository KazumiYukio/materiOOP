public class game {
    public static void main(String[] args){
        enemy musuh = new enemy();

        bird burung = new bird();
        burung.setDamage(7);
        burung.setD_peck(13);

        cat kucing =  new cat();
        kucing.setDamage(5);
        kucing.setD_scratch(15);

        musuh.Attack();

        burung.Attack();
        burung.Peck();

        kucing.Attack();
        kucing.Scratch();
    }
}
