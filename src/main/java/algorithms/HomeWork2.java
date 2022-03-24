package algorithms;


public class HomeWork2 {

    public int[] sortByAscendingOrder(int numbers[]) {
        boolean result = false;
        int k = 1000;
        int h = 0;
        do {
            h++;
            result = true;
            for (int i = 0; i < numbers.length-1; i++){
                int a1 = numbers[i];

                if (numbers[i] >= numbers[i+1]){
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = a1;
                    result = false;
                }
            }
        }
        while (!result && h < k);
        for (int number : numbers) {
            System.out.print(number + ", ");

        }



        return numbers;
    }
}