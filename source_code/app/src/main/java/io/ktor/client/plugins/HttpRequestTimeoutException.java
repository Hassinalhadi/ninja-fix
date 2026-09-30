package io.ktor.client.plugins;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import fd.h;
import hd.an;
import hd.ao;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import od.C2227d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.aa;
import t6.AbstractC3001h2;
import vf.InterfaceC3217v;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "Lvf/v;", "", Constants.KEY_URL, "", "timeoutMillis", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "Lod/c;", "request", "(Lod/c;)V", "Lod/d;", "(Lod/d;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/lang/String;", "Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpRequestTimeoutException extends IOException implements InterfaceC3217v {

    @Nullable
    private final Long timeoutMillis;

    @NotNull
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpRequestTimeoutException(@NotNull C2226c request) {
        this(r4, r10 != null ? r10.alpha : null, null, 4, null);
        Intrinsics.echo(request, "request");
        aa aaVar = request.alpha;
        aaVar.alpha();
        StringBuilder sb2 = new StringBuilder(Barcode.FORMAT_QR_CODE);
        AbstractC3001h2.alpha(aaVar, sb2);
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        an anVar = an.alpha;
        Map map = (Map) request.foxtrot.echo(h.alpha);
        ao aoVar = (ao) (map != null ? map.get(anVar) : null);
    }

    @Override // vf.InterfaceC3217v
    @NotNull
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l10, Throwable th, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l10, (i4 & 4) != 0 ? null : th);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpRequestTimeoutException(@NotNull String url, @Nullable Long l10, @Nullable Throwable th) {
        super(P0.emerald(r0, l10 == null ? "unknown" : l10, " ms]"), th);
        Intrinsics.echo(url, "url");
        StringBuilder sb2 = new StringBuilder("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        this.url = url;
        this.timeoutMillis = l10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpRequestTimeoutException(@NotNull C2227d request) {
        this(r2, r8 != null ? r8.alpha : null, null, 4, null);
        Intrinsics.echo(request, "request");
        String str = request.alpha.teal;
        ao aoVar = (ao) request.alpha();
    }
}
