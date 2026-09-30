package io.getunleash.android.polling;

import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import io.getunleash.android.data.Toggle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lio/getunleash/android/polling/ToggleResponse;", "", "status", "Lio/getunleash/android/polling/Status;", "toggles", "", "", "Lio/getunleash/android/data/Toggle;", RedirectCustomTabEventLogger.RESULT_ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lio/getunleash/android/polling/Status;Ljava/util/Map;Ljava/lang/Exception;)V", "getStatus", "()Lio/getunleash/android/polling/Status;", "getToggles", "()Ljava/util/Map;", "getError", "()Ljava/lang/Exception;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToggleResponse {

    @Nullable
    private final Exception error;

    @NotNull
    private final Status status;

    @NotNull
    private final Map<String, Toggle> toggles;

    public ToggleResponse(@NotNull Status status, @NotNull Map<String, Toggle> toggles, @Nullable Exception exc) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(toggles, "toggles");
        this.status = status;
        this.toggles = toggles;
        this.error = exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToggleResponse copy$default(ToggleResponse toggleResponse, Status status, Map map, Exception exc, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            status = toggleResponse.status;
        }
        if ((i4 & 2) != 0) {
            map = toggleResponse.toggles;
        }
        if ((i4 & 4) != 0) {
            exc = toggleResponse.error;
        }
        return toggleResponse.copy(status, map, exc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final Map<String, Toggle> component2() {
        return this.toggles;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    public final ToggleResponse copy(@NotNull Status status, @NotNull Map<String, Toggle> toggles, @Nullable Exception error) {
        Intrinsics.echo(status, "status");
        Intrinsics.echo(toggles, "toggles");
        return new ToggleResponse(status, toggles, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleResponse)) {
            return false;
        }
        ToggleResponse toggleResponse = (ToggleResponse) other;
        return this.status == toggleResponse.status && Intrinsics.areEqual(this.toggles, toggleResponse.toggles) && Intrinsics.areEqual(this.error, toggleResponse.error);
    }

    @Nullable
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final Map<String, Toggle> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        int hashCode = (this.toggles.hashCode() + (this.status.hashCode() * 31)) * 31;
        Exception exc = this.error;
        return hashCode + (exc == null ? 0 : exc.hashCode());
    }

    @NotNull
    public String toString() {
        return "ToggleResponse(status=" + this.status + ", toggles=" + this.toggles + ", error=" + this.error + ')';
    }

    public /* synthetic */ ToggleResponse(Status status, Map map, Exception exc, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i4 & 2) != 0 ? t.alpha : map, (i4 & 4) != 0 ? null : exc);
    }
}
