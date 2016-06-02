public class NumToStr {

    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int num, first, second;
        
        String s1[] = {"","","Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninty"};
        String s2[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen"};

        System.out.print("Enter Number between 1 - 99 : ");
        num = uInput.nextInt();
            
        if ((num <= 1) || (num >= 100)) {
            System.out.println("Wrong Input");
        } else if ((num >= 1) && (num <= 19)) {
             System.out.println(unit[num]);
        } else if ((num >= 20) && (num <= 99)) {
            first = num / 10;
            second = num % 10;
            System.out.println(s1[first] + " " + s2[second]);
         }
        
        
    }
}
