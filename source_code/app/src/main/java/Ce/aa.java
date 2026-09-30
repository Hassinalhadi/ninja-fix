package Ce;

import gf.InterfaceC1789d;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.az;
import me.AbstractC2120h;
import of.AbstractC2262q;
import pe.C2339o;
import pe.InterfaceC2335k;
import s6.A0;
import s6.AbstractC2661g5;
import s6.G4;
import t6.L3;

/* loaded from: classes2.dex */
public final class aa extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ad purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa(ad adVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = adVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0283, code lost:
    
        if (me.r.alpha(r7) == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0294  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Be.a aVar;
        ue.f fVar;
        boolean z2;
        Ee.d iVar;
        Ee.d dVar;
        kotlin.reflect.jvm.internal.impl.types.y amber;
        kotlin.reflect.jvm.internal.impl.types.y type;
        int i4 = 0;
        ad adVar = this.purple;
        switch (this.alpha) {
            case 0:
                Ne.f name = (Ne.f) obj;
                Intrinsics.echo(name, "name");
                p pVar = adVar.charlie;
                if (pVar != null) {
                    return (pe.al) pVar.golf.invoke(name);
                }
                ve.w foxtrot = ((c) adVar.echo.invoke()).foxtrot(name);
                if (foxtrot != null) {
                    Field field = foxtrot.alpha;
                    if (!field.isEnumConstant()) {
                        boolean z10 = !Modifier.isFinal(((Field) foxtrot.bravo()).getModifiers());
                        B9.ab abVar = adVar.bravo;
                        Be.c bravo = A0.bravo(abVar, foxtrot);
                        InterfaceC2335k quebec = adVar.quebec();
                        C2339o bravo2 = L3.bravo(foxtrot.echo());
                        Ne.f charlie = foxtrot.charlie();
                        Be.a aVar2 = (Be.a) abVar.purple;
                        ue.f alpha = aVar2.juliet.alpha(foxtrot);
                        if (Modifier.isFinal(((Field) foxtrot.bravo()).getModifiers()) && Modifier.isStatic(((Field) foxtrot.bravo()).getModifiers())) {
                            z2 = true;
                            aVar = aVar2;
                            fVar = alpha;
                        } else {
                            aVar = aVar2;
                            fVar = alpha;
                            z2 = false;
                        }
                        Ae.g h02 = Ae.g.h0(quebec, bravo, bravo2, z10, charlie, fVar, z2);
                        h02.d0(null, null, null, null);
                        Type genericType = field.getGenericType();
                        Intrinsics.delta(genericType, "member.genericType");
                        boolean z11 = genericType instanceof Class;
                        if (z11) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                dVar = new ve.ab(cls);
                                amber = ((J2.t) abVar.teal).amber(dVar, G4.delta(2, false, null, 7));
                                if ((!AbstractC2120h.blue(amber) || AbstractC2120h.bronze(amber)) && Modifier.isFinal(((Field) foxtrot.bravo()).getModifiers())) {
                                    Modifier.isStatic(((Field) foxtrot.bravo()).getModifiers());
                                }
                                h02.g0(amber, CollectionsKt.emptyList(), adVar.papa(), null, CollectionsKt.emptyList());
                                type = h02.getType();
                                if (type == null) {
                                    int i5 = Qe.e.alpha;
                                    if (!h02.white && !kotlin.reflect.jvm.internal.impl.types.c.india(type)) {
                                        if (!az.bravo(type)) {
                                            AbstractC2120h echo = Ue.e.echo(h02);
                                            if (!AbstractC2120h.blue(type)) {
                                                gf.l lVar = InterfaceC1789d.alpha;
                                                if (!lVar.alpha(echo.tango(), type)) {
                                                    if (!lVar.alpha(echo.juliet("Number").oscar(), type)) {
                                                        if (!lVar.alpha(echo.echo(), type)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        h02.e0(null, new ab(adVar, foxtrot, h02, i4));
                                    }
                                    aVar.golf.getClass();
                                    return h02;
                                }
                                Qe.e.alpha(67);
                                throw null;
                            }
                        }
                        if (!(genericType instanceof GenericArrayType) && (!z11 || !((Class) genericType).isArray())) {
                            if (genericType instanceof WildcardType) {
                                iVar = new ve.ag((WildcardType) genericType);
                            } else {
                                iVar = new ve.s(genericType);
                            }
                        } else {
                            iVar = new ve.i(genericType);
                        }
                        dVar = iVar;
                        amber = ((J2.t) abVar.teal).amber(dVar, G4.delta(2, false, null, 7));
                        if (!AbstractC2120h.blue(amber)) {
                        }
                        Modifier.isStatic(((Field) foxtrot.bravo()).getModifiers());
                        h02.g0(amber, CollectionsKt.emptyList(), adVar.papa(), null, CollectionsKt.emptyList());
                        type = h02.getType();
                        if (type == null) {
                        }
                    }
                }
                return null;
            case 1:
                Ne.f name2 = (Ne.f) obj;
                Intrinsics.echo(name2, "name");
                p pVar2 = adVar.charlie;
                if (pVar2 != null) {
                    return (Collection) pVar2.foxtrot.invoke(name2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((c) adVar.echo.invoke()).bravo(name2).iterator();
                while (it.hasNext()) {
                    Ae.f tango = adVar.tango((ve.z) it.next());
                    if (adVar.romeo(tango)) {
                        ((Be.a) adVar.bravo.purple).golf.getClass();
                        arrayList.add(tango);
                    }
                }
                adVar.juliet(name2, arrayList);
                return arrayList;
            case 2:
                Ne.f name3 = (Ne.f) obj;
                Intrinsics.echo(name3, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) adVar.foxtrot.invoke(name3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String delta = AbstractC2661g5.delta((se.ak) obj2, 2);
                    Object obj3 = linkedHashMap.get(delta);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(delta, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection oscar = Qe.l.oscar(list, ac.alpha);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(oscar);
                    }
                }
                adVar.mike(linkedHashSet, name3);
                B9.ab abVar2 = adVar.bravo;
                return CollectionsKt.z(((Be.a) abVar2.purple).romeo.echo(abVar2, linkedHashSet));
            default:
                Ne.f name4 = (Ne.f) obj;
                Intrinsics.echo(name4, "name");
                ArrayList arrayList2 = new ArrayList();
                AbstractC2262q.alpha(arrayList2, adVar.golf.invoke(name4));
                adVar.november(name4, arrayList2);
                if (Qe.e.november(adVar.quebec(), 5)) {
                    return CollectionsKt.z(arrayList2);
                }
                B9.ab abVar3 = adVar.bravo;
                return CollectionsKt.z(((Be.a) abVar3.purple).romeo.echo(abVar3, arrayList2));
        }
    }
}
