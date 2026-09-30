package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.C1203e1;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class C10192 {
    public static int alpha = 0;
    public static int bravo = 1;
    public static int charlie;
    public static int delta;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/e1;", "p0", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/e1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Lambda implements Function1<C1203e1, Object> {
        public static final a alpha = new Lambda(1);
        public static int purple = 0;
        public static int red = 1;

        public a() {
            super(1);
        }

        @NotNull
        public final Object alpha(@NotNull C1203e1 c1203e1) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            List list = (List) C1203e1.alpha(new Object[]{c1203e1}, P.setPivotYN16904(), P.setPivotYN16904(), -537911860, 537911860, P.setPivotYN16904(), P.setPivotYN16904());
            int size = ((List) C1203e1.alpha(new Object[]{c1203e1}, P.setPivotYN16904(), P.setPivotYN16904(), 1257476661, -1257476659, P.setPivotYN16904(), P.setPivotYN16904())).size();
            ArrayList indigo = CollectionsKt.indigo((List) C1203e1.alpha(new Object[]{c1203e1}, P.setPivotYN16904(), P.setPivotYN16904(), 1257476661, -1257476659, P.setPivotYN16904(), P.setPivotYN16904()));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = indigo.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Pair pair = (Pair) next;
                Object obj = linkedHashMap.get(pair);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(pair, obj);
                    int i4 = purple;
                    red = ((i4 & 3) + (i4 | 3)) % 128;
                }
                ((List) obj).add(next);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int i5 = purple;
            red = ((i5 & 69) + (i5 | 69)) % 128;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int i10 = purple;
                red = ((i10 ^ 75) + ((i10 & 75) << 1)) % 128;
                if (((List) entry.getValue()).size() == size) {
                    int i11 = red;
                    int i12 = ((i11 | 77) << 1) - (i11 ^ 77);
                    purple = i12 % 128;
                    if (i12 % 2 == 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                        int i13 = red;
                        purple = (((i13 | 33) << 1) - (i13 ^ 33)) % 128;
                    } else {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                        throw null;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap2.size());
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                int i14 = red;
                purple = ((i14 & 93) + (i14 | 93)) % 128;
                arrayList.add((Pair) ((Map.Entry) it2.next()).getKey());
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it3 = arrayList.iterator();
            int i15 = purple;
            red = ((i15 ^ 33) + ((i15 & 33) << 1)) % 128;
            while (it3.hasNext()) {
                arrayList2.add((String) ((Pair) it3.next()).getFirst());
            }
            Set D10 = CollectionsKt.D(arrayList2);
            List<List> list2 = (List) C1203e1.alpha(new Object[]{c1203e1}, P.setPivotYN16904(), P.setPivotYN16904(), 1257476661, -1257476659, P.setPivotYN16904(), P.setPivotYN16904());
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (List list3 : list2) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list3) {
                    red = (purple + 63) % 128;
                    if (!D10.contains(((Pair) obj2).getFirst())) {
                        int i16 = red;
                        int i17 = (i16 ^ 109) + ((i16 & 109) << 1);
                        int i18 = i17 % 128;
                        purple = i18;
                        if (i17 % 2 != 0) {
                            continue;
                        } else {
                            int i19 = (i18 & 115) + (i18 | 115);
                            red = i19 % 128;
                            if (i19 % 2 != 0) {
                                arrayList4.add(obj2);
                            } else {
                                arrayList4.add(obj2);
                                throw null;
                            }
                        }
                    }
                }
                arrayList3.add(arrayList4);
                purple = (red + 75) % 128;
            }
            Pair pair2 = new Pair(P28427.N5.echo.vD14832N6715(), kotlin.collections.y.yankee(list));
            Pair pair3 = new Pair(P28427.A1.echo.vD14832N6715(), kotlin.collections.y.yankee(arrayList));
            String vD14832N6715 = P28427.C1009a5.echo.vD14832N6715();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault3);
            Iterator it4 = arrayList3.iterator();
            int i20 = red;
            int i21 = i20 & 75;
            int i22 = i20 | 75;
            while (true) {
                purple = (i21 + i22) % 128;
                if (it4.hasNext()) {
                    int i23 = purple;
                    red = ((i23 ^ 47) + ((i23 & 47) << 1)) % 128;
                    arrayList5.add(kotlin.collections.y.yankee((List) it4.next()));
                    int i24 = red;
                    i21 = i24 & 91;
                    i22 = i24 | 91;
                } else {
                    return kotlin.collections.y.sierra(pair2, pair3, new Pair(vD14832N6715, arrayList5));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(C1203e1 c1203e1) {
            int i4 = red + 19;
            purple = i4 % 128;
            int i5 = i4 % 2;
            Object alpha2 = alpha(c1203e1);
            if (i5 != 0) {
                int i10 = 7 / 0;
            }
            return alpha2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements Function1<String, Boolean> {
        public static final b alpha = new Lambda(1);
        public static int purple = 0;
        public static int red = 1;

        public b() {
            super(1);
        }

        @NotNull
        public final Boolean alpha(@NotNull String str) {
            int i4 = purple;
            red = ((i4 & 49) + (i4 | 49)) % 128;
            boolean z2 = true;
            if (str.length() == 0) {
                int i5 = purple;
                int i10 = ((i5 ^ 27) + ((i5 & 27) << 1)) % 128;
                red = i10;
                purple = (((i10 | 63) << 1) - (i10 ^ 63)) % 128;
            } else {
                int i11 = purple;
                red = (((i11 | 41) << 1) - (i11 ^ 41)) % 128;
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(String str) {
            int i4 = red;
            int i5 = (i4 ^ 21) + ((i4 & 21) << 1);
            purple = i5 % 128;
            String str2 = str;
            if (i5 % 2 == 0) {
                return alpha(str2);
            }
            alpha(str2);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements Function1<String, Boolean> {
        public static final c alpha = new Lambda(1);
        public static int purple = 0;
        public static int red = 1;

        public c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        
            if ((r4 % 2) != 0) goto L8;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean alpha(@NotNull String str) {
            int i4 = red;
            boolean z2 = true;
            int i5 = ((i4 | 73) << 1) - (i4 ^ 73);
            purple = i5 % 128;
            if (i5 % 2 == 0) {
                if (str.length() == 0) {
                    int i10 = red + 25;
                    purple = i10 % 128;
                } else {
                    purple = (red + 107) % 128;
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
            str.length();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(String str) {
            purple = (red + 31) % 128;
            Boolean alpha2 = alpha(str);
            int i4 = purple;
            int i5 = (i4 ^ 121) + ((i4 & 121) << 1);
            red = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 54 / 0;
            }
            return alpha2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class d extends Lambda implements Function1<String, Boolean> {
        public static final d alpha = new Lambda(1);

        /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.C10192$d, kotlin.jvm.internal.Lambda] */
        static {
            if (((11 << 1) - 11) % 2 == 0) {
                int i4 = 90 / 0;
            }
        }

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull String str) {
            boolean z2;
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class e extends Lambda implements Function1<String, Boolean> {
        public static final e alpha = new Lambda(1);
        public static int purple = 0;
        public static int red = 1;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.C10192$e, kotlin.jvm.internal.Lambda] */
        static {
            if (ao.ad.victor(1, -6, 1, 2) == 0) {
            } else {
                throw null;
            }
        }

        public e() {
            super(1);
        }

        @NotNull
        public final Boolean alpha(@NotNull String str) {
            red = (purple + 75) % 128;
            boolean z2 = false;
            if (str.length() == 0) {
                int i4 = red;
                int i5 = (i4 ^ 91) + ((i4 & 91) << 1);
                purple = i5 % 128;
                if (i5 % 2 == 0) {
                    z2 = true;
                }
            }
            Boolean valueOf = Boolean.valueOf(z2);
            int i10 = red + 83;
            purple = i10 % 128;
            if (i10 % 2 == 0) {
                return valueOf;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(String str) {
            purple = (red + 9) % 128;
            Boolean alpha2 = alpha(str);
            red = (purple + 101) % 128;
            return alpha2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/a2;", "p0", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/a2;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class f extends Lambda implements Function1<C1188a2, Object> {
        public static final f alpha = new Lambda(1);

        /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.C10192$f, kotlin.jvm.internal.Lambda] */
        static {
            if (ao.ad.victor(0, -72, 1, 2) != 0) {
            } else {
                throw null;
            }
        }

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull C1188a2 c1188a2) {
            String vD14832N6715 = P28427.E1.echo.vD14832N6715();
            c1188a2.getClass();
            int i4 = ((C1188a2.charlie + 15) % 128) + 27;
            C1188a2.charlie = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            Pair pair = new Pair(vD14832N6715, c1188a2.alpha);
            String vD14832N67152 = P28427.C1065i5.echo.vD14832N6715();
            int i10 = C1188a2.charlie;
            if ((((i10 | 31) << 1) - (i10 ^ 31)) % 2 == 0) {
                int i11 = 7 / 0;
            }
            return kotlin.collections.y.sierra(pair, new Pair(vD14832N67152, c1188a2.bravo));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/T2;", "p0", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/T2;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class g extends Lambda implements Function1<T2, Object> {
        public static final g alpha = new Lambda(1);
        public static int purple = 0;
        public static int red = 1;

        public g() {
            super(1);
        }

        @NotNull
        public final Object alpha(@NotNull T2 t22) {
            red = (purple + 13) % 128;
            Map sierra = kotlin.collections.y.sierra(new Pair(P28427.C1096n1.echo.vD14832N6715(), T2.alpha(new Object[]{t22}, 1766305295, d3.bravo(), d3.bravo(), -1766305293, d3.bravo(), d3.bravo())), new Pair(P28427.V4.echo.vD14832N6715(), T2.alpha(new Object[]{t22}, 690216439, d3.bravo(), d3.bravo(), -690216439, d3.bravo(), d3.bravo())), new Pair(P28427.C1152v1.echo.vD14832N6715(), T2.alpha(new Object[]{t22}, -210241994, d3.bravo(), d3.bravo(), 210241995, d3.bravo(), d3.bravo())));
            int i4 = red + 79;
            purple = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 85 / 0;
            }
            return sierra;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(T2 t22) {
            red = (purple + 51) % 128;
            Object alpha2 = alpha(t22);
            purple = (red + 79) % 128;
            return alpha2;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/c;", "p0", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class h extends Lambda implements Function1<C1193c, Object> {
        public static final h alpha = new Lambda(1);

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull C1193c c1193c) {
            String vD14832N6715 = P28427.C1065i5.echo.vD14832N6715();
            c1193c.getClass();
            int i4 = C1193c.charlie;
            int i5 = (((i4 | 45) << 1) - (i4 ^ 45)) % 128;
            C1193c.delta = i5;
            C1193c.charlie = (((i5 | 125) << 1) - (i5 ^ 125)) % 128;
            Pair pair = new Pair(vD14832N6715, c1193c.bravo);
            String vD14832N67152 = P28427.C1096n1.echo.vD14832N6715();
            int i10 = C1193c.charlie;
            int i11 = ((i10 & 75) + (i10 | 75)) % 128;
            C1193c.delta = i11;
            C1193c.charlie = ((i11 ^ 61) + ((i11 & 61) << 1)) % 128;
            return kotlin.collections.y.sierra(pair, new Pair(vD14832N67152, c1193c.alpha));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/e1;", "p0", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/e1;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class i extends Lambda implements Function1<C1203e1, Boolean> {
        public static final i alpha = new Lambda(1);

        /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.C10192$i, kotlin.jvm.internal.Lambda] */
        static {
            if ((1 + 53) % 2 != 0) {
                int i4 = 13 / 0;
            }
        }

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull C1203e1 c1203e1) {
            C1203e1.Companion companion = C1203e1.INSTANCE;
            return Boolean.valueOf(Intrinsics.areEqual(c1203e1, C1203e1.Companion.alpha()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "alpha", "(J)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class j extends Lambda implements Function1<Long, Boolean> {
        public static final j alpha = new Lambda(1);
        public static int purple;

        public j() {
            super(1);
        }

        @NotNull
        public final Boolean alpha(long j5) {
            boolean z2;
            int i4 = purple;
            int i5 = ((i4 & 107) + (i4 | 107)) % 128;
            if (j5 == 0) {
                purple = (i5 + 77) % 128;
                z2 = true;
            } else {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Boolean invoke(Long l10) {
            int i4 = purple;
            Long l11 = l10;
            if (((i4 & 43) + (i4 | 43)) % 2 == 0) {
                int i5 = 33 / 0;
                return alpha(l11.longValue());
            }
            return alpha(l11.longValue());
        }
    }

    public static /* synthetic */ Object D8871(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int collectionSizeOrDefault;
        int i14 = ~i4;
        int i15 = ~(i14 | i11);
        int i16 = ~i11;
        int i17 = ~((~i13) | i16);
        int i18 = ~(i16 | i4);
        int i19 = i17 | i18;
        int i20 = (~(i13 | i14)) | i18 | i15;
        int i21 = 366215168 * i12;
        int i22 = 1604583424 * i5;
        int i23 = (216268800 * i10) + i22 + i21 + ((-1289454384) * i20) + (i19 * (-1289454384)) + ((-1716058528) * i15) + ((-923239215) * i4) + ((-1349843359) * i11) + 1460535296;
        int papa = AbstractC2327c.papa(i10, 1787681333, ((-168536539) * i5) + i11 + i4 + i12);
        switch (AbstractC2327c.quebec(papa, -2030960640, (30625011 * i10) + (1252505731 * i5) + ((-925913209) * i12) + (i20 * 432) + (i19 * 432) + (i15 * (-864)) + (i4 * (-925912777)) + (i11 * (-925914073)) + 175428941, 899809280, (1778253824 * papa) + i23)) {
            case 1:
                C1272w c1272w = (C1272w) objArr[0];
                int i24 = bravo;
                alpha = (((i24 | 67) << 1) - (i24 ^ 67)) % 128;
                gF31878 gf31878 = (gF31878) D8871(new Object[]{c1272w, P28427.R2.echo.vD14832N6715(), C1217i.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
                int i25 = alpha;
                int i26 = (i25 & 21) + (i25 | 21);
                bravo = i26 % 128;
                if (i26 % 2 != 0) {
                    return gf31878;
                }
                throw null;
            case 2:
                C1260t c1260t = (C1260t) objArr[0];
                int i27 = bravo;
                int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
                alpha = i28 % 128;
                if (i28 % 2 == 0) {
                    return (gF31878) D8871(new Object[]{c1260t, P28427.U0.echo.vD14832N6715(), C1209g.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
                }
                throw null;
            case 3:
                C1245p c1245p = (C1245p) objArr[0];
                int i29 = bravo;
                alpha = (((i29 | 39) << 1) - (i29 ^ 39)) % 128;
                gF31878 gf318782 = (gF31878) D8871(new Object[]{c1245p, P28427.C1080l.echo.vD14832N6715(), C1197d.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
                int i30 = alpha + 79;
                bravo = i30 % 128;
                if (i30 % 2 != 0) {
                    return gf318782;
                }
                throw null;
            case 4:
                i3 i3Var = (i3) objArr[0];
                String str = (String) objArr[1];
                Function1 function1 = (Function1) objArr[2];
                int i31 = bravo;
                int i32 = ((i31 | 11) << 1) - (i31 ^ 11);
                alpha = i32 % 128;
                if (i32 % 2 == 0) {
                    return (gF31878) D8871(new Object[]{i3Var, str, C1213h.alpha, function1}, -435058294, copy$D8871.component5(), copy$D8871.component5(), 435058294, copy$D8871.component5(), copy$D8871.component5());
                }
                throw null;
            case 5:
                aa aaVar = (aa) objArr[0];
                int i33 = bravo + 113;
                alpha = i33 % 128;
                if (i33 % 2 == 0) {
                    return (gF31878) D8871(new Object[]{aaVar, P28427.I2.echo.vD14832N6715(), C1221j.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
                }
                throw null;
            case 6:
                i3 i3Var2 = (i3) objArr[0];
                String str2 = (String) objArr[1];
                Function1 function12 = (Function1) objArr[2];
                Function1 function13 = (Function1) objArr[3];
                int i34 = alpha + 87;
                bravo = i34 % 128;
                if (i34 % 2 == 0) {
                    throw null;
                }
                if (i3Var2 != null && !((Boolean) function12.invoke(i3Var2.alpha())).booleanValue()) {
                    C1282y1 c1282y1 = new C1282y1(str2, function13.invoke(i3Var2.alpha()));
                    int i35 = bravo + 81;
                    alpha = i35 % 128;
                    if (i35 % 2 != 0) {
                        int i36 = 37 / 0;
                    }
                    return c1282y1;
                }
                C1278x1 c1278x1 = new C1278x1(str2, null, component2.b.a.foxtrot);
                int i37 = bravo + 13;
                alpha = i37 % 128;
                if (i37 % 2 != 0) {
                    int i38 = 81 / 0;
                }
                return c1278x1;
            case 7:
                i3 i3Var3 = (i3) objArr[0];
                String str3 = (String) objArr[1];
                Function1 function14 = (Function1) objArr[2];
                alpha = (bravo + 71) % 128;
                gF31878 gf318783 = (gF31878) D8871(new Object[]{i3Var3, str3, function14, C1205f.alpha}, 838869078, copy$D8871.component5(), copy$D8871.component5(), -838869072, copy$D8871.component5(), copy$D8871.component5());
                alpha = (bravo + 85) % 128;
                return gf318783;
            default:
                i3 i3Var4 = (i3) objArr[0];
                String str4 = (String) objArr[1];
                Function1 function15 = (Function1) objArr[2];
                Function1 function16 = (Function1) objArr[3];
                int i39 = alpha;
                int i40 = ((i39 | 107) << 1) - (i39 ^ 107);
                int i41 = i40 % 128;
                bravo = i41;
                if (i40 % 2 == 0) {
                    throw null;
                }
                if (i3Var4 != null) {
                    int i42 = (i41 & 65) + (i41 | 65);
                    alpha = i42 % 128;
                    if (i42 % 2 == 0) {
                        if (!((Boolean) function15.invoke(i3Var4.alpha())).booleanValue()) {
                            Iterable iterable = (Iterable) i3Var4.alpha();
                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                            Iterator it = iterable.iterator();
                            bravo = (alpha + 95) % 128;
                            while (it.hasNext()) {
                                arrayList.add(function16.invoke(it.next()));
                                int i43 = alpha;
                                bravo = ((i43 & 41) + (i43 | 41)) % 128;
                            }
                            C1282y1 c1282y12 = new C1282y1(str4, arrayList);
                            int i44 = alpha;
                            int i45 = (i44 ^ 1) + ((i44 & 1) << 1);
                            bravo = i45 % 128;
                            if (i45 % 2 == 0) {
                                int i46 = 41 / 0;
                            }
                            return c1282y12;
                        }
                    } else {
                        ((Boolean) function15.invoke(i3Var4.alpha())).getClass();
                        throw null;
                    }
                }
                C1278x1 c1278x12 = new C1278x1(str4, null, component2.b.a.foxtrot);
                alpha = (bravo + 39) % 128;
                return c1278x12;
        }
    }

    public static int alpha() {
        int i4 = charlie;
        int i5 = i4 % 5432523;
        charlie = i4 + 1;
        if (i5 != 0) {
            return delta;
        }
        int romeo = ao.ad.romeo();
        delta = romeo;
        return romeo;
    }

    @NotNull
    public static final gF31878<Object> component5(@Nullable C1256s c1256s) {
        int i4 = alpha;
        int i5 = ((i4 | 59) << 1) - (i4 ^ 59);
        bravo = i5 % 128;
        if (i5 % 2 != 0) {
            gF31878<Object> gf31878 = (gF31878) D8871(new Object[]{c1256s, P28427.N0.echo.vD14832N6715(), c.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
            int i10 = alpha;
            int i11 = (i10 ^ 77) + ((i10 & 77) << 1);
            bravo = i11 % 128;
            if (i11 % 2 != 0) {
                return gf31878;
            }
            throw null;
        }
        throw null;
    }

    @NotNull
    public static final gF31878<List<Object>> component9(@Nullable r rVar) {
        int i4 = alpha;
        bravo = (((i4 | 81) << 1) - (i4 ^ 81)) % 128;
        gF31878<List<Object>> gf31878 = (gF31878) D8871(new Object[]{rVar, P28427.X0.echo.vD14832N6715(), g.alpha}, 472988318, copy$D8871.component5(), copy$D8871.component5(), -472988314, copy$D8871.component5(), copy$D8871.component5());
        int i5 = bravo;
        int i10 = ((i5 | 49) << 1) - (i5 ^ 49);
        alpha = i10 % 128;
        if (i10 % 2 == 0) {
            return gf31878;
        }
        throw null;
    }

    @NotNull
    public static final gF31878<Object> setPivotYN16904(@Nullable C1241o c1241o) {
        int i4 = bravo;
        int i5 = ((i4 | 101) << 1) - (i4 ^ 101);
        alpha = i5 % 128;
        int i10 = i5 % 2;
        String vD14832N6715 = P28427.Z0.echo.vD14832N6715();
        if (i10 == 0) {
            return (gF31878) D8871(new Object[]{c1241o, vD14832N6715, b.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
        }
        throw null;
    }

    @NotNull
    public static final gF31878<Object> vD14832N6715(@Nullable C1249q c1249q) {
        int i4 = alpha;
        bravo = (((i4 | 79) << 1) - (i4 ^ 79)) % 128;
        gF31878<Object> gf31878 = (gF31878) D8871(new Object[]{c1249q, P28427.K1.echo.vD14832N6715(), e.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
        alpha = (bravo + 123) % 128;
        return gf31878;
    }

    @NotNull
    public static final gF31878<Object> vD14832N6715(@Nullable C1264u c1264u) {
        bravo = (alpha + 103) % 128;
        gF31878<Object> gf31878 = (gF31878) D8871(new Object[]{c1264u, P28427.n6.echo.vD14832N6715(), d.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
        int i4 = bravo;
        int i5 = (i4 ^ 33) + ((i4 & 33) << 1);
        alpha = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 31 / 0;
        }
        return gf31878;
    }

    @NotNull
    public static final gF31878<List<Object>> vD14832N6715(@Nullable C1268v c1268v) {
        int i4 = bravo;
        alpha = (((i4 | 89) << 1) - (i4 ^ 89)) % 128;
        gF31878<List<Object>> gf31878 = (gF31878) D8871(new Object[]{c1268v, P28427.ac.echo.vD14832N6715(), h.alpha}, 472988318, copy$D8871.component5(), copy$D8871.component5(), -472988314, copy$D8871.component5(), copy$D8871.component5());
        int i5 = alpha;
        int i10 = (i5 ^ 113) + ((i5 & 113) << 1);
        bravo = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 3 / 0;
        }
        return gf31878;
    }

    @NotNull
    public static final gF31878<Object> vD14832N6715(@Nullable C1284z c1284z) {
        int i4 = alpha;
        bravo = ((i4 & 89) + (i4 | 89)) % 128;
        gF31878<Object> gf31878 = (gF31878) D8871(new Object[]{c1284z, P28427.M0.echo.vD14832N6715(), i.alpha, a.alpha}, 838869078, copy$D8871.component5(), copy$D8871.component5(), -838869072, copy$D8871.component5(), copy$D8871.component5());
        int i5 = alpha + 121;
        bravo = i5 % 128;
        if (i5 % 2 != 0) {
            return gf31878;
        }
        throw null;
    }

    @NotNull
    public static final gF31878<Object> D8871(@Nullable ac acVar) {
        bravo = (alpha + 77) % 128;
        gF31878<Object> gf31878 = (gF31878) D8871(new Object[]{acVar, P28427.d6.echo.vD14832N6715(), j.alpha}, -256719664, copy$D8871.component5(), copy$D8871.component5(), 256719671, copy$D8871.component5(), copy$D8871.component5());
        int i4 = bravo;
        alpha = (((i4 | 15) << 1) - (i4 ^ 15)) % 128;
        return gf31878;
    }

    @NotNull
    public static final gF31878<List<Object>> D8871(@Nullable C1280y c1280y) {
        int i4 = alpha + 11;
        bravo = i4 % 128;
        if (i4 % 2 != 0) {
            return (gF31878) D8871(new Object[]{c1280y, P28427.b6.echo.vD14832N6715(), f.alpha}, 472988318, copy$D8871.component5(), copy$D8871.component5(), -472988314, copy$D8871.component5(), copy$D8871.component5());
        }
        throw null;
    }
}
