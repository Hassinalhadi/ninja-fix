package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\b2\u001c\u0010\u0007\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/EmulatorPathSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/emulator_path/EmulatorPathResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b3 {

    @NotNull
    public static final b3 alpha = new Object();
    public static final String bravo = P28427.r6.echo.vD14832N6715();

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        component2.b bVar;
        boolean z2 = n14263a23323 instanceof component8;
        String str = bravo;
        if (z2) {
            return new C1282y1(str, (List) ((component8) n14263a23323).component9);
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
