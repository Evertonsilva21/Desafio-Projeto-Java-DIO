import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
}

public void adicionarPessoa(String nome,int idade,double altura){
    pessoaList.add(new Pessoa(nome,idade,altura));
}

public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
}
public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
    return pessoasPorAltura;
}

public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
    ordenacaoPessoa.adicionarPessoa("João", 22, 1.85);
    ordenacaoPessoa.adicionarPessoa("camila", 25, 1.65);

    System.err.println(ordenacaoPessoa.ordenarPorIdade());
}
  
}
