package ne;

import com.google.android.gms.measurement.internal.C1473v;
import ff.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import pe.InterfaceC2330f;
import re.InterfaceC2519c;
import s6.K4;
import se.C2873w;
import se.z;

/* renamed from: ne.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2177a implements InterfaceC2519c {
    public final l alpha;
    public final z bravo;

    public C2177a(l lVar, z module) {
        Intrinsics.echo(module, "module");
        this.alpha = lVar;
        this.bravo = module;
    }

    @Override // re.InterfaceC2519c
    public final boolean alpha(Ne.c packageFqName, Ne.f name) {
        Intrinsics.echo(packageFqName, "packageFqName");
        Intrinsics.echo(name, "name");
        String bravo = name.bravo();
        Intrinsics.delta(bravo, "name.asString()");
        if (r.quebec(bravo, "Function", false) || r.quebec(bravo, "KFunction", false) || r.quebec(bravo, "SuspendFunction", false) || r.quebec(bravo, "KSuspendFunction", false)) {
            EnumC2181e.red.getClass();
            if (C1473v.delta(bravo, packageFqName) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // re.InterfaceC2519c
    public final Collection bravo(Ne.c packageFqName) {
        Intrinsics.echo(packageFqName, "packageFqName");
        return u.alpha;
    }

    @Override // re.InterfaceC2519c
    public final InterfaceC2330f charlie(Ne.b classId) {
        Intrinsics.echo(classId, "classId");
        if (!classId.charlie && classId.bravo.echo().delta()) {
            String bravo = classId.hotel().bravo();
            if (StringsKt.beige(bravo, "Function", false)) {
                Ne.c golf = classId.golf();
                Intrinsics.delta(golf, "classId.packageFqName");
                EnumC2181e.red.getClass();
                C2180d delta = C1473v.delta(bravo, golf);
                if (delta != null) {
                    List list = (List) K4.alpha(((C2873w) this.bravo.amber(golf)).teal, C2873w.f13797a[0]);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof df.c) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    if (CollectionsKt.green(arrayList2) == null) {
                        return new C2179c(this.alpha, (df.c) CollectionsKt.gold(arrayList), delta.alpha, delta.bravo);
                    }
                    throw new ClassCastException();
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
