# ColorAlphaCalculator_Kotlin
```用kotlin编写的android程序, 用来计算颜色透明度值```

>小练习:

>1,使用了anko编写界面

>2,练习了kotlin语法

>3,使用了kotlin和java互相调用


##android studio配置kotlin的方法

找到android studio的plugins

使用Browse repository方式

找到插件:Kotlin 和 kotlin extensions for android


如果网络不好,也可以直接下载到本地,然后倒入到android studio中

[kotlin插件下载地址](https://plugins.jetbrains.com/plugin/6954?pr=androidstudio)

[kotlin extensions for android插件下载地址](https://plugins.jetbrains.com/plugin/7717?pr=androidstudio)


把module中的build.gradle文件改成如下(按需修改)
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

在main文件夹中 建立一个与java文件夹同级的文件夹kotlin.

建立好相应的package, 就可以进行开发了.

看看ColorAlphaCalculator_Kotlin这个demo就能了解个大概.

清单文件里面和正常的activity一样, 直接声明即可
