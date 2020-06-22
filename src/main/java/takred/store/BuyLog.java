package takred.store;

import java.util.ArrayList;
import java.util.List;

public class BuyLog {

    private static BuyLog buyLog;
    private static List<String> logList = new ArrayList<String>();

    private BuyLog() {
    }

    public static BuyLog getBuyLog() {
        if (buyLog == null) {
            buyLog = new BuyLog();
        }
        return buyLog;
    }

    public void getLogList() {
        for (int i = 0; i < logList.size(); i++) {
            System.out.println(logList.get(i));
        }
    }

    public void addLogList(String log) {
        logList.add(log);
    }
}
