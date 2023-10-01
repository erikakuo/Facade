package facade;

public class Burguer {

	private int gramas;

    public Burguer(int gramas) {
        this.gramas = gramas;
    }

    public int getGramas() {
        return gramas;
    }

    @Override
    public String toString() {
        return gramas + "g Burguer";
    }
}
