import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
    public static void main(String []args) {
        int count = 0;
        String email = "prosto@mail.ru";
        Pattern pattern = Pattern.compile("((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
        Matcher matcher = pattern.matcher(email);

        while (matcher.find()) {
            count++;
            System.out.println("Введено: " + 
            email.substring(matcher.start(), matcher.end()) +
            "\n на входе: " + matcher.start() + 
            "\n на выходе: " + matcher.end());
        }
        System.out.println("Совпадений: " + count);
    }
}
