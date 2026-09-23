import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== LOGIN =====
        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";
        int tentativas = 3;
        boolean acesso = false;

        System.out.println("=== MEDCONTROL ===");
        System.out.println("Sistema de Controle de Medicamentos");

        while (tentativas > 0 && !acesso) {

            System.out.print("\nUsuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                acesso = true;
                System.out.println("Login realizado com sucesso!");
            } else {
                tentativas--;
                System.out.println("Usuario ou senha incorretos.");
                System.out.println("Tentativas restantes: " + tentativas);
            }
        }

        if (!acesso) {
            System.out.println("\nAcesso bloqueado.");
            scanner.close();
            return;
        }

        // ===== CADASTRO =====
        String continuar;

        do {
            System.out.println("\n=== CADASTRO ===");

            System.out.print("Nome do paciente: ");
            String paciente = scanner.nextLine();

            System.out.print("Nome do cuidador: ");
            String nomeCuidador = scanner.nextLine();

            Cuidador cuidador = new Cuidador(nomeCuidador);

            // Polimorfismo
            Pessoa pessoa = cuidador;

            System.out.print("Nome do medicamento: ");
            String nomeMedicamento = scanner.nextLine();

            System.out.print("Dose: ");
            String dose = scanner.nextLine();

            System.out.print("Horario: ");
            String horario = scanner.nextLine();

            Medicamento medicamento = new Medicamento(nomeMedicamento, dose, horario);

            // ===== AGENDA =====
            System.out.println("\n=== AGENDA ===");
            System.out.println("Paciente: " + paciente);

            pessoa.apresentar();
            medicamento.mostrar();

            // ===== ADMINISTRAÇÃO =====
            System.out.print("\nO medicamento foi administrado? (s/n): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                medicamento.administrar();
            } else {
                System.out.println("Medicamento continua pendente.");
            }

            // ===== SITUAÇÃO FINAL =====
            System.out.println("\n=== SITUAÇÃO FINAL ===");
            medicamento.mostrar();

            System.out.print("\nDeseja cadastrar novamente? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}

