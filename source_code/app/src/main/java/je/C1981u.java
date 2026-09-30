package je;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import me.AbstractC2120h;
import me.C2116d;
import of.AbstractC2262q;
import pe.InterfaceC2330f;
import s6.C6;

/* renamed from: je.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1981u extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1986z purple;
    public final /* synthetic */ C1983w red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1981u(C1983w c1983w, C1986z c1986z, int i4) {
        super(0);
        this.alpha = i4;
        this.red = c1983w;
        this.purple = c1986z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Field declaredField;
        int collectionSizeOrDefault;
        C1986z c1986z = this.purple;
        C1983w c1983w = this.red;
        switch (this.alpha) {
            case 0:
                InterfaceC2330f alpha = c1983w.alpha();
                if (alpha.c() != 6) {
                    return null;
                }
                if (alpha.uniform()) {
                    LinkedHashSet linkedHashSet = C2116d.alpha;
                    if (!C6.alpha(alpha)) {
                        declaredField = c1986z.purple.getEnclosingClass().getDeclaredField(alpha.getName().bravo());
                        Object obj = declaredField.get(null);
                        Intrinsics.charlie(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                        return obj;
                    }
                }
                declaredField = c1986z.purple.getDeclaredField("INSTANCE");
                Object obj2 = declaredField.get(null);
                Intrinsics.charlie(obj2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj2;
            case 1:
                if (c1986z.purple.isAnonymousClass()) {
                    return null;
                }
                Ne.b azure = c1986z.azure();
                if (azure.charlie) {
                    c1983w.getClass();
                    Class cls = c1986z.purple;
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        return StringsKt.plum(simpleName, enclosingMethod.getName() + '$', simpleName);
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        return StringsKt.plum(simpleName, enclosingConstructor.getName() + '$', simpleName);
                    }
                    return StringsKt.pink('$', simpleName, simpleName);
                }
                String bravo = azure.india().bravo();
                Intrinsics.delta(bravo, "classId.shortClassName.asString()");
                return bravo;
            case 2:
                Collection<kotlin.reflect.jvm.internal.impl.types.y> lima = c1983w.alpha().tango().lima();
                Intrinsics.delta(lima, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(lima.size());
                for (kotlin.reflect.jvm.internal.impl.types.y kotlinType : lima) {
                    Intrinsics.delta(kotlinType, "kotlinType");
                    arrayList.add(new N(kotlinType, new Ce.ab(kotlinType, c1983w, c1986z, 7)));
                }
                InterfaceC2330f alpha2 = c1983w.alpha();
                Ne.f fVar = AbstractC2120h.echo;
                if (!AbstractC2120h.bravo(alpha2, me.m.alpha) && !AbstractC2120h.bravo(alpha2, me.m.bravo)) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int c3 = Qe.e.charlie(((N) it.next()).alpha).c();
                            com.google.android.material.datepicker.j.sierra(c3, "getClassDescriptorForType(it.type).kind");
                            if (c3 == 2 || c3 == 5) {
                            }
                        }
                    }
                    arrayList.add(new N(Ue.e.echo(c1983w.alpha()).echo(), C1982v.alpha));
                }
                return AbstractC2262q.delta(arrayList);
            default:
                List<pe.aq> papa = c1983w.alpha().papa();
                Intrinsics.delta(papa, "descriptor.declaredTypeParameters");
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(papa, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                for (pe.aq descriptor : papa) {
                    Intrinsics.delta(descriptor, "descriptor");
                    arrayList2.add(new O(c1986z, descriptor));
                }
                return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1981u(C1986z c1986z, C1983w c1983w) {
        super(0);
        this.alpha = 1;
        this.purple = c1986z;
        this.red = c1983w;
    }
}
