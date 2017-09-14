# Belaris Dialogs

[![](https://jitpack.io/v/belaris-dev/dialogs-lib.svg)](https://jitpack.io/#belaris-dev/dialogs-lib)

The easy way to create AlertDialogs in Android projects.

## How to install

### Step 1

Add it in your root build.gradle:

```Gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

### Step 2

Add the dependecy:

```Gradle
dependencies {
  compile 'com.github.belaris-dev:dialogs-lib:latest.release.here'
}
```

## How to use

* Create a **default** dialog:

```java
BelarisDialog dialog = new BelarisDialog(context, "Title", "Message!");
dialog.showDialog();
```

* Create a **custom** dialog:

```java
BelarisDialog dialog = new BelarisCustomDialog(this, R.layout.your_custom_dialog_layout) {
    @Override
    protected void configCustomViews(View rootView) {
        // Instantiate your views here. i.e:
        TextView textView = rootView.findViewById(R.id.text);
    }
};
dialog.showDialog();
```

* Add default buttons:

```java
dialog.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
         // Positive behavior
    }
});

dialog.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        // Negative behavior
    }
});
```


## License

```
Copyright 2017 Belaris Development

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
