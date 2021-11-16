public class Money {
    private String currency;
    private long amount;
    private char currencyCode;
    private String smallerCurrencyCode;
    private int divdedBy;

    public void setCurrency(String currency) {
        currency.toLowerCase();
        switch (currency) {
        case "dollar":
            this.currency = currency;
            this.currencyCode = '$';
            this.smallerCurrencyCode = "cents";
            this.divdedBy = 100;
            break;
        case "euro":
            this.currency = currency;
            this.currencyCode = '€';
            this.smallerCurrencyCode = "cents";
            this.divdedBy = 100;
            break;
        case "yen":
            this.currency = currency;
            this.currencyCode = '¥';
            this.smallerCurrencyCode = "sen";
            this.divdedBy = 100;
            break;
        case "pound":
            this.currency = currency;
            this.currencyCode = '£';
            this.smallerCurrencyCode = "pence";
            this.divdedBy = 100;
            break;
        case "rupee":
            this.currency = currency;
            this.currencyCode = '₹';
            this.smallerCurrencyCode = "paise";
            this.divdedBy = 100;
            break;
        default:
            this.currency = null;
            this.currencyCode = '\0';
            this.smallerCurrencyCode = null;
            this.divdedBy = 0;
            break;
        }
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String toString() {
        String out = "";
        if (currency
                != null) {
            out += currencyCode
                    + ""
                    + amount
                            / this.divdedBy;
        }
        return out;
    }

    public static void main(String[] args) {
        Money dollar = new Money();
        dollar.setCurrency("dollar");
        dollar.setAmount(1000);
        System.out.println(dollar);
        Money euro = new Money();
        euro.setCurrency("euro");
        euro.setAmount(1000);
        System.out.println(euro);
        Money pound = new Money();
        pound.setCurrency("pound");
        pound.setAmount(1000);
        System.out.println(pound);
    }
}
