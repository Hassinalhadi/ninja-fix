package com.checkout.components.rememberme;

import Nf.az;
import com.checkout.components.rememberme.utils.JWTTokenEncoder$Payload$$serializer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

@Jf.e
/* loaded from: classes3.dex */
public final class D {

    @NotNull
    public static final C Companion = new C();

    /* renamed from: a, reason: collision with root package name */
    public final String f5738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5739b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5740c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5741d;

    public /* synthetic */ D(int i4, String str, String str2, String str3, long j5) {
        if (15 != (i4 & 15)) {
            az.juliet(i4, 15, JWTTokenEncoder$Payload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5738a = str;
        this.f5739b = str2;
        this.f5740c = str3;
        this.f5741d = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        if (Intrinsics.areEqual(this.f5738a, d4.f5738a) && Intrinsics.areEqual(this.f5739b, d4.f5739b) && Intrinsics.areEqual(this.f5740c, d4.f5740c) && this.f5741d == d4.f5741d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int sierra = AbstractC2327c.sierra(AbstractC2327c.sierra(this.f5738a.hashCode() * 31, 31, this.f5739b), 31, this.f5740c);
        long j5 = this.f5741d;
        return ((int) (j5 ^ (j5 >>> 32))) + sierra;
    }

    public final String toString() {
        String str = this.f5738a;
        String str2 = this.f5739b;
        String str3 = this.f5740c;
        long j5 = this.f5741d;
        StringBuilder india = av.q.india("Payload(email=", str, ", phone=", str2, ", countryCode=");
        india.append(str3);
        india.append(", iat=");
        india.append(j5);
        india.append(")");
        return india.toString();
    }

    public D(String email, String phone, String countryCode, long j5) {
        Intrinsics.echo(email, "email");
        Intrinsics.echo(phone, "phone");
        Intrinsics.echo(countryCode, "countryCode");
        this.f5738a = email;
        this.f5739b = phone;
        this.f5740c = countryCode;
        this.f5741d = j5;
    }
}
