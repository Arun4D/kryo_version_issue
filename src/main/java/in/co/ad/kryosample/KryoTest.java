package in.co.ad.kryosample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

public class KryoTest {

    static public void main(String[] args) throws Exception {
        Kryo kryo = new Kryo();
        kryo.register(SomeClass.class);

        SomeClass object = new SomeClass();
        object.value = new Date();

        Map<String, SomeClass> map = new HashMap<>();
        map.put("1", object);

        SomeClassMap classMap = new SomeClassMap();
        classMap.setMap(map);

        Output output = new Output(new FileOutputStream("file.txt"));
        kryo.writeObject(output, classMap);
        output.close();

        Input input = new Input(new FileInputStream("file.txt"));
        SomeClassMap classMapAfter = kryo.readObject(input, SomeClassMap.class);
        System.out.println("After --> " + classMapAfter.getMap().get("1"));
        input.close();

    }

    static public class SomeClass {
        Date value;

        public Date getValue() {
            return value;
        }

        public void setValue(Date value) {
            this.value = value;
        }

    }

    static public class SomeClassMap {
        Map<String, SomeClass> map = new HashMap<>();

        public Map<String, SomeClass> getMap() {
            return map;
        }

        public void setMap(Map<String, SomeClass> map) {
            this.map = map;
        }

    }
}
