package io.getunleash.android.polling;

import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lio/getunleash/android/polling/FetchResponse;", "", "status", "Lio/getunleash/android/polling/Status;", Constants.KEY_CONFIG, "Lio/getunleash/android/polling/ProxyResponse;", RedirectCustomTabEventLogger.RESULT_ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lio/getunleash/android/polling/Status;Lio/getunleash/android/polling/ProxyResponse;Ljava/lang/Exception;)V", "getStatus", "()Lio/getunleash/android/polling/Status;", "getConfig", "()Lio/getunleash/android/polling/ProxyResponse;", "getError", "()Ljava/lang/Exception;", "isSuccess", "", "isNotModified", "isFailed", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FetchResponse {

    @Nullable
    private final ProxyResponse config;

    @Nullable
    private final Exception error;

    @NotNull
    private final Status status;

    public FetchResponse(@NotNull Status status, @Nullable ProxyResponse proxyResponse, @Nullable Exception exc) {
        Intrinsics.echo(status, "status");
        this.status = status;
        this.config = proxyResponse;
        this.error = exc;
    }

    public static /* synthetic */ FetchResponse copy$default(FetchResponse fetchResponse, Status status, ProxyResponse proxyResponse, Exception exc, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            status = fetchResponse.status;
        }
        if ((i4 & 2) != 0) {
            proxyResponse = fetchResponse.config;
        }
        if ((i4 & 4) != 0) {
            exc = fetchResponse.error;
        }
        return fetchResponse.copy(status, proxyResponse, exc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ProxyResponse getConfig() {
        return this.config;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    public final FetchResponse copy(@NotNull Status status, @Nullable ProxyResponse config, @Nullable Exception error) {
        Intrinsics.echo(status, "status");
        return new FetchResponse(status, config, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchResponse)) {
            return false;
        }
        FetchResponse fetchResponse = (FetchResponse) other;
        return this.status == fetchResponse.status && Intrinsics.areEqual(this.config, fetchResponse.config) && Intrinsics.areEqual(this.error, fetchResponse.error);
    }

    @Nullable
    public final ProxyResponse getConfig() {
        return this.config;
    }

    @Nullable
    public final Exception getError() {
        return this.error;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        ProxyResponse proxyResponse = this.config;
        int hashCode2 = (hashCode + (proxyResponse == null ? 0 : proxyResponse.hashCode())) * 31;
        Exception exc = this.error;
        return hashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final boolean isFailed() {
        return this.status.isFailed();
    }

    public final boolean isNotModified() {
        return this.status.isNotModified();
    }

    public final boolean isSuccess() {
        return this.status.isSuccess();
    }

    @NotNull
    public String toString() {
        return "FetchResponse(status=" + this.status + ", config=" + this.config + ", error=" + this.error + ')';
    }

    public /* synthetic */ FetchResponse(Status status, ProxyResponse proxyResponse, Exception exc, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i4 & 2) != 0 ? null : proxyResponse, (i4 & 4) != 0 ? null : exc);
    }
}
