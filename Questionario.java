/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author luke
 */
public class Questionario {
    ArrayList <Domanda> domande;

    public Questionario() {
        this.domande = new ArrayList<>();
    }
    
    public void addDomanda(Domanda d)
    {
        domande.add(d);
    }
    
    public Domanda getDomanda (int index)
    {
        return domande.get(index);
    }
    
    
    
    public void mescola()
    {
        Collections.shuffle(domande);
    }
    
}
