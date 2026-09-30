package com.incognia.internal;

import android.media.MediaDrm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class sP extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final sP f11296b = new sP();

    public sP() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MediaDrm) obj).getPropertyString((String) wGk.vSE.getValue());
    }
}
