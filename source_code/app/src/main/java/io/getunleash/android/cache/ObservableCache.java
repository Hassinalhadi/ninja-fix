package io.getunleash.android.cache;

import com.clevertap.android.sdk.Constants;
import io.getunleash.android.DefaultUnleashKt;
import io.getunleash.android.data.Toggle;
import io.getunleash.android.data.UnleashState;
import io.getunleash.android.util.UnleashLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;
import vf.ad;
import xf.EnumC3340a;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.as;
import yf.au;
import zf.AbstractC3511a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lio/getunleash/android/cache/ObservableCache;", "Lio/getunleash/android/cache/ObservableToggleCache;", "Lio/getunleash/android/cache/ToggleCache;", "cache", "Lvf/ab;", "coroutineScope", "<init>", "(Lio/getunleash/android/cache/ToggleCache;Lvf/ab;)V", "", "", "Lio/getunleash/android/data/Toggle;", "read", "()Ljava/util/Map;", Constants.KEY_KEY, "get", "(Ljava/lang/String;)Lio/getunleash/android/data/Toggle;", "Lio/getunleash/android/data/UnleashState;", "state", "", "write", "(Lio/getunleash/android/data/UnleashState;)V", "Lyf/i;", "featuresReceived", "subscribeTo", "(Lyf/i;)V", "getUpdatesFlow", "()Lyf/i;", "Lio/getunleash/android/cache/ToggleCache;", "Lvf/ab;", "Lyf/as;", "newStateEventFlow", "Lyf/as;", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ObservableCache implements ObservableToggleCache {

    @NotNull
    private static final String TAG = "ObservableCache";

    @NotNull
    private final ToggleCache cache;

    @NotNull
    private final ab coroutineScope;

    @NotNull
    private as newStateEventFlow;

    public ObservableCache(@NotNull ToggleCache cache, @NotNull ab coroutineScope) {
        Intrinsics.echo(cache, "cache");
        Intrinsics.echo(coroutineScope, "coroutineScope");
        this.cache = cache;
        this.coroutineScope = coroutineScope;
        this.newStateEventFlow = AbstractC3428A.bravo(1, 0, EnumC3340a.purple, 2);
    }

    @Override // io.getunleash.android.cache.ToggleCache
    @Nullable
    public Toggle get(@NotNull String key) {
        Intrinsics.echo(key, "key");
        return this.cache.get(key);
    }

    @Override // io.getunleash.android.cache.ObservableToggleCache
    @NotNull
    public InterfaceC3439i getUpdatesFlow() {
        return new au(this.newStateEventFlow);
    }

    @Override // io.getunleash.android.cache.ToggleCache
    @NotNull
    public Map<String, Toggle> read() {
        return this.cache.read();
    }

    @Override // io.getunleash.android.cache.ObservableToggleCache
    public void subscribeTo(@NotNull InterfaceC3439i featuresReceived) {
        Intrinsics.echo(featuresReceived, "featuresReceived");
        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Subscribing to observable cache", null, 4, null);
        ad.zulu(this.coroutineScope, null, null, new ObservableCache$subscribeTo$1(featuresReceived, this, null), 3);
    }

    @Override // io.getunleash.android.cache.ToggleCache
    public void write(@NotNull UnleashState state) {
        Intrinsics.echo(state, "state");
        this.cache.write(state);
        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Done writing cache with " + ((Number) ((AbstractC3511a) this.newStateEventFlow).golf().getValue()).intValue() + " subscribers", null, 4, null);
        ad.zulu(this.coroutineScope, null, null, new ObservableCache$write$1(state, this, null), 3);
    }

    public /* synthetic */ ObservableCache(ToggleCache toggleCache, ab abVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(toggleCache, (i4 & 2) != 0 ? DefaultUnleashKt.getUnleashScope() : abVar);
    }
}
