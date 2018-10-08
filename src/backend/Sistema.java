package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//Classe sistema. Ligação entre back end e front end.
public class Sistema implements java.io.Serializable{

    //Listar de arrays, para uso no front end.
    private ArrayList<Grupo> grupos;
    private ArrayList<Selecao> selecoes;
    private ArrayList<Jogo> jogos;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Staff> membrosStaff;
    private static Sistema sistema;
   
    

        //Construtor
        public Sistema() {
        this.grupos = new ArrayList<Grupo>();
        this.selecoes = new ArrayList<Selecao>();
        this.jogos = new ArrayList<Jogo>();
        this.jogadores = new ArrayList<Jogador>();
        this.membrosStaff = new ArrayList<Staff>();
        
    }

    
//    public static Sistema getInstance(){
//        if (sistema == null){
//            sistema = new Sistema();
//        }
//        return sistema;
//    }
    //Gets

     public ArrayList<Staff> getMembrosStaff() {
        return membrosStaff;
    }
    
    
     public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public ArrayList<Selecao> getSelecoes() {
        return selecoes;
    }

   
    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

   
    
    //Adicionar
    public void adicionarGrupo(Grupo g) {
        grupos.add(g);
    }

    public void adicionarSelecao(Selecao s){
       this.selecoes.add(s);
   }

   
     public void adicionarJogo(Jogo v) {
        this.jogos.add(v);
    }
    
     public void adicionarJogador(Jogador v){
         this.jogadores.add(v);
     }
     
     public void adicionarStaff(Staff n){
         this.membrosStaff.add(n);
     }
     
    
    //Ponto4. Registar o resultado e marcadores de um jogo. (Foreach)
    public void resultadoJogo(){
        for (Jogo e: jogos)
         e.toString();
        }
    
     
     //Listar
   public List<Grupo> listarGrupos(){
    ArrayList<Grupo> gr= new ArrayList<>();
    for(Grupo g: grupos){
        gr.add(g);
    }
    return gr;    
}

     public List<Selecao> listarSelecoes(){
        ArrayList<Selecao> selec= new ArrayList<>();
        for(Selecao s : selecoes){
            selec.add(s);
        }
        return selec;
    }
    
   public List<Jogo> listarJogos() {
        ArrayList<Jogo> jogo= new ArrayList<>();
        for(Jogo j : jogos){
            jogo.add(j);
        }
    return jogo;
    }

    public List<Jogador> listaJogador(){
        ArrayList<Jogador> jog= new ArrayList<>();
        for(Jogador jo: jogadores){
           jog.add(jo);
        }
    return jog;
    }

    public List<Staff> listaStaff(){
        ArrayList<Staff> me = new ArrayList<>();
        for (Staff s : membrosStaff){
           me.add(s);
        }return me;
        
    }
    
    //Guardar Dados
    public void save(){
    try{
    FileOutputStream saveSistema = new FileOutputStream("saveSistema.sav");
    ObjectOutputStream save = new ObjectOutputStream(saveSistema);
    save.writeObject(grupos);
    save.writeObject(selecoes);
    save.writeObject(jogos);
    save.writeObject(jogadores);
    save.writeObject(membrosStaff);
    save.close(); 
    }
    catch(Exception exc){
    exc.printStackTrace();
    }
    }

    //Carregar dados    
    public void load(){
    try{
    FileInputStream saveSistema = new FileInputStream("saveSistema.sav");
    ObjectInputStream load = new ObjectInputStream(saveSistema);
    grupos = (ArrayList) load.readObject();
    selecoes = (ArrayList) load.readObject();
    jogos = (ArrayList) load.readObject();
    membrosStaff = (ArrayList) load.readObject();
    jogadores= (ArrayList) load.readObject();
    load.close(); 
        }
    catch(Exception exc){
    exc.printStackTrace();
}
}
}

