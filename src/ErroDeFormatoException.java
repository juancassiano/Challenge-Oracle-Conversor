
public class ErroDeFormatoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ErroDeFormatoException(String mensagem) {
		super(String.format("O valor %s não é um número.", mensagem));
	}

	
}
