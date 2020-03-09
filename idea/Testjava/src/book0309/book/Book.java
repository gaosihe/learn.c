package book0309.book;

public class Book {
    private String name;
    private String auther;
    private int price;
    private String type;//小说散文
    private boolean isBorrowed;

    public Book(String name, String auther, int price, String type, boolean isBorrowed) {
        this.name = name;
        this.auther = auther;
        this.price = price;
        this.type = type;
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return name;
    }

    public String getAuther() {
        return auther;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
