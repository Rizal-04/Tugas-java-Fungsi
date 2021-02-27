public class MengembalikanNilai {
    
    static int luasPersegiPanjang( int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        System.out.println("Luas persegi panjang dengan panjang x lebar 5x6 adalah " + luasPersegiPanjang(5 , 6));
    }
}
