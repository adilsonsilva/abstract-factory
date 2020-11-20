package br.com.ars.padraoprojeto.abstractfactory.aparelhofactory;

import br.com.ars.padraoprojeto.abstractfactory.som.Som;
import br.com.ars.padraoprojeto.abstractfactory.tv.TV;

public interface AparelhoFactory {
    
    public Som criarSom();
    public TV criarTv();

}
