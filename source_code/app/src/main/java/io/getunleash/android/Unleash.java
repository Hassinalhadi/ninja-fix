package io.getunleash.android;

import io.getunleash.android.data.Toggle;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.Variant;
import io.getunleash.android.events.UnleashListener;
import java.io.Closeable;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H'J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\bH'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0015\u001a\u00020\nH&J\b\u0010\u0016\u001a\u00020\nH&J\b\u0010\u0017\u001a\u00020\nH&J\b\u0010\u0018\u001a\u00020\nH&J\b\u0010\u0019\u001a\u00020\u0003H&J4\u0010\u001a\u001a\u00020\n2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cH&¨\u0006!À\u0006\u0003"}, d2 = {"Lio/getunleash/android/Unleash;", "Ljava/io/Closeable;", "isEnabled", "", "toggleName", "", "defaultValue", "getVariant", "Lio/getunleash/android/data/Variant;", "setContext", "", "context", "Lio/getunleash/android/data/UnleashContext;", "setContextWithTimeout", "timeout", "", "setContextAsync", "addUnleashEventListener", "listener", "Lio/getunleash/android/events/UnleashListener;", "removeUnleashEventListener", "refreshTogglesNow", "refreshTogglesNowAsync", "sendMetricsNow", "sendMetricsNowAsync", "isReady", "start", "eventListeners", "", "bootstrapFile", "Ljava/io/File;", "bootstrap", "Lio/getunleash/android/data/Toggle;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Unleash extends Closeable {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    void addUnleashEventListener(@NotNull UnleashListener listener);

    @NotNull
    Variant getVariant(@NotNull String toggleName);

    @c
    @NotNull
    Variant getVariant(@NotNull String toggleName, @NotNull Variant defaultValue);

    boolean isEnabled(@NotNull String toggleName);

    @c
    boolean isEnabled(@NotNull String toggleName, boolean defaultValue);

    boolean isReady();

    void refreshTogglesNow();

    void refreshTogglesNowAsync();

    void removeUnleashEventListener(@NotNull UnleashListener listener);

    void sendMetricsNow();

    void sendMetricsNowAsync();

    void setContext(@NotNull UnleashContext context);

    void setContextAsync(@NotNull UnleashContext context);

    void setContextWithTimeout(@NotNull UnleashContext context, long timeout);

    void start(@NotNull List<? extends UnleashListener> eventListeners, @Nullable File bootstrapFile, @NotNull List<Toggle> bootstrap);
}
