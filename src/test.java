import java.io.*;
import java.util.Scanner;

public class test {
    static int numberofExample = 11;
    static int numberofMethod = 5;
    static int numberofReason = 4;
    static int numberofDeveloper = 5;
    static int numberofUse_to = 4;
    static int numberofContain = 3;
    static int numberofDrawback = 3;
    public static void main(String[] args){
        String compiler = "python";
        //String command = "G:\\similarity\\main.py";
        String command = "BertSimilarity/similarity.py";
        //String a = "What is the definition of ontology in this book?";
        //String b = "According to this book, how to explain ontology?";

        File file1 = new File("nouns.txt");
        BufferedReader reader1 = null;
        String currLine = null;
        String tempLine = null;
        int lines = 0;
        String lastWord = null;
        String q = null;
        int limit = 1;
        String lineString [] = new String[100];
        String originalStr [] = new String[100];
        try {
            reader1 = new BufferedReader(new FileReader(file1));
            while ((currLine = reader1.readLine()) != null){
                tempLine = currLine;
                //tempLine = tempLine.replace("?", "");
                for (String words: tempLine.split(" ")) {
                    lastWord = words;
                    //System.out.println("Last word is: " + lastWord);
                }
                int count = 0;
                for (String sentence: tempLine.split("\\?")) {
                    if(count < limit)
                        q = sentence;
                    //System.out.println("Question is: " + q);
                    count++;
                }
                q = q + "?";
                originalStr[lines] = q;
                System.out.println("Question is: " + q);
                System.out.println("Current Line is: " + tempLine);
                System.out.println("Last word is: " + lastWord);
                lineString[lines] = lastWord;
                lines++;
            }
            System.out.println("Number of sentences: " + lines);
            for(int k = 0; k < lines;k++) {
                System.out.println(lineString[k]);
            }
            reader1.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            if(reader1 != null){
                try{
                    reader1.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        try {
            String a = null;
            String b = null;
            String example [] = new String[numberofExample];
            String method [] = new String[numberofMethod];
            String reason [] = new String[numberofReason];
            String developer [] = new String[numberofDeveloper];
            String use_to [] = new String[numberofUse_to];
            String contain [] = new String[numberofContain];
            String drawback [] = new String[numberofDrawback];
            File file2 = new File("questionList.txt");
            BufferedReader reader2 = null;
            String currentQ = null;
            String lastQ = null;
            try {
                reader2 = new BufferedReader(new FileReader(file2));
                int counter = 0;
                System.out.println("Loop check:");
                while ((currentQ = reader2.readLine()) != null){
                    lastQ = currentQ;
                    if(lastQ.equals("example")) {
                        for(int i = 0; i < numberofExample;i++){
                            lastQ = reader2.readLine();
                            example[i] = lastQ;
                            System.out.println(example[i]);
                        }
                    }
                    else if(lastQ.equals("method")) {
                        for(int i = 0; i < numberofMethod;i++){
                            lastQ = reader2.readLine();
                            method[i] = lastQ;
                            System.out.println(method[i]);
                        }
                    }
                    else if(lastQ.equals("reason")) {
                        for(int i = 0; i < numberofReason;i++){
                            lastQ = reader2.readLine();
                            reason[i] = lastQ;
                            System.out.println(reason[i]);
                        }
                    }
                    else if(lastQ.equals("developer")) {
                        for(int i = 0; i < numberofDeveloper;i++){
                            lastQ = reader2.readLine();
                            developer[i] = lastQ;
                            System.out.println(developer[i]);
                        }
                    }
                    else if(lastQ.equals("use_to")) {
                        for(int i = 0; i < numberofUse_to;i++){
                            lastQ = reader2.readLine();
                            use_to[i] = lastQ;
                            System.out.println(use_to[i]);
                        }
                    }
                    else if(lastQ.equals("contain")) {
                        for(int i = 0; i < numberofContain;i++){
                            lastQ = reader2.readLine();
                            contain[i] = lastQ;
                            System.out.println(contain[i]);
                        }
                    }
                    else if(lastQ.equals("drawback")) {
                        for(int i = 0; i < numberofDrawback;i++){
                            lastQ = reader2.readLine();
                            drawback[i] = lastQ;
                            System.out.println(drawback[i]);
                        }
                    }
                    else {

                    }
                    /* 把数据读入各个数组 */
                }
                System.out.println("Example array: ");
                for(int k = 0; k < numberofExample;k++) {
                    System.out.println(example[k]);
                }
                System.out.println("Method array: ");
                for(int k = 0; k < numberofMethod;k++) {
                    System.out.println(method[k]);
                }
                System.out.println("Reason array: ");
                for(int k = 0; k < numberofReason;k++) {
                    System.out.println(reason[k]);
                }
                System.out.println("Developer array: ");
                for(int k = 0; k < numberofDeveloper;k++) {
                    System.out.println(developer[k]);
                }
                System.out.println("Use_to array: ");
                for(int k = 0; k < numberofUse_to;k++) {
                    System.out.println(use_to[k]);
                }
                System.out.println("Contain array: ");
                for(int k = 0; k < numberofContain;k++) {
                    System.out.println(contain[k]);
                }
                System.out.println("Drawback array: ");
                for(int k = 0; k < numberofDrawback;k++) {
                    System.out.println(drawback[k]);
                }
                reader2.close();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            finally{
                if(reader2 != null){
                    try{
                        reader2.close();
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }

            System.out.println("Original String: ");
            for(int k = 0; k < lines;k++) {
                System.out.println(originalStr[k]);
            }
            String total [] = new String[100];
            int num = numberofExample + numberofMethod + numberofReason + numberofDeveloper + numberofUse_to + numberofContain + numberofDrawback;
            for(int k = 0; k < numberofExample;k++) {
                total[k] = example[k];
            }
            for(int k = 0; k < numberofMethod;k++) {
                total[numberofExample + k] = method[k];
            }
            for(int k = 0; k < numberofReason;k++) {
                total[numberofExample + numberofMethod + k] = reason[k];
            }
            for(int k = 0; k < numberofDeveloper;k++) {
                total[numberofExample + numberofMethod + numberofReason + k] = developer[k];
            }
            for(int k = 0; k < numberofUse_to;k++) {
                total[numberofExample + numberofMethod + numberofReason + numberofDeveloper + k] = use_to[k];
            }
            for(int k = 0; k < numberofContain;k++) {
                total[numberofExample + numberofMethod + numberofReason + numberofDeveloper + numberofUse_to + k] = contain[k];
            }
            for(int k = 0; k < numberofDrawback;k++) {
                total[numberofExample + numberofMethod + numberofReason + numberofDeveloper + numberofUse_to + numberofContain + k] = drawback[k];
            }
            System.out.println("Total String: ");
            System.out.println("Num is: " + num);
            for(int k = 0; k < num;k++) {
                System.out.println(total[k]);
            }

            /*
            for(int m = 0; m < originalStr.length;m++) {
                a = originalStr[m];
                for(int n = 0; n < num;n++){
                    b = total[n].replace("xxx", lineString[m]);
                    String[] args1 = new String[] {compiler, command, a, b};
                    // 执行py文件
                    Process proc = Runtime.getRuntime().exec(args1);
                    // 此处调用python计算相似度花费时间至少60s
                    //Thread.currentThread().sleep(60000);
                }
            }
            */
            a = "What is the definition of ontology in this book?";
            b = "According to this book, how to explain ontology?";

            String[] args1 = new String[] {compiler, command, a, b};
            //String[] args1 = new String[] {compiler, command};
            Process proc = Runtime.getRuntime().exec(args1);// 执行py文件

            // 此处调用python计算相似度花费时间至少60s
            Thread.currentThread().sleep(60000);
            /*
            InputStream is = proc.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str = dis.readLine();
            proc.waitFor();
            System.out.println(str);
            */

            /* 无法读取控制台输出，疑似因为Python logging日志没有换行符从而导致 readLine() 方法无法读取
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            String lastLine =null;
            while ((line = in.readLine()) != null) {
                lastLine = line;
                //System.out.println(line);
            }
            System.out.println(lastLine);
            in.close();
            */
            File file = new File("BertSimilarity/tempSimi.txt");
            BufferedReader reader = null;
            String simi = null;
            String lastLine = null;
            int line = 1;
            try {
                reader = new BufferedReader(new FileReader(file));
                while ((simi = reader.readLine()) != null){
                    lastLine = simi;
                }
                System.out.println("Similarity is: " + lastLine);
                reader.close();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            finally{
                if(reader != null){
                    try{
                        reader.close();
                    }
                    catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
