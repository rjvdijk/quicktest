package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.AdresType;
import org.junit.Test;

import java.time.LocalDate;

public class AdresTypeBuilderTest {

    @Test
    public void testAdresTypeBuilder() {

        AdresType adresType = new AdresTypeBuilder()
                .soortAdres("14")
                .cjibAdresSoort("VOW")
                .bronAdres("01")
                .datumBeginGeldigheid(LocalDate.now())
                .land("0000")
                .build();
        System.out.println(adresType);
    }
}
