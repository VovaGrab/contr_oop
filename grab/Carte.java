class Carte extends PublicatieTiparita {
    String autor;

    // Constructor cu specificator de acces default
    Carte(String titlu, int numarPagini, String autor) {
        super(titlu, numarPagini);
        this.autor = autor;
    }

    // Constructor cu specificator de acces default
    Carte() {
        // Acest constructor poate fi utilizat intern
    }

    // Suprascrierea metodei din clasa parinte
    @Override
    void afiseazaDetalii() {
        System.out.println("Carte: " + titlu + ", Autor: " + autor);
    }
}