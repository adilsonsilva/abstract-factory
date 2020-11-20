package br.com.ars.padraoprojeto.abstractfactory.tv.impl;

import br.com.ars.padraoprojeto.abstractfactory.tv.TV;

public class TVSansung implements TV {

    @Override
    public void ligar() {
	System.out.println("TV Sansung ligada!!");
    }

}
