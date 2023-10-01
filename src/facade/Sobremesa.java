package facade;

public class Sobremesa {
	
	 private String tamanho;

	    public Sobremesa(String tamanho) {
	        this.tamanho = tamanho;
	    }

	    public String getTamanho() {
	        return tamanho;
	    }

	    @Override
	    public String toString() {
	        return tamanho + " Sobremesa";
	    }
	}