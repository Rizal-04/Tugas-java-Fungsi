public class BangunRuang {
    
    public static void main(String[] args) {
        int p = 12;
        int l = 17;
        int t = 16;
        int volume = volumeBalok(p,l,t);

        System.out.println(volume);
    }

    static int volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

}
