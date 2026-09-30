package n;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0 {
    public gd.a alpha;
    public gd.a bravo;
    public int charlie;
    public Long delta;
    public boolean echo;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[LOOP:0: B:23:0x005d->B:28:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[EDGE_INSN: B:29:0x0072->B:30:0x0072 BREAK  A[LOOP:0: B:23:0x005d->B:28:0x006d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(I0.aa aaVar) {
        I0.aa aaVar2;
        String str;
        gd.a aVar;
        gd.a aVar2;
        this.echo = false;
        gd.a aVar3 = this.alpha;
        if (aVar3 != null) {
            aaVar2 = (I0.aa) aVar3.red;
        } else {
            aaVar2 = null;
        }
        if (!Intrinsics.areEqual(aaVar, aaVar2)) {
            D0.g gVar = aaVar.alpha;
            String str2 = gVar.purple;
            gd.a aVar4 = this.alpha;
            if (aVar4 != null) {
                str = ((I0.aa) aVar4.red).alpha.purple;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str2, str)) {
                gd.a aVar5 = this.alpha;
                if (aVar5 != null) {
                    aVar5.red = aaVar;
                    return;
                }
                return;
            }
            this.alpha = new gd.a(3, this.alpha, aaVar);
            this.bravo = null;
            int length = gVar.purple.length() + this.charlie;
            this.charlie = length;
            if (length > 100000) {
                gd.a aVar6 = this.alpha;
                if (aVar6 != null) {
                    aVar = (gd.a) aVar6.purple;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    while (true) {
                        if (aVar6 != null) {
                            gd.a aVar7 = (gd.a) aVar6.purple;
                            if (aVar7 != null) {
                                aVar2 = (gd.a) aVar7.purple;
                                if (aVar2 != null) {
                                    break;
                                } else {
                                    aVar6 = (gd.a) aVar6.purple;
                                }
                            }
                        }
                        aVar2 = null;
                        if (aVar2 != null) {
                        }
                    }
                    if (aVar6 != null) {
                        aVar6.purple = null;
                    }
                }
            }
        }
    }
}
