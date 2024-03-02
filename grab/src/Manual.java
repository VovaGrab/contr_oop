class Manual extends Carte {
    String disciplina;

    // Constructor cu specificator de acces default
    public Manual(String titlu, int numarPagini, String autor, String disciplina) {
        super(titlu, numarPagini, autor);
        this.disciplina = disciplina;
    }

    // Constructor cu specificator de acces private
    public Manual() {
        // Acest constructor nu poate fi accesat din exteriorul clasei
    }

    @Override
    public String toString() {
        return "Manual{" +
                "autor='" + autor + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", titlu='" + titlu + '\'' +
                ", numarPagini=" + numarPagini +
                '}';
    }

    // Suprascrierea metodei din clasa parinte
    @Override
    void afiseazaDetalii() {
        System.out.println("Manual: " + titlu + ", Autor: " + autor + ", Disciplina: " + disciplina);
    }
}