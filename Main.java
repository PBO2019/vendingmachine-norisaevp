import java.util.Scanner;

public class Main {

    Scanner InputData = new Scanner(System.in);
    int pilihan;


    public static void main(String[] args) {

        Main aa = new Main ();
        aa.menu();
        aa.toping();
        Scanner InputData = new Scanner(System.in);
        int pilihan;
    }
    void menu () {
        MesinKopi aa = new MesinKopi();
        MesinKopi aa1 = new MesinKopi();
        MesinKopi aa2 = new MesinKopi();
        MesinKopi aa3 = new MesinKopi();

        aa1.setJenisKopi("Arabica");
        aa2.setJenisKopi("Robusta");
        aa3.setJenisKopi("Flores");


        System.out.println("Daftar Menu Kopi   :");
        System.out.println(aa1.getJenisKopi());
        System.out.println(aa2.getJenisKopi());
        System.out.println(aa3.getJenisKopi());


        System.out.println("Ketikkan Pesanan Kopi Anda :");
        String setJenisKopi = InputData.nextLine();
    }
    void toping(){
        Topping bb1 = new Topping();
        Topping bb2 = new Topping();
        Topping bb3 = new Topping();

        bb1.setJenisTopping("Susu");
        bb2.setJenisTopping("Gula");
        bb3.setJenisTopping("Cream");

        System.out.println("Daftar Menu Topping Kopi   :");
        System.out.println(bb1.getJenisTopping());
        System.out.println(bb2.getJenisTopping());
        System.out.println(bb3.getJenisTopping());

        System.out.println("Ketikkan Topping Untuk Kopi Anda :");
        String setJenisTopping = InputData.nextLine();
        if (InputData.hasNextInt()) {
            pilihan = InputData.nextInt();
            switch (pilihan) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Keluar Sistem");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan Topping Yang Anda Masukkan Harus Satu Topping");
                    break;
            }
        } else {
            System.out.println(" Inputan Topping Yang Anda Masukkan Harus Satu Topping");
            toping();
        }
    }
    public void Susu (){
    }
    public void Gula (){

    }
    public void Cream (){

    }
}

