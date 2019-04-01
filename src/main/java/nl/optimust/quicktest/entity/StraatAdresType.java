package nl.optimust.quicktest.entity;

public class StraatAdresType extends NederlandsAdresType {

    private String straatnaam;
    private int huisnummer;
    private String huisnummerToevoeging;
    private String indicatieVerwijzing;

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(final String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(final int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getHuisnummerToevoeging() {
        return huisnummerToevoeging;
    }

    public void setHuisnummerToevoeging(final String huisnummerToevoeging) {
        this.huisnummerToevoeging = huisnummerToevoeging;
    }

    public String isIndicatieVerwijzing() {
        return indicatieVerwijzing;
    }

    public void setIndicatieVerwijzing(final String indicatieVerwijzing) {
        this.indicatieVerwijzing = indicatieVerwijzing;
    }
}
