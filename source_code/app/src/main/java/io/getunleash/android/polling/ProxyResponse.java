package io.getunleash.android.polling;

import com.clevertap.android.sdk.Constants;
import io.getunleash.android.data.Toggle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/getunleash/android/polling/ProxyResponse;", "", "toggles", "", "Lio/getunleash/android/data/Toggle;", "<init>", "(Ljava/util/List;)V", "getToggles", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProxyResponse {

    @NotNull
    private final List<Toggle> toggles;

    public ProxyResponse(@NotNull List<Toggle> toggles) {
        Intrinsics.echo(toggles, "toggles");
        this.toggles = toggles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProxyResponse copy$default(ProxyResponse proxyResponse, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = proxyResponse.toggles;
        }
        return proxyResponse.copy(list);
    }

    @NotNull
    public final List<Toggle> component1() {
        return this.toggles;
    }

    @NotNull
    public final ProxyResponse copy(@NotNull List<Toggle> toggles) {
        Intrinsics.echo(toggles, "toggles");
        return new ProxyResponse(toggles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProxyResponse) && Intrinsics.areEqual(this.toggles, ((ProxyResponse) other).toggles);
    }

    @NotNull
    public final List<Toggle> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        return this.toggles.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProxyResponse(toggles=" + this.toggles + ')';
    }
}
