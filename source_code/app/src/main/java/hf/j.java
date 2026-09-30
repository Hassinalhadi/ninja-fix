package hf;

import androidx.appcompat.widget.P0;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2332h;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public final class j extends e {
    @Override // hf.e, Xe.p
    public final Collection alpha(Xe.f kindFilter, Function1 nameFilter) {
        Intrinsics.echo(kindFilter, "kindFilter");
        Intrinsics.echo(nameFilter, "nameFilter");
        throw new IllegalStateException(this.bravo);
    }

    @Override // hf.e, Xe.n
    public final Set bravo() {
        throw new IllegalStateException();
    }

    @Override // hf.e, Xe.n
    public final /* bridge */ /* synthetic */ Collection charlie(Ne.f fVar, EnumC3339b enumC3339b) {
        charlie(fVar, enumC3339b);
        throw null;
    }

    @Override // hf.e, Xe.n
    public final Set delta() {
        throw new IllegalStateException();
    }

    @Override // hf.e, Xe.n
    public final Set echo() {
        throw new IllegalStateException();
    }

    @Override // hf.e, Xe.n
    public final /* bridge */ /* synthetic */ Collection foxtrot(Ne.f fVar, EnumC3339b enumC3339b) {
        foxtrot(fVar, enumC3339b);
        throw null;
    }

    @Override // hf.e, Xe.p
    public final InterfaceC2332h golf(Ne.f name, EnumC3339b location) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(location, "location");
        throw new IllegalStateException(this.bravo + ", required name: " + name);
    }

    @Override // hf.e
    /* renamed from: hotel */
    public final Set charlie(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        throw new IllegalStateException(this.bravo + ", required name: " + name);
    }

    @Override // hf.e
    /* renamed from: india */
    public final Set foxtrot(Ne.f name, EnumC3339b enumC3339b) {
        Intrinsics.echo(name, "name");
        throw new IllegalStateException(this.bravo + ", required name: " + name);
    }

    @Override // hf.e
    public final String toString() {
        return P0.fuchsia(new StringBuilder("ThrowingScope{"), this.bravo, '}');
    }
}
