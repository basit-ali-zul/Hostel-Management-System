
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Record {

    private final static String FILEPATH = "StudentRecord.txt";

    //STORE/SAVE RECORD
    //Saves student data/Object in the file.
    public static void saveRecord(Student std) throws IOException {
        File file = new File(FILEPATH);
        try ( FileWriter fileWriter = new FileWriter(file, true);  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  PrintWriter printWriter = new PrintWriter(bufferedWriter);) {
//        FileWriter fileWriter = new FileWriter(file, true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        PrintWriter printWriter = new PrintWriter(bufferedWriter);

            //Writing Data in the file
            printWriter.println(std);
            printWriter.flush();
//        printWriter.close();
//        bufferedWriter.close();
//        fileWriter.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Save Record.");
            e.printStackTrace();
        }
    }

    //EDIT RECORD
    //To Edit record for Student Id passed in method
    public static void saveRecord(Student std, String studentId) throws IOException {
        File oldFile = new File(FILEPATH);
        File newFile = new File("temp.txt");
        try ( Scanner sc = new Scanner(oldFile);  FileWriter fileWriter = new FileWriter(newFile, true);  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  PrintWriter printWriter = new PrintWriter(bufferedWriter);) {
//        Scanner sc = new Scanner(oldFile);
//        FileWriter fileWriter = new FileWriter(newFile, true);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        PrintWriter printWriter = new PrintWriter(bufferedWriter);

            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String data[] = line.split("\\|");
                if (data[0].equalsIgnoreCase(studentId)) {
                    printWriter.println(std);
                } else {
                    printWriter.println(line);
                }
            }

//        sc.close();
            printWriter.flush();
//        printWriter.close();
//        oldFile.delete();
//        File dump = new File(FILEPATH);
//        newFile.renameTo(dump);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Edit Record.");
        } finally {
            oldFile.delete();
            File dump = new File(FILEPATH);
            newFile.renameTo(dump);
        }
    }

    //RECORD EXIST
    //Check if data exits in the record in file.
    public static boolean recordExist(String input) {
        File file = new File(FILEPATH);
        boolean found = false;
        try ( Scanner sc = new Scanner(file)) {
//            Scanner sc = new Scanner(file);
            String line;
            while (sc.hasNext()) {
                line = sc.nextLine();
                String[] word = line.split("\\|");
                for (String s : word) {
                    if (s.equalsIgnoreCase(input)) {
                        sc.close();
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
//            sc.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File not Found\nIn recordExist method.");
        }
        return found;
    }

    //SEARCH RECORD
    //Searches Record with a keyword
    public static String searchRecord(String keyword) {
        String line = "";
        boolean found = false;
        File file = new File(FILEPATH);
        try ( Scanner sc = new Scanner(file);) {

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                if (line.equals("")) {
                    break;
                }

                String words[] = line.split("\\|");
                for (String s : words) {
                    if (s.equalsIgnoreCase(keyword)) {
                        sc.close();
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "File Not Found\nFileNotFoundException");
        } finally {
            if (found) {
                return line;
            } else {
                return "";
            }
        }
    }

    //DELETE RECORD
    //Delete record by compare record until it matches then delete that record
    public static void deleteRecord(String studentId) throws IOException {
        File oldFile = new File(FILEPATH);
        File newFile = new File("tempDelete.txt");
        try ( Scanner scan = new Scanner(oldFile);  FileWriter fileWriter = new FileWriter(newFile, true);  BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);  PrintWriter printWriter = new PrintWriter(bufferedWriter);) {

            String line;
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                if (!line.equalsIgnoreCase(studentId)) {
                    printWriter.println(line);
                }
            }
            printWriter.flush();
        }

        oldFile.delete();
        File dump = new File(FILEPATH);
        newFile.renameTo(dump);
    }
}
