package JAVA_0313;

public class test {

    public static class human{
        private String name="최승문";
        private int age = 34;
        private double height = 165.5;

        @Override
        public String toString() {
            return "human{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", height=" + height +
                    '}';
        }
    }
    public static class human2{
        public String name="최승문";
        public int age = 34;
        public double height = 165.5;

        @Override
        public String toString() {
            return "human2{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", height=" + height +
                    '}';
        }
    }
    public static void main(String[] args){
        human people1 = new human();
        human2 people2 = new human2();
        System.out.println(people1);
        System.out.println(people2);
    }
}
