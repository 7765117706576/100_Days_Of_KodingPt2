package PERCABANGAN;

public class Day_009_Array4D {

    public static void main(String[] args) {
        String Array4D[][][][] = {{{{"Naruto", "Eren", "Yagami"}}}};
        for (int i = 0; i < Array4D.length; i++) {
            for (int j = 0; j < Array4D[i].length; j++) {
                for (int k = 0; k < Array4D[i][j].length; k++) {
                    for (int l = 0; l < Array4D[i][j][k].length; l++) {
                        System.out.println(Array4D[i][j][k][l]);
                    }
                }
            }

        }
    }

}
