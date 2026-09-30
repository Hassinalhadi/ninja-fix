package re;

import Ne.f;
import ef.r;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;

/* renamed from: re.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2517a implements InterfaceC2518b, InterfaceC2520d {
    public static final C2517a bravo = new C2517a(0);
    public static final C2517a charlie = new C2517a(1);
    public static final C2517a delta = new C2517a(2);
    public static final C2517a echo = new C2517a(3);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2517a(int i4) {
        this.alpha = i4;
    }

    @Override // re.InterfaceC2518b
    public Collection alpha(InterfaceC2330f classDescriptor) {
        Intrinsics.echo(classDescriptor, "classDescriptor");
        return CollectionsKt.emptyList();
    }

    @Override // re.InterfaceC2518b
    public List bravo(f name, InterfaceC2330f classDescriptor) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(classDescriptor, "classDescriptor");
        return CollectionsKt.emptyList();
    }

    @Override // re.InterfaceC2518b
    public List charlie(InterfaceC2330f classDescriptor) {
        Intrinsics.echo(classDescriptor, "classDescriptor");
        return CollectionsKt.emptyList();
    }

    @Override // re.InterfaceC2520d
    public boolean delta(InterfaceC2330f classDescriptor, r rVar) {
        switch (this.alpha) {
            case 1:
                Intrinsics.echo(classDescriptor, "classDescriptor");
                return true;
            default:
                Intrinsics.echo(classDescriptor, "classDescriptor");
                return !rVar.getAnnotations().D(e.alpha);
        }
    }

    @Override // re.InterfaceC2518b
    public List echo(InterfaceC2330f classDescriptor) {
        Intrinsics.echo(classDescriptor, "classDescriptor");
        return CollectionsKt.emptyList();
    }
}
