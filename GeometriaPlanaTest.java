package geo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeometriaPlanaTest {
    GeometriaPlana gp = new GeometriaPlana();

    @Test
    void testAreaCirculo() {
        assertEquals(Math.PI * 4, gp.areaCirculo(2), 0.001);
        assertEquals(0, gp.areaCirculo(0), 0.001);
        assertEquals(Math.PI * 25, gp.areaCirculo(5), 0.001);
    }

    @Test
    void testPerimetroCirculo() {
        assertEquals(2 * Math.PI * 2, gp.perimetroCirculo(2), 0.001);
        assertEquals(0, gp.perimetroCirculo(0), 0.001);
        assertEquals(2 * Math.PI * 5, gp.perimetroCirculo(5), 0.001);
    }

    @Test
    void testAreaRetangulo() {
        assertEquals(6, gp.areaRetangulo(2, 3), 0.001);
        assertEquals(0, gp.areaRetangulo(0, 3), 0.001);
        assertEquals(0, gp.areaRetangulo(2, 0), 0.001);
        assertEquals(20, gp.areaRetangulo(4, 5), 0.001);
    }

    @Test
    void testPerimetroRetangulo() {
        assertEquals(10, gp.perimetroRetangulo(2, 3), 0.001);
        assertEquals(6, gp.perimetroRetangulo(0, 3), 0.001);
        assertEquals(4, gp.perimetroRetangulo(2, 0), 0.001);
        assertEquals(18, gp.perimetroRetangulo(4, 5), 0.001);
    }

    @Test
    void testAreaTriangulo() {
        assertEquals(3, gp.areaTriangulo(2, 3), 0.001);
        assertEquals(0, gp.areaTriangulo(0, 3), 0.001);
        assertEquals(0, gp.areaTriangulo(2, 0), 0.001);
        assertEquals(10, gp.areaTriangulo(4, 5), 0.001);
    }

    @Test
    void testPerimetroTriangulo() {
        assertEquals(6, gp.perimetroTriangulo(2, 2, 2), 0.001);
        assertEquals(9, gp.perimetroTriangulo(2, 3, 4), 0.001);
        assertEquals(0, gp.perimetroTriangulo(0, 0, 0), 0.001);
    }

    @Test
    void testAreaPoligonoRegular() {
        assertEquals(30, gp.areaPoligonoRegular(5, 4, 3), 0.001);
        assertEquals(0, gp.areaPoligonoRegular(0, 4, 3), 0.001);
        assertEquals(0, gp.areaPoligonoRegular(5, 0, 3), 0.001);
        assertEquals(0, gp.areaPoligonoRegular(5, 4, 0), 0.001);
        assertEquals(60, gp.areaPoligonoRegular(8, 5, 3), 0.001);
    }

    @Test
    void testPerimetroPoligonoRegular() {
        assertEquals(20, gp.perimetroPoligonoRegular(5, 4), 0.001);
        assertEquals(0, gp.perimetroPoligonoRegular(0, 4), 0.001);
        assertEquals(0, gp.perimetroPoligonoRegular(5, 0), 0.001);
        assertEquals(40, gp.perimetroPoligonoRegular(8, 5), 0.001);
    }
}