package packageclassloaders.system;

public class ClassLoadersDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        int[] arr = new int[]{1,2,3};
        System.out.println(arr.getClass().getClassLoader());

        ClassLoader loader = Sample.class.getClassLoader();
        System.out.println(loader); // current class

        Class<?> c = Class.forName("packageclassloaders.mycompany.Hello", false, loader);
        System.out.println(c.getClassLoader());
    }
}
