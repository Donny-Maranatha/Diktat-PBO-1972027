/**
 * @author Donny (1972027)
 */

public class PersonDemo {
    public static void main(String[] args) {
        Person2 orangTua = new Person2();
        Person2 saya = new Person2();
        orangTua.setNamaLahir(saya, “Budi”);

        Person2 orangTuaTeman = new Person2();
        Person2 teman = new Person2();
        orangTuaTeman.setNamaLahir(teman, “Santi”);
        saya.kenalan(teman);
    }
}
