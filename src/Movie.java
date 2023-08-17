import java.util.Arrays;

public class Movie {
    public static void main(String[] args){

        String[] titles = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade"};

        String[][] actors = {
                {"Harrison Ford", "Karen Allen", "Paul Freeman"},
                {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"},
                { "Harrison Ford", "Denholm Elliott", "Alison Doody"}
        };
        for(int i=0; i< titles.length; i++){
            System.out.printf("In the movie %s, the main actors are: %s.\n", titles[i], Arrays.toString(actors[i]));
        }
    }
}

