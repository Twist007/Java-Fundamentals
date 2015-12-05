import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p04_UserLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pattern pattern= Pattern.compile("IP=([\\w\\.:]+) message='(.*)' user=(.*)");
        TreeMap<String,LinkedHashMap<String, Integer>>allUsers=new TreeMap<>();

        String line= scan.nextLine();
        while (!line.equals("end")){
            Matcher matcher=pattern.matcher(line);
            if (matcher.find()) {
                String ip = matcher.group(1);
                String user = matcher.group(3);

                if (!allUsers.containsKey(user)) {
                    allUsers.put(user, new LinkedHashMap<>());
                }
                if (allUsers.get(user).containsKey(ip)) {
                   int currentCount= allUsers.get(user).get(ip);
                    allUsers.get(user).put(ip,currentCount+1);
                } else {
                    allUsers.get(user).put(ip, 1);
                }
            }
            line=scan.nextLine();
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> pair : allUsers.entrySet()) {
            System.out.println(pair.getKey()+":");
            StringBuilder sb=new StringBuilder();
            for (Map.Entry<String, Integer> innerPair : pair.getValue().entrySet()) {
                sb.append(innerPair.getKey());
                sb.append(" => ");
                sb.append(innerPair.getValue());
                sb.append(", ");
            }
            String output=sb.toString();
            output=output.substring(0,output.length()-2);
            System.out.println(output+".");
        }
    }
}
