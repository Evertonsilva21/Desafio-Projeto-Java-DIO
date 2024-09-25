import java.util.concurrent.ThreadLocalRandom;
public class analisarCandidato {
    public static void main(String[] args) throws Exception {
    
    }
    static void seleçãoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados=0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 &&  candidatosAtual<candidatos.length){
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido=  valorPretendido();
            System.out.println("O candidato"+ candidato+"Solicitou este valor de salrio"+ salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println("O candidato"+ candidato+ "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    
    }

   // analisarCandidato(1900.0);
   // analisarCandidato(2200.0);
    //analisarCandidato(2000.0);
// esse analisarcandidato é somente se for usr somente  a parte de baixo a parte de cima é outro exercicio.
    public static void analisarCandidato(Double salarioPretendido){
        double salarioBase=2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("ligar para o candidato");
        }else if(salarioBase==salarioPretendido){
            System.out.println("ligar para o candidato com contra-proposta");
        }else{
            System.out.println("Aguardar mais candidato");
        }

    }
}
