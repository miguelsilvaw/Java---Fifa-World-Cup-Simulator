package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Como decorre um jogo
public class Jogo implements java.io.Serializable{

    //variaveis de instancia
    private Selecao selecaoA;
    private Selecao selecaoB;
    private String nomeEstadio;
    private String horaJogo;
    private String dataJogo;
    private String resultadoFinalJogo;
    private int numeroJogo;
    private int golosSelecaoA;
    private int golosSelecaoB;
    private ArrayList<Golo> golos;
    private ArrayList<Jogador> cartoesAmarelos;
    private ArrayList<Jogador> cartoesVermelhos;
    private ArrayList<Jogador> marcadoresGolos;
    private ArrayList<Arbitro> equipaArbitragem;
    private ArrayList<Jogador> marcadorSelecaoCasa; //Marcou um golo para a selecao que joga em casa.
    private ArrayList<Jogador> marcadorSelecaoFora; //Marcou um golo para a selecao que joga fora.
    
    //Constructor
    public Jogo(Selecao selecaoA, Selecao selecaoB, String nomeEstadio, String horaJogo, String dataJogo) {
        this.selecaoA = selecaoA;
        this.selecaoB = selecaoB;
        this.nomeEstadio = nomeEstadio;
        this.horaJogo = horaJogo;
        this.dataJogo = dataJogo;
        this.cartoesAmarelos = new ArrayList<Jogador>();
        this.cartoesVermelhos = new ArrayList<Jogador>();
        this.equipaArbitragem = new ArrayList<Arbitro>();
        this.marcadoresGolos = new ArrayList<Jogador>();
        this.golos = new ArrayList<Golo>();
    }
    
    public Jogo() {
    }
        
    //Gets
    public int getGolosSelecaoA() {
        return golosSelecaoA;
    }

    public int getGolosSelecaoB() {
        return golosSelecaoB;
    }

    public ArrayList<Jogador> getMarcadorSelecaoCasa() {
        return marcadorSelecaoCasa;
    }

    public ArrayList<Jogador> getMarcadorSelecaoFora() {
        return marcadorSelecaoFora;
    }
    
    
     public int getNumeroJogo() {
        return numeroJogo;
    }

    public ArrayList<Golo> getGolos() {
        return golos;
    }
   
    
    public Selecao getSelecaoA() {
        return selecaoA;
    }

    public Selecao getSelecaoB() {
        return selecaoB;
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }

    public String getHoraJogo() {
        return horaJogo;
    }

    public String getDataJogo() {
        return dataJogo;
    }

    public String getResultadoFinalJogo() {
        return resultadoFinalJogo;
    }

    public int getGolosSelecao1() {
        return golosSelecaoA;
    }

    public int getGolosSelecao2() {
        return golosSelecaoB;
    }

    public ArrayList<Jogador> getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public ArrayList<Jogador> getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public ArrayList<Jogador> getMarcadoresGolos() {
        return marcadoresGolos;
    }

    public ArrayList<Arbitro> getEquipaArbitragem() {
        return equipaArbitragem;
    }
    
    //Sets
  public void setNumeroJogo(int numeroJogo) {
        this.numeroJogo = numeroJogo;
    }

    public void setGolos(ArrayList<Golo> golos) {
        this.golos = golos;
    }
    

    public void setSelecaoA(Selecao selecaoA) {
        this.selecaoA = selecaoA;
    }

