package patterns.creation;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item: " + name());
        sb.append(' ');
        sb.append("packing: " + packing());
        sb.append(' ');
        sb.append("price: " + price());
        return sb.toString();
    }
}