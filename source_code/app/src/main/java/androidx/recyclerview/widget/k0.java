package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k0 {
    public int alpha;
    public int bravo;
    public boolean charlie;
    public boolean delta;
    public boolean echo;
    public int[] foxtrot;
    public final /* synthetic */ StaggeredGridLayoutManager golf;

    public k0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.golf = staggeredGridLayoutManager;
        alpha();
    }

    public final void alpha() {
        this.alpha = -1;
        this.bravo = RecyclerView.UNDEFINED_DURATION;
        this.charlie = false;
        this.delta = false;
        this.echo = false;
        int[] iArr = this.foxtrot;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
