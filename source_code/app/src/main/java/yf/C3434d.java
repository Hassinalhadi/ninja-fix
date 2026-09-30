package yf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import xf.EnumC3340a;

/* renamed from: yf.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3434d extends zf.f {
    public static final /* synthetic */ AtomicIntegerFieldUpdater white = AtomicIntegerFieldUpdater.newUpdater(C3434d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final xf.e silver;
    public final boolean teal;

    public /* synthetic */ C3434d(xf.e eVar, boolean z2) {
        this(eVar, z2, Nd.i.alpha, -3, EnumC3340a.alpha);
    }

    @Override // zf.f
    public final String charlie() {
        return "channel=" + this.silver;
    }

    @Override // zf.f, yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        if (this.purple == -3) {
            boolean z2 = this.teal;
            if (z2 && white.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object mike = AbstractC3428A.mike(interfaceC3440j, this.silver, z2, cVar);
            if (mike == Od.a.alpha) {
                return mike;
            }
            return Unit.INSTANCE;
        }
        Object collect = super.collect(interfaceC3440j, cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    @Override // zf.f
    public final Object delta(xf.r rVar, Nd.c cVar) {
        Object mike = AbstractC3428A.mike(new zf.ab(rVar), this.silver, this.teal, cVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }

    @Override // zf.f
    public final zf.f echo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        return new C3434d(this.silver, this.teal, hVar, i4, enumC3340a);
    }

    @Override // zf.f
    public final InterfaceC3439i foxtrot() {
        return new C3434d(this.silver, this.teal);
    }

    @Override // zf.f
    public final xf.t golf(vf.ab abVar) {
        if (this.teal && white.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        if (this.purple == -3) {
            return this.silver;
        }
        return super.golf(abVar);
    }

    public C3434d(xf.e eVar, boolean z2, Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        super(hVar, i4, enumC3340a);
        this.silver = eVar;
        this.teal = z2;
    }
}
