# XXUtils 使用方式
##  添加依赖
1.在project目录的build.gradle的allprojects节点添加
```java maven { url "https://jitpack.io" }```
如下:
```java
    allprojects {
        repositories {
            jcenter()
            maven { url "https://jitpack.io" }
        }
    }
```
2.在自己Modul的build.gradle中添加```compile 'com.github.luoshihai:XXUtils:V1.0.0'```
如下:
```java
dependencies {
	        compile 'com.github.luoshihai:XXUtils:V1.0.0'
	}
```
## 使用方法  
由于是工具类方法  量大 不好描叙  可以自己下源码看  注释写的很清晰  
