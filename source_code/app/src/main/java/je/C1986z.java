package je;

import ef.C1661i;
import ge.InterfaceC1772d;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oe.C2233d;
import pe.InterfaceC2330f;
import s6.AbstractC2617b6;
import t6.AbstractC3062u;
import ve.AbstractC3192d;
import xe.EnumC3339b;

/* renamed from: je.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1986z extends af implements InterfaceC1772d, aa, P {
    public static final /* synthetic */ int silver = 0;
    public final Class purple;
    public final U red;

    public C1986z(Class jClass) {
        Intrinsics.echo(jClass, "jClass");
        this.purple = jClass;
        this.red = new U(new C1980t(this, 7));
    }

    public final Ne.b azure() {
        Ne.b bVar = Y.alpha;
        Class klass = this.purple;
        Intrinsics.echo(klass, "klass");
        me.j jVar = null;
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.delta(componentType, "klass.componentType");
            if (componentType.isPrimitive()) {
                jVar = Ve.c.bravo(componentType.getSimpleName()).delta();
            }
            if (jVar != null) {
                return new Ne.b(me.n.juliet, jVar.purple);
            }
            return Ne.b.juliet(me.m.golf.golf());
        }
        if (Intrinsics.areEqual(klass, Void.TYPE)) {
            return Y.alpha;
        }
        if (klass.isPrimitive()) {
            jVar = Ve.c.bravo(klass.getSimpleName()).delta();
        }
        if (jVar != null) {
            return new Ne.b(me.n.juliet, jVar.alpha);
        }
        Ne.b alpha = AbstractC3192d.alpha(klass);
        if (!alpha.charlie) {
            String str = C2233d.alpha;
            Ne.b bVar2 = (Ne.b) C2233d.hotel.get(alpha.bravo().india());
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return alpha;
    }

    @Override // je.aa
    /* renamed from: beige, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2330f getDescriptor() {
        return ((C1983w) this.red.invoke()).alpha();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1986z) && Intrinsics.areEqual(AbstractC3062u.charlie(this), AbstractC3062u.charlie((InterfaceC1772d) obj))) {
            return true;
        }
        return false;
    }

    @Override // ge.InterfaceC1770b
    public final List getAnnotations() {
        throw null;
    }

    @Override // ge.InterfaceC1772d
    public final List getTypeParameters() {
        C1983w c1983w = (C1983w) this.red.invoke();
        c1983w.getClass();
        ge.v vVar = C1983w.oscar[7];
        Object invoke = c1983w.hotel.invoke();
        Intrinsics.delta(invoke, "<get-typeParameters>(...)");
        return (List) invoke;
    }

    @Override // kotlin.jvm.internal.d
    public final Class golf() {
        return this.purple;
    }

    @Override // ge.InterfaceC1772d
    public final int hashCode() {
        return AbstractC3062u.charlie(this).hashCode();
    }

    @Override // ge.InterfaceC1772d
    public final boolean hotel() {
        return getDescriptor().hotel();
    }

    @Override // ge.InterfaceC1772d
    public final boolean india() {
        return getDescriptor().india();
    }

    @Override // ge.InterfaceC1772d
    public final boolean isAbstract() {
        if (getDescriptor().golf() == 4) {
            return true;
        }
        return false;
    }

    @Override // ge.InterfaceC1772d
    public final String juliet() {
        C1983w c1983w = (C1983w) this.red.invoke();
        c1983w.getClass();
        ge.v vVar = C1983w.oscar[3];
        return (String) c1983w.echo.invoke();
    }

    @Override // ge.InterfaceC1772d
    public final String kilo() {
        C1983w c1983w = (C1983w) this.red.invoke();
        c1983w.getClass();
        ge.v vVar = C1983w.oscar[2];
        return (String) c1983w.delta.invoke();
    }

    @Override // ge.InterfaceC1772d
    public final Object lima() {
        C1983w c1983w = (C1983w) this.red.invoke();
        c1983w.getClass();
        ge.v vVar = C1983w.oscar[6];
        return c1983w.golf.invoke();
    }

    @Override // ge.InterfaceC1772d
    public final boolean mike() {
        if (getDescriptor().golf() == 2) {
            return true;
        }
        return false;
    }

    @Override // ge.InterfaceC1772d
    public final boolean november(Object obj) {
        List list = AbstractC3192d.alpha;
        Class cls = this.purple;
        Intrinsics.echo(cls, "<this>");
        Integer num = (Integer) AbstractC3192d.delta.get(cls);
        if (num != null) {
            return kotlin.jvm.internal.x.foxtrot(num.intValue(), obj);
        }
        Class cls2 = (Class) AbstractC3192d.charlie.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // je.af
    public final Collection quebec() {
        InterfaceC2330f descriptor = getDescriptor();
        if (descriptor.c() != 2 && descriptor.c() != 6) {
            Collection xray = descriptor.xray();
            Intrinsics.delta(xray, "descriptor.constructors");
            return xray;
        }
        return CollectionsKt.emptyList();
    }

    @Override // je.af
    public final Collection romeo(Ne.f fVar) {
        Xe.n olive = getDescriptor().oscar().olive();
        EnumC3339b enumC3339b = EnumC3339b.purple;
        Collection charlie = olive.charlie(fVar, enumC3339b);
        Xe.n lime = getDescriptor().lime();
        Intrinsics.delta(lime, "descriptor.staticScope");
        return CollectionsKt.a(charlie, lime.charlie(fVar, enumC3339b));
    }

    @Override // je.af
    public final pe.al sierra(int i4) {
        C1661i c1661i;
        Class<?> declaringClass;
        Class cls = this.purple;
        if (Intrinsics.areEqual(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((C1986z) AbstractC3062u.echo(declaringClass)).sierra(i4);
        }
        InterfaceC2330f descriptor = getDescriptor();
        if (descriptor instanceof C1661i) {
            c1661i = (C1661i) descriptor;
        } else {
            c1661i = null;
        }
        if (c1661i != null) {
            Oe.n classLocalVariable = Le.k.juliet;
            Intrinsics.delta(classLocalVariable, "classLocalVariable");
            Ie.ag agVar = (Ie.ag) AbstractC2617b6.delta(c1661i.teal, classLocalVariable, i4);
            if (agVar != null) {
                D5.s sVar = c1661i.e;
                return (pe.al) a0.foxtrot(this.purple, agVar, (Ke.e) sVar.bravo, (G6.j) sVar.delta, c1661i.white, C1985y.alpha);
            }
        }
        return null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder("class ");
        Ne.b azure = azure();
        Ne.c golf = azure.golf();
        Intrinsics.delta(golf, "classId.packageFqName");
        if (golf.delta()) {
            concat = "";
        } else {
            concat = golf.bravo().concat(".");
        }
        sb2.append(concat + kotlin.text.r.november(azure.hotel().bravo(), '.', '$'));
        return sb2.toString();
    }

    @Override // je.af
    public final Collection victor(Ne.f fVar) {
        Xe.n olive = getDescriptor().oscar().olive();
        EnumC3339b enumC3339b = EnumC3339b.purple;
        Collection foxtrot = olive.foxtrot(fVar, enumC3339b);
        Xe.n lime = getDescriptor().lime();
        Intrinsics.delta(lime, "descriptor.staticScope");
        return CollectionsKt.a(foxtrot, lime.foxtrot(fVar, enumC3339b));
    }
}
