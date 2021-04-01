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
public class Professores {
    private int cod;
    private String nome,disciplina;
    
    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    
    /*Adiciona seu valores ao Combo box*/
    @Override
    public String toString(){
        return getNome();
    }
}
