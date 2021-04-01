/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;

/**
 *
 * @author Samsung
 */
public class Ambientes {
    private int cod;
    private String ambiente;
    
    public int getCod(){
        return cod;
    }    
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getAmbiente(){
        return ambiente;
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }
    
    /*Adiciona seu valores ao Combo box*/
    @Override
    public String toString(){
        return getAmbiente();
    }  
}
