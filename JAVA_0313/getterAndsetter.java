package JAVA_0313;

public class getterAndsetter {
    public static class human {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age<=0){
                System.out.println("1미만의 값은 입력할수 없습니다.");
            }
            else {
                this.age = age;
            }
        }

        @Override
        public String toString() {
            return "human{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        human csm = new human();
        System.out.println(csm.getName()); // null
        System.out.println(csm.getAge()); // 0
        csm.setName("최승문");
        csm.setAge(24);
        System.out.println(csm.getName()); // 최승문
        System.out.println(csm.getAge()); // 24
    }
}
