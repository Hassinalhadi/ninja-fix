package n;

import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2146v implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ax purple;

    public /* synthetic */ C2146v(ax axVar, int i4) {
        this.alpha = i4;
        this.purple = axVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.alpha) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((t0) this.purple.quebec).setValue(bool);
                return Unit.INSTANCE;
            case 1:
                I0.aa aaVar = (I0.aa) obj;
                String str2 = aaVar.alpha.purple;
                ax axVar = this.purple;
                D0.g gVar = axVar.juliet;
                if (gVar != null) {
                    str = gVar.purple;
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(str2, str)) {
                    ((t0) axVar.kilo).setValue(am.alpha);
                    androidx.compose.runtime.ax axVar2 = axVar.tango;
                    if (((Boolean) ((t0) axVar2).getValue()).booleanValue()) {
                        ((t0) axVar2).setValue(Boolean.FALSE);
                    } else {
                        ((t0) axVar.sierra).setValue(Boolean.FALSE);
                    }
                }
                long j5 = D0.am.bravo;
                axVar.foxtrot(j5);
                axVar.echo(j5);
                axVar.uniform.invoke(aaVar);
                androidx.compose.runtime.Q q4 = axVar.bravo;
                C0590w c0590w = q4.alpha;
                if (c0590w != null) {
                    c0590w.sierra(q4, null);
                }
                return Unit.INSTANCE;
            case 2:
                this.purple.romeo.bravo(((I0.k) obj).alpha);
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(this.purple.romeo.bravo(((I0.k) obj).alpha));
        }
    }
}
