package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.BuitenlandsAdresNietGestructureerdType;

public class BuitenlandsAdresNietGestructureerdTypeBuilder
        extends AdresTypeBuilder<BuitenlandsAdresNietGestructureerdTypeBuilder, BuitenlandsAdresNietGestructureerdType> {

    private BuitenlandsAdresNietGestructureerdType buitenlandsAdresNietGestructureerdType = null;

    @Override
    protected BuitenlandsAdresNietGestructureerdType getObject() {
        if (buitenlandsAdresNietGestructureerdType == null) {
            buitenlandsAdresNietGestructureerdType = new BuitenlandsAdresNietGestructureerdType();
        }
        return buitenlandsAdresNietGestructureerdType;
    }

    public BuitenlandsAdresNietGestructureerdTypeBuilder adresregel1(final String adresregel1) {
        getObject().setAdresregel1(adresregel1);
        return this;
    }

    public BuitenlandsAdresNietGestructureerdTypeBuilder adresregel2(final String adresregel2) {
        getObject().setAdresregel2(adresregel2);
        return this;
    }

    public BuitenlandsAdresNietGestructureerdTypeBuilder adresregel3(final String adresregel3) {
        getObject().setAdresregel3(adresregel3);
        return this;
    }

    public BuitenlandsAdresNietGestructureerdTypeBuilder adresregel4(final String adresregel4) {
        getObject().setAdresregel4(adresregel4);
        return this;
    }

    public BuitenlandsAdresNietGestructureerdTypeBuilder adresregel5(final String adresregel5) {
        getObject().setAdresregel5(adresregel5);
        return this;
    }

    @Override
    public BuitenlandsAdresNietGestructureerdType build() { return getObject(); }
}
