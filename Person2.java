/**
 * @author Donny (1972027)
 */

public class Person2 {
    private String nama;

    public void gantiNama(String nama) {
        this.nama = nama;
    }

    public void setNamaLahir(Person2 anak, String nama) {
        anak.nama = nama;
    }

    public void kenalan(Person orangLain) {
        System.out.println("Hallo, nama saya "+ nama);
        System.out.println("Hai, nama saya "+ orangLain);
        System.out.println("Salama kenal");
    }
}

