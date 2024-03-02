import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crearea si testarea instantele claselor definite mai sus
        List<PublicatieTiparita> publicatii = new ArrayList<>();
        publicatii.add(new Revista("Revista1", 50, "Stiinta"));
        publicatii.add(new Carte("Carte1", 200, "Autor1"));
        publicatii.add(new Manual("Manual1", 150, "Autor2", "Matematica"));

        // Apelarea metodei de filtrare
        PublicatieTiparita.filtreazaPublicatiiDupaCriteriu(publicatii, "1");

        // Apelarea metodei de filtrare cu doua criterii
        PublicatieTiparita.filtreazaPublicatiiDupaDouaCriterii(publicatii, "1", "Autor");
    }
}
