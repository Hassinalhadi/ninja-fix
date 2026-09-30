package com.incognia.internal;

import com.google.android.material.datepicker.ah;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Px extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wk f9458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Px(Wk wk) {
        super(0);
        this.f9458b = wk;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ah.foxtrot(this.f9458b.f9869b.getSystemService("systemhealth"));
    }
}
