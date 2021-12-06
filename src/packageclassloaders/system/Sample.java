package packageclassloaders.system;


import packageclassloaders.mycompany.CustomClassLoader;

public class Sample {
    public static void main(String[] args) throws ClassNotFoundException {

        CustomClassLoader myLoader = new CustomClassLoader();
        System.out.println(myLoader); // custom class loader

        try {
            Class c = myLoader.findClass("packageclassloaders.mycompany.Hello");
            Class d = myLoader.findClass("packageclassloaders.mycompany.Greet");
            System.out.println("c's class loader is " + c.getClassLoader());
            System.out.println("d's class loader is " + d.getClassLoader());
        } catch (Exception exception ) {
            exception.printStackTrace();
        }

    }
}

