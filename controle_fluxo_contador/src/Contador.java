import java.util.Scanner;

public class Contador  {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int parametroUm = sc.nextInt();
        int parametroDois = sc.nextInt();

        try {
            // chamando o método contando a lógicade contagem
            contar(parametroUm, parametroDois);

        }catch (? e) {
            // imprimir a mensagem: O segundo parametro deve ser maior que o primeiro
        }

    }

    static void contar(int paramentroUmn, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - paramentroUmn
        // realizar o for para imprimir os números com base na variável contagem
    }
}
