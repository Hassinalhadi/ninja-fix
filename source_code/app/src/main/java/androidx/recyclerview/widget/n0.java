package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class n0 {
    public Object alpha;
    public Object bravo;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, androidx.recyclerview.widget.q0] */
    public n0(J j5) {
        this.alpha = j5;
        ?? obj = new Object();
        obj.alpha = 0;
        this.bravo = obj;
    }

    public void alpha() {
        int[] iArr = (int[]) this.alpha;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.bravo = null;
    }

    public void bravo(int i4) {
        int[] iArr = (int[]) this.alpha;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i4, 10) + 1];
            this.alpha = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int length = iArr.length;
            while (length <= i4) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.alpha = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.alpha;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View charlie(int i4, int i5, int i10, int i11) {
        int i12;
        View victor;
        J j5 = (J) this.alpha;
        int delta = j5.delta();
        int charlie = j5.charlie();
        if (i5 > i4) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        View view = null;
        while (i4 != i5) {
            switch (j5.alpha) {
                case 0:
                    victor = j5.bravo.victor(i4);
                    break;
                default:
                    victor = j5.bravo.victor(i4);
                    break;
            }
            int bravo = j5.bravo(victor);
            int alpha = j5.alpha(victor);
            q0 q0Var = (q0) this.bravo;
            q0Var.bravo = delta;
            q0Var.charlie = charlie;
            q0Var.delta = bravo;
            q0Var.echo = alpha;
            if (i10 != 0) {
                q0Var.alpha = i10;
                if (q0Var.alpha()) {
                    return victor;
                }
            }
            if (i11 != 0) {
                q0Var.alpha = i11;
                if (q0Var.alpha()) {
                    view = victor;
                }
            }
            i4 += i12;
        }
        return view;
    }

    public boolean delta(View view) {
        J j5 = (J) this.alpha;
        int delta = j5.delta();
        int charlie = j5.charlie();
        int bravo = j5.bravo(view);
        int alpha = j5.alpha(view);
        q0 q0Var = (q0) this.bravo;
        q0Var.bravo = delta;
        q0Var.charlie = charlie;
        q0Var.delta = bravo;
        q0Var.echo = alpha;
        q0Var.alpha = 24579;
        return q0Var.alpha();
    }

    public void echo(int i4, int i5) {
        int[] iArr = (int[]) this.alpha;
        if (iArr != null && i4 < iArr.length) {
            int i10 = i4 + i5;
            bravo(i10);
            int[] iArr2 = (int[]) this.alpha;
            System.arraycopy(iArr2, i4, iArr2, i10, (iArr2.length - i4) - i5);
            Arrays.fill((int[]) this.alpha, i4, i10, -1);
            ArrayList arrayList = (ArrayList) this.bravo;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.bravo).get(size);
                    int i11 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.alpha;
                    if (i11 >= i4) {
                        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.alpha = i11 + i5;
                    }
                }
            }
        }
    }

    public void foxtrot(int i4, int i5) {
        int[] iArr = (int[]) this.alpha;
        if (iArr != null && i4 < iArr.length) {
            int i10 = i4 + i5;
            bravo(i10);
            int[] iArr2 = (int[]) this.alpha;
            System.arraycopy(iArr2, i10, iArr2, i4, (iArr2.length - i4) - i5);
            int[] iArr3 = (int[]) this.alpha;
            Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.bravo;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.bravo).get(size);
                    int i11 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.alpha;
                    if (i11 >= i4) {
                        if (i11 < i10) {
                            ((ArrayList) this.bravo).remove(size);
                        } else {
                            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.alpha = i11 - i5;
                        }
                    }
                }
            }
        }
    }
}
