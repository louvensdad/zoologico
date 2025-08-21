import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Animal> animais = new ArrayList<>();

            System.out.println("Digite os nomes dos animais separados por vírgula (Leão, Macaco, Elefante):");
            String[] escolhidos = scanner.nextLine().split(",");

            for (String nome : escolhidos) {
                switch (nome.trim().toLowerCase()) {
                    case "leão":
                        animais.add(new Leao());
                        break;
                    case "macaco":
                        animais.add(new Macaco());
                        break;
                    case "elefante":
                        animais.add(new Elefante());
                        break;
                    default:
                        System.out.println("Animal não reconhecido: " + nome.trim());
                }
            }

            System.out.println("\nSons dos animais:");
            for (Animal a : animais) {
                a.emitirSom();
            }
        }
    }



