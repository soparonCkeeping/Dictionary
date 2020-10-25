/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary;
/**
 *
 * @author TCC
 */
public class Mydictionary {
    
    String word_target;
    String word_explain;
    String word_pronounce;
    
    public Mydictionary (String word_target, String word_pronounce, String word_explain ) {
        this.word_target = word_target;
        this.word_explain = word_explain;
        this.word_pronounce = word_pronounce;
    }
    
    public void setWord_target (String word_target) {
        this.word_target = word_target;
    }
     public  String getWord_target() {
        return word_target;
    }
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    public String getWord_explain() {
        return word_explain;
    }
    public void setWord_pronounce (String word_pronounce) {
        this.word_pronounce = word_pronounce;
    }
    public String getWord_pronounce ( ) {
        return word_pronounce;
    }
     
    public static void main(String[] args) {
        DictionaryGuiprocessing dgp = new DictionaryGuiprocessing();
        dgp.insertFromFile();
        
        practice sA = new practice();
        sA.setVisible(true);
        // TODO code application logic here
    }
    
}
