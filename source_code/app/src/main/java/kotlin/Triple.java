package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\r\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0017\u0010\u0010\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlin/Triple;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "alpha", "Ljava/lang/Object;", "getFirst", "()Ljava/lang/Object;", "first", "purple", "getSecond", "second", "red", "getThird", "third", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Triple<A, B, C> implements Serializable {

    /* renamed from: alpha, reason: from kotlin metadata */
    public final Object first;

    /* renamed from: purple, reason: from kotlin metadata */
    public final Object second;

    /* renamed from: red, reason: from kotlin metadata */
    public final Object third;

    public Triple(Object obj, Object obj2, Object obj3) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.areEqual(this.first, triple.first) && Intrinsics.areEqual(this.second, triple.second) && Intrinsics.areEqual(this.third, triple.third);
    }

    public final A getFirst() {
        return (A) this.first;
    }

    public final B getSecond() {
        return (B) this.second;
    }

    public final C getThird() {
        return (C) this.third;
    }

    public final int hashCode() {
        Object obj = this.first;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.second;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.third;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
