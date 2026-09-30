package io.getunleash.android.cache;

import com.clevertap.android.sdk.Constants;
import io.getunleash.android.data.Toggle;
import io.getunleash.android.data.UnleashState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/getunleash/android/cache/InMemoryToggleCache;", "Lio/getunleash/android/cache/ToggleCache;", "<init>", "()V", "internalCache", "", "", "Lio/getunleash/android/data/Toggle;", "read", "get", Constants.KEY_KEY, "write", "", "state", "Lio/getunleash/android/data/UnleashState;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InMemoryToggleCache implements ToggleCache {

    @NotNull
    private volatile Map<String, Toggle> internalCache = t.alpha;

    @Override // io.getunleash.android.cache.ToggleCache
    @Nullable
    public Toggle get(@NotNull String key) {
        Intrinsics.echo(key, "key");
        return this.internalCache.get(key);
    }

    @Override // io.getunleash.android.cache.ToggleCache
    @NotNull
    public Map<String, Toggle> read() {
        return this.internalCache;
    }

    @Override // io.getunleash.android.cache.ToggleCache
    public void write(@NotNull UnleashState state) {
        Intrinsics.echo(state, "state");
        this.internalCache = state.getToggles();
    }
}
