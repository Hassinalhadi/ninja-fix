package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/e1;", "", "charlie", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C1203e1 {

    /* renamed from: charlie, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final C1203e1 delta = new C1203e1(CollectionsKt.emptyList(), CollectionsKt.emptyList());
    public static int echo = 0;
    public static int foxtrot = 1;
    public final List alpha;
    public final List bravo;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/e1$a;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.fingerprintjs.android.fpjs_pro_internal.e1$a, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static int alpha = 0;
        public static int bravo = 1;
        public static int charlie;
        public static int delta;

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static C1203e1 alpha() {
            alpha = (bravo + 125) % 128;
            int i4 = C1203e1.echo;
            int i5 = (((i4 | 31) << 1) - (i4 ^ 31)) % 128;
            C1203e1.foxtrot = i5;
            C1203e1.echo = (((i5 | 89) << 1) - (i5 ^ 89)) % 128;
            C1203e1 c1203e1 = C1203e1.delta;
            bravo = (alpha + 71) % 128;
            return c1203e1;
        }

        public static int bravo() {
            int i4 = charlie;
            int i5 = i4 % 6030806;
            charlie = i4 + 1;
            if (i5 != 0) {
                return delta;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            delta = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    public C1203e1(List list, List list2) {
        this.alpha = list;
        this.bravo = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d9, code lost:
    
        if (r7 == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ec, code lost:
    
        if ((r6 instanceof com.fingerprintjs.android.fpjs_pro_internal.C1203e1) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ee, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.C1203e1.foxtrot = ((r11 ^ 53) + ((r11 & 53) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fa, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fb, code lost:
    
        r6 = (com.fingerprintjs.android.fpjs_pro_internal.C1203e1) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r7.alpha, r6.alpha)) == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0110, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.bravo, r6.bravo) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0117, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0118, code lost:
    
        r6 = com.fingerprintjs.android.fpjs_pro_internal.C1203e1.echo;
        r7 = (r6 ^ 115) + ((r6 & 115) << 1);
        com.fingerprintjs.android.fpjs_pro_internal.C1203e1.foxtrot = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0125, code lost:
    
        if ((r7 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0129, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        com.fingerprintjs.android.fpjs_pro_internal.C1203e1.foxtrot = ((r11 & 23) + (r11 | 23)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r7 == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = ~i5;
        int i16 = (~(i14 | i15)) | (~(i14 | i11)) | (~(i15 | i11));
        int i17 = ~(i5 | i14);
        int i18 = i11 | i17 | (~(i15 | i10));
        int i19 = (-1326448640) * i13;
        int i20 = ((-877658112) * i4) + (2076180480 * i12) + i19 + (226096115 * i18) + ((-226096115) * i17) + (i16 * (-226096115)) + ((-1100352524) * i10) + ((-1552544754) * i11) + 1566572544;
        int papa = AbstractC2327c.papa(i4, 1728320405, ((-393945980) * i12) + i11 + i10 + i13);
        int i21 = i17 * (-493);
        int i22 = i18 * 493;
        int i23 = i13 * (-252835169);
        int i24 = i12 * 1574575612;
        int i25 = i4 * 147979147;
        int quebec = AbstractC2327c.quebec(papa, -1426456576, i25 + i24 + i23 + i22 + i21 + (i16 * (-493)) + (i10 * (-252834676)) + ((i11 * (-252835662)) - 192251156), 2075787264, (214302720 * papa) + i20);
        if (quebec != 1) {
            if (quebec != 2) {
                C1203e1 c1203e1 = (C1203e1) objArr[0];
                int i26 = echo + 63;
                int i27 = i26 % 128;
                foxtrot = i27;
                int i28 = i26 % 2;
                List list = c1203e1.alpha;
                if (i28 != 0) {
                    int i29 = (i27 & 3) + (i27 | 3);
                    echo = i29 % 128;
                    if (i29 % 2 == 0) {
                        return list;
                    }
                    throw null;
                }
                throw null;
            }
            C1203e1 c1203e12 = (C1203e1) objArr[0];
            int i30 = echo;
            int i31 = (((i30 | 115) << 1) - (i30 ^ 115)) % 128;
            foxtrot = i31;
            List list2 = c1203e12.bravo;
            int i32 = (i31 & 115) + (i31 | 115);
            echo = i32 % 128;
            if (i32 % 2 == 0) {
                return list2;
            }
            throw null;
        }
        C1203e1 c1203e13 = (C1203e1) objArr[0];
        Object obj = objArr[1];
        int i33 = foxtrot;
        int i34 = (i33 ^ 61) + ((i33 & 61) << 1);
        int i35 = i34 % 128;
        echo = i35;
        if (i34 % 2 != 0) {
            int i36 = 6 / 0;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) alpha(new Object[]{this, obj}, P.setPivotYN16904(), P.setPivotYN16904(), -838499272, 838499273, P.setPivotYN16904(), P.setPivotYN16904())).booleanValue();
    }

    public final int hashCode() {
        int i4;
        int i5 = echo;
        int i10 = ((i5 | 67) << 1) - (i5 ^ 67);
        foxtrot = i10 % 128;
        int i11 = i10 % 2;
        List list = this.bravo;
        List list2 = this.alpha;
        if (i11 == 0) {
            i4 = (list2.hashCode() / 107) - list.hashCode();
        } else {
            int hashCode = list2.hashCode() * 31;
            int i12 = -(-list.hashCode());
            i4 = ((hashCode | i12) << 1) - (i12 ^ hashCode);
        }
        int i13 = foxtrot;
        int i14 = ((i13 | 11) << 1) - (i13 ^ 11);
        echo = i14 % 128;
        if (i14 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String toString() {
        int i4 = foxtrot + 49;
        echo = i4 % 128;
        int i5 = i4 % 2;
        List list = this.bravo;
        List list2 = this.alpha;
        if (i5 == 0) {
            return "CpuInfo(commonInfo=" + list2 + ", perProcessorInfo=" + list + ")";
        }
        StringBuilder sb2 = new StringBuilder("CpuInfo(commonInfo=");
        sb2.append(list2);
        sb2.append(", perProcessorInfo=");
        sb2.append(list);
        sb2.append(")");
        throw null;
    }
}
