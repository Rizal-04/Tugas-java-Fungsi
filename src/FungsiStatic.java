public class FungsiStatic {
    
    //Fungsi non-static
    void aku(String mobil){
        System.out.println("Hello Gaes!");
        System.out.println("Saya sedang mengendarai motor " + mobil);
    }

    //fungsi static
    static void kamu(String becak){
        System.out.println("Saya sedang melihat " + becak + " disana");
    }

    //fungsi main
    public static void main(String[] args) {
        
        //pemanggilan fungsi static
        kamu("Motor Vespa");

        //membuat instansiasi objek saya dari class fungsiStatic
        FungsiStatic saya = new FungsiStatic();
        //pemanggilan fungsi non-static
        saya.aku(" CBR 1000rr");
    }
}
