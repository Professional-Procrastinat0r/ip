import java.util.Scanner;
import java.util.ArrayList;

public class OuiOuiBaguette {
    public static void main(String[] args) {

        String greetings = formatBotSpeech(new String[] {
                "Bone-jaw! I'm Oui Oui Baguette.",
                "What can I do for you? Oui Oui"});

        String farewell = formatBotSpeech("Bye. Hope to see you soon! Oui Oui");
    
        // Say greetings
        System.out.println(greetings);

        // Initialize scanner
        Scanner sc = new Scanner(System.in); 

        // Initialize ArrayList of tasks
        ArrayList<String> tasks = new ArrayList<String>();

        // Main event loop
        while (true) {
            // Read input
            String cmd = sc.nextLine();

            // "bye" command exits loop
            if (cmd.equals("bye")) {
                break;
            }

            if (cmd.equals("list")) {
                // List tasks
                // Convert ArrayList to array of strings
                String[] tasksArr = new String[tasks.size()];
                tasks.toArray(tasksArr);
                for (int i = 0; i < tasks.size(); i++) {
                    tasksArr[i] = (i + 1) + ". " + tasksArr[i];
                }

                System.out.println(formatBotSpeech(tasksArr));

            } else {
                // Add task
                tasks.add(cmd);
                System.out.println(formatBotSpeech("added: " + cmd));
            }
        }

        System.out.println(farewell);

        sc.close();
    }


    /**
     * Returns a message formatted with for a CLI chat response
     *
     * @param s response message
     * @return response delimited with horizontal lines and indented
     */
    public static String formatBotSpeech(String s) {
        return formatBotSpeech(new String[]{s});
    }


    /**
     * Returns a message formatted with for a CLI chat response
     *
     * @param strs list of response message
     * @return response delimited with horizontal lines and indented
     */
    public static String formatBotSpeech(String[] strs) {
        StringBuilder res = new StringBuilder("\t____________________________________________________________");

        for (String s : strs) {
            res.append("\n\t " + s);
        }

        res.append("\n\t____________________________________________________________\n");
        return res.toString();
    }
}
