package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


//Metodo para ver informação sobre seleções, registos e listagem .
public class Selecao implements java.io.Serializable{

    
    //Variaveis de instancia
    private String códigoSelecao;
    private String nomeSelecao;
    private String nomeResponsavel;
    private int numeroJogos;
    private int pontos;
    private int golosMarcados;
    private int diferencaDeGolos;
    private int diferencaDeGolosA;
    private int diferencaDeGolosB;
    private int diferencaDeGolosC;
    private int diferencaDeGolosD;
    private int golosSofridos;
    private int vitorias;
    private int derrotas;
    private int empates;
    private ArrayList<Staff> equipaTecnica; //Staff (Equipa Tecnica + Acompanhantes)
    private ArrayList<Pessoas> total; //Jogadores + Equipa Técnica (Subclasses de Pessoas)

    //Construtor
    public Selecao(String códigoSelecao, String nomeSelecao, String nomeResponsavel) {
        this.códigoSelecao = códigoSelecao;
        this.nomeSelecao = nomeSelecao;
        this.nomeResponsavel = nomeResponsavel;
        this.equipaTecnica = new ArrayList<Staff>();
        this.total = new ArrayList<Pessoas>();
    }
    
    public Selecao() {
    }

    //Gets
    public String getCódigoSelecao() {
        return códigoSelecao;
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public int getNumeroJogos() {
        return numeroJogos;
    }

    public int getPontos() {
        return pontos;
    }

    public int getGolosMarcados() {
        return golosMarcados;
    }

    public int getDiferencaDeGolosA() {
        return diferencaDeGolosA;
    }

    public int getDiferencaDeGolosB() {
        return diferencaDeGolosB;
    }

    public int getDiferencaDeGolosC() {
        return diferencaDeGolosC;
    }

    public int getDiferencaDeGolosD() {
        return diferencaDeGolosD;
    }
    

    public int getGolosSofridos() {
        return golosSofridos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public ArrayList<Staff> getEquipaTecnica() {
        return equipaTecnica;
    }

    public ArrayList<Pessoas> getTotal() {
        return total;
    }

    public int getDiferencaDeGolos() {
        return diferencaDeGolos;
    }
    
    
    //Sets
    public void setCódigoSelecao(String códigoSelecao) {
        this.códigoSelecao = códigoSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setNumeroJogos(int numeroJogos) {
        this.numeroJogos = numeroJogos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setGolosMarcados(int golosMarcados) {
        this.golosMarcados = golosMarcados;
    }

    public void setDiferencaDeGolos(int diferencaDeGolosA) {
        this.diferencaDeGolosA = diferencaDeGolosA;
    }

    public void setGolosSofridos(int golosSofridos) {
        this.golosSofridos = golosSofridos;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setEquipaTecnica(ArrayList<Staff> equipaTecnica) {
        this.equipaTecnica = equipaTecnica;
    }

    public void setTotal(ArrayList<Pessoas> total) {
        this.total = total;
    }

    public void setDiferencaDeGolosA(int diferencaDeGolosA) {
        this.diferencaDeGolosA = diferencaDeGolosA;
    }

    public void setDiferencaDeGolosB(int diferencaDeGolosB) {
        this.diferencaDeGolosB = diferencaDeGolosB;
    }

    public void setDiferencaDeGolosC(int diferencaDeGolosC) {
        this.diferencaDeGolosC = diferencaDeGolosC;
    }

    public void setDiferencaDeGolosD(int diferencaDeGolosD) {
        this.diferencaDeGolosD = diferencaDeGolosD;
    }
    
    
    
    //Ver numero de vitorias, empates e derrotas de uma selecao.
    public void vitoriasSelecao(){
        vitorias++;
    }
    
    public void empatesSelecao(){
        empates++;
    }
    
    public void derrotasSelecao(){
        derrotas++;
    }

   
    //Pontos de uma selecao
    public int PontosSelecao (){
        int totalPontos;
        totalPontos = ((vitorias*3)+(empates));
        return totalPontos;
    }


    //Calcular o número de jogos de uma selecao.
    public int numeroJogos(){
        numeroJogos =(vitorias+empates+derrotas);
        return numeroJogos;
    }

    //Ponto 7. Somar total elementos de uma Selecao.
    public int totalElementos(){
        int elementos1 = 0;
        int elementos2 = 0;
        int totalElementos = 0;
        for (int i=0; i < this.total.size(); i++){
            elementos1++;
        }
        for (int i=0; i < this.equipaTecnica.size(); i++){
            elementos2++;
        }
        totalElementos = elementos1 + elementos2;
        return totalElementos;
    }
    
    
    //Adicionar Staff (Equipa Tecnica ou Acompanhante).
    public void adicionarMembroStaff(Staff t){
        equipaTecnica.add(t);
    }
    
    
    //Listar Staff (Equipa Tecnica ou Acompanhante).
    public void listarStaff() {
        equipaTecnica = new ArrayList<Staff>();
    }
    
    
    //Adicionar Jogador.
    public void adicionarJogador(Jogador y){
        total.add(y);
    }
    
    //Listar jogador
     public void listarJogador() {
        total = new ArrayList<Pessoas>();
    }
     
     
     //Aos golos marcados retiramos os sofridos.
     public void diferencaGolos(){
        diferencaDeGolos = golosMarcados - golosSofridos;
    }

    //toString
    @Override
    public String toString() {
        return "Selecao{" + "c\u00f3digoSelecao=" + códigoSelecao + ", nomeSelecao=" + nomeSelecao + '}';
    }
    
    //Guardar Dados
    public void save(){
    try{
    FileOutputStream saveSelecao = new FileOutputStream("saveSelecao.sav");
    ObjectOutputStream save = new ObjectOutputStream(saveSelecao);
    save.writeObject(equipaTecnica);
    save.writeObject(total);
    save.close(); 
    }
    catch(Exception exc){
    exc.printStackTrace();
    }
    }

    //Carregar dados    
    public void load(){
    try{
    FileInputStream saveSelecao= new FileInputStream("saveSelecao.sav");
    ObjectInputStream load = new ObjectInputStream(saveSelecao);
    equipaTecnica = (ArrayList) load.readObject();
    total = (ArrayList) load.readObject();
     load.close(); 
        }
    catch(Exception exc){
    exc.printStackTrace();
}
}
    
    
}
