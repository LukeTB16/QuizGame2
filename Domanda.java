/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 73287948
 */
public class Domanda{
    private String domanda;
    private ArrayList<String> risposte;
    private int corretta;
    
    public Domanda() {
        risposte = new ArrayList<>();
    }
    public int getCorretta() {
        return corretta;
    }

    public void setCorretta(int corretta) {
        this.corretta = corretta;
    }

    public String getDomanda() {
        return domanda;
    }

    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }
    
   
    
    public void addRisposta(String risposta)
    {
        risposte.add(risposta);
    }
    
    public ArrayList<String> getRisposte()
    {
        return risposte;
    }
    public String getRisposta(int index)
    {
        return risposte.get(index);
    }
}
