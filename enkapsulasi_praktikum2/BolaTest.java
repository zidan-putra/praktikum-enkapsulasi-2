
package enkapsulasi_praktikum2;


public class BolaTest {


    public static void main(String[] args) {
        System.out.println("== menghitung ukuran bola ==");
        int r = 14;
        Bola bola = new Bola();
        bola.setJari2(r);
        bola.showDiameter();
        bola.showLuaspermukaan();
        bola.showVolume();
    }
    
}
