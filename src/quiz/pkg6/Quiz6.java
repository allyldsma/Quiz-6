/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg6;

/**
 *
 * @author admin
 */
public class Quiz6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        LinkedPositionalList<String> list = new LinkedPositionalList<>();
        Position p1 = list.addFirst("position1");
        Position p2 = list.addAfter(p1, "after position 1");
        Position p3 = list.addBefore(p2, "before p2");
        Position p4 = list.addLast("last position");
        
        //----------------------------------------------------------------------
        
        list.showPositionList();
        
        //--[position1][before p2][after position 1][last position]-------------
        
        list.remove(p2);
        System.out.println();
        list.showPositionList();
        
        //--[position1][before p2][last position]-------------------------------
        
        list.moveToFront(p4, "last position");
        System.out.println();
        list.showPositionList();
        
        //--[position1][last position][last position]---------------------------
        
        System.out.println();
    }
    
}
