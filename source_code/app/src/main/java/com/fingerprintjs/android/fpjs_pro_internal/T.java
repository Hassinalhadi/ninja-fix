package com.fingerprintjs.android.fpjs_pro_internal;

import fe.C1713e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "p0", "", "alpha", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class T extends Lambda implements Function1<List<? extends Integer>, List<? extends String>> {
    public static int purple = 0;
    public static int red = 1;
    public static int silver;
    public static int teal;
    public final /* synthetic */ ArrayList alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(ArrayList arrayList) {
        super(1);
        this.alpha = arrayList;
    }

    public static int D8871() {
        int i4 = silver;
        int i5 = i4 % 9507658;
        silver = i4 + 1;
        if (i5 != 0) {
            return teal;
        }
        int tango = ao.ad.tango(863794185);
        teal = tango;
        return tango;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fe.g, fe.e] */
    @NotNull
    public final List<String> alpha(@NotNull List<Integer> list) {
        int intValue = list.get(0).intValue() + 1;
        int intValue2 = list.get(1).intValue();
        int identityHashCode = System.identityHashCode(this);
        int i4 = intValue2 * 561;
        int i5 = ((559 | i4) << 1) - (i4 ^ 559);
        int i10 = ~identityHashCode;
        int i11 = (i5 - (~(-(-((~((i10 ^ (-1)) | i10)) * (-560)))))) - 1;
        int i12 = ~intValue2;
        int i13 = ((~(identityHashCode | (i12 ^ (-1)) | i12)) * (-560)) + i11;
        int i14 = ~((intValue2 & i10) | (i10 ^ intValue2));
        int i15 = -(-(((i14 & i12) | (i12 ^ i14)) * 560));
        List<String> n5 = CollectionsKt.n(this.alpha, new C1713e(intValue, (i13 ^ i15) + ((i15 & i13) << 1), 1));
        int i16 = red;
        purple = ((i16 ^ 23) + ((i16 & 23) << 1)) % 128;
        return n5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ List<? extends String> invoke(List<? extends Integer> list) {
        int i4 = purple;
        red = ((i4 ^ 71) + ((i4 & 71) << 1)) % 128;
        List<String> alpha = alpha(list);
        int i5 = red;
        int i10 = (i5 & 27) + (i5 | 27);
        purple = i10 % 128;
        if (i10 % 2 == 0) {
            return alpha;
        }
        throw null;
    }
}
