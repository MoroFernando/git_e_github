import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        // Criando pessoas
        Pessoa rhcp = new Pessoa("Red Hot Chili Peppers", 41);
        
        // Criando músicas
        Musica otherside = new Musica("Otherside", "4.16min", rhcp);
        Musica getOnTop = new Musica("Get On Top", "3.18min", rhcp);
        
        // Criando álbum
        Album californication = new Album( "Rock", 1999, "Californication", rhcp);
        californication.addMusica(otherside);
        californication.addMusica(getOnTop);
        
        // Exibindo informações do álbum
        californication.mostraTodosOsDados();

    }
}
