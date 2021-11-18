package Book;

public class Book {
    private String name;
    private int pageQuantaty;
    private String author;
    private String color;
    private int dateOfWritten;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageQuantaty() {
        return pageQuantaty;
    }

    public void setPageQuantaty(int pageQuantaty) {
        this.pageQuantaty = pageQuantaty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDateOfWritten() {
        return dateOfWritten;
    }

    public void setDateOfWritten(int dateOfWritten) {
        this.dateOfWritten = dateOfWritten;
    }
    public String toString (){
        return this.getName() + " written in " + this.getDateOfWritten() +" by " + this.getAuthor() + " " + this.getPageQuantaty() + " pages color " + this.getColor();
    }
}
