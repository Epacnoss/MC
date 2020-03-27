package tests.getInstances;

import java.util.ArrayList;

public class testObj implements SingletonObj {

    public static ArrayList<testObj> allObjs = new ArrayList<>();

    public testObj() {
        System.out.println("testObj created");
        OnStart();
    }

    public void speak () {
        System.out.println("spoken: " + hashCode());
    }

    public void OnStart() {
        allObjs.add(this);
    }

    public void OnDestroy() {
        allObjs.remove(this);
    }

    public static void main(String[] args) {
        ArrayList<testObj> list = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            list.add(new testObj());

        for(testObj t : testObj.allObjs)
            t.speak();
    }
}
