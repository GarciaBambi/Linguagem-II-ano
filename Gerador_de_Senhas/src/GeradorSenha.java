//import java.util.Random;
import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorSenha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%&*()-_=+";

        String base = "";

        System.out.println("=== GERADOR DE SENHAS ===");

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = input.nextInt();

        System.out.print("Incluir letras maiusculas? (Sim/Nao): ");
        if (input.next().equalsIgnoreCase("Sim")) {
            base += letrasMaiusculas;
        }

        System.out.print("Incluir letras minusculas? (Sim/Nao): ");
        if (input.next().equalsIgnoreCase("Sim")) {
            base += letrasMinusculas;
        }

        System.out.print("Incluir numeros? (Sim/Nao): ");
        if (input.next().equalsIgnoreCase("Sim")) {
            base += numeros;
        }

        System.out.print("Incluir simbolos? (Sim/Nao): ");
        if (input.next().equalsIgnoreCase("Sim")) {
            base += simbolos;
        }

        if (base.isEmpty()) {
            System.out.println("Erro: Nenhum tipo de caractere selecionado.");
            return;
        }

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(base.length());
            senha.append(base.charAt(index));
        }

        System.out.println("\nSenha gerada: " + senha.toString());

        input.close();
    }
}