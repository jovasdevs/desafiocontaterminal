import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Bem vindo, vamos criar a sua conta.");
            
            System.out.println("Digite o número da Agencia: ");
  
            String agencia = scan.nextLine();

            
            System.out.println("Digite o número da conta: ");
            
            int numero = scan.nextInt();

            System.out.println("Digite seu nome:  ");

            String nomeCliente = scan.next();

            System.out.println("Digite o valor inicial da sua conta:  ");
                   
            float saldo = scan.nextInt();

            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ 
            numero + " e seu saldo " + saldo + " já está disponível para saque");
        }
    }
 }
