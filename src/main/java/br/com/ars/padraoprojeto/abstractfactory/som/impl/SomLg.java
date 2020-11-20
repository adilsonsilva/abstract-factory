package br.com.ars.padraoprojeto.abstractfactory.som.impl;

import br.com.ars.padraoprojeto.abstractfactory.som.Som;

public class SomLg implements Som {

    @Override
    public void ligar() {
	System.out.println("Som Lg ligado!!");
    }

}
