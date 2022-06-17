
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class words {
    public String getRandomWord() {
    List<String> list = new ArrayList<>();  
    list.add("punit"); 
    list.add("put");
    list.add("crome"); 
    
    Random rand = new Random();
    
    String word = list.get(rand.nextInt(list.size()));
    
    return word;
    }
}
