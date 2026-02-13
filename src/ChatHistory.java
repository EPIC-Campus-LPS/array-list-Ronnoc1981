import java.util.*;

public class ChatHistory {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String[]> chat = new ArrayList<>();
        ArrayList<String> unique = new ArrayList<>();
        int theTotal = 0;
        int total = 0;
        boolean allLower = true;
        boolean waiting = true;
        boolean unseen = true;
        while(waiting){
            System.out.print("Enter a sentence: ");
            String input = scan.nextLine();
            if(input.equals("STOP")){
                waiting = false;
            }else{
                chat.add(input.split(" "));
            }
        }
        String longest = chat.get(0)[0];
        for(String[] words : chat){
            for(String word : words){
                if(!word.equals(word.toLowerCase())){
                    allLower = false;
                }
                word = word.toLowerCase();
                total ++;
                if (unique.isEmpty()){
                    unique.add(word);
                }else {
                    for (int i = unique.size() - 1; i >=0; i--) {
                        if (word.equals(unique.get(i))) {
                            unseen = false;
                        }
                    }
                    if(unseen){
                        unique.add(word);
                    }
                }
                if(word.equals("the")){
                    theTotal ++;
                }
                if(word.length() > longest.length()){
                    longest = word;
                }
                unseen = true;
            }
        }
        System.out.println("\nChat Report:\nYou used " + total + " words\nYou used " + unique.size() + " unique words\nYou used \"the\" " + theTotal + " times");
        System.out.println(longest + " was the longest word\nAre all words lowercase? " + allLower + "\n");
        System.out.println("Condensed Chat History:");
        for(String un : unique){
            if(un.length() > 3){
                System.out.println(un);
            }
        }

    }

}
