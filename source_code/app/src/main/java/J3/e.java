package J3;

import android.content.res.Resources;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class e implements com.bumptech.glide.load.data.e {
    public final Resources.Theme alpha;
    public final Resources purple;
    public final Object red;
    public final int silver;
    public Object teal;

    public e(Resources.Theme theme, Resources resources, f fVar, int i4) {
        this.alpha = theme;
        this.purple = resources;
        this.red = fVar;
        this.silver = i4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J3.f, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        return this.red.alpha();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final E3.a charlie() {
        return E3.a.alpha;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [J3.f, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        Object obj = this.teal;
        if (obj != null) {
            try {
                this.red.echo(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [J3.f, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.e
    public final void delta(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object delta = this.red.delta(this.silver, this.alpha, this.purple);
            this.teal = delta;
            dVar.echo(delta);
        } catch (Resources.NotFoundException e) {
            dVar.bravo(e);
        }
    }
}
