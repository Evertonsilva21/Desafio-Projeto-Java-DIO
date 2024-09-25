import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  //atributos
 private Set<String> palavrasUnicaSet;

public ConjuntoPalavrasUnicas() {
    this.palavrasUnicaSet = new HashSet<>();
}

public void adicionarPalavras(String palavra){
    palavrasUnicaSet.add(palavra);
    }
 public void removerPalavra(String palavra){
    if(!palavrasUnicaSet.isEmpty()){
        if (palavrasUnicaSet.contains(palavra)){
            palavrasUnicaSet.remove(palavra);
        }else{
            System.out.println("Palavra não encontrada");
        }
    }else{
        System.out.println("conjunto vazio");
    }
 }

 public boolean verificarPalavra(String palavra){
    return palavrasUnicaSet.contains(palavra);
 }

 public void exibirPalavrasUnicas(){
    if(!palavrasUnicaSet.isEmpty()){
        System.out.println(palavrasUnicaSet);
    }else{
        System.out.println("O conjunto esta vazio");
    }
 }
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoLinguagem = new ConjuntoPalavrasUnicas();
       conjuntoLinguagem.adicionarPalavras("ingles");
       conjuntoLinguagem.adicionarPalavras("italiano");
       conjuntoLinguagem.adicionarPalavras("portugues");

      conjuntoLinguagem.exibirPalavrasUnicas();


      conjuntoLinguagem.removerPalavra("italiano");
      conjuntoLinguagem.exibirPalavrasUnicas();

      System.out.println("a linguem esta na lista:" + conjuntoLinguagem.verificarPalavra("italiano"));
      

    }
}

