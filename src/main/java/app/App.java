package app;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

public class App {

    private String name;

    String greet(String name){

        return "Привет, " + ((name == null) ?  "" :  name)+"!";
    }
    public void main(String[] args) {
        Properties prop = new Properties();
        App app = new App();
        try (InputStream is = App.class.getResourceAsStream("/app.properties")) {

            // Проверяем что файл вообще найден
            if (is == null) {
                System.out.println("Файл app.properties не найден!");
                return;
            }
            prop.load(is);
            String name = prop.getProperty("student.name", "");
            System.out.println(app.greet(name));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



        System.out.println(app.greet(name));
    }
}

