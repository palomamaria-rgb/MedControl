package med;

public class Medicamento {
    String nome;
    String dose;
    String horario;
    boolean administrado;

    public Medicamento(String nome, String dose, String horario) {
        this.nome = nome;
        this.dose = dose;
        this.horario = horario;
        this.administrado = false;
    }

    public void mostrar() {
        System.out.println("Medicamento: " + nome);
        System.out.println("Dose: " + dose);
        System.out.println("Horario: " + horario);
        System.out.println("Administrado: " + administrado);
    }

    public void administrar() {
        administrado = true;
        System.out.println("Medicamento administrado com sucesso!");
    }
}
