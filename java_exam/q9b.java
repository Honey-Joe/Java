class q9b{
    public static void main(String[] args) {
        final int ARRAY_SIZE = 10;
        double[] arr = new double[ARRAY_SIZE];
        System.out.println(arr[4]);
        arr[9] = 1.667;
        arr[6] = 3.333;
        double sum = 0;
        for(int x=0 ; x<ARRAY_SIZE ; x++){
            sum = sum + arr[x];
        } 
        System.out.println("Sum = " + sum);
    }


}