import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("(1) Transportes movidos por esforco humano");
        System.out.println("(2) Transportes movidos por bateria");
        System.out.print("Escolha uma opcao: ");
        String escolha = sc.nextLine();

        switch (escolha) {
            case "1":
                System.out.println("Voce escolheu transportes movidos por esforco humano:");
                HumanPoweredTransportFactory humanFactory = new HumanPoweredTransportFactory();
                humanFactory.createBicycle().ride();
                humanFactory.createRollerSkates().ride();
                humanFactory.createSkateboard().ride();
                break;

            case "2":
                System.out.println("Você escolheu transportes movidos por bateria:");
                ElectricTransportFactory electricFactory = new ElectricTransportFactory();
                electricFactory.createElectricScooter().ride();
                electricFactory.createElectricBike().ride();
                break;

            default:
                System.err.println("Opcao invalida. Encerrando o programa...");
                sc.close();
                return;
        }

        sc.close();
    }
}
