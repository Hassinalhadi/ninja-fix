package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2 \u0010\b\u001a\u001c\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000e\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0002*\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ThreadsInfoSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/threads_info/ThreadsInfo;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/threads_info/ThreadsInfoResult;", "threadsInfoResult", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "withReducedInfoSize$fpjs_pro_release", "(Ljava/util/List;)Lcom/cloned/github/michaelbull/result/Result;", "withReducedInfoSize", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class X1 {

    @NotNull
    public static final X1 alpha = new Object();
    public static final String bravo = P28427.t6.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0138, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001b, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.X1.delta = ((r1 ^ 97) + ((r1 & 97) << 1)) % 128;
        r10 = (java.util.List) ((com.fingerprintjs.android.fpjs_pro_internal.component8) r10).component9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002b, code lost:
    
        r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r10, 10);
        r0 = new java.util.ArrayList(r1);
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        r1 = com.fingerprintjs.android.fpjs_pro_internal.X1.delta;
        com.fingerprintjs.android.fpjs_pro_internal.X1.charlie = ((r1 & 99) + (r1 | 99)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r10.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.lines(new kotlin.text.Regex(com.fingerprintjs.android.fpjs_pro_internal.P28427.C1145u1.echo.vD14832N6715()).foxtrot((java.lang.String) r10.next(), com.fingerprintjs.android.fpjs_pro_internal.P28427.C1173y1.echo.vD14832N6715()));
        r4 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.X1.delta = (com.fingerprintjs.android.fpjs_pro_internal.X1.charlie + 37) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if ((!r1.hasNext()) == true) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r5 = com.fingerprintjs.android.fpjs_pro_internal.X1.delta;
        r6 = (r5 ^ 125) + ((r5 & 125) << 1);
        com.fingerprintjs.android.fpjs_pro_internal.X1.charlie = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if ((r6 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        r5 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if (kotlin.text.StringsKt.gray((java.lang.String) r5) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        kotlin.text.StringsKt.gray((java.lang.String) r1.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        r0.add(kotlin.collections.CollectionsKt.maroon(r4, com.fingerprintjs.android.fpjs_pro_internal.P28427.S1.echo.vD14832N6715(), null, null, null, 62));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if ((r10 instanceof com.fingerprintjs.android.fpjs_pro_internal.component8) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        r0 = new com.fingerprintjs.android.fpjs_pro_internal.component8(kotlin.collections.CollectionsKt.coral(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r10 = com.fingerprintjs.android.fpjs_pro_internal.X1.delta;
        com.fingerprintjs.android.fpjs_pro_internal.X1.charlie = ((r10 & 93) + (r10 | 93)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        r0 = new com.fingerprintjs.android.fpjs_pro_internal.setTopP6481(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0019, code lost:
    
        if ((r10 instanceof com.fingerprintjs.android.fpjs_pro_internal.component8) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00ee, code lost:
    
        if ((r10 instanceof com.fingerprintjs.android.fpjs_pro_internal.setTopP6481) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00f0, code lost:
    
        r1 = r1 + 53;
        com.fingerprintjs.android.fpjs_pro_internal.X1.delta = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00f8, code lost:
    
        if ((r1 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00fa, code lost:
    
        r3 = 1 / 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        N14263A23323 settopp6481;
        int i4 = delta + 93;
        int i5 = i4 % 128;
        charlie = i5;
        if (i4 % 2 != 0) {
            int i10 = 92 / 0;
        }
        boolean z2 = n14263a23323 instanceof component8;
        String str = bravo;
        if (!z2) {
            return new C1282y1(str, (List) ((component8) n14263a23323).component9);
        }
        if (n14263a23323 instanceof setTopP6481) {
            C1278x1 c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
            int i11 = delta + 53;
            charlie = i11 % 128;
            if (i11 % 2 == 0) {
                return c1278x1;
            }
            throw null;
        }
        throw new NoWhenBranchMatchedException();
        n14263a23323 = settopp6481;
        int i12 = (charlie + 109) % 128;
        delta = i12;
        charlie = (i12 + 41) % 128;
        boolean z22 = n14263a23323 instanceof component8;
        String str2 = bravo;
        if (!z22) {
        }
    }
}
