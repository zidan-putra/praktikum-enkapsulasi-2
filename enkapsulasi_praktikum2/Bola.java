
package enkapsulasi_praktikum2;


public class Bola {
    private double jari2;
    
    public void setJari2(int jari){
        jari2 = Double.valueOf(jari);
        System.out.println("jari-jari bola adalah \t\t: "+jari2);
    }
    
    public void showDiameter(){
        System.out.println("diameter linkaran adalah \t: "+jari2 * 2);
    }
    
    public void showLuaspermukaan(){
        double luas = Math.PI * jari2 * jari2 * 4;
        System.out.println("luas permukaan bola adalah \t: "+luas);
    }
    public void showVolume(){
        double volum = Math.PI * jari2 * jari2 * jari2 * (4/3);
        System.out.println("volume bola adalah \t\t: "+volum);
    }
    
}
