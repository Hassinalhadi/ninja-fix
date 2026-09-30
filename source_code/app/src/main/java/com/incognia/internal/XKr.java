package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class XKr {

    /* renamed from: W, reason: collision with root package name */
    public static final String f9909W = (String) wGk.eAG.getValue();

    /* renamed from: f9, reason: collision with root package name */
    public static final String f9910f9 = (String) wGk.w25.getValue();

    /* renamed from: b, reason: collision with root package name */
    public final ozT f9911b = new ozT(OCd.f9289b, eIC.f10358b, f9910f9);

    public final List b() {
        List list = (List) QHn.f9492b.b(new Xw(this.f9911b), f9909W);
        if (list != null) {
            return CollectionsKt.B(list);
        }
        return new ArrayList();
    }
}
