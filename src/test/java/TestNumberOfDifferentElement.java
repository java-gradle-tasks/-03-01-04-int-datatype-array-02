import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumberOfDifferentElement {

   @Test
   public void testNoData() {
      int[] data=new int[] {};
      int expected=0;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

   @Test
   public void testNoRepeatingData() {
      int[] data=new int[] {1,2,3,4,5};
      int expected=5;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

   @Test
   public void testTereAreRepetingElementBeginning() {
      int[] data=new int[] {1,1,2,3,4,5};
      int expected=5;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

   @Test
   public void testAreRepetingElementEnd() {
      int[] data=new int[] {1,2,3,4,5,5};
      int expected=5;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

   @Test
   public void testAreMoreRepetingElementSoFar() {
      int[] data=new int[] {1,2,3,4,5,4,2,4,4,4,2,2,3,5};
      int expected=5;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

   @Test
   public void testAreMoreRepetingElementClose() {
      int[] data=new int[] {1,2,2,4,5,2,4,2,4,2,4,2,4,2,4,3,2,3};
      int expected=5;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

   @Test
   public void testOne() {
      int[] data=new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
      int expected=1;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

   @Test
   public void testTwo() {
      int[] data=new int[] {1,2,1,2,1,2,2,1,1,2,2,1,2,1,2,1,2,1,2,1};
      int expected=2;
      int actual=MyIntArrayProject.getNumberOfDifferentElement(data);
      Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy hány ismétlődő elem van a tömbben.");
   }

}
