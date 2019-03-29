package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.AdresType;

import java.time.LocalDate;

public class AdresTypeBuilder<T extends AdresTypeBuilder, U extends AdresType> {

    private AdresType adresType = null;

    protected U getObject() {
        if (adresType == null) {
            adresType = new AdresType();
        }
        return (U) adresType;
    }

    public T adresSleutel(final String adresSleutel) {
        getObject().setAdresSleutel(adresSleutel);
        return (T) this;
    }

    public T soortAdres(final String soortAdres) {
        getObject().setSoortAdres(soortAdres);
        return (T) this;
    }

    public T cjibAdresSoort(final String cjibAdresSoort) {
        getObject().setCjibAdresSoort(cjibAdresSoort);
        return (T) this;
    }

    public T bronAdres(final String bronAdres) {
        getObject().setBronAdres(bronAdres);
        return (T) this;
    }

    public T land(final String land) {
        getObject().setLand(land);
        return (T) this;
    }

    public T indicatieAdresInOnderzoek(final boolean indicatieAdresInOnderzoek) {
        getObject().setIndicatieAdresInOnderzoek(indicatieAdresInOnderzoek);
        return (T) this;
    }

    public T indicatieVoorkeurAdres(final boolean indicatieVoorkeurAdres) {
        getObject().setIndicatieVoorkeurAdres(indicatieVoorkeurAdres);
        return (T) this;
    }

    public T datumBeginGeldigheid(final LocalDate datumBeginGeldigheid) {
        getObject().setDatumBeginGeldigheid(datumBeginGeldigheid);
        return (T) this;
    }

    public T datumEindeGeldigheid(final LocalDate datumEindeGeldigheid) {
        getObject().setDatumEindeGeldigheid(datumEindeGeldigheid);
        return (T) this;
    }

    public U build() {
        return (U) getObject();
    }
}
