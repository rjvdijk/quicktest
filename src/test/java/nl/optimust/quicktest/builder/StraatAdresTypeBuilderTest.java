package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.StraatAdresType;
import org.junit.Test;

import java.time.LocalDate;

public class StraatAdresTypeBuilderTest {

    @Test
    public void testStraatAdresTypeBuilder() {
        StraatAdresType straatAdresType = new StraatAdresTypeBuilder()
                .soortAdres("01")
                .cjibAdresSoort("GBABA")
                .bronAdres("01")
                .land("Nederland")
                .datumBeginGeldigheid(LocalDate.now())
                .plaats("Velp")
                .gemeente("Rheden")
                .postcode("6880AA")
                .straatnaam("Willemstraat")
                .huisnummer(13)
                .huisnummerToevoeging("A")
                .indicatieVerwijzing("AB")
                .build();
        System.out.println(straatAdresType);
    }
}
