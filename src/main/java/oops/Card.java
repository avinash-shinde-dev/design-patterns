package oops;

public class Card {
    private String cardNumber;
    private String name;
    private String validTill; // MM/YYYY
    private Integer cvv;

    public Card(String cardNumber, String name, String validTill, Integer cvv) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.validTill = validTill;
        this.cvv = cvv;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }


}

