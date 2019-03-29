package nl.optimust.quicktest.entity;

public class NederlandsAdresType extends AdresType {

    private String plaats;
    private String gemeente;
    private String postcode;
    private String locatieOmschrijving;

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(final String plaats) {
        this.plaats = plaats;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(final String gemeente) {
        this.gemeente = gemeente;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

    public String getLocatieOmschrijving() {
        return locatieOmschrijving;
    }

    public void setLocatieOmschrijving(final String locatieOmschrijving) {
        this.locatieOmschrijving = locatieOmschrijving;
    }
}
