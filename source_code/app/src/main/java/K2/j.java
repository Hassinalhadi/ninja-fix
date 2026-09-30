package K2;

import A2.z;
import B2.ao;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements Runnable {
    public final B2.f alpha;
    public final B2.l purple;
    public final boolean red;
    public final int silver;

    public j(B2.f processor, B2.l token, boolean z2, int i4) {
        Intrinsics.echo(processor, "processor");
        Intrinsics.echo(token, "token");
        this.alpha = processor;
        this.purple = token;
        this.red = z2;
        this.silver = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean juliet;
        ao bravo;
        if (this.red) {
            B2.f fVar = this.alpha;
            B2.l lVar = this.purple;
            int i4 = this.silver;
            fVar.getClass();
            String str = lVar.alpha.alpha;
            synchronized (fVar.kilo) {
                bravo = fVar.bravo(str);
            }
            juliet = B2.f.echo(str, bravo, i4);
        } else {
            juliet = this.alpha.juliet(this.purple, this.silver);
        }
        z.echo().alpha(z.golf("StopWorkRunnable"), "StopWorkRunnable for " + this.purple.alpha.alpha + "; Processor.stopWork = " + juliet);
    }
}
