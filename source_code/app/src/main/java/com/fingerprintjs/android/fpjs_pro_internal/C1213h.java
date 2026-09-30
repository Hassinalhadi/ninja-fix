package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "", "L", "p0", "", "alpha", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1213h extends Lambda implements Function1 {
    public static final C1213h alpha = new Lambda(1);
    public static int purple = 0;
    public static int red = 1;

    public C1213h() {
        super(1);
    }

    @NotNull
    public final Boolean alpha(@NotNull List list) {
        Boolean bool = Boolean.FALSE;
        int i4 = purple;
        int i5 = i4 + 81;
        red = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = i4 + 15;
            red = i10 % 128;
            if (i10 % 2 != 0) {
                return bool;
            }
            throw null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        int i4 = red;
        purple = ((i4 ^ 117) + ((i4 & 117) << 1)) % 128;
        Boolean alpha2 = alpha((List) obj);
        int i5 = red;
        purple = ((i5 ^ 33) + ((i5 & 33) << 1)) % 128;
        return alpha2;
    }
}
