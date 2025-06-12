import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

    while (true) {
        System.out.println("\n1 - Cadastrar novo veículo");
        System.out.println("2 - Listar veículos");
        System.out.println("3 - Sair");
        System.out.print(">> ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

    if (opcao == 1) {
        System.out.print("Tipo (1-Carro, 2-Moto, 3-Caminhão): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();

                switch (tipo) {
                    case 1:
                        System.out.print("Quantidade de portas: ");
                        int portas = scanner.nextInt();
                        veiculos.add(new Carro(placa, modelo, ano, portas));
                        break;
                    case 2:
                        System.out.print("Cilindrada: ");
                        int cilindrada = scanner.nextInt();
                        veiculos.add(new Moto(placa, modelo, ano, cilindrada));
                        break;
                    case 3:
                        System.out.print("Capacidade de carga (toneladas): ");
                        double carga = scanner.nextDouble();
                        veiculos.add(new Caminhao(placa, modelo, ano, carga));
                        break;
                    default:
                        System.out.println("Tipo inválido!");
                }

            } else if (opcao == 2) {
                for (Veiculo v : veiculos) {
                    v.exibirDados();
                }
            } else if (opcao == 3) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
