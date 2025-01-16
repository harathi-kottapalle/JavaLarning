import java.io.FileWriter;
import java.io.IOException;

public class WebPageCreator {
    public static void main(String[] args) {
        // Name of the webpage file
        String fileName = "harathitesting.html";

        // HTML content for the web page
        String htmlContent = """
        <!DOCTYPE html>
        <html lang=\"en\">
        <head>
            <meta charset=\"UTF-8\">
            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
            <title>Harathi Testing</title>
        </head>
        <body>
            <h1>Welcome to Harathi Testing</h1>
            <p>This is a sample webpage created using Java!</p>
        </body>
        </html>
        """;

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            // Write HTML content to the file
            fileWriter.write(htmlContent);
            System.out.println("Webpage created successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while creating the webpage.");
            e.printStackTrace();
        }
    }
}

