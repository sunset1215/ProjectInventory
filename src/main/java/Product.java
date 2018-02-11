public class Product {
    
    private static int lastGeneratedId = 0;
    
    private int id;
    
    public Product() {
        setId(++lastGeneratedId);
    }
    
    public int getId() {
        return id;
    }
    
    private void setId(int id) {
        this.id = id;
    }
}
