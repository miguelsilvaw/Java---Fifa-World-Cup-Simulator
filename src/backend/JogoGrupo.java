
package backend;

//Classe para jogos da frase de grupos.
public class JogoGrupo extends Jogo {

   
    //Construtor
    public JogoGrupo(Selecao selecao1, Selecao selecao2, String estadio, String horaJogo, String dataRealizacao) {
        super(selecao1, selecao2, estadio, horaJogo, dataRealizacao);
    }

   
    //Os pontos de uma selecao, vitoria = 3, empate = 1, derrota = 0.
    public void jogoGrupoX(){
        if(this.getGolosSelecaoA() > this.getGolosSelecaoB()){
            this.getSelecaoA().setPontos(this.getSelecaoA().getPontos() + 3);
        }
        else
        {
        if(this.getGolosSelecaoB() > this.getGolosSelecaoA()){
            this.getSelecaoB().setPontos(this.getSelecaoB().getPontos() + 3);
        } 
        else
        {
        if(this.getGolosSelecaoB() == this.getGolosSelecaoA()){
            this.getSelecaoB().setPontos(this.getSelecaoB().getPontos() + 1);
            this.getSelecaoA().setPontos(this.getSelecaoA().getPontos() + 1);
        }   
        }
        }
    }





}











