package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes3.dex */
public final class T {
    public SparseArray alpha;
    public int bravo;
    public Set charlie;

    public final S alpha(int i4) {
        SparseArray sparseArray = this.alpha;
        S s3 = (S) sparseArray.get(i4);
        if (s3 == null) {
            S s9 = new S();
            sparseArray.put(i4, s9);
            return s9;
        }
        return s3;
    }
}
