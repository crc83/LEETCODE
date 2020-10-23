package org.crc83.j11concurrency.print_in_order;

class Foo {

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("first");
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                System.out.println("second");
            }
        };
        Thread thread3 = new Thread() {
            @Override
            public void run() {
                System.out.println("third");
            }
        };
        Foo foo = new Foo();
        foo.first(thread1);
        foo.second(thread2);
        foo.third(thread3);
    }
}
