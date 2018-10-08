

package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Metodo para as fases seguintes as fases de eliminação
public class JogoEliminar extends Jogo implements java.io.Serializable {
 
    private ArrayList<Selecao> faseFinal;
    private ArrayList<Selecao> faseMeiaFinal;
    private ArrayList<Selecao> faseQuartosFinal;
    private ArrayList<Selecao> faseOitavosFinal;
   
    //Construtor
    public JogoEliminar() {
        this.faseFinal = new ArrayList<Selecao>();
        this.faseMeiaFinal = new ArrayList<Selecao>();
        this.faseQuartosFinal = new ArrayList<Selecao>();
        this.faseOitavosFinal = new ArrayList<Selecao>();
    }

    public JogoEliminar(Selecao selecaoA, Selecao selecaoB, String nomeEstadio, String horaJogo, String dataJogo) {
        super(selecaoA, selecaoB, nomeEstadio, horaJogo, dataJogo);
    }

    

   
    //Gets
    public ArrayList<Selecao> getFaseFinal() {
        return faseFinal;
    }

    public ArrayList<Selecao> getFaseMeiaFinal() {
        return faseMeiaFinal;
    }

    public ArrayList<Selecao> getFaseQuartosFinal() {
        return faseQuartosFinal;
    }

    public ArrayList<Selecao> getFaseOitavosFinal() {
        return faseOitavosFinal;
    }
    
    //Sets
    public void setFaseFinal(ArrayList<Selecao> faseFinal) {
        this.faseFinal = faseFinal;
    }

    public void setFaseMeiaFinal(ArrayList<Selecao> faseMeiaFinal) {
        this.faseMeiaFinal = faseMeiaFinal;
    }

    public void setFaseQuartosFinal(ArrayList<Selecao> faseQuartosFinal) {
        this.faseQuartosFinal = faseQuartosFinal;
    }

    public void setFaseOitavosFinal(ArrayList<Selecao> faseOitavosFinal) {
        this.faseOitavosFinal = faseOitavosFinal;
    }
    
    public void oitavos() {       
       Grupo j = new Grupo();
       this.faseOitavosFinal = j.getPassagemOitavos();
  }
     
   
    

//Passar de fazer, como por exemplo de oitavos para quartos.
    public void adicionarSelecaoFinal(Selecao a){
        this.faseFinal.add(a);
    }
    
    public void adicionarSelecaoMeiaFinal(Selecao b){
        this.faseMeiaFinal.add(b);
    }
    
    public void adicionarSelecaoFinalQuartos(Selecao c){
        this.faseQuartosFinal.add(c);
    }
    
    public void adicionarSelecaoOitavosFinal(Selecao d){
        this.faseOitavosFinal.add(d);
    }
    
    
   
    //Metodo saber que selecao ganha nos jogos de eliminacao.
    /*Uma vez que durante as fases de eliminacao, uma equipa acabará por marcar
    mais golos que outra, atraves de jogo regulamentar, pronlogamento ou penaltys,
    */
    //Oitavos 8 jogos
    public void faseOitavosFinal(){
     for (int i=0; i < 8; i++){
        if (faseOitavosFinal.contains(this.getSelecaoA()) && faseOitavosFinal.contains(this.getSelecaoB()) && this.getSelecaoA() != this.getSelecaoB()){
        if (this.getSelecaoA().getGolosMarcados() > this.getSelecaoB().getGolosMarcados()){
            faseOitavosFinal.add(this.getSelecaoA());
        }
        if (this.getSelecaoA().getGolosMarcados() < this.getSelecaoB().getGolosMarcados()){
            faseOitavosFinal.add(this.getSelecaoB());
        }
        }
    }
    }
    
    //Quartos 4 jogos
    public void faseQuartosFinal(){
        for (int i=0; i < 4; i++){
            if (faseQuartosFinal.contains(this.getSelecaoA()) && faseQuartosFinal.contains(this.getSelecaoB()) && this.getSelecaoA() != this.getSelecaoB()){
                if (this.getSelecaoA().getGolosMarcados() > this.getSelecaoB().getGolosMarcados()){
                    faseQuartosFinal.add(this.getSelecaoA());
                }
             if (this.getSelecaoA().getGolosMarcados() < this.getSelecaoB().getGolosMarcados()){
                 faseQuartosFinal.add(this.getSelecaoB());
             }
            }
        }
    }
    
    
    //Meias 2 jogos
    public void faseMeiaFinal(){
        for (int i=0; i < 2; i++){
            if (faseMeiaFinal.contains(this.getSelecaoA()) && faseMeiaFinal.contains(this.getSelecaoB()) && this.getSelecaoA()!= this.getSelecaoB()){
                if (this.getSelecaoA().getGolosMarcados() > this.getSelecaoB().getGolosMarcados()){
                    faseMeiaFinal.add(this.getSelecaoA());
                }
             if (this.getSelecaoA().getGolosMarcados() < this.getSelecaoB().getGolosMarcados()){
                 faseMeiaFinal.add(this.getSelecaoB());
             }
            }
        }
    }
    
    
    
    //Final 1 jogo
    public void faseFinal(){
        for (int i=0; i < 1; i++){
            if (faseFinal.contains(this.getSelecaoA()) && faseFinal.contains(this.getSelecaoB()) && this.getSelecaoA() != this.getSelecaoB()){
                if (this.getSelecaoA().getGolosMarcados() > this.getSelecaoB().getGolosMarcados()){
                    faseFinal.add(this.getSelecaoA());
                }
             if (this.getSelecaoA().getGolosMarcados() < this.getSelecaoB().getGolosMarcados()){
                 faseFinal.add(this.getSelecaoB());
             }
            }
        }
    }
    
    
     //Guardar Dados
    public void save(){
    try{
    FileOutputStream saveEliminar = new FileOutputStream("saveFases.sav");
    ObjectOutputStream save = new ObjectOutputStream(saveEliminar);
    save.writeObject(faseFinal);
    save.writeObject(faseMeiaFinal);
    save.writeObject(faseQuartosFinal);
    save.writeObject(faseOitavosFinal);
    save.close(); 
    }
    catch(Exception exc){
    exc.printStackTrace();
    }
    }

    //Carregar dados    
    public void load(){
    try{
    FileInputStream saveEliminar = new FileInputStream("saveFases.sav");
    ObjectInputStream load = new ObjectInputStream(saveEliminar);
    faseFinal = (ArrayList) load.readObject();
    faseMeiaFinal = (ArrayList) load.readObject();
    faseQuartosFinal = (ArrayList) load.readObject();
    faseOitavosFinal = (ArrayList) load.readObject();
    load.close(); 
        }
    catch(Exception exc){
    exc.printStackTrace();
}
}
    
}
