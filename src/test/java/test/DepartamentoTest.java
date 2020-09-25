package test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import br.edu.utfpr.dv.sireata.model.Ata;
import br.edu.utfpr.dv.sireata.model.Campus;
import br.edu.utfpr.dv.sireata.model.Departamento;

class DepartamentoTest {

	private static Departamento departamento;

    @BeforeClass
    public static void setup() {  
       departamento = new Departamento();
       departamento.setIdDepartamento(10);
       departamento.setCampus(new Campus());
       departamento.setNome("name");
       departamento.setNomeCompleto("namename");
       departamento.setLogo(null);
       departamento.setAtivo(true);
       departamento.setSite("teste");
    }

    @Test
    public void testIdDepartamento() {
        assertEquals(10, departamento.getIdDepartamento());
    }

    @Test
    public void testCampus() {
        assertEquals(new Ata().getClass().getName(), departamento.getCampus().getClass().getName());
    }

    @Test
    public void testNome() {
        assertEquals(10, departamento.getNome());
    }

    @Test
    public void testNomeCompleto() {
        assertEquals("NomeCompleto", departamento.getNomeCompleto());
    }

    @Test
    public void testLogo() {
        assertEquals("Logo", departamento.getLogo());
    }
    @Test
    public void testSite() {
        assertEquals("Site", departamento.getSite());
    }
}