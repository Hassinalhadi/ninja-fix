package je;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import ke.InterfaceC2037e;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public abstract class L extends r implements ge.v {
    public static final Object e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f12890a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12891b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12892c;

    /* renamed from: d, reason: collision with root package name */
    public final T f12893d;
    public final af white;
    public final String yellow;

    public L(af afVar, String str, String str2, se.ah ahVar, Object obj) {
        this.white = afVar;
        this.yellow = str;
        this.f12890a = str2;
        this.f12891b = obj;
        this.f12892c = LazyKt.alpha(kotlin.i.alpha, new K(this, 1));
        this.f12893d = V.kilo(ahVar, new K(this, 0));
    }

    public final boolean equals(Object obj) {
        L charlie = a0.charlie(obj);
        if (charlie == null || !Intrinsics.areEqual(this.white, charlie.white) || !Intrinsics.areEqual(this.yellow, charlie.yellow) || !Intrinsics.areEqual(this.f12890a, charlie.f12890a) || !Intrinsics.areEqual(this.f12891b, charlie.f12891b)) {
            return false;
        }
        return true;
    }

    @Override // ge.InterfaceC1771c
    public final String getName() {
        return this.yellow;
    }

    public final int hashCode() {
        return this.f12890a.hashCode() + AbstractC2327c.sierra(this.white.hashCode() * 31, 31, this.yellow);
    }

    @Override // ge.InterfaceC1771c
    public final boolean isSuspend() {
        return false;
    }

    @Override // je.r
    public final InterfaceC2037e quebec() {
        return yankee().quebec();
    }

    @Override // je.r
    public final af romeo() {
        return this.white;
    }

    @Override // je.r
    public final InterfaceC2037e sierra() {
        yankee().getClass();
        return null;
    }

    public final String toString() {
        Pe.t tVar = X.alpha;
        return X.charlie(tango());
    }

    @Override // je.r
    public final boolean victor() {
        return !Intrinsics.areEqual(this.f12891b, kotlin.jvm.internal.c.NO_RECEIVER);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final Member whiskey() {
        if (!tango().gray()) {
            return null;
        }
        Ne.b bVar = Y.alpha;
        V bravo = Y.bravo(tango());
        if (bravo instanceof C1974m) {
            C1974m c1974m = (C1974m) bravo;
            Le.e eVar = c1974m.silver;
            if ((eVar.purple & 16) == 16) {
                Le.c cVar = eVar.yellow;
                int i4 = cVar.purple;
                if ((i4 & 1) != 1 || (i4 & 2) != 2) {
                    return null;
                }
                int i5 = cVar.red;
                Ke.e eVar2 = c1974m.teal;
                return this.white.papa(eVar2.getString(i5), eVar2.getString(cVar.silver));
            }
        }
        return (Field) this.f12892c.getValue();
    }

    @Override // je.r
    /* renamed from: xray, reason: merged with bridge method [inline-methods] */
    public final pe.al tango() {
        Object invoke = this.f12893d.invoke();
        Intrinsics.delta(invoke, "_descriptor()");
        return (pe.al) invoke;
    }

    public abstract H yankee();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(af container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L(af container, se.ah descriptor) {
        this(container, r3, Y.bravo(descriptor).foxtrot(), descriptor, kotlin.jvm.internal.c.NO_RECEIVER);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        String bravo = descriptor.getName().bravo();
        Intrinsics.delta(bravo, "descriptor.name.asString()");
    }
}
