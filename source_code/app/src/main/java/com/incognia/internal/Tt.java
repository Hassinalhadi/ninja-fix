package com.incognia.internal;

import android.media.MediaDrm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Tt extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Tt f9686b = new Tt();

    public Tt() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return cT.f9(2, ((MediaDrm) obj).getPropertyByteArray("deviceUniqueId"));
    }
}
