package com.ransibi;

/**
 * 通过继承Thread类创建线程
 */
public class Thread01 {
    /**
     * (1)请编写程序，开启一个线程，该线程每隔1秒，在控制台输出"喵喵，我是小猫咪"
     * (2)对上题改进，当输出8次 喵喵，我是小猫咪 ，结束该线程
     * (3)使用JConsole监控线程执行情况，并画出线程示意图
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.start();
        System.out.println("主线程继续执行"+Thread.currentThread().getName());
    }

    static class Dog extends Thread {
        @Override
        public void run() {
            int count = 0;
            while (true) {
                if (count == 8) {
                    break;
                }
                count++;
                System.out.println(Thread.currentThread().getName()+":"+"喵喵，我是小猫咪");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
