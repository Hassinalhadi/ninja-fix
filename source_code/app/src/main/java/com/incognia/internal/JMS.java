package com.incognia.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JMS {

    /* renamed from: W, reason: collision with root package name */
    public final Long f8946W;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f8947b;

    /* renamed from: f9, reason: collision with root package name */
    public final Long f8948f9;

    public JMS(JSONObject jSONObject, Long l10, Long l11) {
        this.f8947b = jSONObject;
        this.f8946W = l10;
        this.f8948f9 = l11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JMS)) {
            return false;
        }
        JMS jms = (JMS) obj;
        if (Intrinsics.areEqual(this.f8947b, jms.f8947b) && Intrinsics.areEqual(this.f8946W, jms.f8946W) && Intrinsics.areEqual(this.f8948f9, jms.f8948f9)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        JSONObject jSONObject = this.f8947b;
        int i4 = 0;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        int i5 = hashCode * 31;
        Long l10 = this.f8946W;
        if (l10 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l10.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Long l11 = this.f8948f9;
        if (l11 != null) {
            i4 = l11.hashCode();
        }
        return i10 + i4;
    }
}
