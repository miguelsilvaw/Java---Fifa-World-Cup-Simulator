package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//Listar seleções pelo grupo.
public class Grupo implements java.io.Serializable {

    private String IDGrupo;
    private ArrayList<Selecao> passagemOitavos;
    private ArrayList<Selecao> selecoes;
    private Selecao A;
    private Selecao B;
    private Selecao C;
    private Selecao D;

    //Construtor
    public Grupo(String IDGrupo) {
        this.IDGrupo = IDGrupo;
        this.passagemOitavos = new ArrayList();
        this.selecoes = new ArrayList();
  }
    
     public Grupo() {
    }

    //Gets
    public ArrayList<Selecao> getPassagemOitavos() {
        return passagemOitavos;
    }
     
     
    public String getIDGrupo() {
        return IDGrupo;
    }


    public ArrayList<Selecao> getSelecoes() {
        return selecoes;
    }

    public Selecao getA() {
        return A;
    }

    public Selecao getB() {
        return B;
    }

    public Selecao getC() {
        return C;
    }

    public Selecao getD() {
        return D;
    }
   
    //Sets
    public void setIDGrupo(String IDGrupo) {
        this.IDGrupo = IDGrupo;
    }

    public void setPassagemOitavos(ArrayList<Selecao> passagemOitavos) {
        this.passagemOitavos = passagemOitavos;
    }

   public void adicionarSelecao(Selecao s){
       this.selecoes.add(s);
   }
     public List<Selecao> listarSelecoes(){
        ArrayList<Selecao> selec= new ArrayList<>();
        for(Selecao s : selecoes){
            selec.add(s);
        }
        return selec;
     }
    public void setSelecoes(ArrayList<Selecao> selecoes) {
        this.selecoes = selecoes;
    }

    public void setA(Selecao A) {
        this.A = A;
    }

    public void setB(Selecao B) {
        this.B = B;
    }

    public void setC(Selecao C) {
        this.C = C;
    }

    public void setD(Selecao D) {
        this.D = D;
    }

   
    //Passagem de grupos
    /* Vai ver se as selecoes de um grupo fizeram cada uma 3 jogos, se fizeram, vai analisar
    os pontos de cada uma, as 2 que tiveram mais pontos avançam, mas caso tiverem pontos iguais
    tem de se ir analisar pela diferença de golos*/
    public void passagemGrupos(){
     if(A.getNumeroJogos()== 3 && B.getNumeroJogos() == 3 && C.getNumeroJogos() == 3 && D.getNumeroJogos() == 3 ){
     //Ver se as selecoes realizaram todas 3 jogos, só assim se pode ver quem passou a fase grupos.
      int primeiroLugar = 0;
      int segundoLugar = 0;
      int pontos1 = 0;
      int pontos2 = 0;
      int pontosdraw = 0;
      for (int i=0; i < this.selecoes.size(); i++){
          if(this.selecoes.get(i).getPontos() > pontos1){
              pontos1 = this.selecoes.get(i).getPontos();
              primeiroLugar = i;
          }
      }
      for (int i=0; i < this.selecoes.size(); i++){
          if(this.selecoes.get(i).getPontos() > pontos2 && i != pontos1){
              pontos2 = this.selecoes.get(i).getPontos();
              segundoLugar = i;
     }
      }
      for (int i=0; i < this.selecoes.size(); i++){
          if(this.selecoes.get(i).getPontos() == pontos1 && i == pontos2){
            if(this.selecoes.get(i).getDiferencaDeGolosA() > this.selecoes.get(i).getDiferencaDeGolosB()){
                if(this.selecoes.get(i).getDiferencaDeGolosA() > this.selecoes.get(i).getDiferencaDeGolosC()){
                    if(this.selecoes.get(i).getDiferencaDeGolosA() > this.selecoes.get(i).getDiferencaDeGolosD()){
                       passagemOitavos.add(A);
                    }
         if(this.selecoes.get(i).getPontos() == pontos1 && i == pontos2){
            if(this.selecoes.get(i).getDiferencaDeGolosB() > this.selecoes.get(i).getDiferencaDeGolosA()){
                if(this.selecoes.get(i).getDiferencaDeGolosB() > this.selecoes.get(i).getDiferencaDeGolosC()){
                    if(this.selecoes.get(i).getDiferencaDeGolosB() > this.selecoes.get(i).getDiferencaDeGolosD()){
                       passagemOitavos.add(B);        
                }
      if(this.selecoes.get(i).getPontos() == pontos1 && i == pontos2){
            if(this.selecoes.get(i).getDiferencaDeGolosC() > this.selecoes.get(i).getDiferencaDeGolosA()){
                if(this.selecoes.get(i).getDiferencaDeGolosC() > this.selecoes.get(i).getDiferencaDeGolosB()){
                    if(this.selecoes.get(i).getDiferencaDeGolosC() > this.selecoes.get(i).getDiferencaDeGolosD()){
                       passagemOitavos.add(C);
            }
      if(this.selecoes.get(i).getPontos() == pontos1 && i == pontos2){
            if(this.selecoes.get(i).getDiferencaDeGolosD() > this.selecoes.get(i).getDiferencaDeGolosA()){
                if(this.selecoes.get(i).getDiferencaDeGolosD() > this.selecoes.get(i).getDiferencaDeGolosB()){
                    if(this.selecoes.get(i).getDiferencaDeGolosD() > this.selecoes.get(i).getDiferencaDeGolosC()){
                       passagemOitavos.add(D);    
          }
}
   }
      }
        }
           }
      }
    }
     }
    }
 }
  }
  }
}
   passagemOitavos.add(this.selecoes.get(primeiroLugar));  
   passagemOitavos.add(this.selecoes.get(segundoLugar));
   //Ve se pontos são iguais, se forem vai procurar pela diferença de golos, depois
   //apura as 2 melhores seleçoes de cada grupo.
  }
}

    
 //Adicionar ao array as selecoes que passaram a fase de grupos    
    public void adicionarSelecoesProximaFase(Selecao o){
        this.selecoes.add(o);
    }
    
   
    //Guardar Dados
    public void save(){
    try{
    FileOutputStream saveGrupo = new FileOutputStream("saveGrupo.sav");
    ObjectOutputStream save = new ObjectOutputStream(saveGrupo);
    save.writeObject(passagemOitavos);
    save.writeObject(selecoes);
    save.close(); 
    }
    catch(Exception exc){
    exc.printStackTrace();
    }
    }

    //Carregar dados    
    public void load(){
    try{
    FileInputStream saveGrupo= new FileInputStream("saveGrupo.sav");
    ObjectInputStream load = new ObjectInputStream(saveGrupo);
    passagemOitavos = (ArrayList) load.readObject();
    selecoes = (ArrayList) load.readObject();
    load.close(); 
        }
    catch(Exception exc){
    exc.printStackTrace();
}
}

}
