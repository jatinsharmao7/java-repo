abstract class vaccine{
    int age;
    String nationality="Indian";
    int t=0;
    public void firstDose(int age,String nationality){
        
        t=1;


    }
    public void secondDose(){
        t=2;

    }
    public void boostrDose(){
        t=3;

    }
}
class dose extends vaccine{
    public void dose(int age,String nationality,int doseType){
        if(age>=18 && nationality.equals(this.nationality)&&doseType==1){
            this.age=age;
            this.nationality=nationality;
            firstDose(age, nationality);
            System.out.println("First dose is Succesful");


        }
        
        
        else if(age>=18 && !nationality.equals(this.nationality)){
            System.out.println("you are not eligible");
        }
        if(age>=18 && nationality.equals(this.nationality)&&doseType==2 && t==1){
            System.out.println("Second dose is Successful");
            secondDose();
        }
        else if(age>=18 && nationality.equals(this.nationality)&&doseType==2 && t!=1){
            System.out.println("You are not eligible for second dose");
        }
        if(age>=18 && nationality.equals(this.nationality)&&doseType==3 && t==2){
            System.out.println("Booster dose is Successful");
            boostrDose();
        }
        else if(age>=18 && nationality.equals(this.nationality)&&doseType==3 && t!=2){
            System.out.println("You are not eligible for booster dose");
        }

    }


}




public class vaccination{
    public static void main(String[] args) {
        dose d=new dose();
        d.dose(20, "Indian", 1);
        d.dose(20, "Indian", 2);
        d.dose(20, "Indian", 3);
        
    }
}