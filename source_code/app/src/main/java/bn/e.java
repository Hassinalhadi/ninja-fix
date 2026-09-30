package bn;

import O7.l;
import androidx.camera.core.O;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.AbstractC0521t;
import androidx.camera.core.impl.InterfaceC0522u;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.ak;
import androidx.camera.core.impl.r;
import java.util.ArrayList;
import t6.j4;

/* loaded from: classes3.dex */
public final class e implements InterfaceC0525x {
    public final InterfaceC0525x alpha;
    public final h purple;
    public final i red;
    public final f silver;

    /* JADX WARN: Type inference failed for: r2v1, types: [bn.h, G3.a] */
    public e(InterfaceC0525x interfaceC0525x, f fVar, S7.a aVar) {
        this.alpha = interfaceC0525x;
        this.silver = fVar;
        this.purple = new G3.a(interfaceC0525x.golf());
        this.red = new i(interfaceC0525x.oscar());
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x, androidx.camera.core.InterfaceC0528j
    public final InterfaceC0523v alpha() {
        return oscar();
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final boolean bravo() {
        if (((ak) alpha()).echo() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.N
    public final void charlie(O o5) {
        j4.alpha();
        this.silver.charlie(o5);
    }

    @Override // androidx.camera.core.N
    public final void delta(O o5) {
        j4.alpha();
        this.silver.delta(o5);
    }

    @Override // androidx.camera.core.N
    public final void echo(O o5) {
        j4.alpha();
        this.silver.echo(o5);
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final A foxtrot() {
        return this.alpha.foxtrot();
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final InterfaceC0522u golf() {
        return this.purple;
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final r hotel() {
        return AbstractC0521t.alpha;
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final /* synthetic */ void india(boolean z2) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final /* synthetic */ void juliet(l lVar) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final void kilo(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final void lima(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final boolean mike() {
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final /* synthetic */ void november(boolean z2) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final InterfaceC0523v oscar() {
        return this.red;
    }

    @Override // androidx.camera.core.N
    public final void papa(O o5) {
        j4.alpha();
        this.silver.papa(o5);
    }
}
