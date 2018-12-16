package serpro.gov.br;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalcularImpostoDeRendaTest {

	@Test
	public void calculosImpostoDevemSerCorretos(){
		List<Contribuinte> listaConstribuintes = new ArrayList<>();
		List<Double> resultados = new ArrayList<>();
		
		listaConstribuintes.add(new PessoaFisica("Joao Santos",3000.00,"11111"));
		listaConstribuintes.add(new PessoaJuridica("Lojas AA",150000.00,"10055"));
		listaConstribuintes.add(new PessoaFisica("Maria Soares",5000.00,"22222"));
		listaConstribuintes.add(new PessoaJuridica("Supermercados B",2000000.00,"10066"));
		listaConstribuintes.add(new PessoaFisica("Carla Maia",1500.00,"33333"));
		listaConstribuintes.add(new PessoaJuridica("Posto XX",500000.00,"10077"));
		listaConstribuintes.add(new PessoaFisica("Jose da Silva",95000.00,"97687"));
		
		
		for (Contribuinte contribuinte : listaConstribuintes) {
			resultados.add(contribuinte.calcularImposto());
		}
		
		assertEquals(3000.00 * 1.10, resultados.get(0) ,0000.1);
		assertEquals(150000.00 * 1.10, resultados.get(1) ,0000.1);
		assertEquals(5000.00 * 1.15, resultados.get(2) ,0000.1);
		assertEquals(2000000.00 * 1.10, resultados.get(3) ,0000.1);
		assertEquals(1500.00 * 0, resultados.get(4) ,0000.1);
		assertEquals(500000.00 * 1.10, resultados.get(5) ,0000.1);
		assertEquals(95000.00 * 1.30, resultados.get(6) ,0000.1);
		//Assert de cada resultado
	}


}
