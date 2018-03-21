
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Classe para realizar testes de unidade e verificar a corretude das soluções desenvolvidas pelos alunos
 *
 * Alguns exemplos de como usar JUnit podem ser obtidos aqui: https://github.com/junit-team/junit4/wiki/Assertions
 */
public class TesteDeValidacao {

    @Test
    public void exercicio01(){
        // valores corretos
        assertEquals("07:30:00", (new Tempo(7,30,0)).toString());
        assertEquals(3600, (new Tempo(1,0,0)).tempoSegundos());
        assertTrue((new Tempo(1,0,0)).alteraHora(10));
        assertEquals(0, (new Tempo(1,0,0)).diferenca(new Tempo(1,0,0)));
        // valor errado para hora
        assertEquals("00:00:00", (new Tempo(33,15,0)).toString());
        assertFalse((new Tempo(1,0,0)).alteraHora(35));
        // valor errado para minuto
        assertEquals("00:00:00", (new Tempo(3,75,0)).toString());
        // valor errado para segundo
        assertEquals("00:00:00", (new Tempo(4,15,80)).toString());
        // valor errado para hora, minuto
        assertEquals("00:00:00", (new Tempo(-1,61,0)).toString());
        // valor errado para hora, minuto, segundo
        assertEquals("00:00:00", (new Tempo(25,60,60)).toString());
    }
}