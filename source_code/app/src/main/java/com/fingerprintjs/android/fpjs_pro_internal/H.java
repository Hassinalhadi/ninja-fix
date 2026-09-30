package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ApkPathSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/apk_path/ApkPathResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class H {

    @NotNull
    public static final H alpha = new Object();
    public static final String bravo = P28427.Q5.echo.vD14832N6715();

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        component2.b bVar;
        boolean z2 = n14263a23323 instanceof component8;
        String str = bravo;
        if (z2) {
            return new C1282y1(str, (String) ((component8) n14263a23323).component9);
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
