package af;

import ae.C0423b;
import ae.ac;
import com.google.android.gms.internal.measurement.C1290a1;
import vf.ab;

/* renamed from: af.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0440k extends ac {
    public ab alpha;
    public Xd.l bravo;
    public C1290a1 charlie;
    public boolean delta;

    @Override // ae.ac
    public final void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        C1290a1 c1290a1 = this.charlie;
        if (c1290a1 != null) {
            c1290a1.echo();
        }
        C1290a1 c1290a12 = this.charlie;
        if (c1290a12 != null) {
            c1290a12.alpha = false;
        }
        this.delta = false;
    }

    @Override // ae.ac
    public final void handleOnBackPressed() {
        C1290a1 c1290a1 = this.charlie;
        if (c1290a1 != null && !c1290a1.alpha) {
            c1290a1.echo();
            this.charlie = null;
        }
        if (this.charlie == null) {
            this.charlie = new C1290a1(this.alpha, false, this.bravo, this);
        }
        C1290a1 c1290a12 = this.charlie;
        if (c1290a12 != null) {
            ((xf.e) c1290a12.bravo).hotel(null);
        }
        C1290a1 c1290a13 = this.charlie;
        if (c1290a13 != null) {
            c1290a13.alpha = false;
        }
        this.delta = false;
    }

    @Override // ae.ac
    public final void handleOnBackProgressed(C0423b c0423b) {
        super.handleOnBackProgressed(c0423b);
        C1290a1 c1290a1 = this.charlie;
        if (c1290a1 != null) {
            ((xf.e) c1290a1.bravo).mike(c0423b);
        }
    }

    @Override // ae.ac
    public final void handleOnBackStarted(C0423b c0423b) {
        super.handleOnBackStarted(c0423b);
        C1290a1 c1290a1 = this.charlie;
        if (c1290a1 != null) {
            c1290a1.echo();
        }
        if (isEnabled()) {
            this.charlie = new C1290a1(this.alpha, true, this.bravo, this);
        }
        this.delta = true;
    }
}
