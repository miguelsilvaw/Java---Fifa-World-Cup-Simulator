
package backend;


//Classe teste para testar metodos criados.
public class Principal {

   
    public static void main(String[] args) {
        
        //Criar grupos
        Grupo grupoA = new Grupo("Grupo A");
        Grupo grupoB = new Grupo ("Grupo B");
        Grupo grupoC = new Grupo ("Grupo C");
        Grupo grupoD = new Grupo ("Grupo D");
        Grupo grupoE = new Grupo ("Grupo E");
        Grupo grupoF = new Grupo ("Grupo F");
        Grupo grupoG = new Grupo ("Grupo G");
        Grupo grupoH = new Grupo ("Grupo H");
        Sistema s1 = new Sistema();
        // adicionar os grupos
        s1.adicionarGrupo(grupoA);
        s1.adicionarGrupo(grupoB);
        s1.adicionarGrupo(grupoC);
        s1.adicionarGrupo(grupoD);
        s1.adicionarGrupo(grupoE);
        s1.adicionarGrupo(grupoF);
        s1.adicionarGrupo(grupoG);
        s1.adicionarGrupo(grupoH);
        
        
     
        
        
        
         Grupo grupo = new Grupo();
         
         //******************GRUPO A**************************************
         Selecao BRA = new Selecao("BRA", "Brazil", "José Carneiro");
         Selecao CRO = new Selecao("CRO", "Croatia", "Joaz");
         Selecao MEX = new Selecao("MEX", "Mexico", "Paquito");
         Selecao CAM = new Selecao("CAM", "Cameroon", "Xpeke Doz"); 
         
        // adicionar as seleçoes ao grupo A
        System.out.println("----------Grupo A -----------");
        grupoA.adicionarSelecao(BRA);
        grupoA.adicionarSelecao(CRO);
        grupoA.adicionarSelecao(CAM);
        grupoA.adicionarSelecao(MEX);
        //grupoA.listarSelecao();
     
        //********************GRUPO B*****************************************
         Selecao ESP = new Selecao("ESP", "Spain", "Ocelote");
         Selecao HOL = new Selecao("HOL", "Netherlands", "Kerp");
         Selecao CHI = new Selecao("CHI", "Chile", "Diamond Prox");
         Selecao AUS = new Selecao("AUS", "Australia", "Wild Boost");
         
         System.out.println("----------Grupo B -----------");
         grupoB.adicionarSelecao(ESP);
         grupoB.adicionarSelecao(HOL);
         grupoB.adicionarSelecao(CHI);
         grupoB.adicionarSelecao(AUS);
         //grupoB.listarSelecao();
         
         //*******************************GRUPO C**********************************
         
        Selecao COL = new Selecao("COL", "Colombia", "Maria Juane");
        Selecao GRE = new Selecao("GRE", "Greece", "John Lampard");
        Selecao COT = new Selecao("COT", "Cote Divoire", "Xaxus");
        Selecao JAP = new Selecao("JAP", "Japan", "Hiroshima");
        
        System.out.println("----------Grupo C -----------");
        grupoC.adicionarSelecao(COL);
        grupoC.adicionarSelecao(GRE);
        grupoC.adicionarSelecao(COT);
        grupoC.adicionarSelecao(JAP);
        //grupoC.listarSelecao();
               
         //***********************GRUPO D****************************
        
        Selecao URO = new Selecao("URO", "Uruguay", "Falcão Silva");
        Selecao COS = new Selecao("COS", "Costa Rica", "Hernandez Kayle");
        Selecao ING = new Selecao("ING", "Inglaterra", "Jackson Teller");
        Selecao ITA = new Selecao("ITA", "Italy", "Balotteli");
          
        
        
        System.out.println("----------Grupo D -----------");
        grupoD.adicionarSelecao(URO);
        grupoD.adicionarSelecao(COS);
        grupoD.adicionarSelecao(ING);
        grupoD.adicionarSelecao(ITA);
        //grupoD.listarSelecao();
    
        //***********************GRUPO E**************************************
        Selecao SWI = new Selecao("SWI", "SWITZERLAND", "Banks");
        Selecao ECU = new Selecao("ECU", "Ecuador", "Rui");
        Selecao FRA = new Selecao("FRA", "France", "DiNatalli");
        Selecao HON = new Selecao("HON", "HONDURAS", "HonJohn");
        
        
        
        
        
        
        
        
        
        System.out.println("----------Grupo E -----------");
        grupoE.adicionarSelecao(SWI);
        grupoE.adicionarSelecao(ECU);
        grupoE.adicionarSelecao(FRA);
        grupoE.adicionarSelecao(HON);
        //grupoE.listarSelecao();

        //*******************************GRUPO F******************************
        
        Selecao ARG = new Selecao("ARG", "Argentina", "Maradonna");
        Selecao BOS = new Selecao("BOS", "Bosnia", "Boas");
        Selecao IRA = new Selecao("IRA", "Iran", "Sassam");
        Selecao NIG = new Selecao("NIG", "Nigeria", "Soul");
        
        
        
        
        
        
        
        
        
        
        System.out.println("----------Grupo F -----------");
        grupoF.adicionarSelecao(ARG);
        grupoF.adicionarSelecao(BOS);
        grupoF.adicionarSelecao(IRA);
        grupoF.adicionarSelecao(NIG);
        //grupoF.listarSelecao();
        
        
        //*******************************GRUPO G******************************
        
        Selecao GER = new Selecao("GER", "Germany", "Schanw");
        Selecao POR = new Selecao("POR", "Portugal", "João Soares");
        Selecao GHA = new Selecao("GHA", "Ghana", "Gama");
        Selecao USA = new Selecao("USA", "USA", "Obama");
        
        
        
        
        
        System.out.println("----------Grupo G -----------");
        grupoG.adicionarSelecao(GER);
        grupoG.adicionarSelecao(POR);
        grupoG.adicionarSelecao(GHA);
        grupoG.adicionarSelecao(USA);
        //grupoG.listarSelecao();
        
        
        
        
        
        //***************************GRUPO H*******************************
        Selecao BEL = new Selecao("BEL", "Belgium", "Bob Marley");
        Selecao ARL = new Selecao("ARL", "Argelia", "Anjo");
        Selecao RUS = new Selecao("RUS", "Russia", "Vladimir");
        Selecao KOR = new Selecao("KOR", "Korea", "Kim Jon Un");
    
    
    
        System.out.println("----------Grupo H -----------");
        grupoH.adicionarSelecao(BEL);
        grupoH.adicionarSelecao(ARL);
        grupoH.adicionarSelecao(RUS);
        grupoH.adicionarSelecao(KOR);
        //grupoH.listarSelecao();
    
    
    // jogos
//        Jogo j1 = new Jogo(POR,USA,"","","");
//        j1.setResultadoFinalJogo("1-0");
//        j1.setSelecao1(POR);
//        j1.setSelecao2(USA);
//        j1.setGolosSelecao1(1);
//        j1.setGolosSelecao2(0);
//        
//       
//     s1.addJogo(j1);
//     s1.listarJogos();
    
   
    }

}
