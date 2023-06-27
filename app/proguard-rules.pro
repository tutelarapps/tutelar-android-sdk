-keep,allowobfuscation,allowshrinking interface retrofit2.Call
-keep,allowobfuscation,allowshrinking class retrofit2.Response
-keep,allowobfuscation,allowshrinking class kotlin.coroutines.** { *; }

-dontwarn io.tutelar.**
-keep class io.tutelar.** {*;}