package io.getunleash.android.cache;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import yf.InterfaceC3439i;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lio/getunleash/android/cache/ObservableToggleCache;", "Lio/getunleash/android/cache/ToggleCache;", "Lyf/i;", "Lio/getunleash/android/data/UnleashState;", "featuresReceived", "", "subscribeTo", "(Lyf/i;)V", "getUpdatesFlow", "()Lyf/i;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ObservableToggleCache extends ToggleCache {
    @NotNull
    InterfaceC3439i getUpdatesFlow();

    void subscribeTo(@NotNull InterfaceC3439i featuresReceived);
}
