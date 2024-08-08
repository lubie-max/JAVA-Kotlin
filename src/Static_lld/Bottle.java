package Static_lld;

public  class  Bottle{
    private  int size;
    private static  int price ;

    public  void  printData(){
        System.out.println("size" + size);
        System.out.println("price" + price);

        getSize();
        getPrice();

    }


    public  int getSize(){
        return  size;
    }

    public static int getPrice(){
        return  price;
    }
    
}
