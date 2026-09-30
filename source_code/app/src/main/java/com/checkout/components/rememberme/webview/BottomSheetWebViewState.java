package com.checkout.components.rememberme.webview;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003R+\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\fR+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR+\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/rememberme/webview/BottomSheetWebViewState;", "", "<init>", "()V", "", Constants.KEY_URL, "", "resetForNewUrl", "(Ljava/lang/String;)V", "", "expanded", "updateExpansionState", "(Z)V", "onPageStarted", "onPageFinished", "<set-?>", "a", "Landroidx/compose/runtime/ax;", "isLoading", "()Z", "setLoading", "b", "getCurrentUrl", "()Ljava/lang/String;", "setCurrentUrl", "currentUrl", "c", "isExpanded", "setExpanded", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetWebViewState {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ax isLoading = C0564b.zulu(Boolean.TRUE);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ax currentUrl = C0564b.zulu("");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ax isExpanded = C0564b.zulu(Boolean.FALSE);

    @NotNull
    public final String getCurrentUrl() {
        return (String) this.currentUrl.getValue();
    }

    public final boolean isExpanded() {
        return ((Boolean) this.isExpanded.getValue()).booleanValue();
    }

    public final boolean isLoading() {
        return ((Boolean) this.isLoading.getValue()).booleanValue();
    }

    public final void onPageFinished() {
        this.isLoading.setValue(Boolean.FALSE);
    }

    public final void onPageStarted() {
        this.isLoading.setValue(Boolean.TRUE);
    }

    public final void resetForNewUrl(@NotNull String url) {
        Intrinsics.echo(url, "url");
        this.isLoading.setValue(Boolean.TRUE);
        this.currentUrl.setValue(url);
    }

    public final void updateExpansionState(boolean expanded) {
        this.isExpanded.setValue(Boolean.valueOf(expanded));
    }
}
