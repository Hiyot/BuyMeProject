package Tools;

import java.io.File;

public class Constant {

    public static String getData(String KeyName) {
        File fXmlFile = new File("C:\\Users\\netan\\IdeaProjects\\BuyMeProject\\src\\main\\resources\\data.xml");
        return KeyName;
    }

    public static final String CHROME_PATH = "C:\\Users\\netan\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe";
}
