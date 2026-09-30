package F;

import a0.InterfaceC0368v;
import f.InterfaceC1673j;
import s0.AbstractC2556p;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;

/* renamed from: F.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0089b0 extends AbstractC2556p implements InterfaceC2553m, s0.P {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0368v f1118a;
    public final /* synthetic */ int red;
    public final InterfaceC1673j silver;
    public final boolean teal;
    public final float white;
    public E.b yellow;

    public /* synthetic */ C0089b0(InterfaceC1673j interfaceC1673j, boolean z2, float f5, InterfaceC0368v interfaceC0368v, int i4) {
        this.red = i4;
        this.silver = interfaceC1673j;
        this.teal = z2;
        this.white = f5;
        this.f1118a = interfaceC0368v;
    }

    @Override // s0.P
    public final void magenta() {
        switch (this.red) {
            case 0:
                AbstractC2557q.november(this, new C0085a0(this, 1));
                return;
            default:
                AbstractC2557q.november(this, new z.n(this, 0));
                return;
        }
    }

    @Override // T.r
    public final void onAttach() {
        switch (this.red) {
            case 0:
                AbstractC2557q.november(this, new C0085a0(this, 1));
                return;
            default:
                AbstractC2557q.november(this, new z.n(this, 0));
                return;
        }
    }
}
