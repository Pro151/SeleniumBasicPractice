public class newB extends KeywrdSuper{


    public void BclassObjectNew(){

        System.out.println("This is b class dunction");
    }

    public void  showClass(){

        BclassObjectNew();
        super.add();
    }

    public static void main(String[] args) {

        newB nb = new newB();
        nb.add();
        nb.showClass();


    }


}
