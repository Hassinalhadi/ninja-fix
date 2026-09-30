package G3;

import J3.ab;
import J3.r;
import J3.s;
import J3.x;
import android.content.Context;
import android.graphics.Rect;
import androidx.camera.core.am;
import androidx.camera.core.impl.InterfaceC0522u;
import androidx.camera.core.impl.L;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.foundation.lazy.layout.z;
import androidx.compose.runtime.C0564b;
import bv.aa;
import bv.o;
import bz.a0;
import bz.af;
import com.google.android.gms.measurement.internal.E;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.Q;
import com.google.android.gms.measurement.internal.ar;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.ao;
import e6.C1629a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import qe.InterfaceC2465a;
import qe.InterfaceC2472h;
import r6.u;
import sd.m;
import zd.q;

/* loaded from: classes3.dex */
public abstract class a implements s, Ye.d, InterfaceC0522u, Q, InterfaceC2465a, q {
    public final Object alpha;

    public /* synthetic */ a(Object obj) {
        this.alpha = obj;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 1 && i4 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1 && i4 != 2) {
            objArr[0] = "receiverType";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        }
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getType";
        }
        if (i4 != 1 && i4 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public static /* synthetic */ void E(int i4) {
        String str;
        int i5;
        if (i4 != 1) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i4 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i4 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 != 1) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public void F(String name, String value) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(value, "value");
        V(value);
        J(name).add(value);
    }

    public void G(m stringValues) {
        Intrinsics.echo(stringValues, "stringValues");
        stringValues.hotel(new af(23, this));
    }

    public boolean H(String name) {
        Intrinsics.echo(name, "name");
        return ((Map) this.alpha).containsKey(name);
    }

    public abstract Object I(ao aoVar);

    public List J(String str) {
        Map map = (Map) this.alpha;
        List list = (List) map.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            U(str);
            map.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public String K(String str) {
        List p4 = p(str);
        if (p4 != null) {
            return (String) CollectionsKt.green(p4);
        }
        return null;
    }

    public abstract Object L();

    public List M(z zVar, int i4, long j5) {
        aa aaVar = (aa) this.alpha;
        List list = (List) aaVar.bravo(i4);
        if (list != null) {
            return list;
        }
        aa aaVar2 = zVar.silver;
        List list2 = (List) aaVar2.bravo(i4);
        if (list2 == null) {
            w wVar = zVar.red;
            Object alpha = wVar.alpha(i4);
            list2 = zVar.purple.pink(alpha, zVar.alpha.alpha(i4, alpha, wVar.bravo(i4)));
            aaVar2.hotel(i4, list2);
        }
        int size = list2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(((q0.ao) list2.get(i5)).victor(j5));
        }
        aaVar.hotel(i4, arrayList);
        return arrayList;
    }

    public abstract Object N();

    public void O(i iVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.alpha;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(iVar);
        }
    }

    public abstract ao P(AbstractC1490h abstractC1490h);

    public abstract void Q(Object obj);

    public abstract void R(a0 a0Var);

    public abstract void S();

    public abstract void T(ao aoVar);

    public void U(String name) {
        Intrinsics.echo(name, "name");
    }

    public void V(String value) {
        Intrinsics.echo(value, "value");
    }

    public void W() {
        E e = ((G) this.alpha).f7508c;
        G.foxtrot(e);
        e.W();
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public ar crimson() {
        throw null;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void cyan(androidx.camera.core.impl.af afVar) {
        ((InterfaceC0522u) this.alpha).cyan(afVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void f(am amVar) {
        ((InterfaceC0522u) this.alpha).f(amVar);
    }

    @Override // zd.q
    public Set foxtrot() {
        Set entrySet = ((Map) this.alpha).entrySet();
        Intrinsics.echo(entrySet, "<this>");
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        Intrinsics.delta(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    public InterfaceC2472h getAnnotations() {
        InterfaceC2472h interfaceC2472h = (InterfaceC2472h) this.alpha;
        if (interfaceC2472h != null) {
            return interfaceC2472h;
        }
        E(1);
        throw null;
    }

    @Override // Ye.d
    public y getType() {
        y yVar = (y) this.alpha;
        if (yVar != null) {
            return yVar;
        }
        D(1);
        throw null;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public Rect gold() {
        return ((InterfaceC0522u) this.alpha).gold();
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public Context green() {
        throw null;
    }

    @Override // zd.q
    public void indigo(String name, List values) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(values, "values");
        List J4 = J(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            V((String) it.next());
        }
        CollectionsKt.zulu(J4, values);
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void ivory(int i4) {
        ((InterfaceC0522u) this.alpha).ivory(i4);
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void m() {
        ((InterfaceC0522u) this.alpha).m();
    }

    @Override // zd.q
    public Set names() {
        return ((Map) this.alpha).keySet();
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public void ochre(L l10) {
        ((InterfaceC0522u) this.alpha).ochre(l10);
    }

    @Override // zd.q
    public List p(String name) {
        Intrinsics.echo(name, "name");
        return (List) ((Map) this.alpha).get(name);
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public C1629a pink() {
        throw null;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public com.google.common.util.concurrent.e purple(boolean z2) {
        return ((InterfaceC0522u) this.alpha).purple(z2);
    }

    @Override // J3.s
    public r sierra(x xVar) {
        return new J3.c(2, (ab) this.alpha);
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public E u() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.Q
    public u victor() {
        throw null;
    }

    @Override // androidx.camera.core.impl.InterfaceC0522u
    public androidx.camera.core.impl.af white() {
        return ((InterfaceC0522u) this.alpha).white();
    }

    public a(G g2) {
        V5.x.hotel(g2);
        this.alpha = g2;
    }

    public a(int i4) {
        switch (i4) {
            case 2:
                this.alpha = new kotlin.collections.l();
                return;
            case 5:
                aa aaVar = o.alpha;
                this.alpha = new aa();
                return;
            case 6:
                this.alpha = C0564b.zulu(Boolean.FALSE);
                return;
            case 10:
                this.alpha = new zd.g();
                return;
            default:
                char[] cArr = Y3.l.alpha;
                this.alpha = new ArrayDeque(20);
                return;
        }
    }

    public a(InterfaceC2472h interfaceC2472h) {
        if (interfaceC2472h != null) {
            this.alpha = interfaceC2472h;
        } else {
            E(0);
            throw null;
        }
    }

    public a(y yVar) {
        if (yVar != null) {
            this.alpha = yVar;
        } else {
            D(0);
            throw null;
        }
    }
}
