package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001JG\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\t2$\u0010\b\u001a \u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/DevToolsDetectionSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/dev_tools/DevToolsDetectionSignalResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class R2 {

    @NotNull
    public static final R2 alpha = new Object();
    public static final String bravo = P28427.C1045g.echo.vD14832N6715();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.R2] */
    static {
        if (((1 ^ 43) + ((1 & 43) << 1)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        component2.b bVar;
        boolean z2 = n14263a23323 instanceof component8;
        String str = bravo;
        if (z2) {
            return new C1282y1(str, (Map) ((component8) n14263a23323).component9);
        }
        if (n14263a23323 instanceof setTopP6481) {
            Throwable th = (Throwable) ((setTopP6481) n14263a23323).vD14832N6715;
            if (!(th instanceof bd) && !(th.getCause() instanceof bd)) {
                bVar = component2.b.a.foxtrot;
            } else {
                bVar = component2.b.C0008b.foxtrot;
            }
            return new C1278x1(str, null, bVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
