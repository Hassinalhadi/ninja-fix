package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.r0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class X implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.aw f3447a;
    public final g0 alpha;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3448b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.compose.runtime.ax f3449c;

    /* renamed from: d, reason: collision with root package name */
    public r f3450d;
    public final r0 e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3451f;

    /* renamed from: g, reason: collision with root package name */
    public final I f3452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f3453h;
    public final androidx.compose.runtime.ax purple;
    public final androidx.compose.runtime.ax red;
    public final androidx.compose.runtime.ax silver;
    public av teal;
    public Q white;
    public final androidx.compose.runtime.ax yellow;

    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Map, java.lang.Object] */
    public X(a0 a0Var, Object obj, r rVar, g0 g0Var) {
        this.f3453h = a0Var;
        this.alpha = g0Var;
        androidx.compose.runtime.ax zulu = C0564b.zulu(obj);
        this.purple = zulu;
        Object obj2 = null;
        androidx.compose.runtime.ax zulu2 = C0564b.zulu(AbstractC0779d.juliet(0.0f, null, 7));
        this.red = zulu2;
        this.silver = C0564b.zulu(new Q((aa) ((t0) zulu2).getValue(), g0Var, obj, ((t0) zulu).getValue(), rVar));
        this.yellow = C0564b.zulu(Boolean.TRUE);
        this.f3447a = C0564b.victor(-1.0f);
        this.f3449c = C0564b.zulu(obj);
        this.f3450d = rVar;
        this.e = C0564b.xray(alpha().bravo());
        Float f5 = (Float) o0.alpha.get(g0Var);
        if (f5 != null) {
            float floatValue = f5.floatValue();
            r rVar2 = (r) g0Var.alpha.invoke(obj);
            int bravo = rVar2.bravo();
            for (int i4 = 0; i4 < bravo; i4++) {
                rVar2.echo(floatValue, i4);
            }
            obj2 = this.alpha.bravo.invoke(rVar2);
        }
        this.f3452g = AbstractC0779d.juliet(0.0f, obj2, 3);
    }

    public final Q alpha() {
        return (Q) ((t0) this.silver).getValue();
    }

    public final float bravo() {
        return ((androidx.compose.runtime.n0) this.f3447a).juliet();
    }

    public final void charlie(long j5) {
        if (bravo() == -1.0f) {
            this.f3451f = true;
            if (Intrinsics.areEqual(alpha().charlie, alpha().delta)) {
                delta(alpha().charlie);
            } else {
                delta(alpha().foxtrot(j5));
                this.f3450d = alpha().delta(j5);
            }
        }
    }

    public final void delta(Object obj) {
        ((t0) this.f3449c).setValue(obj);
    }

    @Override // androidx.compose.runtime.D0
    public final Object getValue() {
        return ((t0) this.f3449c).getValue();
    }

    public final void golf(Object obj, boolean z2) {
        Object obj2;
        InterfaceC0787l j5;
        Q q4 = this.white;
        if (q4 != null) {
            obj2 = q4.charlie;
        } else {
            obj2 = null;
        }
        t0 t0Var = (t0) this.purple;
        boolean areEqual = Intrinsics.areEqual(obj2, t0Var.getValue());
        r0 r0Var = this.e;
        androidx.compose.runtime.ax axVar = this.silver;
        aa aaVar = this.f3452g;
        if (areEqual) {
            ((t0) axVar).setValue(new Q(aaVar, this.alpha, obj, obj, this.f3450d.charlie()));
            this.f3448b = true;
            r0Var.kilo(alpha().bravo());
            return;
        }
        androidx.compose.runtime.ax axVar2 = this.red;
        if (z2 && !this.f3451f) {
            if (((aa) ((t0) axVar2).getValue()) instanceof I) {
                aaVar = (aa) ((t0) axVar2).getValue();
            }
        } else {
            aaVar = (aa) ((t0) axVar2).getValue();
        }
        a0 a0Var = this.f3453h;
        if (a0Var.echo() <= 0) {
            j5 = aaVar;
        } else {
            j5 = new J(aaVar, a0Var.echo());
        }
        ((t0) axVar).setValue(new Q(j5, this.alpha, obj, t0Var.getValue(), this.f3450d));
        r0Var.kilo(alpha().bravo());
        this.f3448b = false;
        Boolean bool = Boolean.TRUE;
        androidx.compose.runtime.ax axVar3 = a0Var.hotel;
        ((t0) axVar3).setValue(bool);
        if (a0Var.hotel()) {
            SnapshotStateList snapshotStateList = a0Var.india;
            int size = snapshotStateList.size();
            long j6 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                X x4 = (X) snapshotStateList.get(i4);
                j6 = Math.max(j6, x4.e.juliet());
                x4.charlie(0L);
            }
            ((t0) axVar3).setValue(Boolean.FALSE);
        }
    }

    public final void hotel(Object obj, Object obj2, aa aaVar) {
        ((t0) this.purple).setValue(obj2);
        ((t0) this.red).setValue(aaVar);
        if (Intrinsics.areEqual(alpha().delta, obj) && Intrinsics.areEqual(alpha().charlie, obj2)) {
            return;
        }
        golf(obj, false);
    }

    public final void india(Object obj, aa aaVar) {
        Object value;
        Object obj2;
        if (this.f3448b) {
            Q q4 = this.white;
            if (q4 != null) {
                obj2 = q4.charlie;
            } else {
                obj2 = null;
            }
            if (Intrinsics.areEqual(obj, obj2)) {
                return;
            }
        }
        androidx.compose.runtime.ax axVar = this.purple;
        if (Intrinsics.areEqual(((t0) axVar).getValue(), obj) && bravo() == -1.0f) {
            return;
        }
        ((t0) axVar).setValue(obj);
        ((t0) this.red).setValue(aaVar);
        if (bravo() == -3.0f) {
            value = obj;
        } else {
            value = ((t0) this.f3449c).getValue();
        }
        androidx.compose.runtime.ax axVar2 = this.yellow;
        boolean z2 = true;
        golf(value, !((Boolean) ((t0) axVar2).getValue()).booleanValue());
        if (bravo() != -3.0f) {
            z2 = false;
        }
        ((t0) axVar2).setValue(Boolean.valueOf(z2));
        if (bravo() >= 0.0f) {
            long bravo = alpha().bravo();
            delta(alpha().foxtrot(bravo() * ((float) bravo)));
        } else if (bravo() == -3.0f) {
            delta(obj);
        }
        this.f3448b = false;
        ((androidx.compose.runtime.n0) this.f3447a).kilo(-1.0f);
    }

    public final String toString() {
        return "current value: " + ((t0) this.f3449c).getValue() + ", target: " + ((t0) this.purple).getValue() + ", spec: " + ((aa) ((t0) this.red).getValue());
    }
}
