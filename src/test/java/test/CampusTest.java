package test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;

import br.edu.utfpr.dv.sireata.model.Campus;

class PautaTest {

	private static Campus campus;

    @BeforeClass
    public static void setup() {
        campus.setIdCampus(0);
        campus.setNome("");
        campus.setEndereco("");
        campus.setLogo(null);
        campus.setAtivo(true);
		campus.setSite("");
    }

    @Test
    public void testIdCampus() {
        assertEquals(10, campus.getIdCampus());
    }

    @Test
    public void testNome() {
        assertEquals(new Campus().getClass().getName(), campus.getNome().getClass().getName());
    }

    @Test
    public void testaEndereco() {
        assertEquals(10, campus.getEndereco());
    }

    @Test
    public void testaLogo() {
        assertEquals("Logo", campus.getLogo());
    }

    @Test
    public void testSite() {
        assertEquals("Site", campus.getSite());
    }
}
