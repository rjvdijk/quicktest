package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.StraatAdresType;

public class StraatAdresTypeBuilder extends NederlandsAdresTypeBuilder<StraatAdresTypeBuilder, StraatAdresType> {

    private StraatAdresType straatAdresType = null;

    @Override
    protected StraatAdresType getObject() {
        if (straatAdresType == null) {
            straatAdresType = new StraatAdresType();
        }
        return straatAdresType;
    }

    public StraatAdresTypeBuilder straatnaam(final String straatnaam) {
        getObject().setStraatnaam(straatnaam);
        return this;
    }

    public StraatAdresTypeBuilder huisnummer(final int huisnummer) {
        getObject().setHuisnummer(huisnummer);
        return this;
    }

    public StraatAdresTypeBuilder huisnummerToevoeging(final String huisnummerToevoeging) {
        getObject().setHuisnummerToevoeging(huisnummerToevoeging);
        return this;
    }

    public StraatAdresTypeBuilder indicatieVerwijzing(final String indicatieVerwijzing) {
        getObject().setIndicatieVerwijzing(indicatieVerwijzing);
        return this;
    }

    public StraatAdresType build() {
        return getObject();
    }
}
