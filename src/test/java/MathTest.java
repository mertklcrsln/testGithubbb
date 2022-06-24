import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @Test
    public void besArtiDortEsittirDokuzTesti1(){
        int a=5;
        int b=4;
        int expected=9;
        Math math= new Math();
        int result= math.add(a,b);
        assertEquals(result,expected);
    }
    @Test
    public void besArtiDortEsittirDokuzTesti2(){
        int a=5;
        int b=4;
        int expected=9;
        Math math= new Math();
        int result= math.add(a,b);
        assertEquals(result,expected);
    }
    @Test
    public void besArtiDortEsittirDokuzTesti3(){
        int a=5;
        int b=4;
        int expected=9;
        Math math= new Math();
        int result= math.add(a,b);
        assertEquals(result,expected);
    }
    @Test
    public void besArtiDortEsittirOnTesti(){
        int a=5;
        int b=4;
        int expected=10;
        Math math= new Math();
        int result= math.add(a,b);
        assertEquals(result,expected);
    }
    @Test
    public void besArtiDortEsittirYirmiTesti(){
        int a=5;
        int b=4;
        int expected=20;
        Math math= new Math();
        int result= math.add(a,b);
        assertEquals(result,expected);
    }
}
