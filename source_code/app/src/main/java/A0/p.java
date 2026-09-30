package A0;

import C1.ap;
import C1.aq;
import Ce.am;
import F.AbstractC0122j1;
import F.Q2;
import F.R2;
import a0.InterfaceC0342ab;
import a0.at;
import android.view.View;
import androidx.compose.foundation.lazy.layout.ao;
import androidx.compose.runtime.t0;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import bv.ai;
import bv.ar;
import bz.C0778c;
import bz.C0786k;
import com.canhub.cropper.CropImageActivity;
import gf.AbstractC1792g;
import gf.C1791f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.as;
import of.C2259n;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2336l;
import pe.InterfaceC2349y;
import s0.AbstractC2557q;
import s0.al;
import s0.an;
import s0.i0;
import s1.au;
import s6.AbstractC2826z0;
import t6.AbstractC3062u;
import t6.AbstractC3075w2;
import ue.C3157a;
import ue.C3158b;
import ve.AbstractC3192d;
import ve.C3193e;

/* loaded from: classes3.dex */
public final class p extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i4, Object obj) {
        super(1);
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0679, code lost:
    
        if (r1.equals("hashCode") == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06c4, code lost:
    
        r0 = ((java.util.ArrayList) r0.golf()).isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x06c2, code lost:
    
        if (r1.equals("toString") != false) goto L231;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06d6  */
    /* JADX WARN: Type inference failed for: r1v14, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object it) {
        boolean z2;
        boolean z10;
        boolean z11;
        Ee.b bVar;
        boolean z12;
        boolean z13;
        float f5;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Fe.a aVar;
        kotlin.reflect.jvm.internal.impl.types.s golf;
        De.f fVar;
        kotlin.reflect.jvm.internal.impl.types.s golf2;
        ve.s sVar = null;
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                aa.echo((ad) it, ((h) obj).alpha);
                return Unit.INSTANCE;
            case 1:
                ((List) it).add((Float) ((ao) obj).invoke());
                return true;
            case 2:
                C3193e annotation = (C3193e) it;
                Intrinsics.echo(annotation, "annotation");
                Ne.f fVar2 = ze.c.alpha;
                Be.c cVar = (Be.c) obj;
                return ze.c.bravo(cVar.alpha, annotation, cVar.red);
            case 3:
                ve.ae typeParameter = (ve.ae) it;
                Intrinsics.echo(typeParameter, "typeParameter");
                Be.e eVar = (Be.e) obj;
                Integer num = (Integer) ((LinkedHashMap) eVar.delta).get(typeParameter);
                if (num == null) {
                    return null;
                }
                int intValue = num.intValue();
                B9.ab abVar = (B9.ab) eVar.bravo;
                Intrinsics.echo(abVar, "<this>");
                B9.ab abVar2 = new B9.ab((Be.a) abVar.purple, eVar, (Lazy) abVar.red);
                InterfaceC2336l interfaceC2336l = (InterfaceC2336l) eVar.charlie;
                return new am(AbstractC2826z0.bravo(abVar2, interfaceC2336l.getAnnotations()), typeParameter, eVar.alpha + intValue, interfaceC2336l);
            case 4:
                Throwable th = (Throwable) it;
                ap apVar = (ap) obj;
                if (th != null) {
                    apVar.hotel.november(new aq(th));
                }
                if (apVar.juliet.alpha()) {
                    ((E1.i) apVar.juliet.getValue()).close();
                }
                return Unit.INSTANCE;
            case 5:
                ve.z m4 = (ve.z) it;
                Intrinsics.echo(m4, "m");
                if (((Boolean) ((Ce.a) obj).bravo.invoke(m4)).booleanValue()) {
                    Class<?> declaringClass = ((Method) m4.bravo()).getDeclaringClass();
                    Intrinsics.delta(declaringClass, "member.declaringClass");
                    if (declaringClass.isInterface()) {
                        String bravo = m4.charlie().bravo();
                        int hashCode = bravo.hashCode();
                        if (hashCode == -1776922004) {
                            break;
                        } else {
                            if (hashCode != -1295482945) {
                                if (hashCode == 147696667) {
                                    break;
                                }
                            } else if (bravo.equals("equals")) {
                                ve.af afVar = (ve.af) CollectionsKt.m(m4.golf());
                                if (afVar != null) {
                                    bVar = afVar.alpha;
                                } else {
                                    bVar = null;
                                }
                                if (bVar instanceof ve.s) {
                                    sVar = (ve.s) bVar;
                                }
                                if (sVar != null) {
                                    ve.u uVar = sVar.bravo;
                                    if ((uVar instanceof ve.q) && Intrinsics.areEqual(((ve.q) uVar).charlie().bravo(), "java.lang.Object")) {
                                        z11 = true;
                                    }
                                }
                            }
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                            if (!z10) {
                                z2 = true;
                                return Boolean.valueOf(z2);
                            }
                        }
                    }
                    z10 = false;
                    if (!z10) {
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 6:
                Intrinsics.echo((C1791f) it, "it");
                Ce.j jVar = (Ce.j) obj;
                B9.ab abVar3 = jVar.f909c;
                if (jVar.f908b != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                return new Ce.p(abVar3, jVar, jVar.f907a, z12, jVar.f915j);
            case 7:
                C1791f kotlinTypeRefiner = (C1791f) it;
                Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
                InterfaceC2330f interfaceC2330f = (InterfaceC2330f) obj;
                if (interfaceC2330f != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    interfaceC2330f = null;
                }
                if (interfaceC2330f != null) {
                    Ue.e.foxtrot(interfaceC2330f);
                }
                return null;
            case 8:
                float floatValue = ((Number) it).floatValue();
                R2 state = ((Q2) obj).getState();
                state.delta(state.bravo() + floatValue);
                return Unit.INSTANCE;
            case 9:
                ((R2) obj).delta(((Number) ((t0) ((C0786k) it).echo).getValue()).floatValue());
                return Unit.INSTANCE;
            case 10:
                InterfaceC0342ab interfaceC0342ab = (InterfaceC0342ab) it;
                float floatValue2 = ((Number) ((C0778c) obj).delta()).floatValue();
                float delta = AbstractC0122j1.delta(interfaceC0342ab, floatValue2);
                float echo = AbstractC0122j1.echo(interfaceC0342ab, floatValue2);
                if (echo == 0.0f) {
                    f5 = 1.0f;
                } else {
                    f5 = delta / echo;
                }
                a0.ap apVar2 = (a0.ap) interfaceC0342ab;
                apVar2.india(f5);
                apVar2.november(AbstractC0122j1.charlie);
                return Unit.INSTANCE;
            case 11:
                ((Number) it).floatValue();
                return Float.valueOf(((Q0.d) obj).lavender(56));
            case 12:
                Fe.a it2 = (Fe.a) it;
                Intrinsics.echo(it2, "it");
                Fe.u uVar2 = (Fe.u) obj;
                boolean z14 = uVar2.bravo;
                p000if.c cVar2 = it2.alpha;
                if (z14) {
                    if (cVar2 != null && (golf2 = AbstractC1792g.golf(cVar2)) != null && (golf2 instanceof De.f)) {
                        fVar = (De.f) golf2;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        return null;
                    }
                }
                if (cVar2 == null) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.types.ae hotel = AbstractC1792g.hotel(cVar2);
                if (hotel == null && ((golf = AbstractC1792g.golf(cVar2)) == null || (hotel = AbstractC1792g.green(golf)) == null)) {
                    hotel = AbstractC1792g.hotel(cVar2);
                    Intrinsics.checkNotNull(hotel);
                }
                kotlin.reflect.jvm.internal.impl.types.ap olive = AbstractC1792g.olive(hotel);
                if (olive == null) {
                    return null;
                }
                List parameters = olive.getParameters();
                Intrinsics.delta(parameters, "this.parameters");
                if (cVar2 instanceof kotlin.reflect.jvm.internal.impl.types.y) {
                    List cyan = ((kotlin.reflect.jvm.internal.impl.types.y) cVar2).cyan();
                    Iterator it3 = parameters.iterator();
                    Iterator it4 = cyan.iterator();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(cyan, 10);
                    ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
                    while (it3.hasNext() && it4.hasNext()) {
                        Object next = it3.next();
                        as asVar = (as) it4.next();
                        pe.aq aqVar = (pe.aq) next;
                        boolean fuchsia = AbstractC1792g.fuchsia(asVar);
                        ye.y yVar = it2.bravo;
                        if (fuchsia) {
                            aVar = new Fe.a(null, yVar, aqVar);
                        } else {
                            B romeo = AbstractC1792g.romeo(asVar);
                            aVar = new Fe.a(romeo, ((Be.a) ((B9.ab) uVar2.delta).purple).quebec.bravo(yVar, romeo.getAnnotations()), aqVar);
                        }
                        arrayList.add(aVar);
                    }
                    return arrayList;
                }
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(cVar2);
                sb2.append(", ");
                throw new IllegalArgumentException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, cVar2.getClass(), sb2).toString());
            case 13:
                InterfaceC2328d it5 = (InterfaceC2328d) it;
                Intrinsics.echo(it5, "it");
                kotlin.reflect.jvm.internal.impl.types.y type = ((se.aq) it5.peach().get(((se.aq) obj).white)).getType();
                Intrinsics.delta(type, "it.valueParameters[p.index].type");
                return type;
            case 14:
                C3158b kotlinClass = (C3158b) it;
                Intrinsics.echo(kotlinClass, "kotlinClass");
                av.ao aoVar = (av.ao) obj;
                aoVar.getClass();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                J2.c cVar3 = new J2.c(aoVar, hashMap, hashMap2);
                Class klass = kotlinClass.alpha;
                Intrinsics.echo(klass, "klass");
                Method[] declaredMethods = klass.getDeclaredMethods();
                Intrinsics.delta(declaredMethods, "klass.declaredMethods");
                int length = declaredMethods.length;
                int i4 = 0;
                while (i4 < length) {
                    Method method = declaredMethods[i4];
                    Ne.f echo2 = Ne.f.echo(method.getName());
                    StringBuilder sb3 = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    Intrinsics.delta(parameterTypes, "method.parameterTypes");
                    int length2 = parameterTypes.length;
                    Class cls = klass;
                    int i5 = 0;
                    while (i5 < length2) {
                        int i10 = length2;
                        Class<?> parameterType = parameterTypes[i5];
                        Intrinsics.delta(parameterType, "parameterType");
                        sb3.append(AbstractC3192d.bravo(parameterType));
                        i5++;
                        length2 = i10;
                    }
                    sb3.append(")");
                    Class<?> returnType = method.getReturnType();
                    Intrinsics.delta(returnType, "method.returnType");
                    sb3.append(AbstractC3192d.bravo(returnType));
                    String sb4 = sb3.toString();
                    Intrinsics.delta(sb4, "sb.toString()");
                    J2.i bronze = cVar3.bronze(echo2, sb4);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    Intrinsics.delta(declaredAnnotations, "method.declaredAnnotations");
                    int length3 = declaredAnnotations.length;
                    int i11 = 0;
                    while (i11 < length3) {
                        Annotation annotation2 = declaredAnnotations[i11];
                        Intrinsics.delta(annotation2, "annotation");
                        Class bravo2 = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation2));
                        Annotation[] annotationArr = declaredAnnotations;
                        int i12 = length3;
                        int i13 = i11;
                        U7.c beige = ((av.ao) ((J2.c) bronze.red).purple).beige(AbstractC3192d.alpha(bravo2), new C3157a(annotation2), (ArrayList) bronze.purple);
                        if (beige != null) {
                            AbstractC3075w2.bravo(beige, annotation2, bravo2);
                        }
                        i11 = i13 + 1;
                        declaredAnnotations = annotationArr;
                        length3 = i12;
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    Intrinsics.delta(parameterAnnotations, "method.parameterAnnotations");
                    Annotation[][] annotationArr2 = parameterAnnotations;
                    int length4 = annotationArr2.length;
                    for (int i14 = 0; i14 < length4; i14++) {
                        Annotation[] annotations = annotationArr2[i14];
                        Intrinsics.delta(annotations, "annotations");
                        int length5 = annotations.length;
                        int i15 = 0;
                        while (i15 < length5) {
                            Annotation[][] annotationArr3 = annotationArr2;
                            Annotation annotation3 = annotations[i15];
                            int i16 = length4;
                            Class bravo3 = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation3));
                            Method[] methodArr = declaredMethods;
                            int i17 = length;
                            U7.c golf3 = bronze.golf(i14, AbstractC3192d.alpha(bravo3), new C3157a(annotation3));
                            if (golf3 != null) {
                                AbstractC3075w2.bravo(golf3, annotation3, bravo3);
                            }
                            i15++;
                            annotationArr2 = annotationArr3;
                            declaredMethods = methodArr;
                            length4 = i16;
                            length = i17;
                        }
                    }
                    bronze.foxtrot();
                    i4++;
                    klass = cls;
                    declaredMethods = declaredMethods;
                    length = length;
                }
                Class cls2 = klass;
                Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                Intrinsics.delta(declaredConstructors, "klass.declaredConstructors");
                int length6 = declaredConstructors.length;
                int i18 = 0;
                while (i18 < length6) {
                    Constructor<?> constructor = declaredConstructors[i18];
                    Ne.f fVar3 = Ne.h.echo;
                    Intrinsics.delta(constructor, "constructor");
                    StringBuilder sb5 = new StringBuilder("(");
                    Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                    Constructor<?>[] constructorArr = declaredConstructors;
                    Intrinsics.delta(parameterTypes2, "constructor.parameterTypes");
                    int length7 = parameterTypes2.length;
                    int i19 = length6;
                    int i20 = 0;
                    while (i20 < length7) {
                        int i21 = length7;
                        Class<?> parameterType2 = parameterTypes2[i20];
                        Intrinsics.delta(parameterType2, "parameterType");
                        sb5.append(AbstractC3192d.bravo(parameterType2));
                        i20++;
                        length7 = i21;
                    }
                    sb5.append(")V");
                    String sb6 = sb5.toString();
                    Intrinsics.delta(sb6, "sb.toString()");
                    J2.i bronze2 = cVar3.bronze(fVar3, sb6);
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    Intrinsics.delta(declaredAnnotations2, "constructor.declaredAnnotations");
                    int length8 = declaredAnnotations2.length;
                    int i22 = 0;
                    while (i22 < length8) {
                        Annotation annotation4 = declaredAnnotations2[i22];
                        Intrinsics.delta(annotation4, "annotation");
                        Annotation[] annotationArr4 = declaredAnnotations2;
                        Class bravo4 = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation4));
                        int i23 = i18;
                        Constructor<?> constructor2 = constructor;
                        int i24 = length8;
                        int i25 = i22;
                        U7.c beige2 = ((av.ao) ((J2.c) bronze2.red).purple).beige(AbstractC3192d.alpha(bravo4), new C3157a(annotation4), (ArrayList) bronze2.purple);
                        if (beige2 != null) {
                            AbstractC3075w2.bravo(beige2, annotation4, bravo4);
                        }
                        i22 = i25 + 1;
                        i18 = i23;
                        declaredAnnotations2 = annotationArr4;
                        constructor = constructor2;
                        length8 = i24;
                    }
                    int i26 = i18;
                    Constructor<?> constructor3 = constructor;
                    Annotation[][] parameterAnnotations2 = constructor3.getParameterAnnotations();
                    Intrinsics.delta(parameterAnnotations2, "parameterAnnotations");
                    if (parameterAnnotations2.length != 0) {
                        int length9 = constructor3.getParameterTypes().length - parameterAnnotations2.length;
                        int length10 = parameterAnnotations2.length;
                        int i27 = 0;
                        while (i27 < length10) {
                            Annotation[] annotations2 = parameterAnnotations2[i27];
                            Intrinsics.delta(annotations2, "annotations");
                            int length11 = annotations2.length;
                            Annotation[][] annotationArr5 = parameterAnnotations2;
                            int i28 = 0;
                            while (i28 < length11) {
                                int i29 = i28;
                                Annotation annotation5 = annotations2[i29];
                                int i30 = length9;
                                Class bravo5 = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation5));
                                int i31 = length10;
                                int i32 = i27;
                                Annotation[] annotationArr6 = annotations2;
                                U7.c golf4 = bronze2.golf(i27 + i30, AbstractC3192d.alpha(bravo5), new C3157a(annotation5));
                                if (golf4 != null) {
                                    AbstractC3075w2.bravo(golf4, annotation5, bravo5);
                                }
                                i28 = i29 + 1;
                                length10 = i31;
                                length9 = i30;
                                i27 = i32;
                                annotations2 = annotationArr6;
                            }
                            i27++;
                            parameterAnnotations2 = annotationArr5;
                        }
                    }
                    bronze2.foxtrot();
                    i18 = i26 + 1;
                    declaredConstructors = constructorArr;
                    length6 = i19;
                }
                Field[] declaredFields = cls2.getDeclaredFields();
                Intrinsics.delta(declaredFields, "klass.declaredFields");
                int length12 = declaredFields.length;
                int i33 = 0;
                while (i33 < length12) {
                    Field field = declaredFields[i33];
                    Ne.f echo3 = Ne.f.echo(field.getName());
                    Class<?> type2 = field.getType();
                    Intrinsics.delta(type2, "field.type");
                    String desc = AbstractC3192d.bravo(type2);
                    Intrinsics.echo(desc, "desc");
                    String bravo6 = echo3.bravo();
                    Intrinsics.delta(bravo6, "name.asString()");
                    Ge.o oVar = new Ge.o(bravo6 + '#' + desc);
                    ArrayList arrayList2 = new ArrayList();
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    Intrinsics.delta(declaredAnnotations3, "field.declaredAnnotations");
                    int length13 = declaredAnnotations3.length;
                    int i34 = 0;
                    while (i34 < length13) {
                        Annotation annotation6 = declaredAnnotations3[i34];
                        Intrinsics.delta(annotation6, "annotation");
                        Class bravo7 = AbstractC3062u.bravo(AbstractC3062u.alpha(annotation6));
                        Field[] fieldArr = declaredFields;
                        int i35 = length12;
                        U7.c beige3 = ((av.ao) cVar3.purple).beige(AbstractC3192d.alpha(bravo7), new C3157a(annotation6), arrayList2);
                        if (beige3 != null) {
                            AbstractC3075w2.bravo(beige3, annotation6, bravo7);
                        }
                        i34++;
                        declaredFields = fieldArr;
                        length12 = i35;
                    }
                    Field[] fieldArr2 = declaredFields;
                    int i36 = length12;
                    if (!arrayList2.isEmpty()) {
                        ((HashMap) cVar3.red).put(oVar, arrayList2);
                    }
                    i33++;
                    declaredFields = fieldArr2;
                    length12 = i36;
                }
                return new Ge.a(hashMap, hashMap2, hashMap3);
            case 15:
                Intrinsics.delta(it, "it");
                ((C2259n) obj).add(it);
                return Unit.INSTANCE;
            case 16:
                InterfaceC2349y it6 = (InterfaceC2349y) it;
                Intrinsics.echo(it6, "it");
                return it6.juliet().papa((me.j) obj);
            case 17:
                Intrinsics.echo((InterfaceC2349y) it, "it");
                return (kotlin.reflect.jvm.internal.impl.types.y) obj;
            case 18:
                ((al) obj).plum((Q0.d) it);
                return Unit.INSTANCE;
            case 19:
                ((com.google.common.util.concurrent.e) obj).cancel(false);
                return Unit.INSTANCE;
            case 20:
                W.g gVar = (W.g) it;
                if (!gVar.getNode().isAttached()) {
                    return i0.purple;
                }
                W.g gVar2 = gVar.purple;
                if (gVar2 != null) {
                    p pVar = new p(20, (O7.j) obj);
                    if (pVar.invoke(gVar2) == i0.alpha) {
                        AbstractC2557q.romeo(gVar2, pVar);
                    }
                }
                gVar.purple = null;
                gVar.alpha = null;
                return i0.alpha;
            case 21:
                an anVar = (an) it;
                ((B2.ap) obj).invoke(anVar);
                anVar.charlie();
                return Unit.INSTANCE;
            case 22:
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
                a0.ap apVar3 = (a0.ap) ((InterfaceC0342ab) it);
                apVar3.juliet(apVar3.alpha() * shadowGraphicsLayerElement.alpha);
                apVar3.kilo(shadowGraphicsLayerElement.purple);
                apVar3.foxtrot(shadowGraphicsLayerElement.red);
                apVar3.delta(shadowGraphicsLayerElement.silver);
                apVar3.lima(shadowGraphicsLayerElement.teal);
                return Unit.INSTANCE;
            case 23:
                at atVar = (at) obj;
                a0.ap apVar4 = (a0.ap) ((InterfaceC0342ab) it);
                apVar4.hotel(atVar.alpha);
                apVar4.india(atVar.purple);
                apVar4.charlie(atVar.red);
                apVar4.oscar(0.0f);
                apVar4.juliet(atVar.silver);
                apVar4.golf(atVar.teal);
                float f10 = atVar.white;
                if (apVar4.f2577c != f10) {
                    apVar4.alpha |= 2048;
                    apVar4.f2577c = f10;
                }
                apVar4.november(atVar.yellow);
                apVar4.kilo(atVar.f2586a);
                apVar4.foxtrot(atVar.f2587b);
                if (!Intrinsics.areEqual(null, null)) {
                    apVar4.alpha |= 131072;
                }
                apVar4.delta(atVar.f2588c);
                apVar4.lima(atVar.f2589d);
                int i37 = atVar.e;
                if (apVar4.f2580g != i37) {
                    apVar4.alpha |= 32768;
                    apVar4.f2580g = i37;
                }
                int i38 = atVar.f2590f;
                if (apVar4.f2584k != i38) {
                    apVar4.alpha |= 524288;
                    apVar4.f2584k = i38;
                }
                if (!Intrinsics.areEqual(null, null)) {
                    apVar4.alpha |= 262144;
                }
                return Unit.INSTANCE;
            case 24:
                ae.ac addCallback = (ae.ac) it;
                Intrinsics.echo(addCallback, "$this$addCallback");
                ((CropImageActivity) obj).golf();
                return Unit.INSTANCE;
            case 25:
                Map.Entry entry = (Map.Entry) it;
                Intrinsics.echo(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = au.alpha;
                return Boolean.valueOf(CollectionsKt.bronze((Collection) obj, s1.al.foxtrot(view)));
            case 26:
                return ((androidx.camera.core.q) obj).juliet;
            case 27:
                if (it == ((ar) obj)) {
                    return "(this)";
                }
                return String.valueOf(it);
            case 28:
                if (it == ((ai) obj)) {
                    return "(this)";
                }
                return String.valueOf(it);
            default:
                if (it == ((bv.am) obj)) {
                    return "(this)";
                }
                return String.valueOf(it);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC2330f interfaceC2330f, De.d dVar, kotlin.reflect.jvm.internal.impl.types.ae aeVar, De.a aVar) {
        super(1);
        this.alpha = 7;
        this.purple = interfaceC2330f;
    }
}
