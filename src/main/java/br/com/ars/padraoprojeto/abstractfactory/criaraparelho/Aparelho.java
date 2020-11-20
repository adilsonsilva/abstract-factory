package br.com.ars.padraoprojeto.abstractfactory.criaraparelho;

import br.com.ars.padraoprojeto.abstractfactory.aparelhofactory.AparelhoFactory;
import br.com.ars.padraoprojeto.abstractfactory.som.Som;
import br.com.ars.padraoprojeto.abstractfactory.tv.TV;

public class Aparelho {

    private TV tv;
    private Som som;

    public Aparelho(AparelhoFactory factory) {
	this.tv = factory.criarTv();
	this.som = factory.criarSom();
    }

    public void ligar() {
	tv.ligar();
	som.ligar();
    }

}
