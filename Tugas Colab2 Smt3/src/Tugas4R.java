import refactor.persegi;
import refactor.persegipanjang;
import refactor.segitiga;

public class Tugas4R {

    /**
     *
     * @param segitiga
     * @return
     */
    public static double hitungSegitiga(segitiga segitiga) {
        return 0.5 * segitiga.alas() * segitiga.tinggi();
    }

    /**
     *
     * @param persegipanjang
     * @return
     */
    public static double hitungPersegiPanjang(persegipanjang persegipanjang) {
        return persegipanjang.panjang() * persegipanjang.lebar();
    }

    /**
     *
     * @param persegi
     * @return
     */
    public static double hitungPersegi(persegi persegi) {
        return persegi.sisi() * persegi.sisi();
    }
}
