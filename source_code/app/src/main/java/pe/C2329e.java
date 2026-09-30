package pe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qe.InterfaceC2472h;

/* renamed from: pe.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2329e implements aq {
    public final aq alpha;
    public final InterfaceC2333i purple;
    public final int red;

    public C2329e(aq aqVar, InterfaceC2333i declarationDescriptor, int i4) {
        Intrinsics.echo(declarationDescriptor, "declarationDescriptor");
        this.alpha = aqVar;
        this.purple = declarationDescriptor;
        this.red = i4;
    }

    @Override // pe.InterfaceC2332h
    public final InterfaceC2332h alpha() {
        return this.alpha.alpha();
    }

    @Override // pe.aq
    public final ff.o b() {
        return this.alpha.b();
    }

    @Override // pe.aq
    public final boolean black() {
        return this.alpha.black();
    }

    @Override // pe.InterfaceC2336l
    public final an echo() {
        return this.alpha.echo();
    }

    @Override // pe.aq
    public final int fuchsia() {
        return this.alpha.fuchsia();
    }

    @Override // qe.InterfaceC2465a
    public final InterfaceC2472h getAnnotations() {
        return this.alpha.getAnnotations();
    }

    @Override // pe.aq
    public final int getIndex() {
        return this.alpha.getIndex() + this.red;
    }

    @Override // pe.InterfaceC2335k
    public final Ne.f getName() {
        return this.alpha.getName();
    }

    @Override // pe.aq
    public final List getUpperBounds() {
        return this.alpha.getUpperBounds();
    }

    @Override // pe.aq
    public final boolean j() {
        return true;
    }

    @Override // pe.InterfaceC2335k
    public final InterfaceC2335k lima() {
        return this.purple;
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ae oscar() {
        return this.alpha.oscar();
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return this.alpha.quebec(interfaceC2337m, obj);
    }

    @Override // pe.InterfaceC2332h
    public final kotlin.reflect.jvm.internal.impl.types.ap tango() {
        return this.alpha.tango();
    }

    public final String toString() {
        return this.alpha + "[inner-copy]";
    }

    @Override // pe.InterfaceC2335k, pe.InterfaceC2332h
    public final InterfaceC2335k alpha() {
        return this.alpha.alpha();
    }

    @Override // pe.aq, pe.InterfaceC2332h
    public final aq alpha() {
        return this.alpha.alpha();
    }
}
