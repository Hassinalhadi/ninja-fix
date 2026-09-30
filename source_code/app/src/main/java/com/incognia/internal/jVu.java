package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jVu {

    /* renamed from: W, reason: collision with root package name */
    public final pXB f10691W;

    /* renamed from: b, reason: collision with root package name */
    public final n2I f10692b;

    /* renamed from: f9, reason: collision with root package name */
    public final Function1 f10693f9;

    public jVu(n2I n2i, pXB pxb, u0w u0wVar) {
        this.f10692b = n2i;
        this.f10691W = pxb;
        this.f10693f9 = u0wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jVu)) {
            return false;
        }
        jVu jvu = (jVu) obj;
        if (Intrinsics.areEqual(this.f10692b, jvu.f10692b) && Intrinsics.areEqual(this.f10691W, jvu.f10691W) && Intrinsics.areEqual(this.f10693f9, jvu.f10693f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10693f9.hashCode() + ((this.f10691W.hashCode() + (this.f10692b.hashCode() * 31)) * 31);
    }

    public jVu(n2I n2i, pXB pxb) {
        HB6 hb6 = HB6.f8827b;
        this.f10692b = n2i;
        this.f10691W = pxb;
        this.f10693f9 = hb6;
    }
}
