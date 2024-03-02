class Manual extends Carte {
    String disciplina;

    // Constructor cu specificator de acces default
    Manual(String titlu, int numarPagini, String autor, String disciplina) {
        super(titlu, numarPagini, autor);
        this.disciplina = disciplina;
    }

    // Constructor cu specificator de acces private
    private Manual() {
        // Acest constructor nu poate fi accesat din exteriorul clasei
    }

    // Suprascrierea metodei din clasa parinte
    @Override
    void afiseazaDetalii() {
        System.out.println("Manual: " + titlu + ", Autor: " + autor + ", Disciplina: " + disciplina);
    }
}