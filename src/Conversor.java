
import javax.swing.JOptionPane;

public class Conversor {
	
	public static void main(String[] args) {
		
		Double valor = null;
		Double resultado = null;

		String[] opcoes = {"Conversor de Moeda", "Conversor de Temperatura"};
		String[] tipoConversao = {"Dolar para Real", "Euro para Real", "Libra Esterlina para Real",
				"Peso Argentino para Real", "Peso Chileno para Real", "Real para Dolar", "Real para Euro",
				"Real para Libra Esterlina", "Real para Peso Argentino", "Real para Peso Chileno" };
		
		String type = JOptionPane.showInputDialog(null, "Escolha uma opção:","Menu",
				JOptionPane.PLAIN_MESSAGE, null,opcoes,null)
						.toString();
					
	try {
			String input = JOptionPane.showInputDialog("Insira um Valor:");
			valor = Double.parseDouble(input);
		
		
		String escolha = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro","Moeda",
				JOptionPane.PLAIN_MESSAGE, null, tipoConversao,null)
				.toString();
			Moeda converterMoeda = new Moeda();
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
			
			JOptionPane.showMessageDialog(null, resultado);
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O valor digitado não é um número", "Erro", JOptionPane.ERROR_MESSAGE);
		} finally {
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?");
			if(resposta == JOptionPane.YES_OPTION) {
				main(args);
			}
		}
		
	}

}
