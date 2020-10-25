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
public class DictionaryGuiprocessing extends mydictionary.practice{
    public void insertFromFile () {
        mydictionary.DictionaryManagement dm = new mydictionary.DictionaryManagement();
        dm.takeDataToArr();
        // lấy dữ liệu từ sql sang mảng
    }

}
