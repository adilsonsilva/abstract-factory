package br.com.ars.padraoprojeto.abstractfactory.marcafactory;

import br.com.ars.padraoprojeto.abstractfactory.aparelhofactory.AparelhoFactory;
import br.com.ars.padraoprojeto.abstractfactory.som.Som;
import br.com.ars.padraoprojeto.abstractfactory.som.impl.SomSansung;
import br.com.ars.padraoprojeto.abstractfactory.tv.TV;
import br.com.ars.padraoprojeto.abstractfactory.tv.impl.TVSansung;

public class Sansung implements AparelhoFactory{

    @Override
    public Som criarSom() {
	return new SomSansung();
    }

    @Override
    public TV criarTv() {
	return new TVSansung();
    }

}
