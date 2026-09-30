package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001JG\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\n2&\u0010\t\u001a\"\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/RequestedPermissionsSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/requested_permisssions/RequestedPermissions;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/requested_permisssions/RequestedPermissionsResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class G {

    @NotNull
    public static final G alpha = new Object();
    public static final String bravo = P28427.C1024d.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        int i4 = charlie;
        delta = ((i4 & 13) + (i4 | 13)) % 128;
        boolean z2 = n14263a23323 instanceof component8;
        String str = bravo;
        if (z2) {
            return new C1282y1(str, (Map) ((component8) n14263a23323).component9);
        }
        if (n14263a23323 instanceof setTopP6481) {
            C1278x1 c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
            int i5 = delta;
            int i10 = (i5 & 23) + (i5 | 23);
            charlie = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 / 0;
            }
            return c1278x1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
