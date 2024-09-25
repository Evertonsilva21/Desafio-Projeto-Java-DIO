package Celular;

import aparelhoTelefonico.AparelhoTelefonico;
import navegador.navegadorInternet;
import reprodutorMusical.reprodutorMusical;

public abstract class Iphone implements reprodutorMusical,navegadorInternet,AparelhoTelefonico {
        public void ligar(){
            System.out.println("ligando");
        }
        public void CorreioDeVoz(){
            System.out.println("Iniciando o correio de voz");
        }
        
        public void atender(){
            System.out.println("atendendo");

          } 
        public void adicionarNovaAba(){
            System.out.println("Adicioando nova aba");
          }
        public void atualizarPagina(){
                System.out.println("Atualizando a página");
            }
        public void exibirPagina(){
                System.out.println("Exibindo a página inicial");
            }
        public void SelecionarMusica(){
                System.out.println("selecionando A música");
            }
        public void tocar(){
                System.out.println("tocando a música selecionada");
            }
        public void pausar(){
                System.out.println("Música pausada");
            }


}
