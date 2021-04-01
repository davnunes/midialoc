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
public class Horarios {
    private int cod;
    private String dia,horario;
    
    public int getCod(){
        return cod;
    }
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getDia(){
        return dia;
    }
    public void setDia(String dia){
        this.dia = dia;
    }
    
    public String getHorario(){
        return horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    /*Adiciona seu valores ao Combo box*/
    @Override
    public String toString(){
        return getHorario();
    }
}
