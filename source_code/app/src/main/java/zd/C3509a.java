package zd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: zd.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3509a {
    public final String alpha;
    public final Ed.a bravo;

    public C3509a(String str, Ed.a aVar) {
        this.alpha = str;
        this.bravo = aVar;
        if (!StringsKt.gray(str)) {
        } else {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3509a)) {
            return false;
        }
        C3509a c3509a = (C3509a) obj;
        if (Intrinsics.areEqual(this.alpha, c3509a.alpha) && Intrinsics.areEqual(this.bravo, c3509a.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: " + this.alpha;
    }
}
