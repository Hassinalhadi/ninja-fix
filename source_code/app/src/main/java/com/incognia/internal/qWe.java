package com.incognia.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qWe {

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f11151J;

    /* renamed from: W, reason: collision with root package name */
    public final Long f11152W;

    /* renamed from: b, reason: collision with root package name */
    public final Long f11153b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f11154f9;
    public final Long gmP;
    public final ArrayList sVU;

    public qWe(Long l10, Long l11, Long l12, ArrayList arrayList, Long l13, ArrayList arrayList2) {
        this.f11153b = l10;
        this.f11152W = l11;
        this.f11154f9 = l12;
        this.sVU = arrayList;
        this.gmP = l13;
        this.f11151J = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qWe)) {
            return false;
        }
        qWe qwe = (qWe) obj;
        if (Intrinsics.areEqual(this.f11153b, qwe.f11153b) && Intrinsics.areEqual(this.f11152W, qwe.f11152W) && Intrinsics.areEqual(this.f11154f9, qwe.f11154f9) && Intrinsics.areEqual(this.sVU, qwe.sVU) && Intrinsics.areEqual(this.gmP, qwe.gmP) && Intrinsics.areEqual(this.f11151J, qwe.f11151J)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11151J.hashCode() + ((this.gmP.hashCode() + ((this.sVU.hashCode() + ((this.f11154f9.hashCode() + ((this.f11152W.hashCode() + (this.f11153b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
