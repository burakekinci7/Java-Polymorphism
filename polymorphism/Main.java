public class Main{

    public static void main(String[] args) {
        /*
        BaseLogger[] baseLoggers=new BaseLogger[]{new FileLogger(),new EmailLogger(), new DataBaseLogger()};
        
        for (BaseLogger logger:baseLoggers){
            logger.log("LogMassage");
        }
         */

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}