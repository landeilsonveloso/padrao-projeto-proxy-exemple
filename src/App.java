import classes.AcessoConta;
import classes.Conta;
import classes.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\nUsuário que não possui uma Conta:");
        
        Usuario usuario1 = new Usuario("000.000.000-00", 000);

        Conta conta = new AcessoConta(usuario1);

        System.out.println(conta.getDados());

        System.out.println("\n--------------------------------------------------");

        System.out.println("\nUsuário possui uma Conta:");

        Usuario usuario2 = new Usuario("123.456.789-10", 123);

        conta = new AcessoConta(usuario2);

        System.out.println(conta.getDados());

        System.out.println();
    }
}
