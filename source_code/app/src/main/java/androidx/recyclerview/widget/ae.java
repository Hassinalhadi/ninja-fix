package androidx.recyclerview.widget;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ae {
    public int alpha;
    public int bravo;
    public int[] charlie;
    public int delta;

    public final void alpha(int i4, int i5) {
        if (i4 >= 0) {
            if (i5 >= 0) {
                int i10 = this.delta;
                int i11 = i10 * 2;
                int[] iArr = this.charlie;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.charlie = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i11 >= iArr.length) {
                    int[] iArr3 = new int[i10 * 4];
                    this.charlie = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.charlie;
                iArr4[i11] = i4;
                iArr4[i11 + 1] = i5;
                this.delta++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void bravo(RecyclerView recyclerView, boolean z2) {
        this.delta = 0;
        int[] iArr = this.charlie;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        L l10 = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && l10 != null && l10.india) {
            if (z2) {
                if (!recyclerView.mAdapterHelper.golf()) {
                    l10.juliet(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                l10.india(this.alpha, this.bravo, recyclerView.mState, this);
            }
            int i4 = this.delta;
            if (i4 > l10.juliet) {
                l10.juliet = i4;
                l10.kilo = z2;
                recyclerView.mRecycler.oscar();
            }
        }
    }
}
