package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.AdresType;
import nl.optimust.quicktest.entity.NederlandsAdresType;

public class NederlandsAdresTypeBuilder<T extends NederlandsAdresTypeBuilder, U extends NederlandsAdresType> extends AdresTypeBuilder<T, U> {

    private NederlandsAdresType nederlandsAdresType = null;

    @Override
    protected U getObject() {
        if (nederlandsAdresType == null) {
            nederlandsAdresType = new NederlandsAdresType();
        }
        return (U) nederlandsAdresType;
    }

    public T plaats(final String plaats) {
        getObject().setPlaats(plaats);
        return (T) this;
    }

    public T gemeente(final String gemeente) {
        getObject().setGemeente(gemeente);
        return (T) this;
    }

    public T postcode(final String postcode) {
        getObject().setPostcode(postcode);
        return (T) this;
    }

    public T locatieOmschrijving(final String locatieOmschrijving) {
        getObject().setLocatieOmschrijving(locatieOmschrijving);
        return (T) this;
    }

    @Override
    public U build() { return getObject(); }
}
