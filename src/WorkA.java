import java.util.ArrayList;
import java.util.Random;

public class WorkA {
    public static void main(String[] args) {

        //task A
        ArrayList<String> music = new ArrayList<>();
        ArrayList<String> music2 = new ArrayList<>();
        music.add("Ветер с моря дул");
        music.add("Нагонял беду");
        music.add("И сказал ты мне");
        music.add("Больше не приду");
        music2.addAll(music);
        ArrayList<String> finalVersion = new ArrayList<>();
        ArrayList<String> for15Plus = new ArrayList<>();
        for (int i = 0; i < music.size(); i++) {
            finalVersion.add(music.get(i));
            finalVersion.add(music2.get(i));
        }

        for (int i = 0; i < finalVersion.size(); i++) {
            if (finalVersion.get(i).length() >= 15) {
                for15Plus.add(finalVersion.get(i));
            }
        }
        for (int i = 0; i < for15Plus.size(); i++) {
            for15Plus.remove("И сказал ты мне");
        }
        for (String s : for15Plus) {
            System.out.println(s);
        }


        // task B
        Random rn = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            numbers.add(rn.nextInt(1, 100));
        }
        ArrayList<Integer> chetNumbers = new ArrayList<>();
        ArrayList<Integer> neChetNumbers = new ArrayList<>();

        for (int i = 0; i< numbers.size(); i++){
            if (numbers.get(i) %2 == 0){
                chetNumbers.add(numbers.get(i));
            }else {
                neChetNumbers.add(numbers.get(i));
            }
        }


            for (Integer i : numbers) {
                System.out.println(i);
            }

        System.out.println("Четные");
        for (Integer i : chetNumbers) {
            System.out.println(i);
        }

        System.out.println("Не четные");
        for (Integer i : neChetNumbers) {
            System.out.println(i);
        }
    }
}

