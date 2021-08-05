package DZ_Call_Centre;

import java.util.concurrent.ConcurrentLinkedQueue;

public class User {
    private static final int PAUSE = 1500;

    public User() {
    }

    public void request(int count, ConcurrentLinkedQueue<String> requestList) {
        for (int i = 0; i < count; i++) {
            requestList.add("Пользователь № " + i + " оставил заявку");
            System.out.println("Пользователь № " + i + " оставил заявку");
            try {
                Thread.sleep(PAUSE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
