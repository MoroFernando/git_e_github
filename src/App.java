import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static ArrayList<Musica> musicas = new ArrayList<>();
    static ArrayList<Album> albuns = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("");
            System.out.println("###############################################################################");
            System.out.println("#### Digite 1 para CRIAR registro ou 2 para CONSULTAR registros existentes ####");
            System.out.println("###############################################################################");
            System.out.println("");
            int escolhaModo = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente

            switch(escolhaModo) {
                case 1:
                    System.out.println("#########################");
                    System.out.println("#### CRIAR REGISTROS ####");
                    System.out.println("#########################");
                    System.out.println("");

                    System.out.println("Digite 1 para cadastrar PESSOA, 2 para cadastrar MÚSICA, e 3 para cadastrar um ÁLBUM: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolha) {
                        case 1: // CADASTRO DE ARTISTA -------------------------------------------------------------------------------------
                            System.out.println("");
                            System.out.println("--> Cadastrando PESSOA:");
        
                            System.out.println("Digite o NOME do artista: ");
                            String nomeArtista = scanner.nextLine();
                            System.out.println("Digite a IDADE do artista: ");
                            int idadeArtista = scanner.nextInt();
                            scanner.nextLine();

                            Pessoa pessoa = new Pessoa(nomeArtista, idadeArtista);
                            pessoas.add(pessoa);
                            System.out.println(pessoa.getNome() + " cadastrado com sucesso!");
                            break;

                        case 2: // CADASTRO DE MUSICA -------------------------------------------------------------------------------------
                            System.out.println("");
                            System.out.println("--> Cadastrando MÚSICA:");

                            System.out.println("Digite o NOME da Música: ");
                            String nomeMusica = scanner.nextLine();
                            System.out.println("Digite a duração da música, no formato: min:seg");
                            String duracaoMusica = scanner.nextLine();

                            System.out.println("Selecione o COMPOSITOR da música: ");
                            for(int i = 0; i < pessoas.size(); i++) {
                                Pessoa p = pessoas.get(i);
                                System.out.println(i + ": Nome: " + p.getNome() + ", Idade: " + p.getIdade());
                            }
                            int escolhaCompositor = scanner.nextInt();

                            if (escolhaCompositor >= 0 && escolhaCompositor < pessoas.size()) {
                                Pessoa compositorMusica = pessoas.get(escolhaCompositor);
                                Musica musica = new Musica(nomeMusica, duracaoMusica, compositorMusica);
                                musicas.add(musica);
                                System.out.println(musica.getTitulo() + " cadastrado com sucesso!");
                            } else {
                                System.out.println("ERRO ao criar Música: Artista não encontrado");
                            }

                            break;
            
                        case 3: // CADASTRO DE ALBUM -------------------------------------------------------------------------------------
                            System.out.println("");
                            System.out.println("--> Cadastrando ÁLBUM:");

                            System.out.println("Digite o GENERO do álbum: ");
                            String generoAlbum = scanner.nextLine();
                            System.out.println("Digite o ANO do álbum: ");
                            int anoAlbum = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Digite o NOME do álbum: ");
                            String nomeAlbum = scanner.nextLine();
                            System.out.println("Selecione o COMPOSITOR do álbum: ");
                            for(int i = 0; i < pessoas.size(); i++) {
                                Pessoa p = pessoas.get(i);
                                System.out.println(i + ": Nome: " + p.getNome() + ", Idade: " + p.getIdade());
                            }
                            int escolhaCompositorAlbum = scanner.nextInt();

                            if (escolhaCompositorAlbum >= 0 && escolhaCompositorAlbum < pessoas.size()) {
                                Pessoa compositorAlbum = pessoas.get(escolhaCompositorAlbum);
                                Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, compositorAlbum);
                                albuns.add(album);
                                System.out.println(album.getNome() + " cadastrado com sucesso!");
                            } else {
                                System.out.println("ERRO ao criar Álbum: Artista não encontrado");
                            }

                            break;
            
                        default:
                            System.out.println("Opção inválida...");
                            break;
                    }
                    break;

                case 2:
                    consultarRegistros();
                    break;

                default:
                    System.out.println("Opção inválida...");
                    break;
            }
        }
    }

    public static void consultarRegistros() {
        System.out.println("### REGISTROS DE PESSOAS ###");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        }

        System.out.println("\n### REGISTROS DE MÚSICAS ###");
        for (Musica musica : musicas) {
            System.out.println("Nome: " + musica.getTitulo() + ", Duração: " + musica.getDuracao() + ", Artista: " + musica.getCompositor().getNome());
        }

        System.out.println("\n### REGISTROS DE ÁLBUNS ###");
        for (Album album : albuns) {
            System.out.println("Gênero: " + album.getGenero() + ", Ano: " + album.getAno() + ", Nome: " + album.getNome() + ", Artista: " + album.getArtista().getNome());
        }
    }
}
