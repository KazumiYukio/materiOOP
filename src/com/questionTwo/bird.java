public class bird extends enemy{
    private int d_peck;
    
    public int getD_peck() {
        return d_peck;
    }

    public void setD_peck(int d_peck) {
        this.d_peck = d_peck;
    }

    @Override
    void Attack(){
        System.out.println("Burung menyerang!. HP anda berkurang " + this.getDamage());
    }

    void Peck(){
        System.out.println("Burung menggunakan 'Peck'!. HP anda berkurang " + getD_peck());
    }

}
