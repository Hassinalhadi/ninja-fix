package F;

import a0.C0366t;
import a0.InterfaceC0368v;
import s0.AbstractC2557q;
import z.AbstractC3450d;
import z.C3449c;

/* loaded from: classes3.dex */
public final class Z implements InterfaceC0368v {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ Z(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // a0.InterfaceC0368v
    public final long alpha() {
        switch (this.alpha) {
            case 0:
                C0089b0 c0089b0 = (C0089b0) this.purple;
                long j5 = ((M1) ((Z) c0089b0.f1118a).purple).charlie;
                if (j5 == 16) {
                    J1 j12 = (J1) AbstractC2557q.echo(c0089b0, L1.bravo);
                    if (j12 != null) {
                        long j6 = j12.alpha;
                        if (j6 != 16) {
                            return j6;
                        }
                    }
                    return ((C0366t) AbstractC2557q.echo(c0089b0, Y.alpha)).alpha;
                }
                return j5;
            case 1:
                return ((M1) this.purple).charlie;
            case 2:
                C0089b0 c0089b02 = (C0089b0) this.purple;
                long j7 = ((z.ab) ((Z) c0089b02.f1118a).purple).charlie;
                if (j7 == 16) {
                    z.z zVar = (z.z) AbstractC2557q.echo(c0089b02, z.aa.alpha);
                    if (zVar != null) {
                        long j10 = zVar.alpha;
                        if (j10 != 16) {
                            return j10;
                        }
                    }
                    long j11 = ((C0366t) AbstractC2557q.echo(c0089b02, z.g.alpha)).alpha;
                    boolean delta = ((C3449c) AbstractC2557q.echo(c0089b02, AbstractC3450d.alpha)).delta();
                    float romeo = a0.ao.romeo(j11);
                    if (!delta && romeo < 0.5d) {
                        return C0366t.echo;
                    }
                    return j11;
                }
                return j7;
            default:
                return ((z.ab) this.purple).charlie;
        }
    }
}
