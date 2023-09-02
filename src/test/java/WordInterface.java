import java.sql.SQLOutput;

public class WordInterface implements MsOffice{

    @Override
    public void open() {

        System.out.println("For opening word file");
    }

    @Override
    public void write() {

        System.out.println("For writing word file");
    }

    @Override
    public void save() {

        System.out.println("For saving word file");
    }
}
