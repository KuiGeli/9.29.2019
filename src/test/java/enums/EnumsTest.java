package enums;

import org.junit.Assert;
import org.junit.Test;

public class EnumsTest {

    @Test
    public void testEnum(){
        Assert.assertEquals(PrinterType.DOT_MATRIX,
                PrinterType.matchPrinterType("Imprimanta matriceala"));
    }

    @Test(expected = PrinterType.UnknownPrinter.class)
    public void testUnknownPrinter(){

        Assert.assertEquals(PrinterType.DOT_MATRIX,
                PrinterType.matchPrinterType("Imprimanta matriceal"));

    }

    @Test
    public void testCapacity(){
        Assert.assertEquals(PrinterType.DOT_MATRIX,
                PrinterType.matchPrintCapacity(30));
    }

    @Test(expected = PrinterType.UnknownPrinter.class)
    public void testUnknownCapacity(){
        Assert.assertEquals(PrinterType.DOT_MATRIX,
                PrinterType.matchPrintCapacity(3));
    }

}
