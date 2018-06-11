<<<<<<< HEAD


## 一个超轻量级，简单好用的多文件选择器。

# JTFilePicker [![jCenter](https://img.shields.io/badge/jCenter-1.3.2-green.svg)](https://bintray.com/william198824/maven/JTFilePicker/_latestVersion)  [![License](https://img.shields.io/badge/License-Apache--2.0%20-blue.svg)](./LICENSE)


![image](jtfilepicker.gif)
### 功能：

1. 支持自定义文件图标
2. 以字符串集合返回
3. 超级轻量，超级简单
4. 基于kotlin

### 安装：
首先在你的项目配置kotlin环境,
在你的moudle里添加如下代码：
```
dependencies {
    ......
    implementation 'com.william:JTFilePicker:1.3.2'
}
```
### 用法：
#### Kotlin(推荐):
```kotlin
/**
* kotlin启动
* @param 参数1：可以是activity或者fragment
*/
JTFilePicker.from(activity||fragment, object :OnFileIconLoadListener{
    override fun fileIconLoad(imageView: ImageView, fileBean: FileBean) {
        when (fileBean.extension) {
            "txt" ->
                //可以用普通方式设置drawable
                imageView.setImageDrawable(R.drawable.txt)
            "jpg"->//图片类型可以直接在图标中预览
                //推荐完全交给Glide或者其他图片加载框架
                Glide.with(context).load(fileBean.path).into(imageView)
        }
    }
})
//可选，设置首页路径（即能打开的根目录）默认为内存卡根目录
//.setRoot(Environment.getExternalStorageDirectory().path)
.open(0)

/**
* kotlin接收
*/
override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    if (resultCode == Activity.RESULT_OK){
        Toast.makeText(this,"已成功：${data!!.getStringArrayListExtra("paths")}",Toast.LENGTH_SHORT).show()
    } else {
        Toast.makeText(this,"已取消",Toast.LENGTH_SHORT).show()
    }
}
```
#### java:
```java
/**
* java 启动
* @param 参数1：可以是activity或者fragment
*/
JTFilePicker.Companion.from(this, new OnFileIconLoadListener() {
    @Override
    public void fileIconLoad(ImageView imageView, FileBean fileBean) {
        switch (fileBean.getExtension()) {
            case "txt":
                //可以用普通方式设置drawable
                imageView.setImageDrawable(R.drawable.txt);
                break;
            case "jpg"://图片类型可以直接在图标中预览
                //推荐完全交给Glide或者其他图片加载框架
                Glide.with(context).load(fileBean.getPath()).into(imageView);
                break;
                default:
        }

    }
})
//可选，设置首页路径（即能打开的根目录）默认为内存卡根目录
//.setRoot(Environment.getExternalStorageDirectory().path)
.open(0);

/**
* java java接收
*/
@Override
public void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (resultCode == Activity.RESULT_CANCELED) {
        return;
    }
    switch (requestCode) {
        case REQUEST_PICK_FILE://从选择文件页面返回
            List<String> paths = data.getStringArrayListExtra("paths");
        break;
        default:
    }
}
```
## License

    Copyright 2018 william Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
=======
# JTFilePicker

#### 项目介绍
用到的远程依赖库

#### 软件架构
软件架构说明


#### 安装教程

1. xxxx
2. xxxx
3. xxxx

#### 使用说明

1. xxxx
2. xxxx
3. xxxx

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [http://git.mydoc.io/](http://git.mydoc.io/)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
>>>>>>> 234f2ed5067445ee4a0061457e336f20836dfc99
