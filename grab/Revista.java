class Revista extends PublicatieTiparita {
    String categorie;

    // Constructor cu specificator de acces default
    Revista(String titlu, int numarPagini, String categorie) {
        super(titlu, numarPagini);
        this.categorie = categorie;
    }

    // Constructor cu specificator de acces private
    private Revista() {
        // Acest constructor nu poate fi accesat din exteriorul clasei
    }

    // Suprascrierea metodei din clasa parinte
    @Override
    void afiseazaDetalii() {
        System.out.println("Revista: " + titlu + ", Categorie: " + categorie);
    }
}
