import java.util.ArrayList;

public class Permutations{
    public static void main(String[] args){
        for (String s : permutations("eat")){
            System.out.println(s);
        }
    }

    public static ArrayList<String> permutations(String word){
        ArrayList<String> result = new ArrayList<String>();
        if(word.length() == 0){ //base case
            result.add(word); //end our recursion
            return result;
        }else{
            for(int count = 0; count < word.length(); count++){ //loop through each letter in the word
                String shorter = word.substring(0,count) + word.substring(count + 1); //create a shorter substring 
                //ex: word = "eat" shorter = ("eat". 0 - 0) = "" + ("eat".0 + 1) = "e" 
                ArrayList<String> shorterPermutations = permutations(shorter); //create a shorter arrayList

                for (String s : shorterPermutations){
                    result.add(word.charAt(count) + s);
                }
            }
        }
        return result;
    }
}