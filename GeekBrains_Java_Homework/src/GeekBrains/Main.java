package GeekBrains;

public class Main {

    public static void main(String[] args) {
//        ChangeOfVariableIfElse();
//        ChangeOfVariableSwitch();
//        VariableInput();
//        VariableInputAlternative();
//        VariableMultiplication();
//        VariableInputDblMassive();
//        FindMinMax();
        if(CheckBalance() == true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
//        Task7();



    }
    public static void ChangeOfVariableIfElse(){
        int[] massive1 = new int[] {0,1,1,1,0,0,1,1,0,1,1};
        for (int i = 0; i < massive1.length; i++) {
            if (massive1[i] == 0){
                massive1[i] = 1;
            } else {
                massive1[i] = 0;
            }
            System.out.println(massive1[i]);
        }
    }
    public static void ChangeOfVariableSwitch() {
        int[] massive1 = new int[]{0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1};
        for (int i = 0; i < massive1.length; i++) {
            switch (massive1[i]) {
                case 0: {
                    massive1[i] = 1;
                    break;
                }
                case 1: {
                    massive1[i] = 0;
                    break;
                } default: {
                    System.out.println("Wrong number");
                }
            } System.out.println(massive1[i]);
        }
    }
    public static void VariableInput(){
        int[] massive2 = new int[8];
        for (int i = 1; i < massive2.length; i++) {
            massive2[i] = 3 + massive2[i-1];
        }
    }
    public static void VariableInputAlternative(){
        int[] massive2 = new int[8];
        for (int i = 0; i < massive2.length; i++) {
            if(i == 0){
                massive2[i] = 0;
            } else {
                massive2[i] = 3 + massive2[i-1];
            }
            System.out.println(massive2[i]);
        }
    }
    public static void VariableMultiplication() {
        int[] massive3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massive3.length; i++) {
            if (massive3[i] < 6) {
                massive3[i] = massive3[i] * 2;
            } else {
                massive3[i] = massive3[i];
            }
            System.out.println(massive3[i]);
        }
    }
    public static void VariableInputDblMassive() {
        int[][] dblmassive = new int[7][7];
        for (int i = 0; i < dblmassive.length; i++) {
            int k = dblmassive.length-i;
            for (int j = 0; j < dblmassive[i].length; j++) {

                if (i == j) {
                    dblmassive[i][j] = 1;
                } else {
                    dblmassive[i][j] = 0;
                }
                dblmassive[i][k-1] = 1;
                System.out.print(dblmassive[i][j]);
            }

            System.out.println();
        }
    }
    public static void FindMinMax(){
        int[] massive4 = new int[]{-1001,2,5,-7,3,55,6,-15,-288,0,144};
        int min = massive4[0];
        int max = massive4[0];
        for (int i = 0; i < massive4.length ; i++) {
            if(massive4[i] < min){
                min = massive4[i];
            } else if(massive4[i] > max){
                max = massive4[i];
            }
        }
        System.out.println("Min= " + min);
        System.out.println("Max= " + max);
    }

    public static boolean CheckBalance(){
        int[] massive5 = new int[] {1,2,2,3,8,4,4,4,4};
        int sum = 0;
        for (int i = 0; i < massive5.length; i++) {
            sum = sum + massive5[i];
        }
        int Left = 0;
        int Right = sum;
        for (int i = 0; i < massive5.length; i++) {
            Left = Left + massive5[i];
            Right = Right - massive5[i];
               if (Left == Right){
                   return true;
               }
        }
        return false;
    }

    public static void Task7(){
        int[] massive = new int[]{1,2,3,4,5,6,7,8};
        int shift = -4;
        shift = shift %massive.length;

        for (int i = 0; i < massive.length; i++) {
            if (shift == 0){
                break;
            } else if(shift <= massive.length/2) {
                if (i + shift < massive.length) {
                    int shiftI = (i + shift) % massive.length;
                    int temp = massive[i];
                    massive[i] = massive[shiftI];
                    massive[shiftI] = temp;
                } else {
                    break;
                }
            } else {
            }


        }
    }
}



