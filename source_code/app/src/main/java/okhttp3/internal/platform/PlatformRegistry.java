package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import ao.ad;
import kotlin.Metadata;
import okhttp3.internal.platform.android.AndroidLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/platform/PlatformRegistry;", "", "<init>", "()V", "findPlatform", "Lokhttp3/internal/platform/Platform;", "isAndroid", "", "()Z", "value", "Landroid/content/Context;", "applicationContext", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformRegistry {

    @NotNull
    public static final PlatformRegistry INSTANCE = new PlatformRegistry();

    private PlatformRegistry() {
    }

    @NotNull
    public final Platform findPlatform() {
        AndroidLog.INSTANCE.enable();
        Platform buildIfSupported = Android10Platform.INSTANCE.buildIfSupported();
        if (buildIfSupported == null) {
            buildIfSupported = AndroidPlatform.INSTANCE.buildIfSupported();
        }
        if (buildIfSupported != null) {
            return buildIfSupported;
        }
        throw new IllegalStateException(ad.zulu(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
    }

    @Nullable
    public final Context getApplicationContext() {
        ContextAwarePlatform contextAwarePlatform;
        Object obj = Platform.INSTANCE.get();
        if (obj instanceof ContextAwarePlatform) {
            contextAwarePlatform = (ContextAwarePlatform) obj;
        } else {
            contextAwarePlatform = null;
        }
        if (contextAwarePlatform == null) {
            return null;
        }
        return contextAwarePlatform.getApplicationContext();
    }

    public final boolean isAndroid() {
        return true;
    }

    public final void setApplicationContext(@Nullable Context context) {
        ContextAwarePlatform contextAwarePlatform;
        Object obj = Platform.INSTANCE.get();
        if (obj instanceof ContextAwarePlatform) {
            contextAwarePlatform = (ContextAwarePlatform) obj;
        } else {
            contextAwarePlatform = null;
        }
        if (contextAwarePlatform != null) {
            contextAwarePlatform.setApplicationContext(context);
        }
    }
}
