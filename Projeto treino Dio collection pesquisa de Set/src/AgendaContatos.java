import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
 private Set<Contato> contatoSet;

public AgendaContatos() {
    this.contatoSet = new HashSet<>();
}

public void adicionarContato(String nome, int numero){
    contatoSet.add(new Contato(nome, numero));
}
public void exibirContatos(){
    System.out.println(contatoSet);
}

public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatoPorNome = new HashSet<>();
    for(Contato c: contatoSet){
        if(c.getNome().startsWith(nome)){
            contatoPorNome.add(c);
        }
    }
    return contatoPorNome;
}
public Contato atualizarNumeroContato(String nome, int novoNumero){
    Contato contatoatulizado=null;
    for(Contato c : contatoSet){
        if(c.getNome().equalsIgnoreCase(nome)){
            c.setTelefone(novoNumero);
            contatoatulizado =c;
            break;
            }
        }
        
    
    return contatoatulizado;
}
  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("joao", 26533);
    agendaContatos.adicionarContato("mariana", 15843);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("joao"));

    System.out.println("atualizando contato:" + agendaContatos.atualizarNumeroContato("joao", 124564));
  }
}
