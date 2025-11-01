// class circle{
//     void draw(){
//         System.out.println("drawing circle");
//     }
    
// }
// class rectangle extends circle{
//     void draw(){
//         System.out.println("drawing rectangle");
//     }
    
// }
// class shape extends rectangle{
//     void draw(){
//         System.out.println("drawing shape");
//     }
    
// }

// public class oops {
//     public static void main(String[] args) {
//         rectangle t=new shape();
//         t.draw();
//         circle c= new shape();
//         c.draw();
//         circle r=new rectangle();
//         r.draw();
        
//     }
// }

// class parent{
//     int sum=0;
//     int a,b;
//     int sum(int a,int b){
//         this.a=a;
//         this.b=b;
//         sum=a+b;
//         return sum;
//     }
// }
// class child extends parent{
//     int sol(int a,int b){ 
//         return super.sum(a,b);  

//     }


// }
// public class oops{

//     public static void main(String[] args) {
//         child c=new child();
        
//         System.out.println("total sum is: "+c.sol(10,20));
//     }
// }
class area{
        void calculate_area(double r){
            System.out.println("area of circle: "+3.14*r*r);
        }
        void calculate_area(int s){
            System.out.println("area of square: "+s*s);
        }
        void calculate_area(int l,int b){
            System.out.println("area of rectangle: "+l*b);
        }

    }
class oops{
    
    public static void main(String[] args) {
        area a=new area();
        a.calculate_area(5.5);
        a.calculate_area(4);
        a.calculate_area(4,5);
        
    }

}

