package Ce;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.C2339o;
import pe.InterfaceC2330f;
import pe.aq;
import pf.AbstractC2360j;
import qe.C2470f;
import qe.C2471g;
import s6.A0;
import s6.AbstractC2661g5;
import s6.G4;
import se.C2859i;
import t6.L3;

/* loaded from: classes2.dex */
public final class n extends Lambda implements Function0 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ B9.ab purple;
    public final /* synthetic */ p red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(B9.ab abVar, p pVar) {
        super(0);
        this.purple = abVar;
        this.red = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Ce.ad, Ce.p] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10, types: [Ae.b] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v5, types: [Ce.am] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [Ae.b, se.i, se.t] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C2470f c2470f;
        int i4;
        ?? r4;
        B9.ab abVar;
        B9.ab abVar2;
        Collection collection;
        ?? r42;
        String str;
        String str2;
        ?? r32;
        ve.z zVar;
        int i5;
        Pair pair;
        Object obj;
        List delta;
        int collectionSizeOrDefault;
        switch (this.alpha) {
            case 0:
                ?? r22 = this.red;
                Constructor<?>[] declaredConstructors = r22.oscar.alpha.getDeclaredConstructors();
                Intrinsics.delta(declaredConstructors, "klass.declaredConstructors");
                List quebec = AbstractC2360j.quebec(AbstractC2360j.oscar(AbstractC2360j.hotel(ArraysKt.tango(declaredConstructors), ve.j.alpha), ve.k.alpha));
                ArrayList arrayList = new ArrayList(quebec.size());
                Iterator it = quebec.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    B9.ab abVar3 = r22.bravo;
                    InterfaceC2330f interfaceC2330f = r22.november;
                    if (hasNext) {
                        ve.t tVar = (ve.t) it.next();
                        Be.c bravo = A0.bravo(abVar3, tVar);
                        Be.a aVar = (Be.a) abVar3.purple;
                        Ae.b q02 = Ae.b.q0(interfaceC2330f, bravo, false, aVar.juliet.alpha(tVar));
                        B9.ab abVar4 = new B9.ab(aVar, new Be.e(abVar3, q02, tVar, interfaceC2330f.papa().size()), (Lazy) abVar3.red);
                        Constructor constructor = tVar.alpha;
                        Type[] types = constructor.getGenericParameterTypes();
                        Intrinsics.delta(types, "types");
                        if (types.length == 0) {
                            delta = CollectionsKt.emptyList();
                        } else {
                            Class declaringClass = constructor.getDeclaringClass();
                            if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                                types = (Type[]) ArraysKt.blue(1, types, types.length);
                            }
                            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                            if (parameterAnnotations.length >= types.length) {
                                if (parameterAnnotations.length > types.length) {
                                    parameterAnnotations = (Annotation[][]) ArraysKt.blue(parameterAnnotations.length - types.length, parameterAnnotations, parameterAnnotations.length);
                                }
                                delta = tVar.delta(types, parameterAnnotations, constructor.isVarArgs());
                            } else {
                                throw new IllegalStateException("Illegal generic signature: " + constructor);
                            }
                        }
                        y uniform = ad.uniform(abVar4, q02, delta);
                        List papa = interfaceC2330f.papa();
                        Intrinsics.delta(papa, "classDescriptor.declaredTypeParameters");
                        ArrayList typeParameters = tVar.getTypeParameters();
                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                        Iterator it2 = typeParameters.iterator();
                        while (it2.hasNext()) {
                            aq alpha = ((Be.f) abVar4.white).alpha((ve.ae) it2.next());
                            Intrinsics.checkNotNull(alpha);
                            arrayList2.add(alpha);
                        }
                        q02.o0(uniform.bravo, L3.bravo(tVar.echo()), CollectionsKt.a(papa, arrayList2));
                        q02.h0(false);
                        q02.i0(uniform.alpha);
                        q02.j0(interfaceC2330f.oscar());
                        ((Be.a) abVar4.purple).golf.getClass();
                        arrayList.add(q02);
                    } else {
                        ve.q qVar = r22.oscar;
                        boolean foxtrot = qVar.foxtrot();
                        C2470f c2470f2 = C2471g.alpha;
                        int i10 = 2;
                        Object obj2 = null;
                        B9.ab abVar5 = this.purple;
                        if (foxtrot) {
                            Ae.b q03 = Ae.b.q0(interfaceC2330f, c2470f2, true, ((Be.a) abVar3.purple).juliet.alpha(qVar));
                            ArrayList echo = qVar.echo();
                            ArrayList arrayList3 = new ArrayList(echo.size());
                            De.a delta2 = G4.delta(2, false, null, 6);
                            Iterator it3 = echo.iterator();
                            int i11 = 0;
                            while (it3.hasNext()) {
                                ve.ac acVar = (ve.ac) it3.next();
                                C2470f c2470f3 = c2470f2;
                                Ae.b bVar = q03;
                                arrayList3.add(new se.aq(bVar, null, i11, c2470f3, acVar.charlie(), ((J2.t) abVar3.teal).amber(acVar.foxtrot(), delta2), false, false, false, null, ((Be.a) abVar3.purple).juliet.alpha(acVar)));
                                obj2 = null;
                                q03 = bVar;
                                i10 = 2;
                                c2470f2 = c2470f3;
                                abVar5 = abVar5;
                                i11++;
                            }
                            Object obj3 = obj2;
                            C2859i c2859i = q03;
                            r4 = obj3;
                            int i12 = i10;
                            c2470f = c2470f2;
                            i4 = i12;
                            abVar = abVar5;
                            c2859i.i0(false);
                            C2339o PROTECTED_AND_PACKAGE = interfaceC2330f.getVisibility();
                            Intrinsics.delta(PROTECTED_AND_PACKAGE, "classDescriptor.visibility");
                            if (Intrinsics.areEqual(PROTECTED_AND_PACKAGE, ye.s.bravo)) {
                                PROTECTED_AND_PACKAGE = ye.s.charlie;
                                Intrinsics.delta(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                            }
                            c2859i.n0(arrayList3, PROTECTED_AND_PACKAGE);
                            c2859i.h0(false);
                            c2859i.j0(interfaceC2330f.oscar());
                            String delta3 = AbstractC2661g5.delta(c2859i, i4);
                            if (!arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    if (Intrinsics.areEqual(AbstractC2661g5.delta((C2859i) it4.next(), i4), delta3)) {
                                    }
                                }
                            }
                            arrayList.add(c2859i);
                            ((Be.a) abVar.purple).golf.getClass();
                        } else {
                            c2470f = c2470f2;
                            i4 = 2;
                            r4 = 0;
                            abVar = abVar5;
                        }
                        ((Ve.a) ((Be.a) abVar.purple).xray).alpha(abVar, interfaceC2330f, arrayList);
                        Be.a aVar2 = (Be.a) abVar.purple;
                        if (arrayList.isEmpty()) {
                            Class cls = qVar.alpha;
                            boolean isAnnotation = cls.isAnnotation();
                            cls.isInterface();
                            if (!isAnnotation) {
                                abVar2 = abVar;
                                obj = r4;
                            } else {
                                Ae.b q04 = Ae.b.q0(interfaceC2330f, c2470f, true, ((Be.a) abVar3.purple).juliet.alpha(qVar));
                                if (isAnnotation) {
                                    List delta4 = qVar.delta();
                                    r32 = new ArrayList(delta4.size());
                                    De.a delta5 = G4.delta(i4, true, r4, 6);
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj4 : delta4) {
                                        if (Intrinsics.areEqual(((ve.z) obj4).charlie(), ye.ab.bravo)) {
                                            arrayList4.add(obj4);
                                        } else {
                                            arrayList5.add(obj4);
                                        }
                                    }
                                    arrayList4.size();
                                    ve.z zVar2 = (ve.z) CollectionsKt.green(arrayList4);
                                    J2.t tVar2 = (J2.t) abVar3.teal;
                                    if (zVar2 != null) {
                                        ve.ad foxtrot2 = zVar2.foxtrot();
                                        if (foxtrot2 instanceof ve.i) {
                                            ve.i iVar = (ve.i) foxtrot2;
                                            zVar = zVar2;
                                            pair = new Pair(tVar2.zulu(iVar, delta5, true), tVar2.amber(iVar.bravo, delta5));
                                        } else {
                                            zVar = zVar2;
                                            pair = new Pair(tVar2.amber(foxtrot2, delta5), null);
                                        }
                                        abVar2 = abVar;
                                        Ae.b bVar2 = q04;
                                        str2 = "classDescriptor.visibility";
                                        str = "PROTECTED_AND_PACKAGE";
                                        r22.xray(r32, bVar2, 0, zVar, (kotlin.reflect.jvm.internal.impl.types.y) pair.first, (kotlin.reflect.jvm.internal.impl.types.y) pair.second);
                                        r42 = bVar2;
                                    } else {
                                        zVar = zVar2;
                                        str = "PROTECTED_AND_PACKAGE";
                                        abVar2 = abVar;
                                        r42 = q04;
                                        str2 = "classDescriptor.visibility";
                                    }
                                    if (zVar != null) {
                                        i5 = 1;
                                    } else {
                                        i5 = 0;
                                    }
                                    Iterator it5 = arrayList5.iterator();
                                    int i13 = 0;
                                    while (it5.hasNext()) {
                                        ve.z zVar3 = (ve.z) it5.next();
                                        r22.xray(r32, r42, i13 + i5, zVar3, tVar2.amber(zVar3.foxtrot(), delta5), null);
                                        i13++;
                                    }
                                } else {
                                    r42 = q04;
                                    str = "PROTECTED_AND_PACKAGE";
                                    str2 = "classDescriptor.visibility";
                                    abVar2 = abVar;
                                    r32 = Collections.EMPTY_LIST;
                                }
                                r42.i0(false);
                                C2339o visibility = interfaceC2330f.getVisibility();
                                Intrinsics.delta(visibility, str2);
                                if (Intrinsics.areEqual(visibility, ye.s.bravo)) {
                                    visibility = ye.s.charlie;
                                    Intrinsics.delta(visibility, str);
                                }
                                r42.n0(r32, visibility);
                                r42.h0(true);
                                r42.j0(interfaceC2330f.oscar());
                                ((Be.a) abVar3.purple).golf.getClass();
                                obj = r42;
                            }
                            collection = CollectionsKt.orange(obj);
                        } else {
                            abVar2 = abVar;
                            collection = arrayList;
                        }
                        return CollectionsKt.z(aVar2.romeo.echo(abVar2, collection));
                    }
                }
                break;
            default:
                B9.ab abVar6 = this.purple;
                return CollectionsKt.D(((Ve.a) ((Be.a) abVar6.purple).xray).foxtrot(abVar6, this.red.november));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, B9.ab abVar) {
        super(0);
        this.red = pVar;
        this.purple = abVar;
    }
}
