class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }


    public float luas() {
        return sisi * sisi;
    }


    public float keliling() {
        return 4 * sisi;
    }
}