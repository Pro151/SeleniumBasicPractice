public class ExecutorInterface {
    public static void main(String[] args) {

        /*ExcelImplements eIm = new ExcelImplements();
        WordInterface wImp = new WordInterface();

        eIm.open();
        eIm.save();

        wImp.open();
        wImp.save();*/

        MsOffice e = new ExcelImplements();
        MsOffice w = new WordInterface();

        e.open();
        e.save();
        w.open();
        w.save();


    }
}
