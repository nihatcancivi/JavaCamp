public class FileLogger extends BaseLogger{
    public void log(String message){//override
        System.out.println("Logged to file :"+message);
    }
}
