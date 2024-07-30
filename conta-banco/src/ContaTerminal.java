

import javax.swing.JOptionPane;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        String agencia = ("00800790");
        String saldo =("1.200,00");
       
        
     System.out.println(".......Bem-Vindo......Banco Java");
     
     int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite Numero da sua conta"));
     System.out.println("Por Favor, digite o numero da sua conta: " + numero);          
     
     
     String nome = JOptionPane.showInputDialog("Digite seu Nome: ");
     System.out.println("Seja muito bem-vindo " + nome);

     System.out.printf("Sua agência é " + agencia 
     + " e seu saldo é de " + saldo);



    }
}
