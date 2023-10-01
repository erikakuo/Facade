package facade;

public class Bebida   {
	
	private int ml;

public Bebida(int ml) {
    this.ml = ml;
}

public int getMl() {
    return ml;
}

@Override
public String toString() {
    return ml + "ml Bebida";
}
}
