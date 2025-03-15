package clubdeportivo;

/**
 * @author Pablo Gámez Guerrero
 * @author Álvaro Gallardo Rubio
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GrupoTest {
    @DisplayName("Crear un grupo con numero de plazas y tarifa mayor que 0, matriculados mayor o igual que 0, matriculados menor que el numero de plazas, codigo y actividad no null (datos correctos)")
    @Test
    public void crearGrupo_NPlazasMayorCero_TarifaMayorCero_MatriculadosMayorIgualCero_MatriculadosMenorNPlazas_CodigoNoNull_ActividadNoNull() throws ClubException {
        //Arrange
        String codigo = "476B";
        String actividad = "Calistenia";
        int nPlazas = 15;
        int matriculados = 12;
        double tarifa = 27.3;

        //Act
        Grupo calistenia = new Grupo(codigo, actividad, nPlazas, matriculados, tarifa);

        //Assert
        assertEquals("(476B - Calistenia - 27.3 euros - P:15 - M:12)", calistenia.toString());
    }

    @DisplayName("Crear un grupo con numero de plazas menor o igual que 0 y tarifa mayor que 0, matriculados mayor o igual que 0, matriculados menor que el numero de plazas, codigo y actividad no null")
    @Test
    public void crearGrupo_NPlazasMenorIgualCero_TarifaMayorCero_MatriculadosMayorIgualCero_MatriculadosMenorNPlazas_CodigoNoNull_ActividadNoNull() throws ClubException {
        //Arrange
        String codigo = "476B";
        String actividad = "Calistenia";
        int nPlazas = -1;
        int matriculados = 12;
        double tarifa = 27.3;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new Grupo(codigo, actividad, nPlazas, matriculados, tarifa);
        });
    }

    @DisplayName("Crear un grupo con numero de plazas mayor que 0 y tarifa menor o igual que 0, matriculados mayor o igual que 0, matriculados menor que el numero de plazas, codigo y actividad no null")
    @Test
    public void crearGrupo_NPlazasMayorCero_TarifaMenorIgualCero_MatriculadosMayorIgualCero_MatriculadosMenorNPlazas_CodigoNoNull_ActividadNoNull() throws ClubException {
        //Arrange
        String codigo = "476B";
        String actividad = "Calistenia";
        int nPlazas = 15;
        int matriculados = 12;
        double tarifa = -1.2;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new Grupo(codigo, actividad, nPlazas, matriculados, tarifa);
        });
    }

    @DisplayName("Crear un grupo con numero de plazas mayor que 0 y tarifa mayor que 0, matriculados menor que 0, matriculados menor que el numero de plazas, codigo y actividad no null")
    @Test
    public void crearGrupo_NPlazasMayorCero_TarifaMayorCero_MatriculadosMenorCero_MatriculadosMenorNPlazas_CodigoNoNull_ActividadNoNull() throws ClubException {
        //Arrange
        String codigo = "476B";
        String actividad = "Calistenia";
        int nPlazas = 15;
        int matriculados = -1;
        double tarifa = 27.3;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new Grupo(codigo, actividad, nPlazas, matriculados, tarifa);        
        });
    }

    @DisplayName("Crear un grupo con numero de plazas mayor que 0 y tarifa mayor que 0, matriculados mayor o igual que 0, matriculados mayor que el numero de plazas, codigo y actividad no null")
    @Test
    public void crearGrupo_NPlazasMayorCero_TarifaMayorCero_MatriculadosMayorIgualCero_MatriculadosMayorNPlazas_CodigoNoNull_ActividadNoNull() throws ClubException {
        //Arrange
        String codigo = "476B";
        String actividad = "Calistenia";
        int nPlazas = 15;
        int matriculados = 17;
        double tarifa = 27.3;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new Grupo(codigo, actividad, nPlazas, matriculados, tarifa);
        });
    }

    @DisplayName("Crear un grupo con numero de plazas mayor que 0 y tarifa mayor que 0, matriculados mayor o igual que 0, matriculados menor que el numero de plazas, codigo null y actividad no null")
    @Test
    public void crearGrupo_NPlazasMayorCero_TarifaMayorCero_MatriculadosMayorIgualCero_MatriculadosMenorNPlazas_CodigoNull_ActividadNoNull() throws ClubException {
        //Arrange
        String codigo = null;
        String actividad = "Calistenia";
        int nPlazas = 15;
        int matriculados = 12;
        double tarifa = 27.3;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new Grupo(codigo, actividad, nPlazas, matriculados, tarifa);
        });
    }

    @DisplayName("Crear un grupo con numero de plazas mayor que 0 y tarifa mayor que 0, matriculados mayor o igual que 0 y matriculados menor que el numero de plazas, codigo no null y actividad null")
    @Test
    public void crearGrupo_NPlazasMayorCero_TarifaMayorCero_MatriculadosMayorIgualCero_MatriculadosMenorNPlazas_CodigoNoNull_ActividadNull() throws ClubException {
        //Arrange
        String codigo = "476B";
        String actividad = null;
        int nPlazas = 15;
        int matriculados = 12;
        double tarifa = 27.3;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            new Grupo(codigo, actividad, nPlazas, matriculados, tarifa);
        });
    }

    @Test
    @DisplayName("Obtener el codigo del grupo")
    public void getCodigo_DevuelveCodigoCorrecto() throws ClubException{
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        String codigo = calistenia.getCodigo();

        //Assert
        assertEquals("476B", codigo);
    }

    @Test
    @DisplayName("Obtener la actividad del grupo")
    public void getActividad_DevuelveActividadCorrecto() throws ClubException{
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        String actividad = calistenia.getActividad();

        //Assert
        assertEquals("Calistenia", actividad);
    }

    @Test
    @DisplayName("Obtener el numero de plazas del grupo")
    public void getPlazas_DevuelveNPlazasCorrectas() throws ClubException{
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        int nplazas = calistenia.getPlazas();

        //Assert
        assertEquals(15, nplazas);
    }

    @Test
    @DisplayName("Obtener el numero de matriculados del grupo")
    public void getMatriculados_DevuelveNMatriculadosCorrectos() throws ClubException{
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        int matriculados = calistenia.getMatriculados();

        //Assert
        assertEquals(7, matriculados);
    }

    @Test
    @DisplayName("Obtener la tarifa del grupo")
    public void getTarifa_DevuelveTarifaCorrecta() throws ClubException{
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        double tarifa = calistenia.getTarifa();

        //Assert
        assertEquals(27.3, tarifa);
    }

    @Test
    @DisplayName("Obtener el numero de plazas libres del grupo")
    public void plazasLibres_DevuelveNPlazasLibresCorrectas() throws ClubException{
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        int plazasLibres = calistenia.plazasLibres();

        //Assert
        assertEquals(15-7, plazasLibres);
    }


    @DisplayName("Actualizar las plazas de un grupo con numero de plazas mayor que 0 y que matriculados")
    @Test
    public void actualizarPlazas_NPlazasMayorCero_NplazasMayorMatriculados() throws ClubException {
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);
        int nPLazas = 13;

        //Act
        calistenia.actualizarPlazas(nPLazas);

        //Assert
        assertEquals("(476B - Calistenia - 27.3 euros - P:13 - M:7)", calistenia.toString());
    }

    @DisplayName("Actualizar las plazas de un grupo con numero de plazas menor o igual que 0 y menor que matriculados")
    @Test
    public void actualizarPlazas_NPlazasMenorIgualCero_NplazasMenorMatriculados() throws ClubException {
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);
        int nPLazas = -1;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            calistenia.actualizarPlazas(nPLazas);
        });
    }
    
    @DisplayName("Actualizar las plazas de un grupo con numero de plazas mayor que 0 y menor que matriculados")
    @Test
    public void actualizarPlazas_NPlazasMayorCero_NplazasMenorMatriculados() throws ClubException {
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);
        int nPLazas = 5;

        //Act, Assert
        assertThrows(ClubException.class, () -> {
            calistenia.actualizarPlazas(nPLazas);
        });
    }

    @DisplayName("Matricular a un grupo un numero mayor que 0 y menor o igual que el numero de plazas libres")
    @Test
    public void matricular_NMayorCero_NMenorIgualPlazasLibres() throws ClubException {
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);
        int nMatricular = 5;

        //Act
        calistenia.matricular(nMatricular);

        //Assert
        assertEquals("(476B - Calistenia - 27.3 euros - P:15 - M:12)", calistenia.toString());
    }
    
    @DisplayName("Matricular a un grupo un numero menor o igual que 0 y menor o igual que el numero de plazas libres")
    @Test
    public void matricular_NMenorIgualCero_NMenorIgualPlazasLibres() throws ClubException {
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);
        int nMatricular = -1;

        //Act, Assert
        assertThrows(ClubException.class, () -> { 
            calistenia.matricular(nMatricular);
        });
    }

    @DisplayName("Matricular a un grupo un numero mayor que 0 y mayor que el numero de plazas libres")
    @Test
    public void matricular_NMayorCero_NMayorPlazasLibres() throws ClubException {
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);
        int nMatricular = 10;

        //Act, Assert
        assertThrows(ClubException.class, () -> { 
            calistenia.matricular(nMatricular);
        });
    }

    @DisplayName("Obtener el String asociado a un grupo")
    @Test
    public void toString_DevuelveStringCorrecto() throws ClubException {
        //Arrange
        Grupo calistenia = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        String calisteniaString = calistenia.toString();

        //Assert
        assertEquals("(476B - Calistenia - 27.3 euros - P:15 - M:7)", calisteniaString);
    }

    @DisplayName("Comprobar que equals devuelve true para grupos iguales, mismo codigo y misma actividad")
    @Test
    public void equals_DevuelveTrue_GruposIguales_MismoCodigo_MismaActividad() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);
        Grupo calistenia2 = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        Boolean sonIguales = calistenia1.equals(calistenia2);

        //Assert
        assertTrue(sonIguales);
    }

    @DisplayName("Comprobar que equals devuelve true si el grupo es el mismo")
    @Test
    public void equals_DevuelveTrue_MismoGrupo() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);

        //Act
        Boolean sonIguales = calistenia1.equals(calistenia1);

        //Assert
        assertTrue(sonIguales);
    }

    @DisplayName("Comprobar que equals devuelve false para grupos distintos, diferente codigo y diferente actividad")
    @Test
    public void equals_DevuelveFalse_GruposDistintos_DiferenteCodigo_DiferenteActividad() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);
        Grupo calistenia2 = new Grupo("675C", "CrossFit", 15, 7, 27.3);

        //Act
        Boolean sonIguales = calistenia1.equals(calistenia2);

        //Assert
        assertFalse(sonIguales);
    }

    @DisplayName("Comprobar que equals devuelve false para grupos distintos, mismo codigo pero diferente actividad")
    @Test
    public void equals_DevuelveFalseGruposDistintos_MismoCodigo_DiferenteActividad() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);
        Grupo calistenia2 = new Grupo("476B", "CrossFit", 15, 7, 27.3);

        //Act
        Boolean sonIguales = calistenia1.equals(calistenia2);

        //Assert
        assertFalse(sonIguales);
    }

    @DisplayName("Comprobar que equals devuelve false para grupos distintos, diferente codigo pero misma actividad")
    @Test
    public void equals_DevuelveFalseGruposDistintos_DiferenteCodigo_MismaActividad() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);
        Grupo calistenia2 = new Grupo("675C", "Calistenia", 15, 7, 27.3);

        //Act
        Boolean sonIguales = calistenia1.equals(calistenia2);

        //Assert
        assertFalse(sonIguales);
    }

    @DisplayName("Comprobar que equals devuelve false si un objeto es null")
    @Test
    public void equals_DevuelveFalseObjetoNull() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);

        //Act
        Boolean sonIguales = calistenia1.equals(null);

        //Assert
        assertFalse(sonIguales);
    }
    
    @DisplayName("Comprobar que equals devuelve false si un objeto no es grupo")
    @Test
    public void equals_DevuelveFalseObjetoNoGrupo() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);
        String noGrupo = "no soy un grupo";

        //Act
        Boolean sonIguales = calistenia1.equals(noGrupo);

        //Assert
        assertFalse(sonIguales);
    }


    @DisplayName("Comprobar que hashCode devuelve el mismo valor para grupos iguales")
    @Test
    public void hashCode_DevuelveMismoValorGruposIguales() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);
        Grupo calistenia2 = new Grupo("476B", "Calistenia", 15, 7, 27.3);

        //Act
        int hashCode1 = calistenia1.hashCode();
        int hashCode2 = calistenia2.hashCode();

        //Assert
        assertEquals(hashCode1, hashCode2);
    }

    @DisplayName("Comprobar que hashCode devuelve diferente valor para grupos distintos")
    @Test
    public void hashCode_DevuelveDiferenteValorGruposDistintos() throws ClubException {
        //Arrange
        Grupo calistenia1 = new Grupo("476B", "Calistenia", 17, 10, 23.1);
        Grupo calistenia2 = new Grupo("675C", "CrossFit", 15, 7, 27.3);

        //Act
        int hashCode1 = calistenia1.hashCode();
        int hashCode2 = calistenia2.hashCode();

        //Assert
        assertNotEquals(hashCode1, hashCode2);
    }
}
