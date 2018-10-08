
package backend;

//Classe para ver e actualizar as estatisticas de um jogo
public class FichaDeJogo extends Jogo {

    
    
   //Construtor 
   public FichaDeJogo(Selecao selecao1, Selecao selecao2, String estadio, String horaJogo, String dataRealizacao) {
        super(selecao1, selecao2, estadio, horaJogo, dataRealizacao);
    }


   
 /*Adicionar cartoes amarelos e vermelhos a um jogador, vai-se procurar o numero de
    cartoes que o jogador j/k já tem e adiciona-se 1 */
    public void adicionarCartaoAmarelo() {
        for(Jogador j : this.getCartoesAmarelos()){
            j.setNumeroCamarelos(j.getNumeroCamarelos() + 1);
        }
    }
    
    public void adicionarCartaoVermelho(){
        for (Jogador k : this.getCartoesVermelhos()){
            k.setNumeroCvermelhos(k.getNumeroCvermelhos()+ 1);
        }
    }
   
      /* Vai-se á lista de marcadores, procura-se o jogador que marcou e adiciona-se
    um golo á sua lista de golos marcados */
   
    public void adicionarGoloJogador(){
        for (Jogador l : this.getMarcadoresGolos()){
            l.setGolosMarcados(l.getGolosMarcados()+ 1);
        }
    }

  //Seleçao joga em casa
   public void addGolosMarcadosSelecaoCasa(){
       int golosMarcados = this.getSelecaoA().getGolosMarcados();
       this.getSelecaoA().setGolosMarcados(this.getGolosSelecaoA()+ golosMarcados);
}


 public void adicionarGolosSofridosSelecaoCasa(){
       int golosSofridos = this.getSelecaoA().getGolosSofridos();
       this.getSelecaoA().setGolosSofridos(this.getGolosSelecaoA()+ golosSofridos);
   }


//seleçao que joga fora
 
 public void addGolosMarcadosSelecaoFora(){
     int golosMarcados2 = this.getSelecaoB().getGolosSofridos();
     this.getSelecaoB().setGolosMarcados(this.getGolosSelecaoB()+ golosMarcados2);
     
 }
 
 public void addGolosSofridosSelecaoFora(){
     int golosSofridos2 = this.getSelecaoB().getGolosSofridos();
     this.getSelecaoB().setGolosSofridos(this.getGolosSelecaoB()+ golosSofridos2);
 }


 //Diferença de golos marcados e golos sofridos. Ex 5 Marcados e 3Sofridos = 2Diferença.
       public void diferencaGolosCasa(){
       int diferencaGolos1 = this.getSelecaoA().getGolosMarcados();
       int diferencaGolos2 = this.getSelecaoB().getGolosSofridos();
       this.getSelecaoA().setDiferencaDeGolos(diferencaGolos1 - diferencaGolos2);
      }

    public void diferencaGolosFora(){
        int diferenca_Golos1= this.getSelecaoB().getGolosMarcados();
        int diferenca_Golos2= this.getSelecaoB().getGolosSofridos();
        this.getSelecaoB().setDiferencaDeGolos(diferenca_Golos1 - diferenca_Golos2);
    }

     
}
