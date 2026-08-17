class Friends{
    String Name;
    int RollNumber;
}
class Goals{
    int a;
    String Name;
}    
class Main{
    public static void main(String[] args) {
        Friends frnd1 = new Friends();
        frnd1.Name = "LOKESH";
        frnd1.RollNumber = 914;
        System.out.println(frnd1.Name);
        System.out.println(frnd1.RollNumber);
        Friends frnd2 = new Friends();
        frnd2.Name = "SHIVA";
        frnd2.RollNumber = 114;
        System.out.println(frnd2.Name);
        System.out.println(frnd2.RollNumber);
        Goals goal1 = new Goals();
        goal1.a = 1;
        goal1.Name = "MATHS";
    }

    /*  public static void main(String[] args) {
        int arr[] ={10,20,30,40,50};
        int sum =0;
        for(int i=0;i<5;i++){
            sum = sum + arr[i] ;
        }
        System.out.println("Sum of values in array is "+ sum);
    }   */


}
