
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import conversores.Moeda;
import conversores.Temperatura;

public class Conversor {
	
	public static void main(String[] args) {
		
		Double valor = null;
		Double temperatura = null;
		
		ImageIcon iconOne= new ImageIcon(new ImageIcon("/home/juancassiano/eclipse-workspace/ConversordeMoeda/src/assets/one.png")
				.getImage().getScaledInstance(150, 50, Image.SCALE_DEFAULT));
		
		ImageIcon iconDuke= new ImageIcon(new ImageIcon("/home/juancassiano/eclipse-workspace/ConversordeMoeda/src/assets/duke.png")
				.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)); 
		
		String[] opcoes = {"Conversor de Moeda", "Conversor de Temperatura", "SAIR"};
		String[] tipoConversaoMoeda = {"Dolar para Real", "Euro para Real", "Libra Esterlina para Real",
				"Peso Argentino para Real", "Peso Chileno para Real", "Real para Dolar", "Real para Euro",
				"Real para Libra Esterlina", "Real para Peso Argentino", "Real para Peso Chileno" };
		
		String[] tipoConversaoTemperatura= {"Celcius para Farenheint", "Celcius para Kelvin",
				"Farenheint para Celcius", "Farenheint para Kelvin", "Kelvin para Celcius", "Kelvin para Farenheint" };
		
		int type = JOptionPane.showOptionDialog(null, "Escolha uma opção:","Menu",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE ,iconOne,opcoes,opcoes[0]);
		
		try {		
			
			if(type == 0) {
				String escolha = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter seu dinheiro","Moeda",
						JOptionPane.PLAIN_MESSAGE, null, tipoConversaoMoeda,null)
						.toString();
					
					String input = JOptionPane.showInputDialog("Insira um Valor:");
					valor = Double.parseDouble(input);
					
					Moeda conversor = new Moeda();
					conversor.converterMoeda(escolha, valor);
			}else if(type == 1) {
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
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?","Conversor", JOptionPane.YES_NO_OPTION);
			if(resposta == JOptionPane.YES_OPTION) {
				main(args);
			}else {
				JOptionPane.showMessageDialog(null,"Obrigado por usar o programa", "", JOptionPane.PLAIN_MESSAGE,iconDuke);
			}
		}
		
	}

}
