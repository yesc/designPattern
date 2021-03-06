/**
 * @Title: ProducerTask.java
 * @Package: yuanjun.chen.concurrent.consumerproducer
 * @Description: 生产者任务，其生成任务并放置到blockingqueue中
 * @author: 陈元俊
 * @date: 2018年8月2日 下午2:46:41
 * @version V1.0
 * @Copyright: 2018 All rights reserved.
 */
package yuanjun.chen.concurrent.consumerproducer;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ProducerTask
 * @Description: 生产者任务，其生成任务并放置到blockingqueue中
 * @author: 陈元俊
 * @date: 2018年8月2日 下午2:46:41
 */
public class ProducerTask implements Runnable {
    private BlockingQueue<Lobster> coldChain;

    public ProducerTask(BlockingQueue<Lobster> coldChain) {
        super();
        this.coldChain = coldChain;
    }

    @Override
    public void run() {
        while (true) {
            if (!Lobster.shouldStopHarvesting) {
                Lobster lob = fishermanHarvest();
                try {
                    Thread.sleep(1000);
                    boolean res = coldChain.offer(lob, 2, TimeUnit.SECONDS);
                    if (res) {
                        System.out.println("nice, the " + lob + " has been delivered");
                    } else {
                        lob.degenerate(); // awful
                        System.out.println("shame, the coldchain is full!"); // 需要加上失败重试机制
                    }
                } catch (InterruptedException e) {
                    lob.degenerate(); // awful
                    System.out.println("interrupted!");
                }
            } else {
                System.out.println("should stop harvesting!");
                break;
            }
        }
    }

    private static Lobster fishermanHarvest() {
        Random rd = new Random();
        Lobster lob = new Lobster();
        lob.setSize(rd.nextInt(200));
        lob.setWeight(rd.nextInt(100));
        lob.setTag(UUID.randomUUID().toString());
        lob.setTaste("delicious");
        return lob;
    }

}
