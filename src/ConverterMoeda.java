import javax.swing.JOptionPane;

public class ConverterMoeda {
	
	try {
		Moeda converterMoeda = new Moeda();
		double resultado;
		double valor;
		
		switch(escolha) {
			case "Dolar para Real":
				resultado = converterMoeda.converterDolarEmReal(valor);
				break;
				
			case "Euro para Real":
				resultado = converterMoeda.converterEuroEmReal(valor);
				break;
				
			case "Libra Esterlina para Real":
				resultado = converterMoeda.converterLibraEsterlinaEmReal(valor);
				break;
				
			case "Peso Argentino para Real":
				resultado = converterMoeda.converterPesoArgentinoEmReal(valor);
				break;
				
			case "Peso Chileno para Real":
				resultado = converterMoeda.converterPesoChilenoEmReal(valor);
				break;
				
			case "Real para Dolar":
				resultado = converterMoeda.converterRealEmDolar(valor);
				break;
				
			case "Real para Euro":
				resultado = converterMoeda.converterRealEmEuro(valor);
				break;
				
			case "Real para Libra Esterlina":
				resultado = converterMoeda.converterRealEmLibraEsterlina(valor);
				break;
				
			case "Real para Peso Argentino":
				resultado = converterMoeda.converterRealEmPesoArgentino(valor);
				break;
				
			case "Real para Peso Chileno":
				resultado = converterMoeda.converterRealEmPesoChileno(valor);
				break;
				
			default:
				break;
		}
		
		JOptionPane.showConfirmDialog(null, resultado);
	}	
}
