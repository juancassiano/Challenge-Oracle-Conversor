
import javax.swing.JOptionPane;

public class Conversor {
	
	public static void main(String[] args) {
		
		Double valor = null;
		Double temperatura = null;
		
		String[] opcoes = {"Conversor de Moeda", "Conversor de Temperatura"};
		String[] tipoConversaoMoeda = {"Dolar para Real", "Euro para Real", "Libra Esterlina para Real",
				"Peso Argentino para Real", "Peso Chileno para Real", "Real para Dolar", "Real para Euro",
				"Real para Libra Esterlina", "Real para Peso Argentino", "Real para Peso Chileno" };
		
		String[] tipoConversaoTemperatura= {"Celcius para Farenheint", "Celcius para Kelvin",
				"Farenheint para Celcius", "Farenheint para Kelvin", "Kelvin para Celcius", "Kelvin para Farenheint" };
		
		String type = JOptionPane.showInputDialog(null, "Escolha uma opção:","Menu",
				JOptionPane.PLAIN_MESSAGE, null,opcoes,null)
						.toString();
		
		try {		
			
			if(type.contains("Conversor de Moeda")) {
				String escolha = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter seu dinheiro","Moeda",
						JOptionPane.PLAIN_MESSAGE, null, tipoConversaoMoeda,null)
						.toString();
					
					String input = JOptionPane.showInputDialog("Insira um Valor:");
					valor = Double.parseDouble(input);
					
					Moeda conversor = new Moeda();
					conversor.converterMoeda(escolha, valor);
			}else {
				String escolha = JOptionPane.showInputDialog(null, "Escolha a temperatura que deseja converter","Temperatura",
						JOptionPane.PLAIN_MESSAGE, null, tipoConversaoTemperatura,null)
						.toString();
				
					String input = JOptionPane.showInputDialog("Insira uma Temperatura:");
					temperatura = Double.parseDouble(input);
					
					Temperatura conversor = new Temperatura();
					conversor.converterTemperatura(escolha, temperatura);
			}
			
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
