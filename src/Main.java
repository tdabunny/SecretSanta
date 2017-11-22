import java.util.*;


public class Main
{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Dad","Mum","Tom","Janet","Owen","Bex","James","Freya","Hugh","Sabine");

        Map<String, String> santaList = new HashMap<>();

        while(santaList.size() <= names.size()) {

            for (String name : names) {

                String assignedName = names.get(new Random().nextInt(names.size()));

                //Should avoid duplicate assignments
                if (!santaList.containsValue(assignedName) && !name.equals(assignedName) && ! santaList.containsKey(name)) {
                    santaList.put(name, assignedName);
                    System.out.print(name);
                    System.out.print("'s Secret Santa is " + assignedName);
                    System.out.println(" ");
                }
            }
        }
    }
}