package JAVA_0313;

public class 생성자 {

    public static class human {
        private String name;
        private int age;
        private double height;

        // 기본생성자
        public human() {
            this.name = "최승문";
            this.age = 24;
            this.height = 165.5;
        }

        //매개변수 생성자
        public human(String string, int i, double v) {
            this.name = string;
            this.age = i;
            this.height = v;
        }
        @Override
        public String toString() {
            return "human{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", height=" + height +
                    '}';
        }
    }
    public static void main(String[] args) {
        human people1 = new human();
        human people2 = new human("김승문", 24, 175.5);
        System.out.println(people1);
        System.out.println(people2);
    }
}