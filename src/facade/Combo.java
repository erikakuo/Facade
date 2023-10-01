package facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Combo  {


	    private List<Produto> itens = new ArrayList<>();

	    public void criarComboMaster() {
	        Produto burguer = new Produto("Combo Master", 40.00);
	        Produto sobremesa = new Produto("Sobremesa", 22.00);
	        Produto bebida = new Produto("Bebida", 12.00);

	        itens.add(burguer);
	        itens.add(sobremesa);
	        itens.add(bebida);
	    }

	    public void criarSuperCombo() {
	        Produto burguer = new Produto("Super Combo", 62.00);
	        Produto sobremesa = new Produto("Sobremesa", 24.00);
	        Produto bebida = new Produto("Bebida", 17.00);

	        itens.add(burguer);
	        itens.add(sobremesa);
	        itens.add(bebida);
	    }

	    public List<Produto> getItens() {
	        return itens;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (Produto item : itens) {
	            sb.append(item.toString()).append("\n");
	        }
	        return sb.toString();
	    }
	}

	