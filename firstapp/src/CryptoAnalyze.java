import java.io.*;
import java.lang.*;
import java.util.Scanner;



public class CryptoAnalyze {
    static private int M = 0; //длина сообщения (без знаков препинания)
    static private int alphabet[] = new int[31]; // здесь будут храниться кол-во встречаемости отдельного символа в сообщении
    static private double analyze_results[] = new double[31]; // частота отдельного символа



    public static void main(String args[]) throws Exception {

        System.out.println("Выберите язык файла, который нужно проанализировать:");
        System.out.print("1-RU"+"            2-ENG");
        System.out.println();

        Scanner input = new Scanner(System.in);

        if (input.hasNext()) {
            int user_switch = input.nextInt();
            switch (user_switch) {
                case 1:
                    CryptoAnalyze obj = new CryptoAnalyze();
                    System.out.println("Введите имя файла(файл должен быть в формате txt) -> ");

                    InputStreamReader reader = new InputStreamReader(System.in); //System.in станартный поток данных введенных с клавы
                    BufferedReader buff = new BufferedReader(reader);
                    String namethatfile = buff.readLine();
                    obj.getRUFile("files/" + namethatfile + ".txt");
                    RU_analyze();
                    break;
                case 2:
                    CryptoAnalyze object = new CryptoAnalyze();
                    System.out.println("Введите имя файла(файл должен быть в формате txt) -> ");

                    InputStreamReader streamReader = new InputStreamReader(System.in); //System.in станартный поток данных введенных с клавы
                    BufferedReader bufferedReader = new BufferedReader(streamReader);
                    String filename = bufferedReader.readLine();
                    object.getENFile("files/" + filename + ".txt");
                    EN_analyze();
                    break;
                default:
                    System.out.println("Error in switch unit");
                    System.exit(9);
            }
        } else {
            System.out.println("Ошибка ввода! Повторите попытку!");
            System.exit(9);
        }
    }

    private void getENFile(String FileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        if ((classLoader.getResource(FileName)) != null ){
            File file = new File(classLoader.getResource(FileName).getFile());
            try (Scanner scan = new Scanner(file)) {
                //считываем слово и идем в run()
                while (scan.hasNext()) {
                    String line = scan.next();
                    run_EN(line);
                }
            } catch (IOException e){
                System.out.println("Не удалось корректно считать файл!;(");
            }
        } else{
            System.out.println("Не удалось открыть файл!");
            System.exit(9);
        }
    }

    private void getRUFile(String FileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        if ((classLoader.getResource(FileName)) != null ){
            File file = new File(classLoader.getResource(FileName).getFile());
            try (Scanner scan = new Scanner(file)) {
                //считываем слово и идем в run()
                while (scan.hasNext()) {
                    String line = scan.next();
                    run_RU(line);
                }
            } catch (IOException e){
                System.out.println("Не удалось корректно считать файл!;(");
            }
        } else{
            System.out.println("Не удалось открыть файл!");
            System.exit(9);
        }
    }
    //dont touch this block! it works perfectly!
    private void run_RU(String word){
        //делим слово на символы
        for (int i = 0; i < word.length() ; i++) {
            char ch = word.charAt(i);
            char ch_Up = Character.toUpperCase(ch);
            switch (ch_Up) {
                case 'А':
                    alphabet[0] += 1;
                    M++;
                    break;
                case 'Б':
                    alphabet[1] += 1;
                    M++;
                    break;
                case 'В':
                    alphabet[2] += 1;
                    M++;
                    break;
                case 'Г':
                    alphabet[3] += 1;
                    M++;
                    break;
                case 'Д':
                    alphabet[4] += 1;
                    M++;
                    break;
                case 'Е':
                    alphabet[5] += 1;
                    M++;
                    break;
                case 'Ё':
                    alphabet[5] +=1;
                    M++;
                    break;
                case 'Ж':
                    alphabet[6] += 1;
                    M++;
                    break;
                case 'З':
                    alphabet[7] += 1;
                    M++;
                    break;
                case 'И':
                    alphabet[8] += 1;
                    M++;
                    break;
                case 'Й':
                    alphabet[9] += 1;
                    M++;
                    break;
                case 'К':
                    alphabet[10] += 1;
                    M++;
                    break;
                case 'Л':
                    alphabet[11] += 1;
                    M++;
                    break;
                case 'М':
                    alphabet[12] += 1;
                    M++;
                    break;
                case 'Н':
                    alphabet[13] += 1;
                    M++;
                    break;
                case 'О':
                    alphabet[14] += 1;
                    M++;
                    break;
                case 'П':
                    alphabet[15] += 1;
                    M++;
                    break;
                case 'Р':
                    alphabet[16] += 1;
                    M++;
                    break;
                case 'С':
                    alphabet[17] += 1;
                    M++;
                    break;
                case 'Т':
                    alphabet[18] += 1;
                    M++;
                    break;
                case 'У':
                    alphabet[19] += 1;
                    M++;
                    break;
                case 'Ф':
                    alphabet[20] += 1;
                    M++;
                    break;
                case 'Х':
                    alphabet[21] += 1;
                    M++;
                    break;
                case 'Ц':
                    alphabet[22] += 1;
                    M++;
                    break;
                case 'Ч':
                    alphabet[23] += 1;
                    M++;
                    break;
                case 'Ш':
                    alphabet[24] += 1;
                    M++;
                    break;
                case 'Щ':
                    alphabet[25] += 1;
                    M++;
                    break;
                case 'Ъ':
                    alphabet[26] += 1;
                    M++;
                    break;
                case 'Ь':
                    alphabet[26] += 1;
                    M++;
                    break;
                case 'Ы':
                    alphabet[27] += 1;
                    M++;
                    break;
                case 'Э':
                    alphabet[28] += 1;
                    M++;
                    break;
                case 'Ю':
                    alphabet[29] += 1;
                    M++;
                    break;
                case 'Я':
                    alphabet[30] += 1;
                    M++;
                    break;
                default:
                        break;
            }
        }
    }

