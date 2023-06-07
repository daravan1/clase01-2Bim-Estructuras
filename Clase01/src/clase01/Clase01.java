/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01;

/**
 *
 * @author SALA H
 */
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int op;
        Metodos_listas obj = new Metodos_listas();
        op = obj.menu();
        do {
            switch(op){
                case 1 :
                    obj.insertar();
                case 2:
                    obj.recorrer();
                case 3:
                    obj.insOrden();
                    break;
                default:
            
            }
        } while (op != 0);
    }
    
}
