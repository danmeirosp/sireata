package test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import br.edu.utfpr.dv.sireata.model.Ata;
import br.edu.utfpr.dv.sireata.model.Pauta;

class PautaTest {

	private static Pauta pauta;

    @BeforeClass
    public static void setup() {
        pauta = new Pauta();
        pauta.setIdPauta(10);
        pauta.setAta(new Ata());
        pauta.setOrdem(10);
        pauta.setTitulo("titulo");
        pauta.setDescricao("descrição");
    }

    @Test
    public void testaIdPauta() {
        assertEquals(10, pauta.getIdPauta());
    }

    @Test
    public void testaAta() {
        assertEquals(new Ata().getClass().getName(), pauta.getAta().getClass().getName());
    }

    @Test
    public void testaOrdem() {
        assertEquals(10, pauta.getOrdem());
    }

    @Test
    public void testaTitulo() {
        assertEquals("titulo", pauta.getTitulo());
    }

    @Test
    public void testaDescricao() {
        assertEquals("descrição", pauta.getDescricao());
    }
}