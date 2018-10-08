

package frontend;

import backend.Sistema;

//Main class front end
public class Frontend {
    public static Sistema sistema;
   
    public static void main(String[] args) {
       sistema = new Sistema();
       Home home= new Home(sistema);
       home.setSize(800, 370);
       home.setVisible(true);
       
       
       
       
       
       
       
        
    }
    
}
