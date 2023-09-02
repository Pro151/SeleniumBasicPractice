public class ExcelImplements implements MsOffice{


    @Override
    public void open() {
        System.out.println("For opening file");
    }

    @Override
    public void write() {

        System.out.println("For writing file");

    }

    @Override
    public void save() {

        System.out.println("For saving file");
    }
}
