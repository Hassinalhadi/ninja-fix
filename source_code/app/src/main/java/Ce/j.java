package Ce;

import gf.C1791f;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ap;
import pe.AbstractC2316H;
import pe.AbstractC2340p;
import pe.C2310B;
import pe.C2313E;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.ao;
import pe.au;
import qe.InterfaceC2472h;
import s6.A0;
import s6.AbstractC2826z0;
import s6.G4;
import s6.K4;
import se.AbstractC2860j;
import se.C2859i;
import t6.G2;
import t6.L3;
import te.C3118a;

/* loaded from: classes2.dex */
public final class j extends AbstractC2860j implements Ae.c {

    /* renamed from: a, reason: collision with root package name */
    public final ve.q f907a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2330f f908b;

    /* renamed from: c, reason: collision with root package name */
    public final B9.ab f909c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f910d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f911f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC2316H f912g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f913h;

    /* renamed from: i, reason: collision with root package name */
    public final h f914i;

    /* renamed from: j, reason: collision with root package name */
    public final p f915j;

    /* renamed from: k, reason: collision with root package name */
    public final pe.am f916k;

    /* renamed from: l, reason: collision with root package name */
    public final Xe.i f917l;

    /* renamed from: m, reason: collision with root package name */
    public final ak f918m;

    /* renamed from: n, reason: collision with root package name */
    public final Be.c f919n;

    /* renamed from: o, reason: collision with root package name */
    public final ff.i f920o;
    public final B9.ab yellow;

