package week3.day5;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while(fileContents.length() < 1000000){
            char c = (char) fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename));
        String str;
        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data){
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[6]);    // 전입 = to, 전출 = from
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try{
            file.createNewFile();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public void write(List<String> strs, String filename){
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs){
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {

        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }else{
                moveCntMap.put(key, moveCntMap.get(key) + 1);
            }
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        String address = "/Users/sangjoonlee/Desktop/2021_인구관련_연간자료_20221007_33904.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();

        List<PopulationMove> pml = populationStatistics.readByLine(address);

        List<String> strings = new ArrayList<>();

        for(PopulationMove pm : pml){
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }

        populationStatistics.write(strings, "./from_to.txt");

        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);

//        populationStatistics.createAFile("from_to.txt");
        String resultFilename = "cnt_result.txt";
        populationStatistics.createAFile(resultFilename);

        List<String> cntResult = new ArrayList<>();
        for(String key : map.keySet()){
            String[] fromto = key.split(",");
            String s = String.format("(%s, %s), %d\n", fromto[0], fromto[1], map.get(key));
            cntResult.add(s);
        }

        populationStatistics.write(cntResult, resultFilename);






//        System.out.println(pml);


        // populationStatistics.readByLine(address);

//        String data = "50,130,54000,2021,07,19,50,130,57000,3,1,061,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,492029";
//        PopulationMove pm = populationStatistics.parse(data);
//        System.out.println(pm.getFromSido());
//        System.out.println(pm.getToSido());

    }
}
