 /*
 class UniqueChars {
    public static void main(String[] args) {
        String str = "helllo";
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.print(c + " ");
            }
        }
		
	*/	
		 class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aabbdddcd";
        StringBuilder result = new StringBuilder();

        int count = 1;  // start with first character count
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;  // same char, increment count
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;  // reset count
            }
        }
        // append last character group
        result.append(str.charAt(str.length() - 1)).append(count);

        System.out.println(result.toString());
    }
}
    }
}