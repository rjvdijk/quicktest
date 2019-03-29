package nl.optimust.quicktest.entity;

import java.time.LocalDate;

public class AdresType {

    private String adresSleutel;
    private String soortAdres;
    private String cjibAdresSoort;
    private String bronAdres;
    private String land;
    private boolean indicatieAdresInOnderzoek;
    private boolean indicatieVoorkeurAdres;
    private LocalDate datumBeginGeldigheid;
    private LocalDate datumEindeGeldigheid;

    public String getAdresSleutel() {
        return adresSleutel;
    }

    public void setAdresSleutel(final String adresSleutel) {
        this.adresSleutel = adresSleutel;
    }

    public String getSoortAdres() {
        return soortAdres;
    }

    public void setSoortAdres(final String soortAdres) {
        this.soortAdres = soortAdres;
    }

    public String getCjibAdresSoort() {
        return cjibAdresSoort;
    }

    public void setCjibAdresSoort(final String cjibAdresSoort) {
        this.cjibAdresSoort = cjibAdresSoort;
    }

    public String getBronAdres() {
        return bronAdres;
    }

    public void setBronAdres(final String bronAdres) {
        this.bronAdres = bronAdres;
    }

    public String getLand() {
        return land;
    }

    public void setLand(final String land) {
        this.land = land;
    }

    public boolean isIndicatieAdresInOnderzoek() {
        return indicatieAdresInOnderzoek;
    }

    public void setIndicatieAdresInOnderzoek(final boolean indicatieAdresInOnderzoek) {
        this.indicatieAdresInOnderzoek = indicatieAdresInOnderzoek;
    }

    public boolean isIndicatieVoorkeurAdres() {
        return indicatieVoorkeurAdres;
    }

    public void setIndicatieVoorkeurAdres(final boolean indicatieVoorkeursAdres) {
        this.indicatieVoorkeurAdres = indicatieVoorkeursAdres;
    }

    public LocalDate getDatumBeginGeldigheid() {
        return datumBeginGeldigheid;
    }

    public void setDatumBeginGeldigheid(final LocalDate datumBeginGeldigheid) {
        this.datumBeginGeldigheid = datumBeginGeldigheid;
    }

    public LocalDate getDatumEindeGeldigheid() {
        return datumEindeGeldigheid;
    }

    public void setDatumEindeGeldigheid(final LocalDate datumEindeGeldigheid) {
        this.datumEindeGeldigheid = datumEindeGeldigheid;
    }
}