    public void setSelecaoB(Selecao selecaoB) {
        this.selecaoB = selecaoB;
    }

    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }

    public void setHoraJogo(String horaJogo) {
        this.horaJogo = horaJogo;
    }

    public void setDataJogo(String dataJogo) {
        this.dataJogo = dataJogo;
    }

    public void setResultadoFinalJogo(String resultadoFinalJogo) {
        this.resultadoFinalJogo = resultadoFinalJogo;
    }

    public void setGolosSelecao1(int golosSelecao1) {
        this.golosSelecaoA = golosSelecao1;
    }

    public void setGolosSelecao2(int golosSelecao2) {
        this.golosSelecaoB = golosSelecao2;
    }

    public void setCartoesAmarelos(ArrayList<Jogador> cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public void setCartoesVermelhos(ArrayList<Jogador> cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }

    public void setMarcadoresGolos(ArrayList<Jogador> marcadoresGolos) {
        this.marcadoresGolos = marcadoresGolos;
    }

    public void setEquipaArbitragem(ArrayList<Arbitro> equipaArbitragem) {
        this.equipaArbitragem = equipaArbitragem;
    }

    public void setGolosSelecaoA(int golosSelecaoA) {
        this.golosSelecaoA = golosSelecaoA;
    }

    public void setGolosSelecaoB(int golosSelecaoB) {
        this.golosSelecaoB = golosSelecaoB;
    }

    public void setMarcadorSelecaoCasa(ArrayList<Jogador> marcadorSelecaoCasa) {
        this.marcadorSelecaoCasa = marcadorSelecaoCasa;
    }

    public void setMarcadorSelecaoFora(ArrayList<Jogador> marcadorSelecaoFora) {
        this.marcadorSelecaoFora = marcadorSelecaoFora;
    }
    
    
     
    

    

   
    
    //Adicionar um arbitro á lista de Arbitros
    public void adicionarArbitro(Arbitro a){
        this.equipaArbitragem.add(a);
    }

    //Adicionar um jogador que levou um cartao amarelo durante o jogo.
    public void adicionarCartaoAmarelo(Jogador j){
        this.cartoesAmarelos.add(j);
    }
    
    //Adicionar um jogador que levou um cartao vermelho durante o jogo.
    public void adicionarCartaoVermelho(Jogador k){
        this.cartoesVermelhos.add(k);
    }
    
    //Adicionar golo a um jogador.
    public void adicionarMarcadoresGolo(Jogador l){
        this.marcadoresGolos.add(l);
    }
    
    //Adicionar um golo.
    public void novoGolo(Golo g){
        this.golos.add(g);
    }
    
    //Adicionar um ao numero de jogos já decorridos.
    public void adicionarNumeroJogo(){
        numeroJogo++;
    }

    
      //Cartoes (Amarelos e vermelhos) durante um jogo.
    public void totalCartoes(){
        for (int i=0; i < this.cartoesAmarelos.size(); i++){
            cartoesAmarelos.get(i).adicionarCartaoAmarelo();
        }
        for(int i=0; i< this.cartoesVermelhos.size(); i++){
            cartoesVermelhos.get(i).adicionarCartaoVermelho();
        }
    }
    
    
    //Registar resultado de um jogo
    public void resultadoJogo(){
        for (int i=0; i < this.marcadorSelecaoCasa.size(); i++){
            golosSelecaoA++;
            marcadorSelecaoCasa.get(i).getGolosMarcados();
        }
        for (int i=0; i < this.marcadorSelecaoFora.size(); i++){
            golosSelecaoB++;
            marcadorSelecaoCasa.get(i).getGolosMarcados();
        }
 }
    
   //Jogo eliminatoria
    public void jogoEliminatoria(){
        this.resultadoJogo();
        this.selecaoA.getGolosMarcados();
        this.selecaoB.getGolosMarcados();
        if (this.golosSelecaoA > this.golosSelecaoB){
            selecaoA.vitoriasSelecao();
            selecaoB.derrotasSelecao();
        }
        else {
            selecaoA.derrotasSelecao();
            selecaoB.vitoriasSelecao();
        }
    }

    
     //Jogo grupo
    public void jogoGrupo(){
        this.resultadoJogo();
        this.selecaoA.getGolosMarcados();
        this.selecaoB.getGolosMarcados();
        if (this.golosSelecaoA > this.golosSelecaoB){
            selecaoA.vitoriasSelecao();
            selecaoB.derrotasSelecao();
        }
        else if( this.golosSelecaoA < this.golosSelecaoB){
            selecaoA.derrotasSelecao();
            selecaoB.vitoriasSelecao();
        }
        else
        {
            selecaoA.empatesSelecao();
            selecaoB.empatesSelecao();
        }
 }

//Autogolo
/* Se autgolo for falso é golo normal, logo adiciona-se ao marcador, mas se for verdadeiro
    nao se adiciona ao marcador */
    
 public void autoGolo(){
        for(int i=0; i < this.golos.size(); i++){
            if (this.golos.get(i).isAutoGolo()==false){
                this.marcadoresGolos.add(this.golos.get(i).getMarcadorGolo());
              }
        }
     }

 //Guardar Dados
    public void save(){
    try{
    FileOutputStream saveJogo = new FileOutputStream("saveJogo.sav");
    ObjectOutputStream save = new ObjectOutputStream(saveJogo);
    save.writeObject(cartoesAmarelos);
    save.writeObject(cartoesVermelhos);
    save.writeObject(marcadoresGolos);
    save.writeObject(equipaArbitragem);
    save.writeObject(marcadorSelecaoCasa);
    save.writeObject(marcadorSelecaoFora);
    save.close(); 
    }
    catch(Exception exc){
    exc.printStackTrace();
    }
    }

    //Carregar dados    
    public void load(){
    try{
    FileInputStream saveJogo = new FileInputStream("saveJogo.sav");
    ObjectInputStream load = new ObjectInputStream(saveJogo);
    cartoesAmarelos = (ArrayList) load.readObject();
    cartoesVermelhos = (ArrayList) load.readObject();
    marcadoresGolos = (ArrayList) load.readObject();
    equipaArbitragem = (ArrayList) load.readObject();
    marcadorSelecaoCasa = (ArrayList) load.readObject();
    marcadorSelecaoFora = (ArrayList) load.readObject();
     load.close(); 
        }
    catch(Exception exc){
    exc.printStackTrace();
}
}
    
 
 
}
 
