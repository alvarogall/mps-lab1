package clubdeportivo;

import static org.junit.jupiter.api.Assertions.assertEquals;

// poner el before each

/**
 * @author Pablo Gámez Guerrero
 * @author Álvaro Gallardo Rubio
 */

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClubDeportivoAltoRendimientoTest {
    @DisplayName("Crear un club deportivo de alto rendimiento con nombre no null, maximo de personas por grupo mayor que 0 e incremento mayor que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNoNull_MaximoMayorCero_IncrementoMayorCero_ClubDeportivoAltoRendimientoCreado() throws ClubException {
        //Arrange
        String nombre = "club1";
        int maximo = 25;
        double incremento = 23.47;

        //Act
        ClubDeportivoAltoRendimiento club1 = new ClubDeportivoAltoRendimiento(nombre, maximo, incremento);

        //Assert
        assertEquals("club1 --> [  ]", club1.toString());
    }

    @DisplayName("Crear un club deportivo de alto rendimiento con nombre null, maximo de personas por grupo mayor que 0 e incremento mayor que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNull_MaximoMayorCero_IncrementoMayorCero_ClubDeportivoAltoRendimientoNoCreadoExcepcion() throws ClubException {
        //Arrange
        String nombre = null;
        int maximo = 25;
        double incremento = 23.47;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new ClubDeportivoAltoRendimiento(nombre, maximo, incremento);
        });
    }

    @DisplayName("Crear un club deportivo de alto rendimiento con nombre no null, maximo de personas por grupo menor o igual que 0 e incremento mayor que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNoNull_MaximoMenorIgualCero_IncrementoMayorCero_ClubDeportivoAltoRendimientoNoCreadoExcepcion() throws ClubException {
        //Arrange
        String nombre = "club1";
        int maximo = -1;
        double incremento = 23.47;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new ClubDeportivoAltoRendimiento(nombre, maximo, incremento);
        });
    }

    @DisplayName("Crear un club deportivo de alto rendimiento con nombre no null, maximo de personas por grupo mayor que 0 e incremento menor o igual que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNoNull_MaximoMayorCero_IncrementoMenorIgualCero_ClubDeportivoAltoRendimientoNoCreadoExcepcion() throws ClubException {
        //Arrange
        String nombre = "club1";
        int maximo = 25;
        double incremento = -3.47;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new ClubDeportivoAltoRendimiento(nombre, maximo, incremento);
        });
    }

    @DisplayName("Crear un club deportivo de alto rendimiento con nombre no null, número de grupos mayor que cero, maximo de personas por grupo mayor que 0 e incremento mayor que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNoNull_NgruposMayorCero_MaximoMayorCero_IncrementoMayorCero_ClubDeportivoAltoRendimientoCreado() throws ClubException {
        //Arrange
        String nombre = "club1";
        int nGrupos = 20;
        int maximo = 25;
        double incremento = 23.47;

        //Act
        ClubDeportivoAltoRendimiento club1 = new ClubDeportivoAltoRendimiento(nombre, nGrupos, maximo, incremento);

        //Assert
        assertEquals("club1 --> [  ]", club1.toString());
    }

    @DisplayName("Crear un club deportivo de alto rendimiento con nombre null, número de grupos mayor que cero, maximo de personas por grupo mayor que 0 e incremento mayor que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNull_NgruposMayorCero_MaximoMayorCero_IncrementoMayorCero_ClubDeportivoAltoRendimientoNoCreadoExcepcion() throws ClubException {
        //Arrange
        String nombre = null;
        int nGrupos = 20;
        int maximo = 25;
        double incremento = 23.47;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new ClubDeportivoAltoRendimiento(nombre, nGrupos, maximo, incremento);
        });
    }

    @DisplayName("Crear un club deportivo de alto rendimiento con nombre no null, número de grupos menor o igual que cero, maximo de personas por grupo mayor que 0 e incremento mayor que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNoNull_NgruposMenorIgualCero_MaximoMayorCero_IncrementoMayorCero_ClubDeportivoAltoRendimientoNoCreadoExcepcion() throws ClubException {
        //Arrange
        String nombre = "club1";
        int nGrupos = -1;
        int maximo = 25;
        double incremento = 23.47;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new ClubDeportivoAltoRendimiento(nombre, nGrupos, maximo, incremento);
        });
    }
    @DisplayName("Crear un club deportivo de alto rendimiento con nombre null, número de grupos mayor que cero, maximo de personas por grupo menor o igual que 0 e incremento mayor que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNoNull_NgruposMayorCero_MaximoMenorIgualCero_IncrementoMayorCero_ClubDeportivoAltoRendimientoNoCreadoExcepcion() throws ClubException {
        //Arrange
        String nombre = "club1";
        int nGrupos = 20;
        int maximo = -1;
        double incremento = 23.47;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new ClubDeportivoAltoRendimiento(nombre, nGrupos, maximo, incremento);
        });
    }
    @DisplayName("Crear un club deportivo de alto rendimiento con nombre null, número de grupos mayor que cero, maximo de personas por grupo mayor que 0 e incremento menor o igual que 0")
    @Test
    public void ClubDeportivoAltoRendimiento_NombreNoNull_NgruposMayorCero_MaximoMayorCero_IncrementoMenorIgualCero_ClubDeportivoAltoRendimientoNoCreadoExcepcion() throws ClubException {
        //Arrange
        String nombre = "club1";
        int nGrupos = 20;
        int maximo = 25;
        double incremento = -3.47;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new ClubDeportivoAltoRendimiento(nombre, nGrupos, maximo, incremento);
        });
    }
}
