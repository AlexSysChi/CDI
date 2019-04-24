package entity;

import javax.inject.Inject;
import java.util.Date;

public class Book {

    private String title;
    private String description;
    private String isn;
    private Double price;
    private Date instantiationDate;


    public Book(String title, String description, Double price, Date date ) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.instantiationDate = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsn() {
        return isn;
    }

    public void setIsn(String isn) {
        this.isn = isn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getInstantiationDate() {
        return instantiationDate;
    }

    public void setInstantiationDate(Date instantiationDate) {
        this.instantiationDate = instantiationDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(":\n\t");
        sb.append(description);
        sb.append("\n\t");
        sb.append(isn);
        sb.append("\n\t");
        sb.append(instantiationDate);
        sb.append("\n\t");
        sb.append(price);
        sb.append(" $\n");
        return sb.toString();
    }

}
