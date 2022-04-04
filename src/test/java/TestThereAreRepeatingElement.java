import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class TestThereAreRepeatingElement {

      @Test
      public void testNoData() {
         int[] data=new int[] {};
         boolean expected=false;
         boolean actual=MyIntArrayProject.isThereRepeatingElement(data);
         Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
      }

      @Test
      public void testNoRepeatingData() {
         int[] data=new int[] {1,2,3,4,5};
         boolean expected=false;
         boolean actual=MyIntArrayProject.isThereRepeatingElement(data);
         Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
      }

      @Test
      public void testTereAreRepetingElementBeginning() {
         int[] data=new int[] {1,1,2,3,4,5};
         boolean expected=true;
         boolean actual=MyIntArrayProject.isThereRepeatingElement(data);
         Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
      }

      @Test
      public void testAreRepetingElementEnd() {
         int[] data=new int[] {1,2,3,4,5,5};
         boolean expected=true;
         boolean actual=MyIntArrayProject.isThereRepeatingElement(data);
         Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
      }

      @Test
      public void testAreMoreRepetingElementSoFar() {
         int[] data=new int[] {1,2,3,4,5,4,2,4,4,4,2,2,3,5};
         boolean expected=true;
         boolean actual=MyIntArrayProject.isThereRepeatingElement(data);
         Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
      }

      @Test
      public void testAreMoreRepetingElementClose() {
         int[] data=new int[] {1,2,2,4,5,2,4,2,4,2,4,2,4,2,4,3,2,3};
         boolean expected=true;
         boolean actual=MyIntArrayProject.isThereRepeatingElement(data);
         Assertions.assertEquals(expected,actual,"Nem jol hatarozta meg, hogy van ismetlodo elem");
      }


   }
