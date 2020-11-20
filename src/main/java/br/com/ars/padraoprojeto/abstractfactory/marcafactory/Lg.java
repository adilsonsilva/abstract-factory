package br.com.ars.padraoprojeto.abstractfactory.marcafactory;

import br.com.ars.padraoprojeto.abstractfactory.aparelhofactory.AparelhoFactory;
import br.com.ars.padraoprojeto.abstractfactory.som.Som;
import br.com.ars.padraoprojeto.abstractfactory.som.impl.SomLg;
import br.com.ars.padraoprojeto.abstractfactory.tv.TV;
import br.com.ars.padraoprojeto.abstractfactory.tv.impl.TVLg;

public class Lg implements AparelhoFactory {

    @Override
    public Som criarSom() {
	return new SomLg();
    }

    @Override
    public TV criarTv() {
	return new TVLg();
    }
}
