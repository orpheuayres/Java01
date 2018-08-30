/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.orpheu.pmedianas.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class TabelaGeral {

    /**
     * @return the pontos
     */
    public List<Ponto> getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(List<Ponto> pontos) {
        this.pontos = pontos;
    }

    /**
     * @return the locais
     */
    public List<Local> getLocais() {
        return locais;
    }

    /**
     * @param locais the locais to set
     */
    public void setLocais(List<Local> locais) {
        this.locais = locais;
    }

    /**
     * @return the pontosEleitos
     */
    public List<Ponto> getPontosEleitos() {
        return pontosEleitos;
    }

    /**
     * @param pontosEleitos the pontosEleitos to set
     */
    public void setPontosEleitos(List<Ponto> pontosEleitos) {
        this.pontosEleitos = pontosEleitos;
    }

    private List<Ponto> pontos = new ArrayList();
    private List<Local> locais = new ArrayList();
    private List<Ponto> pontosEleitos = new ArrayList();
    public double[][] distancia;
    public double[] somaDasDistancias;
    public int[] indiceDasDistancias;
    public int qtdeSelecionados = 2;

    public void calcular() {
        int pt, lc;
        pt = getPontos().size();
        lc = getLocais().size();
        distancia = new double[pt][lc];
        somaDasDistancias = new double[pt];
        indiceDasDistancias = new int[pt];
        Map<Integer, Double> teste = new HashMap();
        for (int i = 0; i < pt; i++) {
            somaDasDistancias[i] = 0;
            indiceDasDistancias[i] = i;
            for (int j = 0; j < lc; j++) {
                distancia[i][j] = Math.sqrt(Math.pow(getPontos().get(i).getX() - getLocais().get(j).getX(), 2)
                        + Math.pow(getPontos().get(i).getY() - getLocais().get(j).getY(), 2));
                somaDasDistancias[i] += distancia[i][j];
            }
            
        }
    }
    
    public void selecionarPontos(){
        for (int i=0; i < qtdeSelecionados; i++){
            for (int j=i+1; j < getPontos().size(); j++){
                if(somaDasDistancias[i]<somaDasDistancias[j]){
                    double aux = somaDasDistancias[i];
                    somaDasDistancias[i] = somaDasDistancias[j];
                    somaDasDistancias[j] = aux;
                    int auxi = indiceDasDistancias[i];
                    indiceDasDistancias[i] = indiceDasDistancias[j];
                    indiceDasDistancias[j] = auxi;
                }
            }
            pontosEleitos.add(pontos.get(indiceDasDistancias[i]));
        }
    }

}
