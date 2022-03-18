# Getting Started

This sample project to test Kryo Object write to file in one version and read from another version.

This to replicate Serialization trace on date

````
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.esotericsoftware.reflectasm.AccessClassLoader (file:/home/arun/.gradle/caches/modules-2/files-2.1/com.esotericsoftware.kryo/kryo/2.21/9a4e69cff8d225729656f7e97e40893b23bffef/kryo-2.21.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int)
WARNING: Please consider reporting this to the maintainers of com.esotericsoftware.reflectasm.AccessClassLoader
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Exception in thread "main" com.esotericsoftware.kryo.KryoException: Unable to find class: 
                                                                                          java.util.Date
Serialization trace:
map (in.co.ad.kryosample.KryoTest$SomeClassMap)
        at com.esotericsoftware.kryo.util.DefaultClassResolver.readName(DefaultClassResolver.java:138)
        at com.esotericsoftware.kryo.util.DefaultClassResolver.readClass(DefaultClassResolver.java:115)
        at com.esotericsoftware.kryo.Kryo.readClass(Kryo.java:610)
        at com.esotericsoftware.kryo.Kryo.readClassAndObject(Kryo.java:721)
        at com.esotericsoftware.kryo.serializers.MapSerializer.read(MapSerializer.java:134)
        at com.esotericsoftware.kryo.serializers.MapSerializer.read(MapSerializer.java:17)
        at com.esotericsoftware.kryo.Kryo.readObject(Kryo.java:648)
        at com.esotericsoftware.kryo.serializers.FieldSerializer$ObjectField.read(FieldSerializer.java:605)
        at com.esotericsoftware.kryo.serializers.FieldSerializer.read(FieldSerializer.java:221)
        at com.esotericsoftware.kryo.Kryo.readObject(Kryo.java:626)
        at in.co.ad.kryosample.KryoTest.main(KryoTest.java:34)
Caused by: java.lang.ClassNotFoundException: 
                                             java.util.Date
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:398)
        at com.esotericsoftware.kryo.util.DefaultClassResolver.readName(DefaultClassResolver.java:136)
        ... 10 more
````