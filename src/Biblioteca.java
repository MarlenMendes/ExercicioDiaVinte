import java.util.HashSet;
import java.util.Set;

class Livro {
    private String isbn;
    private String nome;
    private String autor;
    private String genero;

    public Livro(String isbn, String nome, String autor, String genero) {
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';

    }
}
public class Biblioteca {
    private Set<Livro> livros;

    public Biblioteca() {
        livros = new HashSet<>();
    }

    public void registrarLivro(String isbn) {
        System.out.println("O livro foi registrado com o ISBN " + isbn);
    }

    public void registrarLivro(String isbn, String nome) {
        System.out.println("O livro foi registrado com o ISBN " + isbn + " e o nome " + nome);
    }
    public void registrarLivro(String isbn, String nome, String genero) {
        System.out.println("O livro foi registrado com o ISBN " + isbn + ", o nome " + nome + " e o gênero " + genero);
    }
    public void registrarLivro(String isbn, String nome, String autor, String genero) {
        Livro livro = new Livro(isbn, nome, autor, genero);
        livros.add(livro);
        System.out.println("O livro foi registrado com todos os atributos");
    }

    public void mostrarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.registrarLivro("978-8532530799");
        biblioteca.registrarLivro("978-8532530805", "Harry Potter");
        biblioteca.registrarLivro("978-8532530812", "Dom Casmurro", "Machado de Assis");
        biblioteca.registrarLivro("978-8532530829", "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Infantil");

        biblioteca.mostrarLivros();
    }
}
