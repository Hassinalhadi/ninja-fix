package com.incognia.internal;

import android.location.Location;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class fmh extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ tNn f10436W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kVL f10437b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmh(kVL kvl, tNn tnn) {
        super(1);
        this.f10437b = kvl;
        this.f10436W = tnn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        if (location == null) {
            this.f10437b.b(null);
        } else {
            this.f10437b.b(this.f10436W.olU.b(new Pair(location, this.f10436W.gmP.b(location))));
        }
        return Unit.INSTANCE;
    }
}
