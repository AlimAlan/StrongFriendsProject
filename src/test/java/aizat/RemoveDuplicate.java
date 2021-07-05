package aizat;

public class RemoveDuplicate {
    /**
     * remove duplicates from String
     */
    public static void main(String[] args) {
        String word = "aplle";
        String uniq = "";

        for(char each : word.toCharArray()) {
            if(uniq.indexOf(each) != -1){
                continue;
            }else{
                uniq+= each; // (meaning) uniq = uniq +each

            }



        }

        System.out.println(uniq);

    }
}


