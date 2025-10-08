class Palindrome{
    public static void main(String args[]){
        int x = 121;
        String string = String.valueOf(x);
        int length = string.length();
        char[] temp = new char[length];
        char[] arr = string.toCharArray();
        for(int i = length-1 ; i >=0 ; i--){
             temp[i] = arr[i];
        }

        String rev =  Arrays.toString(temp);

        if(string == rev ){
            return true ;
        }else{
            return false;
        }
    }
}