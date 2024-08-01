class Box{
          int width,height,depth;
    Box() {
        width=10;
        height=10;
        depth=10;
       }
    Box(int w,int h,int d){
           width=w;
           height=h;
           depth=d;
     }
      int volume(){
      return width*height*depth;
      }
      void display(){
      System.out.println(width+" "+height+" "+depth);
      }
  }
  class Boxdemo{
      public static void main(String args[]){
      Box b1=new Box();
      b1.display();
      Box b2=new Box(5,6,7);
      b2.display();
     
      }
   }
