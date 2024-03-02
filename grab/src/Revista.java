class Revista extends PublicatieTiparita {
    String categorie;

    // Constructor cu specificator de acces default
    public Revista(String titlu, int numarPagini, String categorie) {
        super(titlu, numarPagini);
        this.categorie = categorie;
    }

    // Constructor cu specificator de acces private
    public Revista() {
        super();

    }

    @Override
    public String toString() {
        return "Revista{" +
                "titlu='" + titlu + '\'' +
                ", numarPagini=" + numarPagini +
                ", categorie='" + categorie + '\'' +
                '}';
    }

    // Suprascrierea metodei din clasa parinte
    @Override
    void afiseazaDetalii() {
        System.out.println("Revista: " + titlu + ", Categorie: " + categorie);
    }
}
