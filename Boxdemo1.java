class Box{          
         int width=10;
         int height=10;
         int  depth=10;
    void sai(int w,int h,int d) {
        this.width=w;
        this.height=h;
        this.depth=d;
       System.out.println(width+height);
       }
    void sai(){
         System.out.println(width+height+depth);
     }
      int volume(){
      return width*height*depth;
      }
      void display(){
      System.out.println(width+" "+height+" "+depth);
      }
  }
  class Boxdemo1{
      public static void main(String args[]){
      Box b1=new Box();
      b1.sai();
      Box b2=new Box();
      b2.sai();
     }
   }  
      
