import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }
     public List<Livro>pesquisarPorAutor(String autor){
        List<Livro>livrosPorAutor= new ArrayList<>();
        if(!livroList.isEmpty()){
         for(Livro l :livroList){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
         }
        }
         return livrosPorAutor;
     }
     public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorIntervaloAnos= new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
     }
      
    
    
        public Livro pesquisarPorTitulo(String titulo){
            Livro LivroPorTitulo = null;
            if(!livroList.isEmpty()){
                for(Livro l:livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    LivroPorTitulo = l;
                    break;
                }
                }
            }
            return LivroPorTitulo;
        }
        public static void main(String[] args) {
            CatalagoLivros catalagoLivros=new CatalagoLivros();

            catalagoLivros.adicionarLivro("livro 1 ", "Autor 1", 2020);
            catalagoLivros.adicionarLivro("livro 2 ", "Autor 2", 2022);
            System.out.println(catalagoLivros.pesquisarPorAutor("Autor 2"));
        }
        
}
