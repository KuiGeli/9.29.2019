package enums;

public enum PrinterType {

    DOT_MATRIX("Imprimanta matriceala", 30),
    INK_JET("Imprimanta cu cerneala", 15),
    LASER("Imprimanta laser", 40),
    _3D("Imprimanta 3D", 50);

    private final String description;

    private final int PRINT_CAPACITY;


    PrinterType(String description, int printCapacity){
        this.description = description;
        this.PRINT_CAPACITY = printCapacity;
    }

    public String getDescription(){
        return this.description;
    }

    public int getPRINT_CAPACITY(){
        return this.PRINT_CAPACITY;
    }

    public static PrinterType matchPrinterType(String description){
        for(PrinterType printerType : PrinterType.values()){
            if(description.equalsIgnoreCase(printerType.getDescription())){
                return printerType;
            }
        }
//        return null;
        throw  new UnknownPrinter(String.format("Nu exista: '%s", description));
    }

    public static PrinterType matchPrintCapacity(int capacity){
        for (PrinterType printerType : PrinterType.values()){
            if(capacity == printerType.getPRINT_CAPACITY()){
                return printerType;
            }
        }
        throw new UnknownPrinter("Nu exista:" + String.valueOf(capacity));

    }

    public PrinterType mapPrinterType(String printDescription){
        return matchPrinterType(printDescription);
    }


    public static class UnknownPrinter extends RuntimeException {
        public UnknownPrinter(String message){
            super(message);
        }
    }


//    public String getName (String a){
//
//        if(a.equals(this.description)){
//            return this.name();
//        }
//        return "Please type in a valid line!";
//
//    }
//
}
