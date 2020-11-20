package br.com.ars.padraoprojeto.abstractfactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.ars.padraoprojeto.abstractfactory.aparelhofactory.AparelhoFactory;
import br.com.ars.padraoprojeto.abstractfactory.criaraparelho.Aparelho;
import br.com.ars.padraoprojeto.abstractfactory.marcafactory.Lg;
import br.com.ars.padraoprojeto.abstractfactory.marcafactory.Sansung;

@Component
public class DirigirRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

	Aparelho aparelho = escolherMarcaAparelho("lg");
	aparelho.ligar();

    }

    public Aparelho escolherMarcaAparelho(String marca) {

	Aparelho aparelho;
	AparelhoFactory factory;

	if ("sansung".equals(marca)) {
	    factory = new Sansung();
	    aparelho = new Aparelho(factory);
	} else {
	    factory = new Lg();
	    aparelho = new Aparelho(factory);
	}

	return aparelho;
    }

}
