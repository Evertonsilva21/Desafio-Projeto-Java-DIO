import java.util.Scanner;

public class Contador {
        public static void main(String[] args) {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            
            try {
                //chamando o método contendo a lógica de contagem

                contar(int parametroUm, int parametroDois);
            
            }catch (ParametrosInvalidosException )  {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("O PRIMEIRO VALOR PRECISA SER MAIOR QUE O PRIMEIRO");
            }
            
        }
        static void contar(parametroUm ,  parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if(parametroUm>parametroDois){
                int contagem = parametroDois - parametroUm;
                for(contador=0;contador<=contagem;contador++){
                    System.out.println("o valor da sequenica é :" + contador);
                
                }
                return contar()
           
            }
                
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
       
    }
    }