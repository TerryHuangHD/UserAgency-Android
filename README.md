# UserAgency-Android
[![Build Status](https://travis-ci.com/TerryHuangHD/UserAgency-Android.svg?branch=main)](https://travis-ci.com/TerryHuangHD/UserAgency-Android)
[![](https://jitpack.io/v/TerryHuangHD/UserAgency-Android.svg)](https://jitpack.io/#TerryHuangHD/UserAgency-Android)
[![GitHub license](https://img.shields.io/github/license/TerryHuangHD/UserAgency-Android)](https://github.com/TerryHuangHD/UserAgency-Android/blob/main/LICENSE)

UserAgency is an Android User-Agent generator library written in Java/Kotlin. Provides story-oriented usage, and comprehensive way to mock real life data.

# Download
You can download a jar from GitHub's [releases page](https://github.com/TerryHuangHD/UserAgency-Android/releases).

### Gradle

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency in your app build.gradle

```gradle
dependencies {
    implementation 'com.github.TerryHuangHD:UserAgency-Android:0.2'
}
```

### Maven

Add the JitPack repository to your build file

```maven
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Add the dependency

```maven
<dependency>
    <groupId>com.github.TerryHuangHD</groupId>
    <artifactId>UserAgency-Android</artifactId>
    <version>0.2</version>
</dependency>
```

# Usage

* Android Phone & Chrome:

```java
  new UserAgency()
      .setDevice(new AndroidPhone())
      .setApp(new Chrome())
      .getString();
```

# Support
Device \ App  | Chrome | Firefox | Safari
----- |  ----- | ----- | -----
Android Phone | ✅ | ✅ | ❌
iPhone | ✅ | ✅ | ✅
Mac | ✅ | ✅ | ✅
PC |  ✅ | ✅ | ❌

MIT License
--------

    Copyright (c) 2020 Terry Huang

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
