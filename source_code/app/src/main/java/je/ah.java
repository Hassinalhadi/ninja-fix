package je;

import ge.InterfaceC1775g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import ke.C2038f;
import ke.InterfaceC2037e;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2340p;
import pe.InterfaceC2330f;
import pe.InterfaceC2345u;
import s6.AbstractC2662g6;
import s6.AbstractC2671h6;
import se.AbstractC2863m;
import se.C2859i;
import t6.AbstractC3023m;

/* loaded from: classes2.dex */
public final class ah extends r implements kotlin.jvm.internal.g, InterfaceC1775g, InterfaceC1966e {
    public static final /* synthetic */ ge.v[] e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12894a;

    /* renamed from: b, reason: collision with root package name */
    public final T f12895b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12896c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12897d;
    public final af white;
    public final String yellow;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        e = new ge.v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(ah.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public ah(af afVar, String str, String str2, InterfaceC2345u interfaceC2345u, Object obj) {
        this.white = afVar;
        this.yellow = str2;
        this.f12894a = obj;
        this.f12895b = V.kilo(interfaceC2345u, new Xa.f(15, this, str));
        kotlin.i iVar = kotlin.i.alpha;
        this.f12896c = LazyKt.alpha(iVar, new ag(this, 0));
        this.f12897d = LazyKt.alpha(iVar, new ag(this, 1));
    }

    public static final ke.t whiskey(ah ahVar, Constructor constructor, InterfaceC2345u interfaceC2345u, boolean z2) {
        Class<?> cls;
        C2859i c2859i;
        Object[] objArr;
        if (!z2) {
            ahVar.getClass();
            if (interfaceC2345u instanceof C2859i) {
                c2859i = (C2859i) interfaceC2345u;
            } else {
                c2859i = null;
            }
            if (c2859i != null) {
                C2859i c2859i2 = c2859i;
                if (!AbstractC2340p.echo(c2859i2.getVisibility())) {
                    InterfaceC2330f zulu = c2859i.zulu();
                    Intrinsics.delta(zulu, "constructorDescriptor.constructedClass");
                    if (!Qe.g.bravo(zulu) && !Qe.e.quebec(c2859i.zulu())) {
                        List peach = c2859i2.peach();
                        Intrinsics.delta(peach, "constructorDescriptor.valueParameters");
                        if (!peach.isEmpty()) {
                            Iterator it = peach.iterator();
                            while (it.hasNext()) {
                                kotlin.reflect.jvm.internal.impl.types.y type = ((se.aq) it.next()).getType();
                                Intrinsics.delta(type, "it.type");
                                if (AbstractC3023m.alpha(type)) {
                                    if (ahVar.victor()) {
                                        return new C2038f(constructor, AbstractC2671h6.alpha(ahVar.f12894a, ahVar.tango()), 0);
                                    }
                                    Intrinsics.echo(constructor, "constructor");
                                    Class declaringClass = constructor.getDeclaringClass();
                                    Intrinsics.delta(declaringClass, "constructor.declaringClass");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    Intrinsics.delta(genericParameterTypes, "constructor.genericParameterTypes");
                                    if (genericParameterTypes.length <= 1) {
                                        objArr = new Type[0];
                                    } else {
                                        objArr = ArraysKt.blue(0, genericParameterTypes, genericParameterTypes.length - 1);
                                    }
                                    return new ke.g(constructor, declaringClass, null, (Type[]) objArr, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (ahVar.victor()) {
            return new C2038f(constructor, AbstractC2671h6.alpha(ahVar.f12894a, ahVar.tango()), 1);
        }
        Intrinsics.echo(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        Intrinsics.delta(declaringClass2, "constructor.declaringClass");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        } else {
            cls = null;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        Intrinsics.delta(genericParameterTypes2, "constructor.genericParameterTypes");
        return new ke.g(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    public final boolean equals(Object obj) {
        ah bravo = a0.bravo(obj);
        if (bravo == null || !Intrinsics.areEqual(this.white, bravo.white) || !Intrinsics.areEqual(getName(), bravo.getName()) || !Intrinsics.areEqual(this.yellow, bravo.yellow) || !Intrinsics.areEqual(this.f12894a, bravo.f12894a)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return AbstractC2662g6.alpha(quebec());
    }

    @Override // ge.InterfaceC1771c
    public final String getName() {
        String bravo = ((AbstractC2863m) tango()).getName().bravo();
        Intrinsics.delta(bravo, "descriptor.name.asString()");
        return bravo;
    }

    @Override // Xd.o
    public final Object golf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final int hashCode() {
        return this.yellow.hashCode() + ((getName().hashCode() + (this.white.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // ge.InterfaceC1775g
    public final boolean isExternal() {
        return tango().isExternal();
    }

    @Override // ge.InterfaceC1775g
    public final boolean isInfix() {
        return tango().isInfix();
    }

    @Override // ge.InterfaceC1775g
    public final boolean isInline() {
        return tango().isInline();
    }

    @Override // ge.InterfaceC1775g
    public final boolean isOperator() {
        return tango().isOperator();
    }

    @Override // ge.InterfaceC1771c
    public final boolean isSuspend() {
        return tango().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // je.r
    public final InterfaceC2037e quebec() {
        return (InterfaceC2037e) this.f12896c.getValue();
    }

    @Override // je.r
    public final af romeo() {
        return this.white;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // je.r
    public final InterfaceC2037e sierra() {
        return (InterfaceC2037e) this.f12897d.getValue();
    }

    public final String toString() {
        Pe.t tVar = X.alpha;
        return X.bravo(tango());
    }

    @Override // je.r
    public final boolean victor() {
        return !Intrinsics.areEqual(this.f12894a, kotlin.jvm.internal.c.NO_RECEIVER);
    }

    @Override // je.r
    /* renamed from: xray, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2345u tango() {
        ge.v vVar = e[0];
        Object invoke = this.f12895b.invoke();
        Intrinsics.delta(invoke, "<get-descriptor>(...)");
        return (InterfaceC2345u) invoke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // Xd.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // Xd.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ah(af container, InterfaceC2345u descriptor) {
        this(container, r3, Y.charlie(descriptor).foxtrot(), descriptor, kotlin.jvm.internal.c.NO_RECEIVER);
        Intrinsics.echo(container, "container");
        Intrinsics.echo(descriptor, "descriptor");
        String bravo = ((AbstractC2863m) descriptor).getName().bravo();
        Intrinsics.delta(bravo, "descriptor.name.asString()");
    }
}
