package homework9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


import static homework9.MyScanner.scanner;

public class FileUtilities {
    public void writeFile(String fileName) throws IOException {
        String strPath = checkPathExistence(fileName);
        try (FileWriter fileWriter = new FileWriter(strPath)) {
            fileWriter.write("Smile a while\n");
            fileWriter.write("And when you smile\n");
            fileWriter.write("Others will smile.\n");
            fileWriter.write("And so there'll be\n");
            fileWriter.write("Miles of smiles!\n");
        } catch (IOException exception) {
            System.err.println("Error with FileWriter!!!");
        }

    }

    public void writeFileWithAppend(String fileName, String appendLine) throws IOException {
        String strPath = checkPathExistence(fileName);
        try (FileWriter fileWriter = new FileWriter(strPath, true)) {
            fileWriter.write(appendLine);
        } catch (IOException exception) {
            System.err.println("Error with FileWithAppend!!!");
        }

    }

    public void readFile(String fileName) {
        try (final FileReader fileReader = new FileReader(fileName);
             final Scanner fileScanner = new Scanner(fileReader)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException exception) {
            System.err.println("Error with FileReader!!!");
        }
    }

    public boolean checkLoginPasswordSuccessfully(String fileName) {
        int countOfAttempts = 3;
        // Сначала прочитаем файл в список, так как нам, возможно, придется
        //ходить по нему 3 раза.
        ArrayList<String> myArrayList = new ArrayList<String>();

        try (FileReader fileReader = new FileReader(fileName);
             Scanner fileScanner = new Scanner(fileReader)) {
            while (fileScanner.hasNextLine()) {
                myArrayList.add(fileScanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i <= countOfAttempts; i++) {
            System.out.println("Enter your login. Attempt #: " + i);
            String inputLogin = scanner.nextLine().trim();
            System.out.println("Enter your password. Attempt #: " + i);
            String inputPassword = scanner.nextLine().trim();

            for (int j = 0; j < myArrayList.size(); j++)
                if (myArrayList.get(j).equals(inputLogin.concat("|").concat(inputPassword))) {
                    return true;
                }
        }
        return false;
    }

    private String checkPathExistence(String fileName) throws IOException {
        String path = fileName;
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        return path;
    }
}
