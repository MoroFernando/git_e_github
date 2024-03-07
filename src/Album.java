import java.util.ArrayList;
import java.util.List;

public class Album {

    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private List<Musica> musicas; 
    
    public Album(String genero, int ano, String nome, Pessoa artista) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public Pessoa getArtista() {
        return artista;
    }
    
    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }
    
    public List<Musica> getMusicas() {
        return musicas;
    }
    
    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public void addMusica(Musica musica){
        this.musicas.add(musica);
    }

    public void mostraTodosOsDados(){
        System.out.println("Nome do Álbum: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Ano de Lançamento: " + this.ano);
        System.out.println("Artista: " + this.artista.getNome());
        System.out.println("Lista de Músicas:");
        for (Musica musica : this.musicas) {
            System.out.println(musica.getTitulo());
        }
    } 
}