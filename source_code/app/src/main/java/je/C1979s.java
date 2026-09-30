package je;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import t6.Y1;

/* renamed from: je.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1979s extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1983w purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1979s(C1983w c1983w, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c1983w;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC2330f interfaceC2330f;
        Class cls;
        C1986z c1986z;
        C1986z c1986z2;
        switch (this.alpha) {
            case 0:
                C1983w c1983w = this.purple;
                c1983w.getClass();
                ge.v[] vVarArr = C1983w.oscar;
                ge.v vVar = vVarArr[14];
                Object invoke = c1983w.mike.invoke();
                Intrinsics.delta(invoke, "<get-allNonStaticMembers>(...)");
                ge.v vVar2 = vVarArr[15];
                Object invoke2 = c1983w.november.invoke();
                Intrinsics.delta(invoke2, "<get-allStaticMembers>(...)");
                return CollectionsKt.a((Collection) invoke, (Collection) invoke2);
            case 1:
                C1983w c1983w2 = this.purple;
                c1983w2.getClass();
                ge.v[] vVarArr2 = C1983w.oscar;
                ge.v vVar3 = vVarArr2[10];
                Object invoke3 = c1983w2.india.invoke();
                Intrinsics.delta(invoke3, "<get-declaredNonStaticMembers>(...)");
                ge.v vVar4 = vVarArr2[12];
                Object invoke4 = c1983w2.kilo.invoke();
                Intrinsics.delta(invoke4, "<get-inheritedNonStaticMembers>(...)");
                return CollectionsKt.a((Collection) invoke3, (Collection) invoke4);
            case 2:
                C1983w c1983w3 = this.purple;
                c1983w3.getClass();
                ge.v[] vVarArr3 = C1983w.oscar;
                ge.v vVar5 = vVarArr3[11];
                Object invoke5 = c1983w3.juliet.invoke();
                Intrinsics.delta(invoke5, "<get-declaredStaticMembers>(...)");
                ge.v vVar6 = vVarArr3[13];
                Object invoke6 = c1983w3.lima.invoke();
                Intrinsics.delta(invoke6, "<get-inheritedStaticMembers>(...)");
                return CollectionsKt.a((Collection) invoke5, (Collection) invoke6);
            case 3:
                return a0.delta(this.purple.alpha());
            case 4:
                C1983w c1983w4 = this.purple;
                c1983w4.getClass();
                ge.v[] vVarArr4 = C1983w.oscar;
                ge.v vVar7 = vVarArr4[10];
                Object invoke7 = c1983w4.india.invoke();
                Intrinsics.delta(invoke7, "<get-declaredNonStaticMembers>(...)");
                ge.v vVar8 = vVarArr4[11];
                Object invoke8 = c1983w4.juliet.invoke();
                Intrinsics.delta(invoke8, "<get-declaredStaticMembers>(...)");
                return CollectionsKt.a((Collection) invoke7, (Collection) invoke8);
            case 5:
                Xe.n s3 = this.purple.alpha().s();
                Intrinsics.delta(s3, "descriptor.unsubstitutedInnerClassesScope");
                Collection alpha = Y1.alpha(s3, null, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : alpha) {
                    if (!Qe.e.mike((InterfaceC2335k) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC2335k interfaceC2335k = (InterfaceC2335k) it.next();
                    if (interfaceC2335k instanceof InterfaceC2330f) {
                        interfaceC2330f = (InterfaceC2330f) interfaceC2335k;
                    } else {
                        interfaceC2330f = null;
                    }
                    if (interfaceC2330f != null) {
                        cls = a0.juliet(interfaceC2330f);
                    } else {
                        cls = null;
                    }
                    if (cls != null) {
                        c1986z = new C1986z(cls);
                    } else {
                        c1986z = null;
                    }
                    if (c1986z != null) {
                        arrayList2.add(c1986z);
                    }
                }
                return arrayList2;
            default:
                Collection<InterfaceC2330f> coral = this.purple.alpha().coral();
                Intrinsics.delta(coral, "descriptor.sealedSubclasses");
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC2330f interfaceC2330f2 : coral) {
                    Intrinsics.charlie(interfaceC2330f2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class juliet = a0.juliet(interfaceC2330f2);
                    if (juliet != null) {
                        c1986z2 = new C1986z(juliet);
                    } else {
                        c1986z2 = null;
                    }
                    if (c1986z2 != null) {
                        arrayList3.add(c1986z2);
                    }
                }
                return arrayList3;
        }
    }
}
