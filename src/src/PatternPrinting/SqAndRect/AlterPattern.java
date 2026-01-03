package PatternPrinting.SqAndRect;

public class AlterPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) { // more efficient method cuz if else only once
            char ch;

            if (i == 0)
                ch = 'a';        // lowercase a
            else if (i == 1)
                ch = 'B';        // uppercase B
            else if (i == 2)
                ch = 'c';        // lowercase c
            else
                ch = 'D';        // uppercase D

            for (int j = 0; j < 4; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < 4; i++) {
//
//            for (int j = 0; j < 4; j++) { //inefficient cuz if else runs every time before print
//                char ch;
//
//                if (i == 0)
//                    ch = 'a';        // lowercase a
//                else if (i == 1)
//                    ch = 'B';        // uppercase B
//                else if (i == 2)
//                    ch = 'c';        // lowercase c
//                else
//                    ch = 'D';        // uppercase D
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }
    }

}