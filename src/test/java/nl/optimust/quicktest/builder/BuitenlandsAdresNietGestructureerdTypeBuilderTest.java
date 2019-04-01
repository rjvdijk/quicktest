package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.BuitenlandsAdresNietGestructureerdType;
import org.junit.Test;

import java.time.LocalDate;

public class BuitenlandsAdresNietGestructureerdTypeBuilderTest {

    @Test
    public void testBuitenlandsAdresNietGestructureerdTypeBuilder() {
        BuitenlandsAdresNietGestructureerdType buitenlandsAdresNietGestructureerdType = new BuitenlandsAdresNietGestructureerdTypeBuilder()
                .soortAdres("01")
                .cjibAdresSoort("GBAWA")
                .bronAdres("03")
                .land("Brazilië")
                .datumBeginGeldigheid(LocalDate.now())
                .adresregel1("Condomínio Edifício Portal do Alto")
                .adresregel2("Rua Ana Bilhar 500 Apto 1201")
                .adresregel3("60160-110 Mereilles")
                .adresregel4("Fortaleza, CE")
                .adresregel5("Brazil")
                .build();
        System.out.println(buitenlandsAdresNietGestructureerdType);
    }
}
