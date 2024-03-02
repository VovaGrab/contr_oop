import java.util.List;
import java.util.ArrayList;
class PublicatieTiparita {
    String titlu;
    int numarPagini;

    // Constructor cu specificator de acces default
    public PublicatieTiparita(String titlu, int numarPagini) {
        this.titlu = titlu;
        this.numarPagini = numarPagini;
    }

    // Constructor cu specificator de acces private
    public PublicatieTiparita() {
        this.titlu = "Null";
        this.numarPagini = 0;
    }


    // Metoda de filtrare
    static void filtreazaPublicatiiDupaCriteriu(List<? extends PublicatieTiparita> publicatii, String criteriu) {
        for (PublicatieTiparita publicatie : publicatii) {
            if (publicatie.titlu.contains(criteriu)) {
                System.out.println(publicatie.titlu);
            }
        }
    }

    // Supraincarcarea metodei de filtrare
    static void filtreazaPublicatiiDupaDouaCriterii(List<? extends PublicatieTiparita> publicatii, String criteriu1, String criteriu2) {
        for (PublicatieTiparita publicatie : publicatii) {
            if (publicatie.titlu.contains(criteriu1) && publicatie.titlu.contains(criteriu2)) {
                System.out.println(publicatie.titlu);
            }
        }
    }

    // Metoda care poate fi suprascrisa de clasele copil
    void afiseazaDetalii() {
        System.out.println("Publicatie Tiparita: " + titlu + ", Numar Pagini: " + numarPagini);
    }
}