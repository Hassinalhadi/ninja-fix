package com.incognia.internal;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class dGS {
    public static final String sVU = (String) wGk.TC.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final boolean f10304W;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f10305b = new AtomicReference(QHn.f9492b.W(sVU));

    /* renamed from: f9, reason: collision with root package name */
    public final CopyOnWriteArraySet f10306f9 = new CopyOnWriteArraySet();

    public dGS(vY vYVar) {
        this.f10304W = vYVar.f11554f9;
    }

    public final boolean b() {
        Boolean bool = (Boolean) this.f10305b.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.f10304W;
    }
}
