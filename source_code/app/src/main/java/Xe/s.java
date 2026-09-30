package Xe;

import B9.K;
import Ie.ag;
import Y.aa;
import Yb.C0313k;
import Yb.L0;
import af.C0433d;
import android.content.Context;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.t0;
import androidx.lifecycle.d0;
import bx.ai;
import bz.a0;
import cf.C0851g;
import cf.InterfaceC0845a;
import delivery.samurai.android.ui.about.MoreFragment;
import delivery.samurai.android.ui.about.TrophiesCollectionsFragment;
import delivery.samurai.android.ui.about.TrophiesListFragment;
import delivery.samurai.android.ui.about.TrophyMilestonesFragment;
import ef.C1661i;
import g0.aj;
import gf.C1794i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2335k;
import pe.al;
import se.ak;
import t6.Y1;

/* loaded from: classes2.dex */
public final class s extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i4, Object obj) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        androidx.sqlite.db.framework.f fVar;
        boolean z2;
        int collectionSizeOrDefault;
        switch (this.alpha) {
            case 0:
                t tVar = (t) this.purple;
                return tVar.hotel(Y1.alpha(tVar.bravo, null, 3));
            case 1:
                av foxtrot = ((ax) this.purple).foxtrot();
                foxtrot.getClass();
                return new ax(foxtrot);
            case 2:
                ((aa) this.purple).c();
                return Unit.INSTANCE;
            case 3:
                return (Ya.d) this.purple;
            case 4:
                return (d0) ((s) this.purple).invoke();
            case 5:
                return (C0313k) this.purple;
            case 6:
                return (d0) ((s) this.purple).invoke();
            case 7:
                return (L0) this.purple;
            case 8:
                return (d0) ((s) this.purple).invoke();
            case 9:
                ((C0433d) this.purple).setEnabled(true);
                return Unit.INSTANCE;
            case 10:
                androidx.sqlite.db.framework.g gVar = (androidx.sqlite.db.framework.g) this.purple;
                String str = gVar.purple;
                Context context = gVar.alpha;
                if (str != null && gVar.silver) {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    Intrinsics.delta(noBackupFilesDir, "context.noBackupFilesDir");
                    fVar = new androidx.sqlite.db.framework.f(context, new File(noBackupFilesDir, gVar.purple).getAbsolutePath(), new androidx.sqlite.db.framework.c(), gVar.red, gVar.teal);
                } else {
                    fVar = new androidx.sqlite.db.framework.f(context, gVar.purple, new androidx.sqlite.db.framework.c(), gVar.red, gVar.teal);
                }
                fVar.setWriteAheadLoggingEnabled(gVar.yellow);
                return fVar;
            case 11:
                a0 a0Var = (a0) this.purple;
                Object L4 = a0Var.alpha.L();
                ai aiVar = ai.red;
                if (L4 == aiVar && ((t0) a0Var.delta).getValue() == aiVar) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 12:
                Set keySet = ((LinkedHashMap) ((df.c) this.purple).f12558b.silver).keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : keySet) {
                    Ne.b bVar = (Ne.b) obj;
                    if (bVar.bravo.echo().delta() && !C0851g.charlie.contains(bVar)) {
                        arrayList.add(obj);
                    }
                }
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Ne.b) it.next()).india());
                }
                return arrayList2;
            case 13:
                J2.i iVar = (J2.i) this.purple;
                iVar.getClass();
                HashSet hashSet = new HashSet();
                C1661i c1661i = (C1661i) iVar.silver;
                Iterator it2 = c1661i.f12588g.lima().iterator();
                while (it2.hasNext()) {
                    for (InterfaceC2335k interfaceC2335k : Y1.alpha(((y) it2.next()).olive(), null, 3)) {
                        if ((interfaceC2335k instanceof ak) || (interfaceC2335k instanceof al)) {
                            hashSet.add(interfaceC2335k.getName());
                        }
                    }
                }
                Ie.j jVar = c1661i.teal;
                List list = jVar.f1569j;
                Intrinsics.delta(list, "classProto.functionList");
                Iterator it3 = list.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    D5.s sVar = c1661i.e;
                    if (hasNext) {
                        hashSet.add(Zd.a.bravo((Ke.e) sVar.bravo, ((Ie.y) it3.next()).white));
                    } else {
                        List list2 = jVar.f1570k;
                        Intrinsics.delta(list2, "classProto.propertyList");
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            hashSet.add(Zd.a.bravo((Ke.e) sVar.bravo, ((ag) it4.next()).white));
                        }
                        return ab.mike(hashSet, hashSet);
                    }
                }
                break;
            case 14:
                ef.o oVar = (ef.o) this.purple;
                Set november = oVar.november();
                if (november == null) {
                    return null;
                }
                return ab.mike(ab.mike(oVar.mike(), oVar.charlie.charlie.keySet()), november);
            case 15:
                ef.t tVar2 = (ef.t) this.purple;
                D5.s sVar2 = tVar2.f12617d;
                return CollectionsKt.z(((InterfaceC0845a) ((K) sVar2.alpha).echo).charlie(tVar2.e, (Ke.e) sVar2.bravo));
            case 16:
                aj ajVar = (aj) this.purple;
                int i4 = ajVar.f12635a;
                p0 p0Var = ajVar.teal;
                if (i4 == p0Var.juliet()) {
                    p0Var.kilo(p0Var.juliet() + 1);
                }
                return Unit.INSTANCE;
            case 17:
                return (MoreFragment) this.purple;
            case 18:
                return (d0) ((s) this.purple).invoke();
            case 19:
                return (ga.u) this.purple;
            case 20:
                return (d0) ((s) this.purple).invoke();
            case 21:
                return (d0) ((ga.aa) this.purple).invoke();
            case 22:
                return (TrophiesCollectionsFragment) this.purple;
            case 23:
                return (d0) ((s) this.purple).invoke();
            case 24:
                return (TrophiesListFragment) this.purple;
            case 25:
                return (d0) ((s) this.purple).invoke();
            case 26:
                return (TrophyMilestonesFragment) this.purple;
            case 27:
                return (d0) ((s) this.purple).invoke();
            case 28:
                Function0 function0 = ((C1794i) this.purple).bravo;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
            default:
                return "This collections cannot be empty! input types: " + CollectionsKt.maroon((LinkedHashSet) this.purple, null, null, null, null, 63);
        }
    }
}
