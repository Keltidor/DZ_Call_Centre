package DZ_Call_Centre;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Support {
    public static final int SUPPORT_SLEEP = 3000;

    public Support() {
    }

    public void closeRequest(ConcurrentLinkedQueue<String> requestList, Thread userRequest) {
        String request;

        while ((request = requestList.poll()) != null || userRequest.isAlive()) {
            if (request == null) continue;
            System.out.println(Thread.currentThread().getName() + " закрыл заявку от " + request);
            try {
                Thread.sleep(SUPPORT_SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " у меня больше нет заявок");
    }
}
