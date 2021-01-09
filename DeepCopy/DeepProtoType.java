package DeepCopy;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    public String name; // String attribute
    public DeepCloneableTarget deepCloneableTarget; // Reference attribute
    public DeepProtoType() {
        super();
    }

    // 浅拷贝 shallow copy
    @Override
    protected Object clone() {
        DeepProtoType copy = null;
        try {
            copy = (DeepProtoType)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return copy;
    }
    // Method 1: use clone()
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     Object deep = null;
    //     deep = super.clone(); // clone the basic value prama and String param
    //     DeepProtoType deepProtoType = (DeepProtoType)deep;
    //     deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
    //     // 这里是这样的，新建了DeepProtoType 变量，这是还是浅复制，然后，将新的变量里面的 引用类型变量重新申明新地址并赋值

    //     return deepProtoType;
    // }

    // Method 2: use Serialize;
    public Object deepClone() {
        // create the steam object;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        
        try {
            // Serialize;
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式输出
            // Deserialize;
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();

            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
