import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Digite 1 para CRIAR registro ou 2 para CONSULTAR registros existentes");
            int escolhaModo = scanner.nextInt();
            
            switch(escolhaModo) {
                case 1:
                    System.out.println("#########################");
                    System.out.println("#### CRIAR REGISTROS ####");
                    System.out.println("#########################");

                    System.out.println("Digite 1 para cadastrar PESSOA, 2 para cadastrar MÚSICA, e 3 para cadastrar um ÁLBUM: ");
                    int escolha = scanner.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("Cadastrando PESSOA:");
        
                            System.out.println("Digite o NOME do artista: ");
                            String nomeArtista = scanner.next();
                            System.out.println("Digite a IDADE do artista: ");
                            int idadeArtista = scanner.nextInt();

                            new Pessoa(nomeArtista, idadeArtista);
                            System.out.println(nomeArtista + " cadastrado com sucesso!");
                            break;

                        case 2:
                            System.out.println("Cadastrando MÚSICA:");
                            break;
            
                        case 3:
                            System.out.println("Cadastrando ÁLBUM:");
                            break;
            
                        default:
                            System.out.println("Opção inválida...");
                            break;
                    }
                    break;

                case 2:

                    break;

                default:
                    System.out.println("Opção inválida...");
                    break;
            }
        }
    }
}
