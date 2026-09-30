package a0;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class aq extends AbstractC0362p {
    public O7.l alpha;
    public long bravo = 9205357640488583168L;

    @Override // a0.AbstractC0362p
    public final void alpha(float f5, long j5, ak akVar) {
        Shader shader;
        O7.l lVar = this.alpha;
        Shader shader2 = null;
        if (lVar == null || !Z.e.alpha(this.bravo, j5)) {
            if (Z.e.echo(j5)) {
                this.alpha = null;
                this.bravo = 9205357640488583168L;
                lVar = null;
            } else {
                lVar = this.alpha;
                if (lVar == null) {
                    lVar = new O7.l(20, false);
                    this.alpha = lVar;
                }
                lVar.purple = bravo(j5);
                this.alpha = lVar;
                this.bravo = j5;
            }
        }
        Be.e eVar = (Be.e) akVar;
        long charlie = ao.charlie(((Paint) eVar.bravo).getColor());
        long j6 = C0366t.bravo;
        if (!C0366t.charlie(charlie, j6)) {
            eVar.oscar(j6);
        }
        Shader shader3 = (Shader) eVar.charlie;
        if (lVar != null) {
            shader = (Shader) lVar.purple;
        } else {
            shader = null;
        }
        if (!Intrinsics.areEqual(shader3, shader)) {
            if (lVar != null) {
                shader2 = (Shader) lVar.purple;
            }
            eVar.sierra(shader2);
        }
        if (((Paint) eVar.bravo).getAlpha() / 255.0f == f5) {
            return;
        }
        eVar.mike(f5);
    }

    public abstract Shader bravo(long j5);
}
