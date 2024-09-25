import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {


    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));

    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover= new ArrayList<>();
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefa(){
        return tarefaList.size();

    }
    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }
    public static void main(String[] args) {
        System.out.println("O numero total de elementos na lista é  : " + ListaTarefa.obterNumeroTotalTarefa());

        ListaTarefa.adicionarTarefa("tarefa 1 ");
        ListaTarefa.adicionarTarefa("tarefa 2 ");

        System.out.println("O numero total de elementos na lista é  : " + ListaTarefa.obterNumeroTotalTarefa());

        ListaTarefa.removerTarefa("Tarefa 2")
        
        System.out.println("O numero total de elementos na lista é  : " + ListaTarefa.obterNumeroTotalTarefa());
    }
}