    static {
        ArraysKt.g(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(B9.ab outerContext, InterfaceC2335k containingDeclaration, ve.q jClass, InterfaceC2330f interfaceC2330f) {
        super(r1, containingDeclaration, Ne.f.echo(r2.getSimpleName()), r0.juliet.alpha(jClass));
        int i4;
        int modifiers;
        AbstractC2316H abstractC2316H;
        Class<?> declaringClass;
        ve.q qVar;
        boolean z2;
        boolean z10;
        boolean z11;
        Intrinsics.echo(outerContext, "outerContext");
        Intrinsics.echo(containingDeclaration, "containingDeclaration");
        Intrinsics.echo(jClass, "jClass");
        Be.a aVar = (Be.a) outerContext.purple;
        ff.l lVar = aVar.alpha;
        Class cls = jClass.alpha;
        this.yellow = outerContext;
        this.f907a = jClass;
        this.f908b = interfaceC2330f;
        int i5 = 4;
        B9.ab alpha = AbstractC2826z0.alpha(outerContext, this, jClass, 4);
        this.f909c = alpha;
        Be.a aVar2 = (Be.a) alpha.purple;
        aVar2.golf.getClass();
        this.f910d = LazyKt.lazy(new g(this, 2));
        if (cls.isAnnotation()) {
            i4 = 5;
        } else if (cls.isInterface()) {
            i4 = 2;
        } else if (cls.isEnum()) {
            i4 = 3;
        } else {
            i4 = 1;
        }
        this.e = i4;
        if (!cls.isAnnotation() && !cls.isEnum()) {
            boolean golf = jClass.golf();
            if (!jClass.golf() && !Modifier.isAbstract(cls.getModifiers()) && !cls.isInterface()) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean isFinal = Modifier.isFinal(cls.getModifiers());
            if (golf) {
                i5 = 2;
            } else if (!z11) {
                if (!isFinal) {
                    i5 = 3;
                }
            }
            this.f911f = i5;
            modifiers = cls.getModifiers();
            if (!Modifier.isPublic(modifiers)) {
                abstractC2316H = C2313E.charlie;
            } else if (Modifier.isPrivate(modifiers)) {
                abstractC2316H = C2310B.charlie;
            } else if (Modifier.isProtected(modifiers)) {
                if (Modifier.isStatic(modifiers)) {
                    abstractC2316H = te.c.charlie;
                } else {
                    abstractC2316H = te.b.charlie;
                }
            } else {
                abstractC2316H = C3118a.charlie;
            }
            this.f912g = abstractC2316H;
            declaringClass = cls.getDeclaringClass();
            if (declaringClass == null) {
                qVar = new ve.q(declaringClass);
            } else {
                qVar = null;
            }
            if (qVar == null && !Modifier.isStatic(cls.getModifiers())) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f913h = z2;
            this.f914i = new h(this);
            if (interfaceC2330f == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p pVar = new p(alpha, this, jClass, z10, null);
            this.f915j = pVar;
            ao aoVar = pe.am.delta;
            ff.l storageManager = aVar2.alpha;
            aVar2.uniform.getClass();
            A0.p pVar2 = new A0.p(6, this);
            aoVar.getClass();
            Intrinsics.echo(storageManager, "storageManager");
            this.f916k = new pe.am(this, storageManager, pVar2);
            this.f917l = new Xe.i(pVar);
            this.f918m = new ak(alpha, jClass, this);
            this.f919n = A0.bravo(alpha, jClass);
            this.f920o = storageManager.bravo(new g(this, 1));
        }
        i5 = 1;
        this.f911f = i5;
        modifiers = cls.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
        }
        this.f912g = abstractC2316H;
        declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
        }
        if (qVar == null) {
        }
        z2 = false;
        this.f913h = z2;
        this.f914i = new h(this);
        if (interfaceC2330f == null) {
        }
        p pVar3 = new p(alpha, this, jClass, z10, null);
        this.f915j = pVar3;
        ao aoVar2 = pe.am.delta;
        ff.l storageManager2 = aVar2.alpha;
        aVar2.uniform.getClass();
        A0.p pVar22 = new A0.p(6, this);
        aoVar2.getClass();
        Intrinsics.echo(storageManager2, "storageManager");
        this.f916k = new pe.am(this, storageManager2, pVar22);
        this.f917l = new Xe.i(pVar3);
        this.f918m = new ak(alpha, jClass, this);
        this.f919n = A0.bravo(alpha, jClass);
        this.f920o = storageManager2.bravo(new g(this, 1));
    }

    @Override // pe.InterfaceC2330f
    public final boolean B() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final boolean azure() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final int c() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Iterable] */
    @Override // pe.InterfaceC2330f
    public final Collection coral() {
        Class[] clsArr;
        ?? emptyList;
        InterfaceC2330f interfaceC2330f;
        if (this.f911f == 2) {
            Object obj = null;
            De.a delta = G4.delta(2, false, null, 7);
            Class clazz = this.f907a.alpha;
            Intrinsics.echo(clazz, "clazz");
            J2.n nVar = G2.alpha;
            if (nVar == null) {
                try {
                    nVar = new J2.n(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
                } catch (NoSuchMethodException unused) {
                    nVar = new J2.n(obj, obj, obj, obj);
                }
                G2.alpha = nVar;
            }
            Method method = (Method) nVar.purple;
            if (method == null) {
                clsArr = null;
            } else {
                Object invoke = method.invoke(clazz, null);
                Intrinsics.charlie(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
                clsArr = (Class[]) invoke;
            }
            if (clsArr != null) {
                emptyList = new ArrayList(clsArr.length);
                for (Class cls : clsArr) {
                    emptyList.add(new ve.s(cls));
                }
            } else {
                emptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC2332h kilo = ((J2.t) this.f909c.teal).amber((ve.s) it.next(), delta).green().kilo();
                if (kilo instanceof InterfaceC2330f) {
                    interfaceC2330f = (InterfaceC2330f) kilo;
                } else {
                    interfaceC2330f = null;
                }
                if (interfaceC2330f != null) {
                    arrayList.add(interfaceC2330f);
                }
            }
            return CollectionsKt.p(arrayList, new Object());
        }
        return CollectionsKt.emptyList();
    }

    public final p cyan() {
        return (p) super.x();
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return false;
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return this.f919n;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        ve.q qVar;
        C2339o c2339o = AbstractC2340p.alpha;
        AbstractC2316H abstractC2316H = this.f912g;
        if (Intrinsics.areEqual(abstractC2316H, c2339o)) {
            Class<?> declaringClass = this.f907a.alpha.getDeclaringClass();
            if (declaringClass != null) {
                qVar = new ve.q(declaringClass);
            } else {
                qVar = null;
            }
            if (qVar == null) {
                C2339o c2339o2 = ye.s.alpha;
                Intrinsics.delta(c2339o2, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
                return c2339o2;
            }
        }
        return L3.bravo(abstractC2316H);
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2348x
    public final int golf() {
        return this.f911f;
    }

    @Override // pe.InterfaceC2330f
    public final boolean hotel() {
        return false;
    }

    @Override // pe.InterfaceC2333i
    public final boolean india() {
        return this.f913h;
    }

    @Override // pe.InterfaceC2330f
    public final boolean isInline() {
        return false;
    }

    @Override // pe.InterfaceC2330f
    public final C2859i lavender() {
        return null;
    }

    @Override // pe.InterfaceC2330f
    public final Xe.n lime() {
        return this.f918m;
    }

    @Override // pe.InterfaceC2330f
    public final InterfaceC2330f maroon() {
        return null;
    }

    @Override // pe.InterfaceC2330f, pe.InterfaceC2333i
    public final List papa() {
        return (List) this.f920o.invoke();
    }

    @Override // se.AbstractC2852b, pe.InterfaceC2330f
    public final Xe.n s() {
        return this.f917l;
    }

    @Override // se.y
    public final Xe.n sierra(C1791f c1791f) {
        pe.am amVar = this.f916k;
        Ue.e.juliet(amVar.alpha);
        return (p) ((Xe.n) K4.alpha(amVar.charlie, pe.am.echo[0]));
    }

    @Override // pe.InterfaceC2330f
    public final au t() {
        return null;
    }

    @Override // pe.InterfaceC2332h
    public final ap tango() {
        return this.f914i;
    }

    public final String toString() {
        return "Lazy Java class " + Ue.e.hotel(this);
    }

    @Override // pe.InterfaceC2330f
    public final boolean uniform() {
        return false;
    }

    @Override // se.AbstractC2852b, pe.InterfaceC2330f
    public final Xe.n x() {
        return (p) super.x();
    }

    @Override // pe.InterfaceC2330f
    public final Collection xray() {
        return (List) this.f915j.quebec.invoke();
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }
}
