import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p04_LogParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Integer>>> project = new LinkedHashMap<>();

        String line = scan.nextLine();
        while (!line.equals("END")) {
            Pattern pat = Pattern.compile("\\{\"Project\":\\s+\\[\"([\\w]+)\"\\],\\s+\"Type\":\\s+\\[\"(Critical|Warning)\"\\],\\s+\"Message\":\\s+\\[\"([\\w\\s]+)\"\\]\\}");
            Matcher matcher = pat.matcher(line);
            if (matcher.find()) {
                String projectName = matcher.group(1);
                String errorType = matcher.group(2);
                String message = matcher.group(3);

                if (!project.containsKey(projectName)) {
                    project.put(projectName, new LinkedHashMap<>());
                }
                if (!project.get(projectName).containsKey(errorType)) {
                    project.get(projectName).put(errorType, new LinkedHashMap<>());//message or ""
                }
                if (!project.get(projectName).get(errorType).containsKey(message)) {
                    project.get(projectName).get(errorType).put(message, 0);
                }
                int count = project.get(projectName).get(errorType).get(message);
                project.get(projectName).get(errorType).put(message, 1 + count);

            }
            line = scan.nextLine();
        }
        //System.out.println(project.entrySet().stream().sorted((x, y) -> y.getValue().size()));

        System.out.println();

        for (Map.Entry<String, LinkedHashMap<String, LinkedHashMap<String, Integer>>> pairProject : project.entrySet()) {
            System.out.println(pairProject.getKey() + ":");
            for (Map.Entry<String, LinkedHashMap<String, Integer>> innerPair : pairProject.getValue().entrySet()) {
                System.out.println(innerPair.getKey());
                       int size= innerPair.getValue().entrySet().size();
                for (Map.Entry<String, Integer> inner : innerPair.getValue().entrySet())
                    System.out.println(inner.getValue());
                }
            }

        }
    }











