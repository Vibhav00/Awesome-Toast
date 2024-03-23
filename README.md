# Awesome Toast - Stylish Kotlin Toast Library for Android. 🔥😍💖

[![platform](https://img.shields.io/badge/platform-Android-green.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=24)
[![GitHub license](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)

A Stylish Kotlin Toast Library for Android Apps 😍🤗

![GitHub Cards Preview](./awesometoastpsd.png)

## Preview - Awesome Toast 🌟🌟🌟

<img src = "./working.gif" width="300px" />

# Types of Toast 😍

<table style="width:100%">
  <tr>
    <th> Success Toast </th>
    <th> Warning Toast </th> 
    <th> Failure Toast </th>
    <th> Default Toast</th> 
  </tr>
  <tr>
    <td><img src = "./success.jpg"  /></td> 
    <td><img src = "./worning.jpg"/></td>
    <td><img src = "./fail.jpg"/></td> 
    <td><img src = "./default.jpg"/></td> 
   
  </tr>
</table>

## About

An impressive and versatile Kotlin-based Android library is here to elevate your app experience with its stunning and multi-functional Awesome Toast component.

## Dependency Project Level

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

if this shows <b>Error</b> in your android studio paste this

```
	allprojects {
		repositories {
			...
			    maven { url = uri("https://www.jitpack.io" ) }
		}
	}

```

## Dependency App Level

Add dependency in your app module

```
	dependencies {
	         implementation 'com.github.Vibhav00:awesometoast:1.0.0'
	}

```

## Eight Toast Types 🎱

```
        1. TOAST_SUCCESS
        3. TOAST_WARNING
        5. TOAST_DELETE
        2. TOAST_ERROR
        4. TOAST_INFO
        6. TOAST_NO_INTERNET
        7. TOAST_PERMISSIONS_REQUIRED
        8. TOAST_DEFAULT
```

## Toast Duration ⌛️

```
        1. LENGTH_LONG // 3 Seconds
        2. LENGTH_SHORT // 2 Seconds

```

## Usage

# Sample Code for - Awesome Toast 🌟🤗🤩

### Success Toast 🎉🏆🌟

```
  AwesomeToast.createToast(
                    this@MainActivity,
                    "Successfully Saved 😊 ",
                    "Your item was saved successfully ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.SUCCESS,
                )

```

### Warning Toast ⚠️🚨⛔

```
  AwesomeToast.createToast(
                    this@MainActivity,
                    "Provide strong password ⚠️ ",
                    "password must contain one number ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.WARNING,
                )


```

### Delete Toast ❌🗑️🔥

```
      AwesomeToast.createToast(
                    this@MainActivity,
                    "Item Deleted 🗑️",
                    "item was  deleted ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.DELETE,
                )
```

### Error Toast ❌⚠️🚫

```
 AwesomeToast.createToast(
                    this@MainActivity,
                    "Failed to Save 🙁",
                    "Error while saving the item  ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.ERROR,
                )


```

### Info Toast 💡📋ℹ️

```
       AwesomeToast.createToast(
                    this@MainActivity,
                    "Please Enter Email 💡 ",
                    "Email Should not be Empty ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.INFO,
                )
```

### No Internet Toast 📵🌐🚫

```
       AwesomeToast.createToast(
                    this@MainActivity,
                    "Connection Problem  🌐",
                    "internet or wifi is not available ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.NO_INTERNET,
                )

```

### Permission Required Toast 🔒📝🛑

```
   AwesomeToast.createToast(
                    this@MainActivity,
                    "Permission Required 🔒",
                    "Permission for internet is Required ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.PERMISSION_REQUIRED,
                )
```

### Default Toast 🔄📜🆗

```
     AwesomeToast.createToast(
                    this@MainActivity,
                    "Hello Everyone 🖐",
                    "Welcome to this app ",
                    Toast.LENGTH_SHORT,
                    AwesomeToastStyles.DEFAULT,
                )
```

## License

```


Copyright © 2024 Vibhav Kumar

This file is licensed under the Apache License, Version 2.0. You are permitted to use this file only in accordance with the terms of the License. You may obtain a copy of the License at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.




```
