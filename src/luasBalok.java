public class luasBalok {

    int panjang;
    int lebar;
    int tinggi;

    /**
     *
     * @param panjang
     * @param tinggi
     * @param lebar
     */
    public luasBalok(int panjang, int tinggi, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    /**
     *
     * @return
     */

    public double calculateLuas(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args)   {
        luasBalok luasbalok = new luasBalok(10,7,8);

        System.out.println("Luas Balok = "+ luasbalok.calculateLuas());
    }
}