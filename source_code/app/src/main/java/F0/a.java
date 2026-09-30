package F0;

import android.text.SegmentFinder;

/* loaded from: classes3.dex */
public final class a extends SegmentFinder {
    public final /* synthetic */ J2.c alpha;

    public a(J2.c cVar) {
        this.alpha = cVar;
    }

    public final int nextEndBoundary(int i4) {
        return this.alpha.golf(i4);
    }

    public final int nextStartBoundary(int i4) {
        return this.alpha.delta(i4);
    }

    public final int previousEndBoundary(int i4) {
        return this.alpha.echo(i4);
    }

    public final int previousStartBoundary(int i4) {
        return this.alpha.foxtrot(i4);
    }
}
