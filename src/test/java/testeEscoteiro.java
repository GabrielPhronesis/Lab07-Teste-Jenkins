
import com.mycompany.escoteiro.Escoteiro;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class testeEscoteiro {
   
    @Test
    public void ct1() {
        Escoteiro escoteiro = new Escoteiro("LOBINHO",1);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(25, escoteiro.calculaSalario());
    }
    
    @Test
    public void ct2() {
        Escoteiro escoteiro = new Escoteiro("LOBO",1);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(35, escoteiro.calculaSalario());
    }
    @Test
    public void ct3() {
        Escoteiro escoteiro = new Escoteiro("URSO",1);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(40, escoteiro.calculaSalario());
    }    
    @Test
    public void ct4() {
        Escoteiro escoteiro = new Escoteiro("LEÃO",1);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(45, escoteiro.calculaSalario());
    }        
    
    
    @Test
    public void ct5() {
        Escoteiro escoteiro = new Escoteiro("LOBINHO",2);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(35, escoteiro.calculaSalario());
    }  
    
    @Test
    public void ct6() {
        Escoteiro escoteiro = new Escoteiro("LOBO",2);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(45, escoteiro.calculaSalario());
    } 
    
    @Test
    public void ct7() {
        Escoteiro escoteiro = new Escoteiro("URSO",2);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(50, escoteiro.calculaSalario());
    }
    @Test
    public void ct8() {
        Escoteiro escoteiro = new Escoteiro("LEÃO",2);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(55, escoteiro.calculaSalario());
    }        
 
    @Test
    public void ct9() {
        Escoteiro escoteiro = new Escoteiro("LOBINHO",3);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(50, escoteiro.calculaSalario());
    } 

    @Test
    public void ct10() {
        Escoteiro escoteiro = new Escoteiro("LOBO",4);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(60, escoteiro.calculaSalario());
    } 
    @Test
    public void ct11() {
        Escoteiro escoteiro = new Escoteiro("URSO",5);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(65, escoteiro.calculaSalario());
    } 
    @Test
    public void ct12() {
        Escoteiro escoteiro = new Escoteiro("LEÃO",6);
        escoteiro.calculaSubsidio();
        escoteiro.calculaSubsidioExtra();
        assertEquals(70, escoteiro.calculaSalario());
    } 


}
