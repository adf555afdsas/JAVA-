package java基础.抽象类接口区别;

    interface Food {
        int a = 111;
//        private int a;
    default int rot(){
        return 0;
    }

    static void saldout() {

    }

//    private static void print();  java

    void selling();

    }
