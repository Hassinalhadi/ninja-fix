package io.getunleash.android.data;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/getunleash/android/data/UnleashState;", "", "context", "Lio/getunleash/android/data/UnleashContext;", "toggles", "", "", "Lio/getunleash/android/data/Toggle;", "<init>", "(Lio/getunleash/android/data/UnleashContext;Ljava/util/Map;)V", "getContext", "()Lio/getunleash/android/data/UnleashContext;", "getToggles", "()Ljava/util/Map;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UnleashState {

    @NotNull
    private final UnleashContext context;

    @NotNull
    private final Map<String, Toggle> toggles;

    public UnleashState(@NotNull UnleashContext context, @NotNull Map<String, Toggle> toggles) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(toggles, "toggles");
        this.context = context;
        this.toggles = toggles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnleashState copy$default(UnleashState unleashState, UnleashContext unleashContext, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            unleashContext = unleashState.context;
        }
        if ((i4 & 2) != 0) {
            map = unleashState.toggles;
        }
        return unleashState.copy(unleashContext, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UnleashContext getContext() {
        return this.context;
    }

    @NotNull
    public final Map<String, Toggle> component2() {
        return this.toggles;
    }

    @NotNull
    public final UnleashState copy(@NotNull UnleashContext context, @NotNull Map<String, Toggle> toggles) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(toggles, "toggles");
        return new UnleashState(context, toggles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnleashState)) {
            return false;
        }
        UnleashState unleashState = (UnleashState) other;
        return Intrinsics.areEqual(this.context, unleashState.context) && Intrinsics.areEqual(this.toggles, unleashState.toggles);
    }

    @NotNull
    public final UnleashContext getContext() {
        return this.context;
    }

    @NotNull
    public final Map<String, Toggle> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        return this.toggles.hashCode() + (this.context.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UnleashState(context=" + this.context + ", toggles=" + this.toggles + ')';
    }
}
