package com.incognia.internal;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class F6 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CF f8643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6(CF cf2) {
        super(1);
        this.f8643b = cf2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        this.f8643b.getClass();
        if (StringsKt.beige(str, (String) wGk.tO.getValue(), false)) {
            List maroon = StringsKt.maroon(str, new String[]{":"}, 6);
            if (maroon.size() == 3) {
                return StringsKt.lime((String) maroon.get(2), "/");
            }
            return null;
        }
        return null;
    }
}
