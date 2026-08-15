package behavioral.template;

abstract class DataParser {
    protected void openFile() {
        System.out.println("Opening a file");
    }

    protected void closeFile() {
        System.out.println("Closing a file");
    }
    // need to make it as final so that no one can override this method
    // and the sequence remains as it is?
    // template method
    public final void parse(){
        openFile();
        parseData(); // abstract method
        closeFile();
    }
    protected abstract void parseData();
}

class CsvParserII extends DataParser {

    @Override
    public void parseData() {
        System.out.println("Parsing csv data ");
    }
}

class JsonParserII extends DataParser {

    @Override
    public void parseData() {
        System.out.println("Parsing Json data ");
    }
}


public class WithTemplateDesignPattern {
    public static void main(String[] args) {

        DataParser csvParser = new CsvParserII();
        csvParser.parse();

        DataParser jsonParser = new JsonParserII();
        jsonParser.parse();


    }
}
