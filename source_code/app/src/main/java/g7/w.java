package g7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class w {
    public float alpha;
    public float bravo;
    public float charlie;
    public float delta;
    public float echo;
    public final ArrayList foxtrot = new ArrayList();
    public final ArrayList golf = new ArrayList();

    public w() {
        delta(0.0f, 270.0f, 0.0f);
    }

    public final void alpha(float f5) {
        float f10 = this.delta;
        if (f10 != f5) {
            float f11 = ((f5 - f10) + 360.0f) % 360.0f;
            if (f11 > 180.0f) {
                return;
            }
            float f12 = this.bravo;
            float f13 = this.charlie;
            s sVar = new s(f12, f13, f12, f13);
            sVar.foxtrot = this.delta;
            sVar.golf = f11;
            this.golf.add(new q(sVar));
            this.delta = f5;
        }
    }

    public final void bravo(Matrix matrix, Path path) {
        ArrayList arrayList = this.foxtrot;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((u) arrayList.get(i4)).alpha(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.u, g7.t, java.lang.Object] */
    public final void charlie(float f5, float f10) {
        ?? uVar = new u();
        uVar.bravo = f5;
        uVar.charlie = f10;
        this.foxtrot.add(uVar);
        r rVar = new r(uVar, this.bravo, this.charlie);
        float bravo = rVar.bravo() + 270.0f;
        float bravo2 = rVar.bravo() + 270.0f;
        alpha(bravo);
        this.golf.add(rVar);
        this.delta = bravo2;
        this.bravo = f5;
        this.charlie = f10;
    }

    public final void delta(float f5, float f10, float f11) {
        this.alpha = f5;
        this.bravo = 0.0f;
        this.charlie = f5;
        this.delta = f10;
        this.echo = (f10 + f11) % 360.0f;
        this.foxtrot.clear();
        this.golf.clear();
    }
}
