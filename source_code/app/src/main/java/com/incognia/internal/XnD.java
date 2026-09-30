package com.incognia.internal;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class XnD {

    /* renamed from: W, reason: collision with root package name */
    public final String f9950W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f9951b;

    /* renamed from: f9, reason: collision with root package name */
    public final long f9952f9;
    public final PIe sVU;

    public XnD(Long l10, String str, long j5, PIe pIe) {
        this.f9951b = l10;
        this.f9950W = str;
        this.f9952f9 = j5;
        this.sVU = pIe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XnD)) {
            return false;
        }
        XnD xnD = (XnD) obj;
        if (Intrinsics.areEqual(this.f9951b, xnD.f9951b) && Intrinsics.areEqual(this.f9950W, xnD.f9950W) && this.f9952f9 == xnD.f9952f9 && Intrinsics.areEqual(this.sVU, xnD.sVU)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l10 = this.f9951b;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.sVU.hashCode() + lci.b(this.f9952f9, VpS.b(this.f9950W, hashCode * 31, 31), 31);
    }

    public /* synthetic */ XnD(long j5, PIe pIe) {
        this(null, UUID.randomUUID().toString(), j5, pIe);
    }
}