    private void run_EN(String word){
        //делим слово на символы
        for (int i = 0; i < word.length() ; i++) {
            char ch = word.charAt(i);
            char ch_Up = Character.toUpperCase(ch);
            switch (ch_Up) {
                case 'A':
                    alphabet[0] += 1;
                    M++;
                    break;
                case 'B':
                    alphabet[1] += 1;
                    M++;
                    break;
                case 'C':
                    alphabet[2] += 1;
                    M++;
                    break;
                case 'D':
                    alphabet[3] += 1;
                    M++;
                    break;
                case 'E':
                    alphabet[4] += 1;
                    M++;
                    break;
                case 'F':
                    alphabet[5] += 1;
                    M++;
                    break;
                case 'G':
                    alphabet[6] +=1;
                    M++;
                    break;
                case 'H':
                    alphabet[7] += 1;
                    M++;
                    break;
                case 'I':
                    alphabet[8] += 1;
                    M++;
                    break;
                case 'J':
                    alphabet[9] += 1;
                    M++;
                    break;
                case 'K':
                    alphabet[10] += 1;
                    M++;
                    break;
                case 'L':
                    alphabet[11] += 1;
                    M++;
                    break;
                case 'M':
                    alphabet[12] += 1;
                    M++;
                    break;
                case 'N':
                    alphabet[13] += 1;
                    M++;
                    break;
                case 'O':
                    alphabet[14] += 1;
                    M++;
                    break;
                case 'P':
                    alphabet[15] += 1;
                    M++;
                    break;
                case 'Q':
                    alphabet[16] += 1;
                    M++;
                    break;
                case 'R':
                    alphabet[17] += 1;
                    M++;
                    break;
                case 'S':
                    alphabet[18] += 1;
                    M++;
                    break;
                case 'T':
                    alphabet[19] += 1;
                    M++;
                    break;
                case 'U':
                    alphabet[20] += 1;
                    M++;
                    break;
                case 'V':
                    alphabet[21] += 1;
                    M++;
                    break;
                case 'W':
                    alphabet[22] += 1;
                    M++;
                    break;
                case 'X':
                    alphabet[23] += 1;
                    M++;
                    break;
                case 'Y':
                    alphabet[24] += 1;
                    M++;
                    break;
                case 'Z':
                    alphabet[25] += 1;
                    M++;
                    break;
                default:
                    break;
            }
        }
    }


    private static void RU_analyze() throws Exception {
        File file = new File("out/production/CryptoAnalyze/files/out_RU.txt");
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
            for (int i = 0; i < analyze_results.length; i++) {
                analyze_results[i] = (double) alphabet[i] / M;
                double roundOff = Math.round(analyze_results[i] * 10000.0) / 1000.0;
                String tmp_out = scanner.next();
                System.out.println("Символ " + tmp_out + " встречается " + alphabet[i] + " раз. Частота равна " + roundOff);
                }
            }
            scanner.close();
        } else {
            System.out.println("Не удалось открыть файл");
        }
        System.out.println("Длина сообщения - "+M);
    }

    private static void EN_analyze() throws Exception {
        File file = new File("out/production/CryptoAnalyze/files/out_EN.txt");
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                for (int i = 0; i < (analyze_results.length-5); i++) {
                    analyze_results[i] = (double) alphabet[i] / M;
                    double roundOff = Math.round(analyze_results[i] * 10000.0) / 1000.0;
                    String tmp_out = scanner.next();
                    System.out.println("Символ " + tmp_out + " встречается " + alphabet[i] + " раз. Частота равна " + roundOff);
                }
            }
            scanner.close();
        } else {
            System.out.println("Не удалось открыть файл");
        }
        System.out.println("Длина сообщения - "+M);
    }
}




