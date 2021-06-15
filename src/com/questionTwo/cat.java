public class cat extends enemy {
    private int d_scratch;
    
    public int getD_scratch() {
        return d_scratch;
    }

    public void setD_scratch(int d_scratch) {
        this.d_scratch = d_scratch;
    }

    @Override
    void Attack(){
        System.out.println("Kucing menyerang!. HP anda berkurang " + this.getDamage());
    }

    void Scratch(){
        System.out.println("Kucing menggunakan 'scratch'!. HP anda berkurang " + getD_scratch());
    }
}
