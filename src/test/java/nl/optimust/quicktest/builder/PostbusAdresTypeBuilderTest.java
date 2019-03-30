package nl.optimust.quicktest.builder;

import nl.optimust.quicktest.entity.PostbusAdresType;
import org.junit.Test;

import java.time.LocalDate;

public class PostbusAdresTypeBuilderTest {

    @Test
    public void testPostbusAdresTypeBuilder() {
        PostbusAdresType postbusAdresType = new PostbusAdresTypeBuilder()
                .soortAdres("01")
                .cjibAdresSoort("GBABA")
                .bronAdres("01")
                .land("Nederland")
                .datumBeginGeldigheid(LocalDate.now())
                .plaats("Velp")
                .gemeente("Rheden")
                .postcode("6880AA")
                .postbusnummer(12345)
                .build();
        System.out.println(postbusAdresType);
    }
}
