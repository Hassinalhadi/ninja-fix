package com.checkout.components.redirecthandler.webview;

import androidx.appcompat.widget.P0;
import com.checkout.components.redirecthandler.webview.RedirectWebViewEventLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final RedirectWebViewEventLogger.ErrorType f5710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5711b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5712c;

    public a(RedirectWebViewEventLogger.ErrorType type, int i4, String description) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(description, "description");
        this.f5710a = type;
        this.f5711b = i4;
        this.f5712c = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5710a == aVar.f5710a && this.f5711b == aVar.f5711b && Intrinsics.areEqual(this.f5712c, aVar.f5712c);
    }

    public final int hashCode() {
        return this.f5712c.hashCode() + ((this.f5711b + (this.f5710a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        RedirectWebViewEventLogger.ErrorType errorType = this.f5710a;
        int i4 = this.f5711b;
        String str = this.f5712c;
        StringBuilder sb2 = new StringBuilder("WebViewError(type=");
        sb2.append(errorType);
        sb2.append(", code=");
        sb2.append(i4);
        sb2.append(", description=");
        return P0.gold(sb2, str, ")");
    }
}
