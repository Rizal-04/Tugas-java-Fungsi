import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fungsi {
    
    static ArrayList listBarang = new ArrayList();
    static boolean isRuning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader); 

    static void showMenu() throws IOException {

        System.out.println("========MENU=======");
        System.out.println("[1] Show All Barang");
        System.out.println("[2] Insert Barang");
        System.out.println("[3] Edit Barang");
        System.out.println("[4] Delete Barang");
        System.out.println("[5] Exit");
        System.out.println("PILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch(selectedMenu) {
            case 1 :
            showAllBarang();
            break;
            case 2 :
            insertBarang();
            break;
            case 3 :
            editBarang();
            break;
            case 4 :
            deleteBarang();
            break;
            case 5 :
            System.exit(0);
            break;
            default:
            System.out.println("Pilihan Salah!");
        }
    }
    static void showAllBarang(){
        if(listBarang.isEmpty()){
            System.out.println("Belum ada data");
        }else {
            // tampilkan semua Barang
            for(int i= 0; i < listBarang.size(); i++){
                System.out.println(String.format("[%d] %s",i, listBarang.get(i)));
            }
        }
    }

    static void insertBarang() throws IOException{
        System.out.print("Nama Barang: ");
        String namaBarang = input.readLine();
        listBarang.add(namaBarang);
    }

    static void editBarang() throws IOException{
        showAllBarang();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = Integer.valueOf(input.readLine());

        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();

        //ubah nama buah
        listBarang.set(indexBuah, namaBaru);
    }

    static void deleteBarang() throws IOException{
        showAllBarang();
        System.out.print("Pilih nomer Barang: ");
        int indexBarang = Integer.valueOf(input.readLine());
        //hapus Barang
        listBarang.remove(indexBarang);
    }

    public static void main(String[] args) throws IOException {
        do{
            showMenu();
        }while(isRuning);
    }
}
