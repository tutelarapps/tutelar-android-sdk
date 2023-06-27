# Tutelar SDK

Tutelar are risk management experts. Our high powered tech-enabled solutions simplify fraud risk management and automates auxiliary business processes enabling companies to focus on its core products and services.

## Requirements

1. Use Android 6.0 (API level 23) and above.
2. Use Kotlin version 1.6.10 and above: example ```ext.kotlin_version = '1.6.10'```
3. _(optional)_ ```READ_PHONE_STATE``` permission for device_id
4. _(optional)_ ```ACCESS_FINE_LOCATION``` and ```ACCESS_COARSE_LOCATION``` for device location

> __Note:__ If the application does not have the listed permissions, the values collected using those permissions will be ignored. To provide a valid device fingerprint, we recommend employing as much permission as possible based on your use-case.

#### Step 1 - Add Dependency

Add the dependency in the app level build.gradle:
```
dependencies {
    implementation 'io.tutelar.android:0.0.1'
}
```

#### Step 2 - Initialize SDK

Add the following line of code to initialise it with the api key you obtained from the Tutelar merchant panel. If you don't have a api key create new one.
```
Tutelar tutelar = new Tutelar(context, "YOUR API KEY");
```

#### Step 3 - Implement Listener

Set and Implement our listener to receive the device detail

```
public class DemoActivity extends AppCompatActivity implements TutelarListener {
    @Override
    public void onSuccess(String data) {
        // Success Callback
    }

    @Override
    public void onFailure(String message) {
        // Failure Callback
    }
}
```
#### Step 4 - Getting Device Info

By passing listener, call the following function to receive the device info shown below.
```
tutelar.getDeviceDetails(this);
```
#### Step 5 - Progurad Rules (optional)

The proguard rules are already included in the SDK, If you encounter a problem when using Proguard use.
```
-keep,allowobfuscation,allowshrinking interface retrofit2.Call
-keep,allowobfuscation,allowshrinking class retrofit2.Response
-keep,allowobfuscation,allowshrinking class kotlin.coroutines.** { *; }

-dontwarn io.tutelar.**
-keep class io.tutelar.** {*;}
```
That's it for the integration, now send the obtained device fingerprint to the server.
