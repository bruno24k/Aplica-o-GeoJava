package geo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometriaEspacialTest {
    GeometriaEspacial ge = new GeometriaEspacial();

    @Test
    void testVolumeCubo() {
        assertEquals(8, ge.volumeCubo(2), 0.001);
    }
    @Test
    void testAreaCubo() {
        assertEquals(24, ge.areaCubo(2), 0.001);
    }
    @Test
    void testVolumeEsfera() {
        assertEquals((4.0/3.0)*Math.PI*8, ge.volumeEsfera(2), 0.001);
    }
    @Test
    void testAreaEsfera() {
        assertEquals(16*Math.PI, ge.areaEsfera(2), 0.001);
    }
    @Test
    void testVolumeCilindro() {
        assertEquals(Math.PI * 4 * 3, ge.volumeCilindro(2, 3), 0.001);
    }
    @Test
    void testAreaCilindro() {
        assertEquals(2 * Math.PI * 2 * (2 + 3), ge.areaCilindro(2, 3), 0.001);
    }
}