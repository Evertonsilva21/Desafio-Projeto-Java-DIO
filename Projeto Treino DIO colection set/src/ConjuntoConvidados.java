import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome,codigo));
    }

    
public void removerConvidadoPorCodigoConvite(int codigoConvite){
     Convidado convidadoParaRemover= null;
     for( Convidado c: convidadoSet){
        if(c.getCodigo()==codigoConvite);
        convidadoParaRemover=c;
        break;
     }
     convidadoSet.remove(convidadoParaRemover);
}
public int contarConvidados(){
    return convidadoSet.size();
}
public void exibirConvidados(){
    System.out.println(convidadoSet);
}

public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    conjuntoConvidados.adicionarConvidado("JO", 10);
    conjuntoConvidados.adicionarConvidado("ze", 13);
    
    conjuntoConvidados.exibirConvidados();
    
    System.out.println(conjuntoConvidados.contarConvidados());

}


}
