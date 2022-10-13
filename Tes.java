package Praktikum4;

/**
 *
 * @author Affandika
 */
public class Tes {
    public static void main(String[] args) {
        System.out.println("Memasukkan Identitas Dosen 1 : Kusnan");
        Dosen dosen1 = new Dosen("Kusnan");
 
        System.out.println("Memasukkan Identitas Dosen 2 : Jamal, NIP. 1568");
        Dosen dosen2 = new Dosen("Jamal", 1568);
 
        System.out.println("Memasukkan Identitas Dosen 3 : Wawan, NIP. 1256, umur 45");
        Dosen dosen3 = new Dosen("Wawan", 1256, 45);

        System.out.println();
        dosen1.info();
        System.out.println();
        dosen2.info();
        System.out.println();
        dosen3.info();
    }    
}
