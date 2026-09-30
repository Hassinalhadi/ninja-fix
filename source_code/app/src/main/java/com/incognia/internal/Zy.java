package com.incognia.internal;

import android.content.Context;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class Zy implements M1 {

    /* renamed from: W, reason: collision with root package name */
    public static final String f10073W;

    /* renamed from: b, reason: collision with root package name */
    public static final String f10074b;

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10075f9;
    public static final String sVU;

    static {
        f10074b = (String) wGk.UJ.getValue();
        f10073W = (String) wGk.f11685d.getValue();
        f10075f9 = (String) wGk.VKu.getValue();
        sVU = (String) wGk.jQN.getValue();
    }

    @Override // com.incognia.internal.M1
    public final boolean W() {
        return false;
    }

    @Override // com.incognia.internal.M1
    public final int b() {
        return 7;
    }

    @Override // com.incognia.internal.M1
    public final void b(Context context) {
        QHn.f9492b.b(CollectionsKt.a(CollectionsKt.a(CollectionsKt.listOf(f10074b, f10075f9), VD2.b(f10073W)), VD2.b(sVU)));
    }
}
