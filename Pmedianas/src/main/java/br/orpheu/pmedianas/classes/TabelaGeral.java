/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.orpheu.pmedianas.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class TabelaGeral {

    List<Ponto> pontos = new ArrayList<Ponto>();
    List<Local> locais = new ArrayList<Local>();
    List<Ponto> pontosEleitos = new ArrayList<Ponto>();
    double[][] distancia;

    public void calcular() {
        int pt, lc;
        pt = pontos.size();
        lc = locais.size();
        distancia = new double[pt][lc];
        for (int i = 0; i < pt; i++) {
            for (int j = 0; j < lc; j++) {
                distancia[i][j]= Math.sqrt(Math.pow(pontos.get(i).getX(), j))
            }
        }

    }

}
