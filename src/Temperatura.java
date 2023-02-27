import javax.swing.JOptionPane;

public class Temperatura {

	double resultado;
	
	public double converterCelciusEmFarenheint(double temperatura) {
		return this.resultado = (temperatura * 9/5) + 32;
	}
	
	public double converterCelciusEmKelvin(double temperatura) {
		return this.resultado = 5/9 * (temperatura - 32) + 273.15;
	}
	
	public double converterFarenheintEmCelcius(double temperatura) {
		return this.resultado = (temperatura - 32) * 5/9;
	}
	
	public double converterFarenheintEmKelvin(double temperatura) {
		return this.resultado = (temperatura + 459.67) * 5/9;
	}
	
	public double converterkelvinEmFarenheint(double temperatura) {
		return this.resultado = temperatura * 9/5 - 459.67;
	}
	
	public double converterkelvinEmCelcius(double temperatura) {
		return this.resultado = temperatura - 273.15;
	}
	
	public void converterTemperatura(String escolha, double temperatura) {
		double resultado=0;
		
		switch(escolha) {
		
		case "Celcius para Farenheint":
			resultado = converterCelciusEmFarenheint(temperatura);
			break;
		
		case "Celcius para Kelvin":
			resultado = converterCelciusEmKelvin(temperatura);
			break;
			
		case "Farenheint para Celcius":
			resultado = converterFarenheintEmCelcius(temperatura);
			break;
			
		case "Farenheint para Kelvin":
			resultado = converterFarenheintEmKelvin(temperatura);
			break;
			
		case "Kelvin para Celcius":
			resultado = converterkelvinEmCelcius(temperatura);
			break;
			
		case "Kelvin para Farenheint":
			resultado = converterkelvinEmFarenheint(temperatura);
			break;
		default:
			break;
		}
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
