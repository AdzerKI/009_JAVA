public class ExFour {
    static String exFour(){
        /* Во фразе "Добро пожаловать на курс по Java"
        * переставить слова в обратном порядке.*/

        String phrase = "Добро пожаловать на курс по Java";
        String[] parts = phrase.split(" ");
        String newPhrase = "";

        for (int i = parts.length - 1; i >= 0; i--) {
            newPhrase = newPhrase + " " + parts[i];
        }

        return newPhrase;
    }
}
