package kotlin.jvm.internal;

import ao.ad;
import d.C1534h0;
import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import java.util.List;
import kotlin.collections.CollectionsKt;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public final class aa implements ge.w {
    public final InterfaceC1773e alpha;
    public final List purple;
    public final int red;

    public aa(InterfaceC1773e classifier, List arguments, int i4) {
        Intrinsics.echo(classifier, "classifier");
        Intrinsics.echo(arguments, "arguments");
        this.alpha = classifier;
        this.purple = arguments;
        this.red = i4;
    }

    @Override // ge.w
    public final boolean alpha() {
        if ((this.red & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // ge.w
    public final List delta() {
        return this.purple;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aa) {
            aa aaVar = (aa) obj;
            if (Intrinsics.areEqual(this.alpha, aaVar.alpha) && Intrinsics.areEqual(this.purple, aaVar.purple) && Intrinsics.areEqual(null, null) && this.red == aaVar.red) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ge.w
    public final InterfaceC1773e foxtrot() {
        return this.alpha;
    }

    @Override // ge.InterfaceC1770b
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final String golf(boolean z2) {
        InterfaceC1772d interfaceC1772d;
        String name;
        String maroon;
        InterfaceC1773e interfaceC1773e = this.alpha;
        Class cls = null;
        if (interfaceC1773e instanceof InterfaceC1772d) {
            interfaceC1772d = (InterfaceC1772d) interfaceC1773e;
        } else {
            interfaceC1772d = null;
        }
        if (interfaceC1772d != null) {
            cls = AbstractC3062u.bravo(interfaceC1772d);
        }
        if (cls == null) {
            name = interfaceC1773e.toString();
        } else if ((this.red & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (Intrinsics.areEqual(cls, boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (Intrinsics.areEqual(cls, char[].class)) {
                name = "kotlin.CharArray";
            } else if (Intrinsics.areEqual(cls, byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (Intrinsics.areEqual(cls, short[].class)) {
                name = "kotlin.ShortArray";
            } else if (Intrinsics.areEqual(cls, int[].class)) {
                name = "kotlin.IntArray";
            } else if (Intrinsics.areEqual(cls, float[].class)) {
                name = "kotlin.FloatArray";
            } else if (Intrinsics.areEqual(cls, long[].class)) {
                name = "kotlin.LongArray";
            } else if (Intrinsics.areEqual(cls, double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else if (z2 && cls.isPrimitive()) {
            Intrinsics.charlie(interfaceC1773e, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC3062u.charlie((InterfaceC1772d) interfaceC1773e).getName();
        } else {
            name = cls.getName();
        }
        String str = "";
        if (this.purple.isEmpty()) {
            maroon = "";
        } else {
            maroon = CollectionsKt.maroon(this.purple, ", ", "<", ">", new C1534h0(24, this), 24);
        }
        if (alpha()) {
            str = "?";
        }
        return ad.amber(name, maroon, str);
    }

    public final int hashCode() {
        return com.google.android.material.datepicker.j.golf(this.alpha.hashCode() * 31, 31, this.purple) + this.red;
    }

    public final String toString() {
        return golf(false) + " (Kotlin reflection is not available)";
    }
}
