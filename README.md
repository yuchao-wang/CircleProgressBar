## CircleProgressBar For Android

- min sdk 15(Android 4.0.3)

### Demo

[Download](https://codeload.github.com/yuchao-wang/CircleProgressBar/zip/master)

![pic is here](https://github.com/yuchao-wang/CircleProgressBar/blob/master/image/screenshot.gif)

### Update

#### 1.0.0 
- 2016/04/28 Basic Function

### Dependence 

```
compile 'wang.yuchao.android.library.view.circleprogressbar:CircleProgressBarLibrary:1.0.0'
```

### How To Use

**xml file**

```
    <wang.yuchao.android.library.view.circleprogressbar.CircleProgressBar
        android:id="@+id/circleProgressBar1"
        android:layout_width="108dp"
        android:layout_height="108dp"
        ProgressCircleView:isSolid="false"
        ProgressCircleView:progress="0"
        ProgressCircleView:ringWidth="10px"
        ProgressCircleView:textColor="@android:color/holo_red_dark"
        ProgressCircleView:textShown="true"
        ProgressCircleView:textSize="13sp"/>
```

**declarations**

|param|statement|
|:---|:---|
|isSolid|whether is ring or solid|
|progress|progress（0-100）|
|ringWidth|the width of ring|
|textColor|text color|
|textShown|whether show text or not|
|textSize|font size|
|backgroundColor|backgroundColor|
|foregroundColor|foregroundColor|

### Proguard

```
-keep class wang.yuchao.android.library.** { *; }
-dontwarn wang.yuchao.android.library.**
```

### [About Me](http://yuchao.wang)

### License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```