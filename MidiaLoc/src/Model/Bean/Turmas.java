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
public class Turmas {
    private int cod;
    private String turma, ano;
    
    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getTurma(){
        return turma;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }
    
    public String getAno(){
        return ano;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    
    /*Adiciona seu valores ao Combo box*/
    @Override
    public String toString(){
        return getTurma();
    }
}
