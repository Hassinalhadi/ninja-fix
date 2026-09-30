package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ag implements Runnable {
    public static final ThreadLocal teal = new ThreadLocal();
    public static final C0673s white = new C0673s(1);
    public ArrayList alpha;
    public long purple;
    public long red;
    public ArrayList silver;

    public static f0 charlie(RecyclerView recyclerView, int i4, long j5) {
        int hotel = recyclerView.mChildHelper.hotel();
        for (int i5 = 0; i5 < hotel; i5++) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.golf(i5));
            if (childViewHolderInt.mPosition == i4 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        U u4 = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            f0 mike = u4.mike(i4, j5);
            if (mike != null) {
                if (mike.isBound() && !mike.isInvalid()) {
                    u4.juliet(mike.itemView);
                } else {
                    u4.alpha(mike, false);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return mike;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public final void alpha(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.alpha.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.purple == 0) {
                this.purple = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        ae aeVar = recyclerView.mPrefetchRegistry;
        aeVar.alpha = i4;
        aeVar.bravo = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bravo(long j5) {
        af afVar;
        RecyclerView recyclerView;
        long j6;
        RecyclerView recyclerView2;
        af afVar2;
        boolean z2;
        ArrayList arrayList = this.alpha;
        int size = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.bravo(recyclerView3, false);
                i4 += recyclerView3.mPrefetchRegistry.delta;
            }
        }
        ArrayList arrayList2 = this.silver;
        arrayList2.ensureCapacity(i4);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i11);
            if (recyclerView4.getWindowVisibility() == 0) {
                ae aeVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(aeVar.bravo) + Math.abs(aeVar.alpha);
                for (int i12 = 0; i12 < aeVar.delta * 2; i12 += 2) {
                    if (i10 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        afVar2 = obj;
                    } else {
                        afVar2 = (af) arrayList2.get(i10);
                    }
                    int[] iArr = aeVar.charlie;
                    int i13 = iArr[i12 + 1];
                    if (i13 <= abs) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    afVar2.alpha = z2;
                    afVar2.bravo = abs;
                    afVar2.charlie = i13;
                    afVar2.delta = recyclerView4;
                    afVar2.echo = iArr[i12];
                    i10++;
                }
            }
        }
        Collections.sort(arrayList2, white);
        for (int i14 = 0; i14 < arrayList2.size() && (recyclerView = (afVar = (af) arrayList2.get(i14)).delta) != null; i14++) {
            if (afVar.alpha) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = j5;
            }
            f0 charlie = charlie(recyclerView, afVar.echo, j6);
            if (charlie != null && charlie.mNestedRecyclerView != null && charlie.isBound() && !charlie.isInvalid() && (recyclerView2 = charlie.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.hotel() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                ae aeVar2 = recyclerView2.mPrefetchRegistry;
                aeVar2.bravo(recyclerView2, true);
                if (aeVar2.delta != 0) {
                    try {
                        int i15 = o1.i.alpha;
                        Trace.beginSection("RV Nested Prefetch");
                        b0 b0Var = recyclerView2.mState;
                        az azVar = recyclerView2.mAdapter;
                        b0Var.delta = 1;
                        b0Var.echo = azVar.getItemCount();
                        b0Var.golf = false;
                        b0Var.hotel = false;
                        b0Var.india = false;
                        for (int i16 = 0; i16 < aeVar2.delta * 2; i16 += 2) {
                            charlie(recyclerView2, aeVar2.charlie[i16], j5);
                        }
                        Trace.endSection();
                        afVar.alpha = false;
                        afVar.bravo = 0;
                        afVar.charlie = 0;
                        afVar.delta = null;
                        afVar.echo = 0;
                    } catch (Throwable th) {
                        int i17 = o1.i.alpha;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            afVar.alpha = false;
            afVar.bravo = 0;
            afVar.charlie = 0;
            afVar.delta = null;
            afVar.echo = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i4 = o1.i.alpha;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.alpha;
            if (arrayList.isEmpty()) {
                this.purple = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j5 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                if (recyclerView.getWindowVisibility() == 0) {
                    j5 = Math.max(recyclerView.getDrawingTime(), j5);
                }
            }
            if (j5 == 0) {
                this.purple = 0L;
                Trace.endSection();
            } else {
                bravo(TimeUnit.MILLISECONDS.toNanos(j5) + this.red);
                this.purple = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.purple = 0L;
            int i10 = o1.i.alpha;
            Trace.endSection();
            throw th;
        }
    }
}
