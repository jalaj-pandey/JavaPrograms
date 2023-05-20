import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {

    static void Captialize(String txt){
        System.out.println(txt.toUpperCase());
    }

    static void CountSpaces(String txt){
        int i = 0;
        int space=0, words = 0;
        while(i<txt.length()){
            char ch=txt.charAt(i);
             if(ch==' '){
                space++;
             }
             i++;
            }
            words = space+1;
            System.out.println("Total spaces : " + space);
            System.out.println("Total words : " + words);
    }
    public static void main(String[] args) {
        String txt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your text : ");
        txt = sc.nextLine();

        String fileName = "jalaj.txt";
        String fileContent = txt;

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }

        Captialize(txt);
        CountSpaces(txt);
        

        System.out.print("Do you want to save the file in Capitalized form (1/0) : ");
        int op = sc.nextInt();
        switch (op) {
            case 1:     // 1 for save
                try {
                    FileWriter fileWriter = new FileWriter(fileName);
                    fileWriter.write(txt.toUpperCase());
                    fileWriter.close();
                    System.out.println("Successfully updated with words capitalization.");
                    } catch (IOException e) {
                    System.out.println("An error occurred while writing to the file: " + e.getMessage());
                    e.printStackTrace();
                }
                break;

            default:
                break;
        }
    }
}
