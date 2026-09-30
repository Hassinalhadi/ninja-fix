package hf;

import com.google.android.material.internal.s;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import pe.C2339o;
import pe.InterfaceC2317a;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2344t;
import pe.InterfaceC2345u;
import pe.an;
import qe.InterfaceC2472h;
import se.AbstractC2870t;
import se.ak;

/* loaded from: classes2.dex */
public final class b extends ak {
    @Override // se.AbstractC2870t, pe.InterfaceC2328d
    public final /* bridge */ /* synthetic */ InterfaceC2328d A(InterfaceC2330f interfaceC2330f, int i4, C2339o c2339o) {
        A(interfaceC2330f, i4, c2339o);
        return this;
    }

    @Override // se.AbstractC2870t
    /* renamed from: a0 */
    public final ak A(InterfaceC2330f newOwner, int i4, C2339o visibility) {
        Intrinsics.echo(newOwner, "newOwner");
        com.google.android.material.datepicker.j.papa(i4, "modality");
        Intrinsics.echo(visibility, "visibility");
        com.google.android.material.datepicker.j.papa(2, "kind");
        return this;
    }

    @Override // se.ak, se.AbstractC2870t
    public final AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k newOwner, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h annotations) {
        Intrinsics.echo(newOwner, "newOwner");
        com.google.android.material.datepicker.j.papa(i4, "kind");
        Intrinsics.echo(annotations, "annotations");
        return this;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2345u
    public final boolean isSuspend() {
        return false;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2326b
    public final Object orange(InterfaceC2317a interfaceC2317a) {
        return null;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2328d
    public final void r(Collection overriddenDescriptors) {
        Intrinsics.echo(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // se.ak, se.AbstractC2870t, pe.InterfaceC2345u
    public final InterfaceC2344t w() {
        return new s(11, this);
    }
}
