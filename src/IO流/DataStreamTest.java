package IO流;

import java.io.*;
import java.lang.annotation.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * *@Author LiGuanda
 * *@Data 2022/3/26 上午 9:02
 * *@Description This is a description of DataStreamTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */

@classAnnotation
public class DataStreamTest {

    public static void main(String[] args) {
        try {

            //DataInputStream dis = new DataInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\")));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\f.fff")));
            dos.writeByte((byte) 16);
            dos.writeInt(666);
            dos.writeBoolean(false);
            dos.writeLong(123456L);
            dos.writeChar('a');
            dos.writeDouble(6.666666);
            dos.writeFloat(1);
            dos.writeUTF("heiheihei");
            dos.writeShort(66);

            dos.flush();
            dos.close();

            DataInputStream dis1 = new DataInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\f.fff")));
            System.out.println((byte) (dis1.readByte()));
            System.out.println(dis1.readInt());
            System.out.println(dis1.readDouble());
            System.out.println(dis1.readFloat());
            System.out.println((boolean) (dis1.readBoolean()));
            System.out.println((dis1.read()));
            System.out.println(dis1.readLong());

            long l = dis1.readLong();
            System.out.println(l);
            Short s = dis1.readShort();
            System.out.println(s);

            Person p = new Person("G.E.M.", 30, "Hongkong");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\g.ggg")));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\g.ggg")));

            oos.writeObject(p);
            oos.flush();

            Person p1 = (Person) ois.readObject();
            System.out.println(p1.name + "\t\t" + p1.age + "\t\t" + p1.address);

            Person p2 = new Person("Jay Chou", 43, "China Taiwan");

            ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\g.ggg")));
            Person p3 = (Person) ois1.readObject();
            System.out.println("name: " + p3.name + "\t\tage: " + p3.age + "\t\taddress: " + p3.address);

            ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\g.ggg")));

            oos1.writeObject(p2);

            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\g.ggg")));

            oos1.flush();
            oos1.close();

            Person p4 = (Person) ois2.readObject();

            System.out.println(p4.name + "\t\t" + p4.age + "\t\t" + p4.address);


            oos.close();
            ois.close();

            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\g.ggg")));

            oos2.writeChar('m');
            oos2.writeInt(6666);
            oos2.writeDouble(6.6666);
            oos2.writeChars("Good along the way");
            oos2.writeByte(0xffff0011);
            Person p5 = new Person("JJ Lin", 41, "Singapore");
            oos2.flush();
            //oos2.writeObject(p5);

            System.out.println("-------------exquisite segment line-------------");

            ObjectInputStream ois3 = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\g.ggg")));

            //System.out.println(ois3.readInt());
            //System.out.println(ois3.readDouble());
            System.out.println(ois.read());
            System.out.println(ois3.readByte());
            ObjectOutputStream oos5 = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));
            int i = 66;
            oos5.writeInt(i);
            oos5.flush();
            oos5.close();

            ObjectInputStream ois5 = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));

            System.out.println(ois5.readInt());

            DataOutputStream dos1 = new DataOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));

            dos1.writeInt(1111);
            dos1.flush();
            dos1.close();

            DataInputStream dis = new DataInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));
            System.out.println(dis.readInt());

            DataOutputStream dos2 = new DataOutputStream(new FileOutputStream(new File("c:\\Users\\Lenovo\\Desktop\\h.hhh")));
            dos2.writeBoolean(false);
            dos2.flush();
            dos2.close();

            DataInputStream dis2 = new DataInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));
            System.out.println(dis2.readBoolean());

            ObjectOutputStream oos6 = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));
            oos6.writeDouble(6.666);
            oos6.flush();
            oos6.writeChar('m');
            oos6.flush();
            oos6.writeByte(0xffff0011);
            oos6.writeChars("");


            oos6.flush();
            oos6.close();

            FileWriter fw = new FileWriter(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh"));
            fw.write("");
            fw.flush();
            fw.close();

            //ObjectInputStream ois6 = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));
            //System.out.println(ois6.readByte());
            //System.out.println(ois6.readChar());
            //System.out.println(ois6.readDouble());
            //System.out.println(ois6.readChar());
            //System.out.println(ois6.readByte());
            //System.out.println(ois6.readLine());

            ObjectOutputStream oos7 = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));
            oos7.writeChar('m');
            oos7.flush();
            oos7.close();

            ObjectInputStream ois7 = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh")));
            System.out.println(ois7.readChar());


            //RandomAccessFile raf = new RandomAccessFile(new File("C:\\Users\\Lenovo\\Desktop\\i.iii"),"r");

            //raf.close();


            RandomAccessFile raf1 = new RandomAccessFile(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh"), "rw");


            System.out.println(raf1.getFD());
            raf1.writeBoolean(false);

            byte[] b = new byte[]{(byte) 1, (byte) 2, (byte) 3, (byte) 4};

            raf1.write(b, 0, b.length);
            //raf1.close();
            System.out.println(raf1.readLine());

            //System.out.println(raf1.readByte());

            System.out.println(raf1.getFilePointer());

            raf1.seek(0);
            System.out.println(raf1.readByte());
            FileWriter fw1 = new FileWriter(new File("c:\\Users\\Lenovo\\Desktop\\h.hhh"));
            fw1.write("");
            fw1.close();


            RandomAccessFile raf2 = new RandomAccessFile(new File("C:\\Users\\Lenovo\\Desktop\\h.hhh"), "rwd");

            raf2.writeChar('u');
            raf2.writeInt(6666);
            raf2.writeDouble(1.111111);

            System.out.println("------------exquisite segment line-----------");
            //System.out.println(raf2.readChar());
            System.out.println(raf2.getFilePointer());

            raf2.seek(0);
            System.out.println(raf2.readChar());
            System.out.println(raf2.getFilePointer());
            System.out.println(raf2.readInt());
            System.out.println(raf2.getFilePointer());
            System.out.println(raf2.readDouble());
            System.out.println(raf2.getFilePointer());

            raf2.writeBoolean(false);
            raf2.seek(14);
            System.out.println(raf2.readBoolean());
            System.out.println(raf2.getFilePointer());
            raf2.seek(2);
            raf2.write("RIP".getBytes(), 0, "RIP".getBytes().length);
            raf2.seek(2);
            System.out.println((char) raf2.readByte());
            System.out.println(raf2.getFilePointer());
            System.out.println((char) raf2.readByte());
            System.out.println(raf2.getFilePointer());
            System.out.println((char) raf2.readChar());
            System.out.println(raf2.getFilePointer());
            raf2.seek(4);
            System.out.println((char) raf2.readByte());
            System.out.println(raf2.getFilePointer());
            System.out.println(raf2.readInt());
            System.out.println(raf2.getFilePointer());
            raf2.seek(5);
            System.out.println(raf2.readLine());
            raf2.seek(14);
            System.out.println(raf2.readBoolean());

            byte[] b1 = "RIP".getBytes();


            Path pa = Paths.get("h.hhh");
            System.out.println(pa);
            Path pa1 = Paths.get("C:\\", "Users\\Lenovo\\Desktop\\", "h.hhh");
            System.out.println(pa1.isAbsolute());
            System.out.println(pa.isAbsolute());

            System.out.println(pa1.toAbsolutePath());
            System.out.println(pa.resolve(pa1));
            Path pa2 = Paths.get("C:\\Users\\", "Lenovo\\Desktop\\");

            System.out.println(pa2.resolve(pa));
            System.out.println(pa2.startsWith("C:\\"));
            System.out.println(pa1.endsWith("h.hhh"));
            System.out.println(pa1.endsWith("\\h.hhh"));

            Path pa3 = Paths.get("C:\\");
            System.out.println(pa3.getFileName());
            System.out.println(pa3.getNameCount());
            Path pa4 = Paths.get("C:\\Users\\Lenovo\\Desktop\\MySQL基础");
            System.out.println(pa4.getNameCount());
            System.out.println(pa4.getName(0));
            System.out.println(pa4.getName(1));
            System.out.println(pa4.getName(2));
            System.out.println(pa4.getRoot());
            System.out.println(pa4.getParent());
            Path pa5 = Paths.get("C:\\Users\\Lenovo\\Desktop\\");
            Path pa6 = Paths.get("h.hhh");
            System.out.println(pa5.resolve(pa6));
            System.out.println(pa4.resolve(pa5));
            Path pa7 = pa5.resolve(pa6);

            System.out.println(Files.size(pa7));
            Path pa9 = Paths.get("C:\\Users\\Lenovo\\Desktop\\h.hhh");
            Path pa10 = Paths.get("C:\\Users\\Lenovo\\Desktop\\hhh");
            //Path pa8 = Files.move(pa9,pa10, StandardCopyOption.REPLACE_EXISTING);

            //Files.deleteIfExists(Paths.get("C:\\Users\\Lenovo\\Desktop\\hhh"));
            //Files.createFile(Paths.get("C:\\Users\\Lenovo\\Desktop\\i.iiiii"));
            Files.createDirectory(Paths.get("C:\\Users\\Lenovo\\Desktop\\bbb"));
            Path pa11 = Paths.get("C:\\Users\\Lenovo\\Desktop\\bbb");
            Path pa12 = Paths.get("C:\\Users\\Lenovo\\Desktop\\i.iiiii");
            Files.move(pa12,pa11,StandardCopyOption.ATOMIC_MOVE);

        } catch (FileNotFoundException fnfe) {

            fnfe.getLocalizedMessage();
            fnfe.printStackTrace();
            fnfe.getCause();

        } catch (IOException ioe) {

            ioe.getMessage();
            ioe.printStackTrace();

        } catch (ClassNotFoundException cnfe) {

            cnfe.getCause();
            cnfe.printStackTrace();

        }


    }
}

@classAnnotation
class Person<T> implements Serializable {

    public static final long PUID = 12345678L;
    public String name;
    public int age;
    public String address;
    T t;

    public Person() {

        ;

    }

    public Person(String name, int age, String address) {

        this();
        this.name = name;
        this.age = age;
        this.address = address;

    }


}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface classAnnotation {

    ;

}