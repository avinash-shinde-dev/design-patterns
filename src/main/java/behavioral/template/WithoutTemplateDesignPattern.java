package behavioral.template;

class JsonParser {
    public void parse() {
        openFile();
        System.out.println("Parsing json file");
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening a file .. ");
    }

    private void closeFile() {
        System.out.println("Closing a file .. ");
    }
}

class CsVParser {
    public void parse() {
        openFile();
        System.out.println("Parsing csv file");
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening a file .. ");
    }

    private void closeFile() {
        System.out.println("Closing a file .. ");
    }
}

public class WithoutTemplateDesignPattern {
    public static void main(String[] args) {

        JsonParser parser = new JsonParser();
        parser.parse();

        CsVParser csVParser = new CsVParser();
        csVParser.parse();

    }
}
