
package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

//Calendario: Adicionar jogos e listagem dos mesmos.
public class Calendario implements java.io.Serializable {
    
    private ArrayList<Jogo> jogo;
    private HashMap<String, ArrayList<Jogo>> calendario;
   
    
    //Construtor
    public Calendario() {
        this.jogo = new ArrayList<Jogo>();
        this.calendario = new HashMap();
    }

    
    //Gets
    public ArrayList<Jogo> getJogo(){
        return jogo;
        }

    public HashMap<String, ArrayList<Jogo>> getCalendario() {
        return calendario;
    }

    
    /*Adicionar um jogo ao calendario de jogos do Mundial.
    Adicionar um jogo ao calendário do fifawc2014. Sabendo em que eliminatoria
    se encontra e que jogo está a ser disputado.*/
    public void adicionarJogo(String eliminatoria, Jogo q){
        if(this.calendario.containsKey(eliminatoria)){
            this.calendario.get(eliminatoria).add(q);
        }
    }

    //Guardar Dados
    public void save(){
    try{
    FileOutputStream saveCalendario = new FileOutputStream("saveCalendario.sav");
    ObjectOutputStream save = new ObjectOutputStream(saveCalendario);
    save.writeObject(jogo);
    save.close(); 
    }
    catch(Exception exc){
    exc.printStackTrace();
    }
    }

    //Carregar dados    
    public void load(){
    try{
    FileInputStream saveCalendario = new FileInputStream("saveCalendario.sav");
    ObjectInputStream load = new ObjectInputStream(saveCalendario);
    jogo = (ArrayList) load.readObject();
    load.close(); 
        }
    catch(Exception exc){
    exc.printStackTrace();
}
}
    
}
