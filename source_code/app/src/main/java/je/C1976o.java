package je;

import ge.EnumC1782n;
import ge.InterfaceC1783o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2328d;
import s6.AbstractC2768s5;
import se.C2871u;

/* renamed from: je.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1976o extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1976o(r rVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4;
        ParameterizedType parameterizedType;
        Type type;
        WildcardType wildcardType;
        Type[] lowerBounds;
        int collectionSizeOrDefault;
        int i5 = 0;
        r rVar = this.purple;
        switch (this.alpha) {
            case 0:
                int size = (rVar.isSuspend() ? 1 : 0) + rVar.getParameters().size();
                int size2 = (rVar.getParameters().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                Iterator it = rVar.getParameters().iterator();
                while (it.hasNext()) {
                    av avVar = (av) ((InterfaceC1783o) it.next());
                    boolean papa = avVar.papa();
                    int i10 = avVar.purple;
                    if (papa) {
                        N oscar = avVar.oscar();
                        Ne.c cVar = a0.alpha;
                        kotlin.reflect.jvm.internal.impl.types.y yVar = oscar.alpha;
                        if (yVar == null || !Qe.g.charlie(yVar)) {
                            objArr[i10] = a0.echo(AbstractC2768s5.charlie(avVar.oscar()));
                        }
                    }
                    if (avVar.quebec()) {
                        objArr[i10] = r.papa(avVar.oscar());
                    }
                }
                for (int i11 = 0; i11 < size2; i11++) {
                    objArr[size + i11] = 0;
                }
                return objArr;
            case 1:
                return a0.delta(rVar.tango());
            case 2:
                InterfaceC2328d tango = rVar.tango();
                ArrayList arrayList = new ArrayList();
                if (!rVar.victor()) {
                    C2871u golf = a0.golf(tango);
                    if (golf != null) {
                        arrayList.add(new av(rVar, 0, EnumC1782n.alpha, new C1977p(golf, 0)));
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    C2871u g2 = tango.g();
                    if (g2 != null) {
                        arrayList.add(new av(rVar, i4, EnumC1782n.purple, new C1977p(g2, 1)));
                        i4++;
                    }
                } else {
                    i4 = 0;
                }
                int size3 = tango.peach().size();
                while (i5 < size3) {
                    arrayList.add(new av(rVar, i4, EnumC1782n.red, new C1978q(tango, i5)));
                    i5++;
                    i4++;
                }
                if (rVar.uniform() && (tango instanceof Ae.a) && arrayList.size() > 1) {
                    kotlin.collections.p.romeo(arrayList, new Sb.k(18));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                Type type2 = null;
                if (rVar.isSuspend()) {
                    Object olive = CollectionsKt.olive(rVar.quebec().alpha());
                    if (olive instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) olive;
                    } else {
                        parameterizedType = null;
                    }
                    if (parameterizedType != null) {
                        type = parameterizedType.getRawType();
                    } else {
                        type = null;
                    }
                    if (Intrinsics.areEqual(type, Nd.c.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Intrinsics.delta(actualTypeArguments, "continuationType.actualTypeArguments");
                        Object orange = ArraysKt.orange(actualTypeArguments);
                        if (orange instanceof WildcardType) {
                            wildcardType = (WildcardType) orange;
                        } else {
                            wildcardType = null;
                        }
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type2 = (Type) ArraysKt.fuchsia(lowerBounds);
                        }
                    }
                }
                if (type2 == null) {
                    return rVar.quebec().getReturnType();
                }
                return type2;
            case 4:
                kotlin.reflect.jvm.internal.impl.types.y returnType = rVar.tango().getReturnType();
                Intrinsics.checkNotNull(returnType);
                return new N(returnType, new C1976o(rVar, 3));
            default:
                List<pe.aq> typeParameters = rVar.tango().getTypeParameters();
                Intrinsics.delta(typeParameters, "descriptor.typeParameters");
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                for (pe.aq descriptor : typeParameters) {
                    Intrinsics.delta(descriptor, "descriptor");
                    arrayList2.add(new O(rVar, descriptor));
                }
                return arrayList2;
        }
    }
}
