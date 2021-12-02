//When the value of count becomes 7 or 15, the continue statement plays its role and skip their execution but for other values of the count, the loop will run smoothly.
//consider  i =20

class Main{
    public static void main(String args[]){
        int i = 20;
        while(i >= 0){
            if(i == 7 || i == 15){
                i--;
                continue;            
            }
            System.out.println("Value of i: "+ i);
            i--;
        }
    }
}
