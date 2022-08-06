public class problem10 {
    int counter = 0;
    static int N;
    static int[] a={5,10,22,11,24,14,11,12121,33,122,1919,44};

    public void odd()
    {
        synchronized (this)
        {
            while (counter < N-1) {
                while (a[counter] % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (
                            Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread odd :"+a[counter]);
                counter++;
                notify();
            }
        }
    }

    public void even()
    {
        synchronized (this)
        {
            while (counter < N-1) {
                while (a[counter] % 2 == 1) {
                    try {
                        wait();
                    }
                    catch (
                            Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread even : "+a[counter]);

                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args)
    {
        N = a.length;
        problem10 mt = new problem10();
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.even();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.odd();
            }
        });
        t1.start();
        t2.start();
    }
}