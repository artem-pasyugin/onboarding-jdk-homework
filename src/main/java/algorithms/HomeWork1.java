package algorithms;


    public boolean checkIsUnique(int[] numbers) {
        boolean result = true;
        for (int i = 0; i < numbers.length ; i++) {


            for (int j = i + 1; j < numbers.length ; j++) {
                if (numbers[i] == numbers[j]){
                    result = false;
                }

            }
        }
        return result;
    }
}





