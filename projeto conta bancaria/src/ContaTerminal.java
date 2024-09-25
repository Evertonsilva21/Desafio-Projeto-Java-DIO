import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta bancária");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da agência bancária");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente bancário");
        String nome = scanner.next();

        double saldo= 470.00;

        System.out.println("Olá " + nome  + " " +",obrigado por criar uma conta em nosso banco, sua agência é :" + agencia  +"" +", conta:" + conta +" 399" +  "e seu saldo:" +saldo +""+ "já está disponível para saque");
        







    }
}
