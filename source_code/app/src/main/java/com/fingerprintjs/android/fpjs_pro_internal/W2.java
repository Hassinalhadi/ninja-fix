package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\u00030\b2\u001c\u0010\u0007\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/MountsInfoSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/mounts_info/MountInfo;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/mounts_info/MountsInfoResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class W2 {

    @NotNull
    public static final W2 alpha = new Object();
    public static final String bravo = P28427.C1121q5.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.W2, java.lang.Object] */
    static {
        if ((((1 | 77) << 1) - (1 ^ 77)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        int collectionSizeOrDefault;
        int i4 = delta;
        int i5 = ((i4 | 63) << 1) - (i4 ^ 63);
        charlie = i5 % 128;
        if (i5 % 2 == 0) {
            boolean z2 = n14263a23323 instanceof component8;
            String str = bravo;
            if (z2) {
                List list = (List) ((component8) n14263a23323).component9;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                int i10 = delta;
                charlie = ((i10 & 89) + (i10 | 89)) % 128;
                for (Object obj : list) {
                    int i11 = charlie;
                    delta = ((i11 & 57) + (i11 | 57)) % 128;
                    String vD14832N6715 = P28427.ae.echo.vD14832N6715();
                    try {
                        Object D8871 = uH18377.D8871(1294116165);
                        if (D8871 == null) {
                            D8871 = uH18377.setPivotYN16904((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63, 463 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29264), -1835464816, false, "component5", new Class[0]);
                        }
                        Pair pair = new Pair(vD14832N6715, ((Method) D8871).invoke(obj, null));
                        String vD14832N67152 = P28427.C1180z1.echo.vD14832N6715();
                        Object D88712 = uH18377.D8871(1294120009);
                        if (D88712 == null) {
                            D88712 = uH18377.setPivotYN16904(View.MeasureSpec.getSize(0) + 64, (ViewConfiguration.getScrollBarSize() >> 8) + 463, (char) (29265 - View.resolveSize(0, 0)), -1835460964, false, "component9", new Class[0]);
                        }
                        Pair pair2 = new Pair(vD14832N67152, ((Method) D88712).invoke(obj, null));
                        String vD14832N67153 = P28427.V4.echo.vD14832N6715();
                        Object D88713 = uH18377.D8871(-679723718);
                        if (D88713 == null) {
                            D88713 = uH18377.setPivotYN16904(TextUtils.getTrimmedLength("") + 64, 464 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (Color.green(0) + 29265), 147300335, false, "setPivotYN16904", new Class[0]);
                        }
                        arrayList.add(kotlin.collections.y.sierra(pair, pair2, new Pair(vD14832N67153, ((Method) D88713).invoke(obj, null))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                return new C1282y1(str, arrayList);
            }
            if (n14263a23323 instanceof setTopP6481) {
                C1278x1 c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
                int i12 = delta;
                int i13 = ((i12 | 119) << 1) - (i12 ^ 119);
                charlie = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 13 / 0;
                }
                return c1278x1;
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z10 = n14263a23323 instanceof component8;
        throw null;
    }
}
