package com.checkout.components.rememberme;

import Nf.az;
import com.checkout.components.rememberme.utils.JWTTokenEncoder$Header$$serializer;
import io.reactivex.annotations.SchedulerSupport;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Jf.e
/* loaded from: classes3.dex */
public final class B {

    @NotNull
    public static final A Companion = new A();

    /* renamed from: a, reason: collision with root package name */
    public final String f5717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5718b;

    public /* synthetic */ B(int i4, String str, String str2) {
        if (3 != (i4 & 3)) {
            az.juliet(i4, 3, JWTTokenEncoder$Header$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5717a = str;
        this.f5718b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        if (Intrinsics.areEqual(this.f5717a, b2.f5717a) && Intrinsics.areEqual(this.f5718b, b2.f5718b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5718b.hashCode() + (this.f5717a.hashCode() * 31);
    }

    public final String toString() {
        return av.q.golf("Header(alg=", this.f5717a, ", typ=", this.f5718b, ")");
    }

    public B() {
        this.f5717a = SchedulerSupport.NONE;
        this.f5718b = "JWT";
    }
}
