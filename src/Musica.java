public class Musica {
    private String titulo;
    private String duracao;
    private Pessoa compositor;

    public Musica(String titulo, String duracao, Pessoa compositor) {
        this. titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getDuracao(){
        return this.duracao;
    }

    public Pessoa getCompositor(){
        return this.compositor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracao(String duracao){
        this.duracao = duracao;
    }

    public void setCompositor(Pessoa compositor){
        this.compositor = compositor;
    }

    public void tocarMusica(){
        System.out.println("Musica " + this.titulo + " tocando...");
    }
}
