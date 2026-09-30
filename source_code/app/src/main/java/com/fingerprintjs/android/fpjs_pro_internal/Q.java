package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/Pair;", "", "", "p0", "alpha", "(Ljava/util/List;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class Q extends Lambda implements Function1<List<? extends Pair<? extends String, ? extends Integer>>, Integer> {
    public static final Q alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.Q, kotlin.jvm.internal.Lambda] */
    static {
        if (((53 << 1) - 53) % 2 != 0) {
        } else {
            throw null;
        }
    }

    public Q() {
        super(1);
    }

    @Nullable
    public final Integer alpha(@NotNull List<Pair<String, Integer>> list) {
        int i4 = red;
        purple = (((i4 | 21) << 1) - (i4 ^ 21)) % 128;
        String str = (String) list.get(0).first;
        Pair<String, Integer> pair = list.get(1);
        String str2 = (String) pair.first;
        int intValue = ((Number) pair.second).intValue();
        if (!(!StringsKt.gray(str))) {
            int i5 = purple;
            red = ((i5 & 31) + (i5 | 31)) % 128;
            if (StringsKt.gray(str2)) {
                int i10 = purple;
                int i11 = (i10 & 51) + (i10 | 51);
                red = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 70 / 0;
                    return Integer.valueOf(intValue);
                }
                return Integer.valueOf(intValue);
            }
        }
        int i13 = purple + 121;
        red = i13 % 128;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Integer invoke(List<? extends Pair<? extends String, ? extends Integer>> list) {
        int i4 = red + 95;
        purple = i4 % 128;
        List<? extends Pair<? extends String, ? extends Integer>> list2 = list;
        if (i4 % 2 == 0) {
            return alpha(list2);
        }
        alpha(list2);
        throw null;
    }
}
