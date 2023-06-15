import java.util.Scanner;

public class Contador  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            // chamando o método contando a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem: O segundo parametro deve ser maior que o primeiro
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        sc.close();
    }

    static void contar(int paramentroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (paramentroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - paramentroUm;

        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        } 
    }
}
