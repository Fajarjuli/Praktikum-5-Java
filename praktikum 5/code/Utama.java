public class Utama {
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(6);
        Segitiga segitiga = new Segitiga(5, 9);
        Persegi persegi = new Persegi(6);


        System.out.println("Lingkaran:");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        System.out.println("\nSegitiga:");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());

        System.out.println("\nPersegi:");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());
    }
}