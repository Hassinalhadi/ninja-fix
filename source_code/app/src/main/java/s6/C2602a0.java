package s6;

import java.util.Arrays;

/* renamed from: s6.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2602a0 {
    public final EnumC2831z5 alpha;
    public final Boolean bravo;
    public final I7 charlie;
    public final aj delta;
    public final aj echo;

    public /* synthetic */ C2602a0(B9.ab abVar) {
        this.alpha = (EnumC2831z5) abVar.purple;
        this.bravo = (Boolean) abVar.white;
        this.charlie = (I7) abVar.red;
        this.delta = (aj) abVar.silver;
        this.echo = (aj) abVar.teal;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2602a0) {
                C2602a0 c2602a0 = (C2602a0) obj;
                if (V5.x.lima(this.alpha, c2602a0.alpha) && V5.x.lima(null, null) && V5.x.lima(this.bravo, c2602a0.bravo) && V5.x.lima(null, null) && V5.x.lima(this.charlie, c2602a0.charlie) && V5.x.lima(this.delta, c2602a0.delta) && V5.x.lima(this.echo, c2602a0.echo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, null, this.bravo, null, this.charlie, this.delta, this.echo});
    }
}
