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
public class Geral {
    private int cod;
    private String instituicao;
    
    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getInstituicao(){
        return instituicao;
    }
    public void setInstituicao(String instituicao){
        this.instituicao = instituicao;
    }
    
    /*Adiciona seu valores ao Combo box*/
    @Override
    public String toString(){
        return getInstituicao();
    }
    
}
