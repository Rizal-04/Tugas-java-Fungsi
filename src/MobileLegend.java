// import jdk.internal.jshell.tool.resources.version;

public class MobileLegend {
    
    //ini variabel global
    static String nama = "Hero Favorite";
    static String version = "Versi baru";
    
    static void help(){

        //ini variabel lokal
        String nama = "Nama Hero";

        //mengakses variabel global di dalam fungsi help()
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);
    }
    public static void main(String[] args) {
        
        //panggil fungsi help()
        help();

        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);
    }
}
