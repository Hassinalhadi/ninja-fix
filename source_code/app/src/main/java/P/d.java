package P;

import Ec.aa;
import Ec.al;
import Xd.m;
import Xd.n;
import Xd.o;
import Xd.p;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public final class d implements b {
    public final int alpha;
    public final boolean purple;
    public Object red;
    public Q silver;
    public ArrayList teal;

    public d(Object obj, int i4, boolean z2) {
        this.alpha = i4;
        this.purple = z2;
        this.red = obj;
    }

    public final Object alpha(InterfaceC0581m interfaceC0581m, int i4) {
        int alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(this.alpha);
        juliet(c0585q);
        if (c0585q.golf(this)) {
            alpha = e.alpha(2, 0);
        } else {
            alpha = e.alpha(1, 0);
        }
        int i5 = i4 | alpha;
        Object obj = this.red;
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        x.echo(2, obj);
        Object invoke = ((Xd.l) obj).invoke(c0585q, Integer.valueOf(i5));
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(2, this, d.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return invoke;
    }

    public final Object delta(Object obj, InterfaceC0581m interfaceC0581m, int i4) {
        int alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(this.alpha);
        juliet(c0585q);
        if (c0585q.golf(this)) {
            alpha = e.alpha(2, 1);
        } else {
            alpha = e.alpha(1, 1);
        }
        Object obj2 = this.red;
        Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        x.echo(3, obj2);
        Object invoke = ((m) obj2).invoke(obj, c0585q, Integer.valueOf(alpha | i4));
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, 2, this, obj);
        }
        return invoke;
    }

    public final Object foxtrot(Object obj, Object obj2, InterfaceC0581m interfaceC0581m, int i4) {
        int alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(this.alpha);
        juliet(c0585q);
        if (c0585q.golf(this)) {
            alpha = e.alpha(2, 2);
        } else {
            alpha = e.alpha(1, 2);
        }
        Object obj3 = this.red;
        Intrinsics.charlie(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        x.echo(4, obj3);
        Object invoke = ((n) obj3).invoke(obj, obj2, c0585q, Integer.valueOf(alpha | i4));
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new al(this, obj, obj2, i4, 2);
        }
        return invoke;
    }

    @Override // Xd.o
    public final /* bridge */ /* synthetic */ Object golf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return hotel(obj, obj2, obj3, (InterfaceC0581m) obj4, ((Number) obj5).intValue());
    }

    public final Object hotel(Object obj, Object obj2, Object obj3, InterfaceC0581m interfaceC0581m, int i4) {
        int alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(this.alpha);
        juliet(c0585q);
        if (c0585q.golf(this)) {
            alpha = e.alpha(2, 3);
        } else {
            alpha = e.alpha(1, 3);
        }
        Object obj4 = this.red;
        Intrinsics.charlie(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        x.echo(5, obj4);
        Object golf = ((o) obj4).golf(obj, obj2, obj3, c0585q, Integer.valueOf(alpha | i4));
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.j(this, obj, obj2, obj3, i4, 1);
        }
        return golf;
    }

    public final Object india(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC0581m interfaceC0581m, int i4) {
        int alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(this.alpha);
        juliet(c0585q);
        if (c0585q.golf(this)) {
            alpha = e.alpha(2, 4);
        } else {
            alpha = e.alpha(1, 4);
        }
        Object obj5 = this.red;
        Intrinsics.charlie(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        x.echo(6, obj5);
        Object invoke = ((p) obj5).invoke(obj, obj2, obj3, obj4, c0585q, Integer.valueOf(i4 | alpha));
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.b(this, obj, obj2, obj3, obj4, i4, 2);
        }
        return invoke;
    }

    @Override // Xd.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return alpha((InterfaceC0581m) obj, ((Number) obj2).intValue());
    }

    public final void juliet(InterfaceC0581m interfaceC0581m) {
        C0585q c0585q;
        Q azure;
        if (this.purple && (azure = (c0585q = (C0585q) interfaceC0581m).azure()) != null) {
            c0585q.getClass();
            azure.bravo |= 1;
            if (e.foxtrot(this.silver, azure)) {
                this.silver = azure;
                return;
            }
            ArrayList arrayList = this.teal;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.teal = arrayList2;
                arrayList2.add(azure);
                return;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (e.foxtrot((Q) arrayList.get(i4), azure)) {
                    arrayList.set(i4, azure);
                    return;
                }
            }
            arrayList.add(azure);
        }
    }

    public final void kilo(kotlin.e eVar) {
        boolean z2;
        if (!Intrinsics.areEqual(this.red, eVar)) {
            if (this.red == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.red = eVar;
            if (!z2 && this.purple) {
                Q q4 = this.silver;
                if (q4 != null) {
                    C0590w c0590w = q4.alpha;
                    if (c0590w != null) {
                        c0590w.sierra(q4, null);
                    }
                    this.silver = null;
                }
                ArrayList arrayList = this.teal;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Q q5 = (Q) arrayList.get(i4);
                        C0590w c0590w2 = q5.alpha;
                        if (c0590w2 != null) {
                            c0590w2.sierra(q5, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
    }

    @Override // Xd.m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return delta(obj, (InterfaceC0581m) obj2, ((Number) obj3).intValue());
    }

    @Override // Xd.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return foxtrot(obj, obj2, (InterfaceC0581m) obj3, ((Number) obj4).intValue());
    }

    @Override // Xd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return india(obj, obj2, obj3, obj4, (InterfaceC0581m) obj5, ((Number) obj6).intValue());
    }
}
