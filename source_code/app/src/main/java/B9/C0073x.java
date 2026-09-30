package B9;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;

/* renamed from: B9.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0073x extends AbstractC0071w {

    /* renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.load.engine.h f716j;

    /* renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f717k;

    /* renamed from: i, reason: collision with root package name */
    public long f718i;

    static {
        com.bumptech.glide.load.engine.h hVar = new com.bumptech.glide.load.engine.h(14);
        f716j = hVar;
        int[] iArr = {R.layout.row_withdraw_item};
        ((String[][]) hVar.purple)[0] = new String[]{"row_withdraw_item"};
        ((int[][]) hVar.red)[0] = new int[]{1};
        ((int[][]) hVar.silver)[0] = iArr;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f717k = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.textView29, 3);
        sparseIntArray.put(R.id.textView30, 4);
        sparseIntArray.put(R.id.recyclerView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0073x(View view) {
        super(null, view, r5, (Toolbar) r0[2], (p1) r0[1]);
        Object[] november = z1.g.november(view, 6, f716j, f717k);
        RecyclerView recyclerView = (RecyclerView) november[5];
        this.f718i = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        p1 p1Var = this.f709h;
        if (p1Var != null) {
            p1Var.f14186a = this;
        }
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f718i = 0L;
        }
        this.f709h.golf();
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f718i != 0) {
                    return true;
                }
                if (this.f709h.juliet()) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f718i = 4L;
        }
        this.f709h.lima();
        oscar();
    }
}
