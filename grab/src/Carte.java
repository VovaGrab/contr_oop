class Carte extends PublicatieTiparita {
    String autor;

    // Constructor cu specificator de acces default
    public Carte(String titlu, int numarPagini, String autor) {
        super(titlu, numarPagini);
        this.autor = autor;
    }

    // Constructor cu specificator de acces default
    public Carte() {
        // Acest constructor poate fi utilizat intern
    }

    @Override
    public String toString() {
        return "Carte{" +
                "autor='" + autor + '\'' +
                ", titlu='" + titlu + '\'' +
                ", numarPagini=" + numarPagini +
                '}';
    }

    // Suprascrierea metodei din clasa parinte
    @Override
    void afiseazaDetalii() {
        System.out.println("Carte: " + titlu + ", Autor: " + autor);
    }
}