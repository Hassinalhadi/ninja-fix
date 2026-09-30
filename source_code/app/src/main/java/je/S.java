package je;

import cf.C0853i;
import cf.InterfaceC0854j;
import df.C1622a;
import gf.C1795j;
import gf.InterfaceC1796k;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.AbstractC2120h;
import ne.C2177a;
import oe.C2236g;
import oe.C2238i;
import oe.C2243n;
import oe.C2244o;
import re.C2517a;
import re.InterfaceC2518b;
import re.InterfaceC2520d;
import s1.C2576i;
import se.C2862l;
import ue.C3160d;
import ue.C3161e;
import ve.AbstractC3192d;
import xe.C3338a;
import ye.C3426d;

/* loaded from: classes2.dex */
public abstract class S {
    public static final ConcurrentHashMap alpha = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r10v3, types: [cf.a, java.lang.Object, av.ao] */
    /* JADX WARN: Type inference failed for: r12v1, types: [Ge.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [Fe.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v0, types: [Ge.f, java.lang.Object] */
    public static final C3161e alpha(Class cls) {
        C2238i c2238i;
        InterfaceC2518b interfaceC2518b;
        InterfaceC2520d interfaceC2520d;
        int i4 = 1;
        Intrinsics.echo(cls, "<this>");
        ClassLoader delta = AbstractC3192d.delta(cls);
        b0 b0Var = new b0(delta);
        ConcurrentHashMap concurrentHashMap = alpha;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(b0Var);
        if (weakReference != null) {
            C3161e c3161e = (C3161e) weakReference.get();
            if (c3161e != null) {
                return c3161e;
            }
            concurrentHashMap.remove(b0Var, weakReference);
        }
        C2576i c2576i = new C2576i(delta);
        ClassLoader classLoader = Unit.class.getClassLoader();
        Intrinsics.delta(classLoader, "Unit::class.java.classLoader");
        C2576i c2576i2 = new C2576i(classLoader);
        tg.b bVar = new tg.b(1, delta);
        String moduleName = "runtime module for " + delta;
        C3160d c3160d = C3160d.bravo;
        C3160d c3160d2 = C3160d.charlie;
        Intrinsics.echo(moduleName, "moduleName");
        ff.l lVar = new ff.l("DeserializationComponentsForJava.ModuleData");
        C2238i c2238i2 = new C2238i(lVar);
        se.z zVar = new se.z(Ne.f.golf("<" + moduleName + '>'), lVar, c2238i2, 56);
        ff.n nVar = lVar.alpha;
        nVar.lock();
        try {
            if (c2238i2.alpha == null) {
                c2238i2.alpha = zVar;
                nVar.unlock();
                c2238i2.foxtrot = new me.k(zVar, i4);
                ?? obj = new Object();
                D8.c cVar = new D8.c(7, false);
                J2.i iVar = new J2.i(lVar, zVar);
                Ge.f fVar = Ge.f.charlie;
                ze.h hVar = ze.h.charlie;
                ze.h hVar2 = ze.h.alpha;
                U8.a aVar = new U8.a(lVar, CollectionsKt.emptyList());
                pe.ao aoVar = pe.ao.red;
                C3338a c3338a = C3338a.alpha;
                me.l lVar2 = new me.l(zVar, iVar);
                ye.x xVar = ye.x.charlie;
                C3426d c3426d = new C3426d(xVar);
                Be.b bVar2 = Be.b.alpha;
                ?? obj2 = new Object();
                ye.q qVar = ye.q.alpha;
                InterfaceC1796k.bravo.getClass();
                gf.l lVar3 = C1795j.bravo;
                Be.d dVar = new Be.d(new Be.a(lVar, bVar, c2576i, obj, hVar, c3160d, hVar2, aVar, c3160d2, cVar, fVar, aoVar, c3338a, zVar, lVar2, c3426d, obj2, qVar, bVar2, lVar3, xVar, new Object()));
                Me.f jvmMetadataVersion = Me.f.golf;
                Intrinsics.echo(jvmMetadataVersion, "jvmMetadataVersion");
                J2.e eVar = new J2.e(8, c2576i, (Object) obj);
                ?? obj3 = new Object();
                obj3.alpha = c2576i;
                obj3.purple = lVar.charlie(new A0.p(14, obj3));
                obj3.red = zVar;
                obj3.silver = iVar;
                obj3.teal = new J2.c(zVar, iVar);
                obj3.white = Me.f.golf;
                obj3.white = jvmMetadataVersion;
                List juliet = kotlin.collections.ab.juliet(kotlin.reflect.jvm.internal.impl.types.n.alpha);
                AbstractC2120h abstractC2120h = zVar.silver;
                if (abstractC2120h instanceof C2238i) {
                    c2238i = (C2238i) abstractC2120h;
                } else {
                    c2238i = null;
                }
                Ge.f fVar2 = Ge.f.bravo;
                List emptyList = CollectionsKt.emptyList();
                if (c2238i == null || (interfaceC2518b = c2238i.cyan()) == null) {
                    interfaceC2518b = C2517a.bravo;
                }
                InterfaceC2518b interfaceC2518b2 = interfaceC2518b;
                if (c2238i == null || (interfaceC2520d = c2238i.cyan()) == null) {
                    interfaceC2520d = C2517a.delta;
                }
                B9.K k6 = new B9.K(lVar, zVar, eVar, obj3, dVar, c3160d, fVar2, emptyList, iVar, interfaceC2518b2, interfaceC2520d, Me.h.alpha, lVar3, new U8.a(lVar, CollectionsKt.emptyList()), juliet, 262144);
                obj.alpha = k6;
                cVar.purple = new O7.j(11, dVar);
                C2243n additionalClassPartsProvider = c2238i2.cyan();
                C2243n platformDependentDeclarationFilter = c2238i2.cyan();
                U8.a aVar2 = new U8.a(lVar, CollectionsKt.emptyList());
                Intrinsics.echo(additionalClassPartsProvider, "additionalClassPartsProvider");
                Intrinsics.echo(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
                C2244o c2244o = new C2244o(lVar, c2576i2, zVar);
                av.ah ahVar = new av.ah(13, c2244o);
                C1622a c1622a = C1622a.mike;
                c2244o.charlie = new B9.K(lVar, zVar, ahVar, new w.o(zVar, iVar, c1622a), c2244o, InterfaceC0854j.alpha, C0853i.charlie, CollectionsKt.listOf(new C2177a(lVar, zVar), new C2236g(lVar, zVar)), iVar, additionalClassPartsProvider, platformDependentDeclarationFilter, c1622a.alpha, lVar3, aVar2, null, 786432);
                List descriptors = ArraysKt.b(new se.z[]{zVar});
                Intrinsics.echo(descriptors, "descriptors");
                zVar.yellow = new com.google.android.play.core.integrity.c(descriptors, CollectionsKt.emptyList());
                zVar.f13798a = new C2862l(CollectionsKt.listOf(dVar, c2244o), "CompositeProvider@RuntimeModuleData for " + zVar);
                C3161e c3161e2 = new C3161e(k6, new com.bumptech.glide.load.engine.h((Ge.e) obj, c2576i));
                while (true) {
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(b0Var, new WeakReference(c3161e2));
                    if (weakReference2 == null) {
                        return c3161e2;
                    }
                    C3161e c3161e3 = (C3161e) weakReference2.get();
                    if (c3161e3 != null) {
                        return c3161e3;
                    }
                    concurrentHashMap.remove(b0Var, weakReference2);
                }
            } else {
                throw new AssertionError("Built-ins module is already set: " + c2238i2.alpha + " (attempting to reset to " + zVar + ")");
            }
        } finally {
        }
    }
}
