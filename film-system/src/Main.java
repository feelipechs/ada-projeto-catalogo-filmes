import models.Ator;
import models.Diretor;
import models.Filme;
import services.FilmeService;
import services.PessoaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaService pessoaService = new PessoaService();
        FilmeService filmeService = new FilmeService();
        int opcao;

        do {
            System.out.println("\n===== ADA FLIX =====");
            System.out.println("1. Cadastrar filme");
            System.out.println("2. Cadastrar ator");
            System.out.println("3. Cadastrar diretor");
            System.out.println("4. Associar ator a filme");
            System.out.println("5. Associar diretor a filme");
            System.out.println("6. Buscar filme por nome");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: "); String nomeFilme = scanner.nextLine();
                    System.out.print("Data de lançamento: "); String data = scanner.nextLine();
                    System.out.print("Orçamento: "); double orcamento = scanner.nextDouble(); scanner.nextLine();
                    System.out.print("Descrição: "); String descricao = scanner.nextLine();
                    filmeService.cadastrarFilme(nomeFilme, data, orcamento, descricao);
                    break;

                case 2:
                    System.out.print("Nome: "); String nomeAtor = scanner.nextLine();
                    System.out.print("Data de nascimento: "); String nascAtor = scanner.nextLine();
                    System.out.print("Personagem: "); String personagem = scanner.nextLine();
                    pessoaService.cadastrarAtor(nomeAtor, nascAtor, personagem);
                    break;

                case 3:
                    System.out.print("Nome: "); String nomeDiretor = scanner.nextLine();
                    System.out.print("Data de nascimento: "); String nascDiretor = scanner.nextLine();
                    System.out.print("Gênero: "); String genero = scanner.nextLine();
                    pessoaService.cadastrarDiretor(nomeDiretor, nascDiretor, genero);
                    break;

                case 4:
                    pessoaService.listarAtores();
                    System.out.print("Nome do ator: "); String nomeA = scanner.nextLine();
                    filmeService.listarFilmes();
                    System.out.print("Nome do filme: "); String nomeF1 = scanner.nextLine();
                    Ator atorEncontrado = pessoaService.buscarAtorPorNome(nomeA);
                    Filme filmeEncontrado1 = filmeService.buscarFilmeParaAssociacao(nomeF1);
                    if (atorEncontrado != null && filmeEncontrado1 != null)
                        filmeService.associarAtor(filmeEncontrado1, atorEncontrado);
                    break;

                case 5:
                    pessoaService.listarDiretores();
                    System.out.print("Nome do diretor: "); String nomeD = scanner.nextLine();
                    filmeService.listarFilmes();
                    System.out.print("Nome do filme: "); String nomeF2 = scanner.nextLine();
                    Diretor diretorEncontrado = pessoaService.buscarDiretorPorNome(nomeD);
                    Filme filmeEncontrado2 = filmeService.buscarFilmeParaAssociacao(nomeF2);
                    if (diretorEncontrado != null && filmeEncontrado2 != null)
                        filmeService.associarDiretor(filmeEncontrado2, diretorEncontrado);
                    break;

                case 6:
                    System.out.print("Nome do filme: "); String busca = scanner.nextLine();
                    filmeService.buscarFilmePorNome(busca);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}