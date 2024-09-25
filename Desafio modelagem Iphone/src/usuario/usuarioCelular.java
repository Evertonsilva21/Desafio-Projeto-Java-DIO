package usuario;
import Celular.Iphone;



public class usuarioCelular {
    public static void main(String[] args) {
        Iphone iphone = new  Iphone(){};
       
        System.out.println("vamos ligar agora");    
        iphone.ligar();
        System.out.println("telefone tocando deixar cair na caixa postal");
        iphone.CorreioDeVoz();
        System.out.println("telefone tocando vamos atender agora");
        iphone.atender();
        System.out.println("vamos navegar na internet");
        System.out.println("exibindo  a pagina");
        iphone.exibirPagina();
        System.out.println("atualizando a página");
        iphone.atualizarPagina();
        System.out.println("adicionando nova aba");
        iphone.adicionarNovaAba();
        System.out.println("vamos ouvir musica agora");
        iphone.SelecionarMusica();
        System.out.println("seleciando a musica");
        iphone.SelecionarMusica();
        System.out.println("pausar a musica agora");
        iphone.pausar();

       
        
            
        


    }

}
