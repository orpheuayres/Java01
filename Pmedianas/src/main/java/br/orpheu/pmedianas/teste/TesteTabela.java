/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.orpheu.pmedianas.teste;

import br.orpheu.pmedianas.classes.Local;
import br.orpheu.pmedianas.classes.Ponto;
import br.orpheu.pmedianas.classes.TabelaGeral;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class TesteTabela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto a1 = new Ponto(-22.1090378,-41.4799135, "a1");
        Ponto a2 = new Ponto(-22.1090577,-41.4799135, "a2");
        Ponto a3 = new Ponto( -22.1090577,-41.4799135,"a3");
        Ponto a4 = new Ponto(-22.1090577,-41.4799135, "a4");
       //Ponto a5 = new Ponto(-22.1128256,-41.468847,14, "a5");
       Local b1 = new Local(-22.1091562,-41.479056,"b1"); 
       Local b2 = new Local(-22.1087138,-41.4767278,"b2"); 
       Local b3 = new Local(-22.1075036,-41.4731391,"b3"); 
       Local b4 = new Local(-22.1092368,-41.4688367,"b4"); 
       Local b5 = new Local(-22.1065986,-41.4698241,"b5"); 
       Local b6 = new Local(-22.1094908,-41.473252,"b6"); 
       Local b7 = new Local(-22.1095054,-41.4718311,"b7"); 
       Local b8 = new Local(-22.1083593,-41.4683416,"b8"); 
       Local b9 = new Local(-22.1051562,-41.459056,"b9"); 
               
        TabelaGeral tb = new TabelaGeral();
        tb.getPontos().add(a1);
        tb.getPontos().add(a2);
        tb.getPontos().add(a3);
        tb.getPontos().add(a4);
        
        tb.getLocais().add(b1);
        tb.getLocais().add(b2);
        tb.getLocais().add(b3);
        tb.getLocais().add(b4);
        tb.getLocais().add(b5);
        tb.getLocais().add(b6);
        tb.getLocais().add(b7);
        tb.getLocais().add(b8);
        tb.getLocais().add(b9);
        
        tb.calcular();
        tb.selecionarPontos();
        
        for (Iterator it = tb.getPontosEleitos().iterator(); it.hasNext();) {
            Ponto p = (Ponto) it.next();
            System.out.println("Ponto eleito: " + p.getNome());
        }
   }
    
}
