package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int mInput1, int mInput2, int mExpected) throws Exception {

	  Computation com = new Computation();
      int result = com.getDiscount(mInput1, mInput2);
      Assert.assertEquals(mExpected, result);

   }
}
