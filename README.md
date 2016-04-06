# ColorAlphaCalculator_Kotlin
```用 kotlin 编写的 Android 程序, 用来计算颜色透明度值```

>小练习:

>1,使用了 anko 编写界面

>2,练习了 kotlin 语法

>3,使用了 kotlin 和 java 互相调用


##Android Studio 配置 kotlin 的方法

找到 Android Studio 的 plugins

使用 Browse repository 方式

找到插件 :Kotlin 和 kotlin extensions for android


如果网络不好,也可以直接下载到本地,然后倒入到 Android Studio 中

[ kotlin 插件下载地址](https://plugins.jetbrains.com/plugin/6954?pr=androidstudio)

[ kotlin extensions for android 插件下载地址](https://plugins.jetbrains.com/plugin/7717?pr=androidstudio)


把 Module 中的 build.gradle 文件改成如下(按需修改)
```
apply plugin: 'android'
apply plugin: 'kotlin-android'

buildscript {
    repositories {
        mavenCentral()
        maven {
            url 'http://oss.sonatype.org/content/repositories/snapshots'
        }
    }
    dependencies {
        classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:0.1-SNAPSHOT'
    }
}

repositories {
    mavenCentral()
    maven {
        url 'http://oss.sonatype.org/content/repositories/snapshots'
    }
}

dependencies {
    compile 'org.jetbrains.kotlin:kotlin-stdlib:0.1-SNAPSHOT'
}

android {
    compileSdkVersion 21
    buildToolsVersion "21.1.2"

    defaultConfig {
        minSdkVersion 14
        targetSdkVersion 21
    }

    sourceSets {
        main.java.srcDirs += 'src/main/kotlin'
    }
}

dependencies {
    compile 'org.jetbrains.anko:anko:0.5-15'
}

```

在 main 文件夹中 建立一个与 java 文件夹同级的文件夹 kotlin.

建立好相应的 package , 就可以进行开发了.

看看 ColorAlphaCalculator_Kotlin 这个 Demo 就能了解个大概.

清单文件里面和正常的 activity 一样, 直接声明即可
