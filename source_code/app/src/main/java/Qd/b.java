package Qd;

import A0.z;
import java.io.Serializable;
import kotlin.collections.ArraysKt;
import kotlin.collections.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends e implements a, Serializable {
    public final Enum[] alpha;

    public b(Enum[] entries) {
        Intrinsics.echo(entries, "entries");
        this.alpha = entries;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.alpha.length;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.echo(element, "element");
        if (((Enum) ArraysKt.ivory(element.ordinal(), this.alpha)) != element) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Enum[] enumArr = this.alpha;
        int length = enumArr.length;
        if (i4 >= 0 && i4 < length) {
            return enumArr[i4];
        }
        throw new IndexOutOfBoundsException(z.juliet("index: ", i4, length, ", size: "));
    }

    @Override // kotlin.collections.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.echo(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) ArraysKt.ivory(ordinal, this.alpha)) != element) {
            return -1;
        }
        return ordinal;
    }

    @Override // kotlin.collections.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.echo(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) ArraysKt.ivory(ordinal, this.alpha)) != element) {
            return -1;
        }
        return ordinal;
    }
}
