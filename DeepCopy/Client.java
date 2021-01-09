package DeepCopy;

public class Client {
    public static void main(String[] arg) throws Exception {
        DeepProtoType p = new DeepProtoType();
        p.name = "AAA";
        p.deepCloneableTarget = new DeepCloneableTarget("11", "22");
        
        DeepProtoType p1 = (DeepProtoType)p.clone();
        DeepProtoType p2 = (DeepProtoType)p.deepClone();
        System.out.println("p:" + p.deepCloneableTarget.hashCode());
        System.out.println("p1:" + p1.deepCloneableTarget.hashCode());
        System.out.println("p2:" + p2.deepCloneableTarget.hashCode());

    }
}
