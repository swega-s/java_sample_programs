package packageclassloaders.mycompany;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {

    @Override
    public Class<?> findClass(String name) {
        byte[] b = loadClassFromFile(name);
        return defineClass(name, b, 0, b.length);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    private byte[] loadClassFromFile(String fileName) {
        InputStream inputStream = getClass()
                                    .getClassLoader()
                                    .getResourceAsStream(fileName.replace('.', File.separatorChar) + ".class");
        byte[] buffer;
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        try {
            while ((nextValue = inputStream.read()) != -1) {
                byteStream.write(nextValue);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        buffer = byteStream.toByteArray();
        return buffer;
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }

    @Override
    protected Object getClassLoadingLock(String className) {
        return super.getClassLoadingLock(className);
    }
}
