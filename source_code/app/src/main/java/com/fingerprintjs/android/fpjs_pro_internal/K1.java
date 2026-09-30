package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bÁ\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/K1;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class K1 {

    @NotNull
    public static final K1 alpha = new Object();
    public static final String bravo = P28427.C1150v.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.K1] */
    static {
        if (99 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r6 >= r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.K1.delta = (com.fingerprintjs.android.fpjs_pro_internal.K1.charlie + 87) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r7 = r9[r6];
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7);
        r7 = r7.getEncoded();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7);
        r10.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        r6 = r6 + 1;
        com.fingerprintjs.android.fpjs_pro_internal.K1.delta = (com.fingerprintjs.android.fpjs_pro_internal.K1.charlie + 95) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r10, 10);
        r9 = new java.util.ArrayList(r3);
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r10.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.K1.delta;
        com.fingerprintjs.android.fpjs_pro_internal.K1.charlie = (((r3 | 1) << 1) - (r3 ^ 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r3 = (byte[]) r10.next();
        r9.add(kotlin.collections.CollectionsKt.listOf(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(r3.length).array(), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.K1.charlie = (com.fingerprintjs.android.fpjs_pro_internal.K1.delta + 29) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        r9 = kotlin.collections.CollectionsKt.indigo(r9);
        r10 = r9.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (r10.hasNext() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011b, code lost:
    
        r6 = com.fingerprintjs.android.fpjs_pro_internal.K1.charlie + 45;
        com.fingerprintjs.android.fpjs_pro_internal.K1.delta = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0124, code lost:
    
        if ((r6 % 2) != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0136, code lost:
    
        r3 = r3 + ((byte[]) r10.next()).length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0126, code lost:
    
        r3 = r3 * ((byte[]) r10.next()).length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r10 = java.nio.ByteBuffer.allocate(r3);
        r9 = r9.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.K1.charlie;
        r6 = (r3 & 15) + (r3 | 15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.K1.delta = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r9.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.K1.delta;
        r6 = (r3 ^ 77) + ((r3 & 77) << 1);
        com.fingerprintjs.android.fpjs_pro_internal.K1.charlie = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
    
        if ((r6 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        r10.put((byte[]) r9.next());
        r3 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        r3 = com.fingerprintjs.android.fpjs_pro_internal.K1.charlie;
        r6 = ((r3 | 31) << 1) - (r3 ^ 31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        r10.put((byte[]) r9.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r10.november == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
    
        r9 = android.util.Base64.encodeToString(r10.array(), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r9);
        r9 = kotlin.Result.m206constructorimpl(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r9 = new com.fingerprintjs.android.fpjs_pro_internal.C1278x1(r5, null, com.fingerprintjs.android.fpjs_pro_internal.component2.b.C0008b.foxtrot);
        r10 = com.fingerprintjs.android.fpjs_pro_internal.K1.charlie;
        com.fingerprintjs.android.fpjs_pro_internal.K1.delta = ((r10 ^ 91) + ((r10 & 91) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0064, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = kotlin.Result.m206constructorimpl(kotlin.ResultKt.createFailure(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x001b, code lost:
    
        if (r10.november == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r10 = kotlin.Result.INSTANCE;
        r9 = r9.alpha;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r9);
        r10 = new java.util.ArrayList(r9.length);
        r3 = r9.length;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gF31878 alpha(ca caVar, G2 g2) {
        Object m206constructorimpl;
        int i4 = delta + 15;
        charlie = i4 % 128;
        int i5 = i4 % 2;
        String str = bravo;
        if (i5 != 0) {
            int i10 = 57 / 0;
        }
        N14263A23323 component5 = bk.component5(m206constructorimpl);
        if (component5 instanceof component8) {
            return new C1282y1(str, (String) ((component8) component5).component9);
        }
        if (component5 instanceof setTopP6481) {
            return new C1278x1(str, null, component2.b.a.foxtrot);
        }
        throw new NoWhenBranchMatchedException();
    }
}
