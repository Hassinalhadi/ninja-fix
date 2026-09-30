package J2;

import android.database.Cursor;
import android.util.SparseArray;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.T;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import androidx.lifecycle.ac;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.work.impl.WorkDatabase_Impl;
import av.ao;
import bv.aw;
import bv.u;
import bx.C0769g;
import cf.C0848d;
import cf.InterfaceC0849e;
import com.google.android.gms.internal.measurement.C1308e;
import com.google.android.gms.internal.measurement.C1318g;
import com.google.android.gms.internal.measurement.C1378u;
import com.google.android.gms.internal.measurement.InterfaceC1355o;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o2.C2194d;
import pe.C2318aa;
import pe.C2320ac;
import pe.InterfaceC2330f;
import pe.InterfaceC2349y;
import pe.an;
import s6.G6;
import t6.AbstractC3062u;
import ue.C3157a;

/* loaded from: classes3.dex */
public final class i implements InterfaceC0849e {
    public Object alpha;
    public Object purple;
    public Object red;
    public Object silver;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4) {
        this.alpha = obj;
        this.purple = obj2;
        this.red = obj3;
        this.silver = obj4;
    }

    public InterfaceC2330f alpha(Ne.b classId, List typeParametersCount) {
        Intrinsics.echo(classId, "classId");
        Intrinsics.echo(typeParametersCount, "typeParametersCount");
        return (InterfaceC2330f) ((ff.e) this.silver).invoke(new C2318aa(classId, typeParametersCount));
    }

    public g bravo(j id2) {
        g gVar;
        Intrinsics.echo(id2, "id");
        l2.p foxtrot = l2.p.foxtrot(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        foxtrot.oscar(1, id2.alpha);
        foxtrot.gold(2, id2.bravo);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.alpha;
        workDatabase_Impl.bravo();
        Cursor mike = workDatabase_Impl.mike(foxtrot);
        try {
            int bravo = G6.bravo(mike, "work_spec_id");
            int bravo2 = G6.bravo(mike, "generation");
            int bravo3 = G6.bravo(mike, "system_id");
            if (mike.moveToFirst()) {
                gVar = new g(mike.getString(bravo), mike.getInt(bravo2), mike.getInt(bravo3));
            } else {
                gVar = null;
            }
            return gVar;
        } finally {
            mike.close();
            foxtrot.golf();
        }
    }

    public Y charlie(InterfaceC1772d modelClass, String key) {
        Y viewModel;
        Y create;
        Intrinsics.echo(modelClass, "modelClass");
        Intrinsics.echo(key, "key");
        synchronized (((V1.c) this.silver)) {
            try {
                c0 c0Var = (c0) this.alpha;
                c0Var.getClass();
                viewModel = (Y) c0Var.alpha.get(key);
                if (modelClass.november(viewModel)) {
                    a0 a0Var = (a0) this.purple;
                    if (a0Var instanceof V) {
                        V v4 = (V) a0Var;
                        Intrinsics.checkNotNull(viewModel);
                        v4.getClass();
                        Intrinsics.echo(viewModel, "viewModel");
                        ac acVar = v4.delta;
                        if (acVar != null) {
                            C2194d c2194d = v4.echo;
                            Intrinsics.checkNotNull(c2194d);
                            Intrinsics.checkNotNull(acVar);
                            T.alpha(viewModel, c2194d, acVar);
                        }
                    }
                    Intrinsics.charlie(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    T1.e eVar = new T1.e((T1.c) this.red);
                    eVar.alpha.put(b0.bravo, key);
                    a0 factory = (a0) this.purple;
                    Intrinsics.echo(factory, "factory");
                    try {
                        try {
                            create = factory.create(modelClass, eVar);
                        } catch (AbstractMethodError unused) {
                            create = factory.create(AbstractC3062u.bravo(modelClass));
                        }
                    } catch (AbstractMethodError unused2) {
                        create = factory.create(AbstractC3062u.bravo(modelClass), eVar);
                    }
                    viewModel = create;
                    c0 c0Var2 = (c0) this.alpha;
                    c0Var2.getClass();
                    Intrinsics.echo(viewModel, "viewModel");
                    Y y10 = (Y) c0Var2.alpha.put(key, viewModel);
                    if (y10 != null) {
                        y10.clear$lifecycle_viewmodel_release();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    public void delta(g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.alpha;
        workDatabase_Impl.bravo();
        workDatabase_Impl.charlie();
        try {
            ((b) this.purple).oscar(gVar);
            workDatabase_Impl.papa();
        } finally {
            workDatabase_Impl.kilo();
        }
    }

    public boolean echo(ef.s descriptor) {
        boolean z2;
        Intrinsics.echo(descriptor, "descriptor");
        if (!Intrinsics.areEqual((ef.s) this.purple, descriptor)) {
            i iVar = (i) this.alpha;
            if (iVar != null) {
                z2 = iVar.echo(descriptor);
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void foxtrot() {
        ArrayList arrayList = (ArrayList) this.purple;
        if (!arrayList.isEmpty()) {
            ((HashMap) ((c) this.red).red).put((Ge.o) this.alpha, arrayList);
        }
    }

    public U7.c golf(int i4, Ne.b bVar, C3157a c3157a) {
        Ge.o oVar = new Ge.o(((Ge.o) this.alpha).alpha + '@' + i4);
        c cVar = (c) this.silver;
        List list = (List) ((HashMap) cVar.red).get(oVar);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) cVar.red).put(oVar, list);
        }
        return ((ao) cVar.purple).beige(bVar, c3157a, list);
    }

    public i hotel() {
        return new i(this, (C1378u) this.purple);
    }

    @Override // cf.InterfaceC0849e
    public C0848d india(Ne.b classId) {
        Intrinsics.echo(classId, "classId");
        Ie.j jVar = (Ie.j) ((LinkedHashMap) this.silver).get(classId);
        if (jVar == null) {
            return null;
        }
        ((C0769g) this.red).invoke(classId);
        return new C0848d((w.o) this.alpha, jVar, (Je.a) this.purple, an.magenta);
    }

    public InterfaceC1355o juliet(InterfaceC1355o interfaceC1355o) {
        return ((C1378u) this.purple).alpha(this, interfaceC1355o);
    }

    public InterfaceC1355o kilo(C1308e c1308e) {
        InterfaceC1355o interfaceC1355o = InterfaceC1355o.gold;
        Iterator romeo = c1308e.romeo();
        while (romeo.hasNext()) {
            interfaceC1355o = ((C1378u) this.purple).alpha(this, c1308e.oscar(((Integer) romeo.next()).intValue()));
            if (interfaceC1355o instanceof C1318g) {
                break;
            }
        }
        return interfaceC1355o;
    }

    public InterfaceC1355o lima(String str) {
        HashMap hashMap = (HashMap) this.red;
        if (hashMap.containsKey(str)) {
            return (InterfaceC1355o) hashMap.get(str);
        }
        i iVar = (i) this.alpha;
        if (iVar != null) {
            return iVar.lima(str);
        }
        throw new IllegalArgumentException(P0.crimson(str, " is not defined"));
    }

    public void mike(String str, InterfaceC1355o interfaceC1355o) {
        if (((HashMap) this.silver).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.red;
        if (interfaceC1355o == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC1355o);
        }
    }

    public void november(String str, InterfaceC1355o interfaceC1355o) {
        i iVar;
        HashMap hashMap = (HashMap) this.red;
        if (!hashMap.containsKey(str) && (iVar = (i) this.alpha) != null && iVar.oscar(str)) {
            iVar.november(str, interfaceC1355o);
        } else {
            if (((HashMap) this.silver).containsKey(str)) {
                return;
            }
            if (interfaceC1355o == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, interfaceC1355o);
            }
        }
    }

    public boolean oscar(String str) {
        if (((HashMap) this.red).containsKey(str)) {
            return true;
        }
        i iVar = (i) this.alpha;
        if (iVar != null) {
            return iVar.oscar(str);
        }
        return false;
    }

    public i(i iVar, C1378u c1378u) {
        this.red = new HashMap();
        this.silver = new HashMap();
        this.alpha = iVar;
        this.purple = c1378u;
    }

    public i(ff.l lVar, InterfaceC2349y module) {
        Intrinsics.echo(module, "module");
        this.alpha = lVar;
        this.purple = module;
        this.red = lVar.charlie(new C2320ac(this, 1));
        this.silver = lVar.charlie(new C2320ac(this, 0));
    }

    public i() {
        this.alpha = new aw(0);
        this.purple = new SparseArray();
        this.red = new u((Object) null);
        this.silver = new aw(0);
    }

    public i(c0 store, a0 factory, T1.c defaultExtras) {
        Intrinsics.echo(store, "store");
        Intrinsics.echo(factory, "factory");
        Intrinsics.echo(defaultExtras, "defaultExtras");
        this.alpha = store;
        this.purple = factory;
        this.red = defaultExtras;
        this.silver = new Object();
    }

    public i(c cVar, Ge.o oVar) {
        this.silver = cVar;
        this.red = cVar;
        this.alpha = oVar;
        this.purple = new ArrayList();
    }
}
