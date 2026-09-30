package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import com.fingerprintjs.android.fpjs_pro_internal.C1203e1;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import pe.AbstractC2327c;
import s6.AbstractC2743p6;

/* loaded from: classes3.dex */
public final class U {
    public static int alpha = 0;
    public static int bravo = 1;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01da, code lost:
    
        if (r5 < 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ef, code lost:
    
        r9 = com.fingerprintjs.android.fpjs_pro_internal.U.alpha;
        r12 = (r9 ^ 121) + ((r9 & 121) << 1);
        com.fingerprintjs.android.fpjs_pro_internal.U.bravo = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fc, code lost:
    
        if ((r12 % 2) == 0) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01fe, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0202, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0205, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ed, code lost:
    
        if (r5 < 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024e, code lost:
    
        if (r5 < 0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x025e, code lost:
    
        kotlin.collections.CollectionsKt.throwIndexOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x025c, code lost:
    
        if (r5 < 0) goto L357;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        String readText$default;
        List lines;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        int collectionSizeOrDefault3;
        int collectionSizeOrDefault4;
        int collectionSizeOrDefault5;
        int collectionSizeOrDefault6;
        boolean z2;
        Pair pair;
        int collectionSizeOrDefault7;
        String str;
        String str2;
        Object next;
        int i14;
        Object next2;
        int i15;
        int i16 = 0;
        int i17 = ~(i5 | i10 | i4);
        int i18 = ~i10;
        int i19 = (~(i18 | i4)) | (~((~i4) | i5));
        int i20 = (~(i4 | (~i5))) | i18;
        int i21 = ((-299892736) * i13) + (689963008 * i12) + (606076928 * i11) + ((-441125413) * i20) + (441125413 * i19) + (i17 * 441125413) + (164951516 * i10) + ((1047202342 * i5) - 713031680);
        int papa = AbstractC2327c.papa(i13, 1743660113, ((-2044576983) * i12) + i5 + i10 + i11);
        int i22 = i20 * 441;
        int quebec = AbstractC2327c.quebec(papa, 1885470720, ((-1448904853) * i13) + (2142076211 * i12) + (2048728315 * i11) + i22 + (i19 * (-441)) + (i17 * (-441)) + (i10 * 2048728756) + ((i5 * 2048727874) - 782056376), -1618345984, ((-1081737216) * papa) + i21);
        if (quebec == 1) {
            List list = (List) objArr[0];
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                alpha = (bravo + 61) % 128;
                Object next3 = it.next();
                if (!((Boolean) alpha(new Object[]{(Pair) next3}, av.ah.magenta(), 943154280, -943154278, av.ah.magenta(), av.ah.magenta(), av.ah.magenta())).booleanValue()) {
                    alpha = (bravo + 113) % 128;
                    arrayList.add(next3);
                } else {
                    int i23 = alpha;
                    bravo = ((i23 ^ 9) + ((i23 & 9) << 1)) % 128;
                    break;
                }
            }
            int i24 = alpha;
            int i25 = ((i24 | 113) << 1) - (i24 ^ 113);
            bravo = i25 % 128;
            if (i25 % 2 == 0) {
                int i26 = 5 / 0;
            }
            return arrayList;
        }
        if (quebec == 2) {
            Pair pair2 = (Pair) objArr[0];
            int i27 = alpha;
            int i28 = (i27 & 121) + (i27 | 121);
            bravo = i28 % 128;
            if (i28 % 2 != 0) {
                if (Intrinsics.areEqual(pair2.getFirst(), "processor")) {
                    CharSequence charSequence = (CharSequence) pair2.getSecond();
                    int i29 = bravo;
                    alpha = ((i29 & 33) + (i29 | 33)) % 128;
                    while (i16 < charSequence.length()) {
                        int i30 = bravo;
                        int i31 = ((i30 | 71) << 1) - (i30 ^ 71);
                        alpha = i31 % 128;
                        if (i31 % 2 == 0) {
                            if (!(!Character.isDigit(charSequence.charAt(i16)))) {
                                int i32 = (i16 ^ 28) + ((i16 & 28) << 1);
                                i16 = (i32 & (-27)) + (i32 | (-27));
                                bravo = (alpha + 59) % 128;
                            } else {
                                bravo = (alpha + 3) % 128;
                            }
                        } else {
                            Character.isDigit(charSequence.charAt(i16));
                            throw null;
                        }
                    }
                    int i33 = alpha;
                    int i34 = (((i33 | 5) << 1) - (i33 ^ 5)) % 128;
                    bravo = i34;
                    alpha = (i34 + 111) % 128;
                    return Boolean.TRUE;
                }
                int i35 = bravo + 97;
                alpha = i35 % 128;
                if (i35 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            Intrinsics.areEqual(pair2.getFirst(), "processor");
            throw null;
        }
        if (quebec == 3) {
            List list2 = (List) objArr[0];
            ArrayList arrayList2 = new ArrayList();
            boolean z10 = false;
            for (Object obj : list2) {
                int i36 = alpha;
                bravo = (((i36 | 111) << 1) - (i36 ^ 111)) % 128;
                if (z10) {
                    alpha = (bravo + 93) % 128;
                    arrayList2.add(obj);
                } else if (((Boolean) alpha(new Object[]{(Pair) obj}, av.ah.magenta(), 943154280, -943154278, av.ah.magenta(), av.ah.magenta(), av.ah.magenta())).booleanValue()) {
                    int i37 = (bravo + 37) % 128;
                    alpha = i37;
                    bravo = ((i37 ^ 5) + ((i37 & 5) << 1)) % 128;
                    arrayList2.add(obj);
                    z10 = true;
                }
            }
            int i38 = alpha;
            int i39 = (i38 & 41) + (i38 | 41);
            bravo = i39 % 128;
            if (i39 % 2 != 0) {
                return arrayList2;
            }
            throw null;
        }
        if (quebec == 4) {
            readText$default = FilesKt__FileReadWriteKt.readText$default(new File("/proc/cpuinfo"), null, 1, null);
            List juliet = kotlin.collections.ab.juliet("");
            lines = StringsKt__StringsKt.lines(readText$default);
            ArrayList a6 = CollectionsKt.a(CollectionsKt.a(juliet, lines), kotlin.collections.ab.juliet(""));
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(a6, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            Iterator it2 = a6.iterator();
            int i40 = 0;
            while (it2.hasNext()) {
                Object next4 = it2.next();
                int i41 = ((i40 | 1) << 1) - (i40 ^ 1);
                if (i40 < 0) {
                    int i42 = alpha + 115;
                    bravo = i42 % 128;
                    if (i42 % 2 == 0) {
                        CollectionsKt.throwIndexOverflow();
                        int i43 = 73 / 0;
                    } else {
                        CollectionsKt.throwIndexOverflow();
                    }
                }
                arrayList3.add(new Pair((String) next4, Integer.valueOf(i40)));
                i40 = i41;
            }
            ArrayList emerald = CollectionsKt.emerald(CollectionsKt.F(arrayList3, Q.alpha));
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = a6.iterator();
            int i44 = 0;
            while (it3.hasNext()) {
                int i45 = bravo;
                int i46 = (i45 ^ 27) + ((i45 & 27) << 1);
                alpha = i46 % 128;
                if (i46 % 2 != 0) {
                    next2 = it3.next();
                    i15 = (i44 ^ 2) + ((i44 & 2) << 1);
                } else {
                    next2 = it3.next();
                    int i47 = (i44 ^ 119) + ((i44 & 119) << 1);
                    i15 = ((i47 & (-118)) << 1) + (i47 ^ (-118));
                }
                if (!emerald.contains(Integer.valueOf(i44))) {
                    av.ah.magenta();
                    av.ah.magenta();
                    arrayList4.add(next2);
                }
                i44 = i15;
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
            Iterator it4 = arrayList4.iterator();
            bravo = (alpha + 51) % 128;
            int i48 = 0;
            while (it4.hasNext()) {
                int i49 = alpha;
                int i50 = (i49 & 59) + (i49 | 59);
                bravo = i50 % 128;
                if (i50 % 2 == 0) {
                    next = it4.next();
                    i14 = i48 + 1;
                } else {
                    next = it4.next();
                    int i51 = i48 - 55;
                    i14 = (i51 | 56) + (i51 & 56);
                }
                Integer valueOf = Integer.valueOf(i48);
                if (StringsKt.gray((String) next)) {
                    int i52 = bravo;
                    int i53 = (i52 & 105) + (i52 | 105);
                    alpha = i53 % 128;
                    if (i53 % 2 != 0) {
                        throw null;
                    }
                } else {
                    valueOf = null;
                }
                arrayList5.add(valueOf);
                i48 = i14;
            }
            ArrayList F10 = CollectionsKt.F(CollectionsKt.emerald(arrayList5), new T(arrayList4));
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(F10, 10);
            ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault3);
            Iterator it5 = F10.iterator();
            while (it5.hasNext()) {
                List list3 = (List) it5.next();
                ArrayList arrayList7 = new ArrayList();
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    List<String> maroon = StringsKt.maroon((String) it6.next(), new String[]{":"}, 2);
                    if (maroon.size() == 2) {
                        int i54 = bravo;
                        alpha = (((i54 | 59) << 1) - (i54 ^ 59)) % 128;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(!z2)) {
                        int i55 = alpha + 89;
                        bravo = i55 % 128;
                        if (i55 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        maroon = null;
                    }
                    if (maroon != null) {
                        collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(maroon, 10);
                        ArrayList arrayList8 = new ArrayList(collectionSizeOrDefault7);
                        for (String str3 : maroon) {
                            int i56 = bravo;
                            alpha = ((i56 & 15) + (i56 | 15)) % 128;
                            int length = str3.length();
                            int i57 = 0;
                            while (true) {
                                if (i57 >= length) {
                                    int i58 = bravo;
                                    alpha = ((i58 ^ 41) + ((i58 & 41) << 1)) % 128;
                                    str = "";
                                    break;
                                }
                                int i59 = alpha;
                                bravo = ((i59 & 121) + (i59 | 121)) % 128;
                                if (!AbstractC2743p6.delta(str3.charAt(i57))) {
                                    int i60 = bravo + 35;
                                    alpha = i60 % 128;
                                    if (i60 % 2 != 0) {
                                        str3.substring(i57);
                                        throw null;
                                    }
                                    str = str3.substring(i57);
                                } else {
                                    i57++;
                                    bravo = (alpha + 43) % 128;
                                }
                            }
                            int cyan = StringsKt.cyan(str);
                            while (true) {
                                if (cyan < 0) {
                                    alpha = (bravo + 41) % 128;
                                    str2 = "";
                                    break;
                                }
                                bravo = (alpha + 111) % 128;
                                if (!AbstractC2743p6.delta(str.charAt(cyan))) {
                                    str2 = str.substring(0, cyan + 1);
                                    int i61 = alpha;
                                    bravo = (((i61 | 79) << 1) - (i61 ^ 79)) % 128;
                                    break;
                                }
                                cyan = (cyan & (-58)) + (cyan | (-58)) + 57;
                            }
                            arrayList8.add(str2);
                        }
                        pair = new Pair(arrayList8.get(0), arrayList8.get(1));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList7.add(pair);
                    }
                }
                arrayList6.add(arrayList7);
                int i62 = bravo;
                alpha = ((i62 ^ 125) + ((i62 & 125) << 1)) % 128;
            }
            ArrayList arrayList9 = new ArrayList();
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                int i63 = alpha;
                bravo = (((i63 | 101) << 1) - (i63 ^ 101)) % 128;
                Object next5 = it7.next();
                if (!((List) next5).isEmpty()) {
                    int i64 = alpha;
                    bravo = ((i64 & 5) + (i64 | 5)) % 128;
                    arrayList9.add(next5);
                }
            }
            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10);
            ArrayList arrayList10 = new ArrayList(collectionSizeOrDefault4);
            Iterator it8 = arrayList9.iterator();
            alpha = (bravo + 51) % 128;
            while (it8.hasNext()) {
                arrayList10.add((List) alpha(new Object[]{(List) it8.next()}, av.ah.magenta(), -1176213429, 1176213432, av.ah.magenta(), av.ah.magenta(), av.ah.magenta()));
            }
            ArrayList arrayList11 = new ArrayList();
            Iterator it9 = arrayList10.iterator();
            while (it9.hasNext()) {
                int i65 = bravo;
                alpha = ((i65 & 35) + (i65 | 35)) % 128;
                Object next6 = it9.next();
                if (!((List) next6).isEmpty()) {
                    int i66 = bravo;
                    alpha = (((i66 | 119) << 1) - (i66 ^ 119)) % 128;
                    arrayList11.add(next6);
                } else {
                    int i67 = bravo;
                    alpha = (((i67 | 53) << 1) - (i67 ^ 53)) % 128;
                }
            }
            collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList11, 10);
            ArrayList arrayList12 = new ArrayList(collectionSizeOrDefault5);
            Iterator it10 = arrayList11.iterator();
            while (it10.hasNext()) {
                List list4 = (List) it10.next();
                ArrayList arrayList13 = new ArrayList();
                for (Object obj2 : list4) {
                    if (!((Boolean) alpha(new Object[]{(Pair) obj2}, av.ah.magenta(), 943154280, -943154278, av.ah.magenta(), av.ah.magenta(), av.ah.magenta())).booleanValue()) {
                        int i68 = alpha;
                        int i69 = (i68 ^ 7) + ((i68 & 7) << 1);
                        bravo = i69 % 128;
                        if (i69 % 2 != 0) {
                            arrayList13.add(obj2);
                            int i70 = alpha;
                            bravo = (((i70 | 97) << 1) - (i70 ^ 97)) % 128;
                        }
                    }
                }
                arrayList12.add(arrayList13);
            }
            collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList9, 10);
            ArrayList arrayList14 = new ArrayList(collectionSizeOrDefault6);
            Iterator it11 = arrayList9.iterator();
            while (it11.hasNext()) {
                int i71 = bravo;
                int i72 = ((i71 | 5) << 1) - (i71 ^ 5);
                alpha = i72 % 128;
                if (i72 % 2 == 0) {
                    arrayList14.add((List) alpha(new Object[]{(List) it11.next()}, av.ah.magenta(), -862286477, 862286478, av.ah.magenta(), av.ah.magenta(), av.ah.magenta()));
                } else {
                    arrayList14.add((List) alpha(new Object[]{(List) it11.next()}, av.ah.magenta(), -862286477, 862286478, av.ah.magenta(), av.ah.magenta(), av.ah.magenta()));
                    throw null;
                }
            }
            ArrayList arrayList15 = new ArrayList();
            Iterator it12 = arrayList14.iterator();
            while (it12.hasNext()) {
                int i73 = bravo;
                int i74 = (i73 & 25) + (i73 | 25);
                alpha = i74 % 128;
                if (i74 % 2 == 0) {
                    Object next7 = it12.next();
                    if (!((List) next7).isEmpty()) {
                        int i75 = alpha;
                        bravo = (((i75 | 105) << 1) - (i75 ^ 105)) % 128;
                        arrayList15.add(next7);
                    }
                } else {
                    ((List) it12.next()).isEmpty();
                    throw null;
                }
            }
            C1203e1 c1203e1 = new C1203e1(CollectionsKt.indigo(arrayList15), arrayList12);
            int i76 = bravo;
            int i77 = ((i76 | 103) << 1) - (i76 ^ 103);
            alpha = i77 % 128;
            if (i77 % 2 == 0) {
                return c1203e1;
            }
            throw null;
        }
        try {
            Object[] objArr2 = {0L, r0, r0, new Lambda(0), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo = am.echo(373658851);
            if (echo == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int i78 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52;
                int alpha2 = 904 - Color.alpha(0);
                Class cls = Boolean.TYPE;
                echo = am.charlie(threadPriority, i78, alpha2, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo).invoke(null, objArr2);
            C1203e1.Companion companion = C1203e1.INSTANCE;
            C1203e1 alpha3 = C1203e1.Companion.alpha();
            Result.Companion companion2 = Result.INSTANCE;
            if (invoke instanceof kotlin.k) {
                int i79 = bravo;
                int i80 = (i79 ^ 23) + ((i79 & 23) << 1);
                alpha = i80 % 128;
                if (i80 % 2 != 0) {
                    throw null;
                }
                invoke = alpha3;
            } else {
                int i81 = bravo;
                alpha = ((i81 & 47) + (i81 | 47)) % 128;
            }
            return (C1203e1) invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static final /* synthetic */ C1203e1 bravo() {
        int i4 = alpha;
        int i5 = (i4 ^ 41) + ((i4 & 41) << 1);
        bravo = i5 % 128;
        if (i5 % 2 != 0) {
            C1203e1 c1203e1 = (C1203e1) alpha(new Object[0], av.ah.magenta(), 1936051076, -1936051072, av.ah.magenta(), av.ah.magenta(), av.ah.magenta());
            int i10 = alpha;
            bravo = ((i10 & 9) + (i10 | 9)) % 128;
            return c1203e1;
        }
        throw null;
    }
}
