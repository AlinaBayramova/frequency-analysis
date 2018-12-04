import java.io.*;
import java.lang.*;
import java.util.Scanner;



public class CryptoAnalyze {
    static private int M = 0; //длина сообщения (без знаков препинания)
    static private int alphabet[] = new int[31]; // здесь будут храниться кол-во встречаемости отдельного символа в сообщении
    static private double analyze_results[] = new double[31]; // частота отдельного символа
   


    public static void main(String args[]) throws Exception {
        CryptoAnalyze obj = new CryptoAnalyze();
        System.out.println("Введите имя файла(файл должен быть в формате txt) -> ");
        //считываем имя файла

            InputStreamReader reader = new InputStreamReader(System.in); //System.in станартный поток данных введенных с клавы
            BufferedReader buff = new BufferedReader(reader);
            String namethatfile = buff.readLine();
            obj.getFile("files/" + namethatfile + ".txt");
            analyze();

    }

    private void getFile(String FileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        if ((classLoader.getResource(FileName)) != null ){
            File file = new File(classLoader.getResource(FileName).getFile());
            try (Scanner scan = new Scanner(file)) {
                //считываем слово и идем в run()
                while (scan.hasNext()) {
                    String line = scan.next();
                    run(line);
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
    private void run(String word){
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


    private static void analyze() throws Exception {
        File file = new File("out/production/CryptoAnalyze/files/out.txt");
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
            for (int i = 0; i < analyze_results.length; i++) {
                analyze_results[i] = (double) alphabet[i] / M;
                double roundOff = Math.round(analyze_results[i] * 10000.0) / 100.0;
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




