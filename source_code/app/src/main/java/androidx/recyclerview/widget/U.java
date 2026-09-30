package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import s1.C2568a;
import s1.C2569b;
import t6.AbstractC2977c3;

/* loaded from: classes3.dex */
public final class U {
    public final ArrayList alpha;
    public ArrayList bravo;
    public final ArrayList charlie;
    public final List delta;
    public int echo;
    public int foxtrot;
    public T golf;
    public final /* synthetic */ RecyclerView hotel;

    public U(RecyclerView recyclerView) {
        this.hotel = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.alpha = arrayList;
        this.bravo = null;
        this.charlie = new ArrayList();
        this.delta = Collections.unmodifiableList(arrayList);
        this.echo = 2;
        this.foxtrot = 2;
    }

    public static void echo(ViewGroup viewGroup, boolean z2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                echo((ViewGroup) childAt, true);
            }
        }
        if (!z2) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    public final void alpha(f0 f0Var, boolean z2) {
        C2569b c2569b;
        RecyclerView.clearNestedRecyclerViewIfNotNested(f0Var);
        View view = f0Var.itemView;
        RecyclerView recyclerView = this.hotel;
        h0 h0Var = recyclerView.mAccessibilityDelegate;
        if (h0Var != null) {
            g0 g0Var = h0Var.echo;
            if (g0Var != null) {
                c2569b = (C2569b) g0Var.echo.remove(view);
            } else {
                c2569b = null;
            }
            s1.au.november(view, c2569b);
        }
        if (z2) {
            if (recyclerView.mRecyclerListeners.size() <= 0) {
                az azVar = recyclerView.mAdapter;
                if (azVar != null) {
                    azVar.onViewRecycled(f0Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.delta(f0Var);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + f0Var);
                }
            } else {
                recyclerView.mRecyclerListeners.get(0).getClass();
                throw new ClassCastException();
            }
        }
        f0Var.mBindingAdapter = null;
        f0Var.mOwnerRecyclerView = null;
        T charlie = charlie();
        charlie.getClass();
        int itemViewType = f0Var.getItemViewType();
        ArrayList arrayList = charlie.alpha(itemViewType).alpha;
        if (((S) charlie.alpha.get(itemViewType)).bravo <= arrayList.size()) {
            AbstractC2977c3.alpha(f0Var.itemView);
        } else {
            if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(f0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            f0Var.resetInternal();
            arrayList.add(f0Var);
        }
    }

    public final int bravo(int i4) {
        RecyclerView recyclerView = this.hotel;
        if (i4 >= 0 && i4 < recyclerView.mState.bravo()) {
            if (!recyclerView.mState.golf) {
                return i4;
            }
            return recyclerView.mAdapterHelper.foxtrot(i4, 0);
        }
        StringBuilder sierra = Q0.c.sierra(i4, "invalid position ", ". State item count is ");
        sierra.append(recyclerView.mState.bravo());
        sierra.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(sierra.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.recyclerview.widget.T] */
    public final T charlie() {
        if (this.golf == null) {
            ?? obj = new Object();
            obj.alpha = new SparseArray();
            obj.bravo = 0;
            obj.charlie = Collections.newSetFromMap(new IdentityHashMap());
            this.golf = obj;
            foxtrot();
        }
        return this.golf;
    }

    public final View delta(int i4) {
        return mike(i4, Long.MAX_VALUE).itemView;
    }

    public final void foxtrot() {
        if (this.golf != null) {
            RecyclerView recyclerView = this.hotel;
            if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                T t5 = this.golf;
                t5.charlie.add(recyclerView.mAdapter);
            }
        }
    }

    public final void golf(az azVar, boolean z2) {
        T t5 = this.golf;
        if (t5 != null) {
            Set set = t5.charlie;
            set.remove(azVar);
            if (set.size() == 0 && !z2) {
                int i4 = 0;
                while (true) {
                    SparseArray sparseArray = t5.alpha;
                    if (i4 < sparseArray.size()) {
                        ArrayList arrayList = ((S) sparseArray.get(sparseArray.keyAt(i4))).alpha;
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            AbstractC2977c3.alpha(((f0) arrayList.get(i5)).itemView);
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void hotel() {
        ArrayList arrayList = this.charlie;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            india(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            ae aeVar = this.hotel.mPrefetchRegistry;
            int[] iArr = aeVar.charlie;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            aeVar.delta = 0;
        }
    }

    public final void india(int i4) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i4);
        }
        ArrayList arrayList = this.charlie;
        f0 f0Var = (f0) arrayList.get(i4);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f0Var);
        }
        alpha(f0Var, true);
        arrayList.remove(i4);
    }

    public final void juliet(View view) {
        f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean isTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.hotel;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        kilo(childViewHolderInt);
        if (recyclerView.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
            recyclerView.mItemAnimator.endAnimation(childViewHolderInt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d4, code lost:
    
        r4 = r4 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void kilo(f0 f0Var) {
        boolean z2;
        boolean z10;
        boolean isScrap = f0Var.isScrap();
        boolean z11 = false;
        boolean z12 = true;
        RecyclerView recyclerView = this.hotel;
        if (!isScrap && f0Var.itemView.getParent() == null) {
            if (!f0Var.isTmpDetached()) {
                if (!f0Var.shouldIgnore()) {
                    boolean doesTransientStatePreventRecycling = f0Var.doesTransientStatePreventRecycling();
                    az azVar = recyclerView.mAdapter;
                    if (azVar != null && doesTransientStatePreventRecycling && azVar.onFailedToRecycleView(f0Var)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z13 = RecyclerView.sDebugAssertionsEnabled;
                    ArrayList arrayList = this.charlie;
                    if (z13 && arrayList.contains(f0Var)) {
                        StringBuilder sb2 = new StringBuilder("cached view received recycle internal? ");
                        sb2.append(f0Var);
                        throw new IllegalArgumentException(P0.black(recyclerView, sb2));
                    }
                    if (!z2 && !f0Var.isRecyclable()) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.exceptionLabel());
                        }
                        z12 = false;
                    } else {
                        if (this.foxtrot > 0 && !f0Var.hasAnyOfTheFlags(526)) {
                            int size = arrayList.size();
                            if (size >= this.foxtrot && size > 0) {
                                india(0);
                                size--;
                            }
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0) {
                                ae aeVar = recyclerView.mPrefetchRegistry;
                                int i4 = f0Var.mPosition;
                                if (aeVar.charlie != null) {
                                    int i5 = aeVar.delta * 2;
                                    for (int i10 = 0; i10 < i5; i10 += 2) {
                                        if (aeVar.charlie[i10] == i4) {
                                            break;
                                        }
                                    }
                                }
                                int i11 = size - 1;
                                loop1: while (i11 >= 0) {
                                    int i12 = ((f0) arrayList.get(i11)).mPosition;
                                    ae aeVar2 = recyclerView.mPrefetchRegistry;
                                    if (aeVar2.charlie == null) {
                                        break;
                                    }
                                    int i13 = aeVar2.delta * 2;
                                    for (int i14 = 0; i14 < i13; i14 += 2) {
                                        if (aeVar2.charlie[i14] == i12) {
                                            break;
                                        }
                                    }
                                    break loop1;
                                }
                                size = i11 + 1;
                            }
                            arrayList.add(size, f0Var);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            alpha(f0Var, true);
                        } else {
                            z12 = false;
                        }
                        z11 = z10;
                    }
                    recyclerView.mViewInfoStore.delta(f0Var);
                    if (!z11 && !z12 && doesTransientStatePreventRecycling) {
                        AbstractC2977c3.alpha(f0Var.itemView);
                        f0Var.mBindingAdapter = null;
                        f0Var.mOwnerRecyclerView = null;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(P0.black(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            StringBuilder sb3 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb3.append(f0Var);
            throw new IllegalArgumentException(P0.black(recyclerView, sb3));
        }
        StringBuilder sb4 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb4.append(f0Var.isScrap());
        sb4.append(" isAttached:");
        if (f0Var.itemView.getParent() != null) {
            z11 = true;
        }
        sb4.append(z11);
        sb4.append(recyclerView.exceptionLabel());
        throw new IllegalArgumentException(sb4.toString());
    }

    public final void lima(View view) {
        f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.hotel;
        if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.bravo == null) {
                this.bravo = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.bravo.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(P0.black(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.alpha.add(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x04b9, code lost:
    
        if ((r11 + r7) >= r32) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0086  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [s1.b] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v5, types: [s1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f0 mike(int i4, long j5) {
        boolean z2;
        f0 f0Var;
        boolean z10;
        long j6;
        long j7;
        boolean z11;
        boolean z12;
        ?? r12;
        ?? r82;
        ViewGroup.LayoutParams layoutParams;
        M m4;
        RecyclerView findNestedRecyclerView;
        boolean z13;
        f0 f0Var2;
        View view;
        int charlie;
        boolean z14;
        int size;
        int foxtrot;
        boolean z15 = true;
        RecyclerView recyclerView = this.hotel;
        if (i4 >= 0 && i4 < recyclerView.mState.bravo()) {
            if (recyclerView.mState.golf) {
                ArrayList arrayList = this.bravo;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            f0Var = (f0) this.bravo.get(i5);
                            if (!f0Var.wasReturnedFromScrap() && f0Var.getLayoutPosition() == i4) {
                                f0Var.addFlags(32);
                                break;
                            }
                            i5++;
                        } else if (recyclerView.mAdapter.hasStableIds() && (foxtrot = recyclerView.mAdapterHelper.foxtrot(i4, 0)) > 0 && foxtrot < recyclerView.mAdapter.getItemCount()) {
                            long itemId = recyclerView.mAdapter.getItemId(foxtrot);
                            for (int i10 = 0; i10 < size; i10++) {
                                f0 f0Var3 = (f0) this.bravo.get(i10);
                                if (!f0Var3.wasReturnedFromScrap() && f0Var3.getItemId() == itemId) {
                                    f0Var3.addFlags(32);
                                    f0Var = f0Var3;
                                    break;
                                }
                            }
                        }
                    }
                    if (f0Var == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                f0Var = null;
                if (f0Var == null) {
                }
            } else {
                z2 = false;
                f0Var = null;
            }
            ArrayList arrayList2 = this.charlie;
            ArrayList arrayList3 = this.alpha;
            if (f0Var == null) {
                int size2 = arrayList3.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    f0 f0Var4 = (f0) arrayList3.get(i11);
                    if (!f0Var4.wasReturnedFromScrap() && f0Var4.getLayoutPosition() == i4 && !f0Var4.isInvalid() && (recyclerView.mState.golf || !f0Var4.isRemoved())) {
                        f0Var4.addFlags(32);
                        z10 = true;
                        f0Var = f0Var4;
                        break;
                    }
                }
                ArrayList arrayList4 = recyclerView.mChildHelper.charlie;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        view = (View) arrayList4.get(i12);
                        f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                        z10 = z15;
                        if (childViewHolderInt.getLayoutPosition() == i4 && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                            break;
                        }
                        i12++;
                        z15 = z10;
                    } else {
                        z10 = z15;
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    f0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    C0666k c0666k = recyclerView.mChildHelper;
                    int indexOfChild = c0666k.alpha.alpha.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        C0665j c0665j = c0666k.bravo;
                        if (c0665j.echo(indexOfChild)) {
                            c0665j.bravo(indexOfChild);
                            c0666k.kilo(view);
                            C0666k c0666k2 = recyclerView.mChildHelper;
                            int indexOfChild2 = c0666k2.alpha.alpha.indexOfChild(view);
                            if (indexOfChild2 != -1) {
                                C0665j c0665j2 = c0666k2.bravo;
                                if (!c0665j2.echo(indexOfChild2)) {
                                    charlie = indexOfChild2 - c0665j2.charlie(indexOfChild2);
                                    if (charlie == -1) {
                                        recyclerView.mChildHelper.charlie(charlie);
                                        lima(view);
                                        childViewHolderInt2.addFlags(8224);
                                        f0Var = childViewHolderInt2;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                        sb2.append(childViewHolderInt2);
                                        throw new IllegalStateException(P0.black(recyclerView, sb2));
                                    }
                                }
                            }
                            charlie = -1;
                            if (charlie == -1) {
                            }
                        } else {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                    } else {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                } else {
                    int size4 = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size4) {
                            f0 f0Var5 = (f0) arrayList2.get(i13);
                            if (!f0Var5.isInvalid() && f0Var5.getLayoutPosition() == i4 && !f0Var5.isAttachedToTransitionOverlay()) {
                                arrayList2.remove(i13);
                                if (RecyclerView.sVerboseLoggingEnabled) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i4 + ") found match in cache: " + f0Var5);
                                }
                                f0Var = f0Var5;
                            } else {
                                i13++;
                            }
                        } else {
                            f0Var = null;
                            break;
                        }
                    }
                }
                if (f0Var != null) {
                    if (f0Var.isRemoved()) {
                        if (RecyclerView.sDebugAssertionsEnabled && !recyclerView.mState.golf) {
                            throw new IllegalStateException(P0.black(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                        }
                        z14 = recyclerView.mState.golf;
                    } else {
                        int i14 = f0Var.mPosition;
                        if (i14 >= 0 && i14 < recyclerView.mAdapter.getItemCount()) {
                            if ((!recyclerView.mState.golf && recyclerView.mAdapter.getItemViewType(f0Var.mPosition) != f0Var.getItemViewType()) || (recyclerView.mAdapter.hasStableIds() && f0Var.getItemId() != recyclerView.mAdapter.getItemId(f0Var.mPosition))) {
                                z14 = false;
                            } else {
                                z14 = z10;
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb3.append(f0Var);
                            throw new IndexOutOfBoundsException(P0.black(recyclerView, sb3));
                        }
                    }
                    if (!z14) {
                        f0Var.addFlags(4);
                        if (f0Var.isScrap()) {
                            recyclerView.removeDetachedView(f0Var.itemView, false);
                            f0Var.unScrap();
                        } else if (f0Var.wasReturnedFromScrap()) {
                            f0Var.clearReturnedFromScrapFlag();
                        }
                        kilo(f0Var);
                        f0Var = null;
                    } else {
                        z2 = z10;
                    }
                }
            } else {
                z10 = true;
            }
            if (f0Var == null) {
                int foxtrot2 = recyclerView.mAdapterHelper.foxtrot(i4, 0);
                if (foxtrot2 >= 0 && foxtrot2 < recyclerView.mAdapter.getItemCount()) {
                    int itemViewType = recyclerView.mAdapter.getItemViewType(foxtrot2);
                    j6 = 3;
                    if (recyclerView.mAdapter.hasStableIds()) {
                        long itemId2 = recyclerView.mAdapter.getItemId(foxtrot2);
                        int size5 = arrayList3.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                j7 = 4;
                                f0 f0Var6 = (f0) arrayList3.get(size5);
                                if (f0Var6.getItemId() == itemId2 && !f0Var6.wasReturnedFromScrap()) {
                                    if (itemViewType == f0Var6.getItemViewType()) {
                                        f0Var6.addFlags(32);
                                        if (f0Var6.isRemoved() && !recyclerView.mState.golf) {
                                            f0Var6.setFlags(2, 14);
                                        }
                                        f0Var = f0Var6;
                                    } else {
                                        arrayList3.remove(size5);
                                        recyclerView.removeDetachedView(f0Var6.itemView, false);
                                        f0 childViewHolderInt3 = RecyclerView.getChildViewHolderInt(f0Var6.itemView);
                                        childViewHolderInt3.mScrapContainer = null;
                                        childViewHolderInt3.mInChangeScrap = false;
                                        childViewHolderInt3.clearReturnedFromScrapFlag();
                                        kilo(childViewHolderInt3);
                                    }
                                }
                                size5--;
                            } else {
                                j7 = 4;
                                int size6 = arrayList2.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    f0 f0Var7 = (f0) arrayList2.get(size6);
                                    if (f0Var7.getItemId() != itemId2 || f0Var7.isAttachedToTransitionOverlay()) {
                                        size6--;
                                    } else if (itemViewType == f0Var7.getItemViewType()) {
                                        arrayList2.remove(size6);
                                        f0Var = f0Var7;
                                    } else {
                                        india(size6);
                                    }
                                }
                                f0Var = null;
                            }
                        }
                        if (f0Var != null) {
                            f0Var.mPosition = foxtrot2;
                            z2 = z10;
                        }
                    } else {
                        j7 = 4;
                    }
                    if (f0Var == null) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i4 + ") fetching from shared pool");
                        }
                        S s3 = (S) charlie().alpha.get(itemViewType);
                        if (s3 != null) {
                            ArrayList arrayList5 = s3.alpha;
                            if (!arrayList5.isEmpty()) {
                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                    if (!((f0) arrayList5.get(size7)).isAttachedToTransitionOverlay()) {
                                        f0Var2 = (f0) arrayList5.remove(size7);
                                        break;
                                    }
                                }
                            }
                        }
                        f0Var2 = null;
                        if (f0Var2 != null) {
                            f0Var2.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                View view2 = f0Var2.itemView;
                                if (view2 instanceof ViewGroup) {
                                    echo((ViewGroup) view2, false);
                                }
                            }
                        }
                        f0Var = f0Var2;
                    }
                    if (f0Var == null) {
                        long nanoTime = recyclerView.getNanoTime();
                        if (j5 != Long.MAX_VALUE) {
                            long j10 = this.golf.alpha(itemViewType).charlie;
                            if (j10 != 0 && j10 + nanoTime >= j5) {
                                z13 = false;
                            } else {
                                z13 = z10;
                            }
                            if (!z13) {
                                return null;
                            }
                        }
                        f0Var = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = RecyclerView.findNestedRecyclerView(f0Var.itemView)) != null) {
                            f0Var.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                        }
                        long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                        S alpha = this.golf.alpha(itemViewType);
                        long j11 = alpha.charlie;
                        if (j11 != 0) {
                            nanoTime2 = (nanoTime2 / j7) + ((j11 / j7) * 3);
                        }
                        alpha.charlie = nanoTime2;
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                        }
                    }
                } else {
                    StringBuilder hotel = av.q.hotel(i4, foxtrot2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
                    hotel.append(recyclerView.mState.bravo());
                    hotel.append(recyclerView.exceptionLabel());
                    throw new IndexOutOfBoundsException(hotel.toString());
                }
            } else {
                j6 = 3;
                j7 = 4;
            }
            if (z2 && !recyclerView.mState.golf && f0Var.hasAnyOfTheFlags(8192)) {
                f0Var.setFlags(0, 8192);
                if (recyclerView.mState.juliet) {
                    recyclerView.recordAnimationInfoIfBouncedHiddenView(f0Var, recyclerView.mItemAnimator.recordPreLayoutInformation(recyclerView.mState, f0Var, H.buildAdapterChangeFlagsForAnimations(f0Var) | 4096, f0Var.getUnmodifiedPayloads()));
                }
            }
            if (recyclerView.mState.golf && f0Var.isBound()) {
                f0Var.mPreLayoutPosition = i4;
            } else if (!f0Var.isBound() || f0Var.needsUpdate() || f0Var.isInvalid()) {
                if (RecyclerView.sDebugAssertionsEnabled && f0Var.isRemoved()) {
                    StringBuilder sb4 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb4.append(f0Var);
                    throw new IllegalStateException(P0.black(recyclerView, sb4));
                }
                int foxtrot3 = recyclerView.mAdapterHelper.foxtrot(i4, 0);
                g0 g0Var = null;
                f0Var.mBindingAdapter = null;
                f0Var.mOwnerRecyclerView = recyclerView;
                int itemViewType2 = f0Var.getItemViewType();
                long nanoTime3 = recyclerView.getNanoTime();
                if (j5 != Long.MAX_VALUE) {
                    long j12 = this.golf.alpha(itemViewType2).delta;
                    if (j12 != 0) {
                    }
                }
                if (f0Var.isTmpDetached()) {
                    recyclerView.attachViewToParent(f0Var.itemView, recyclerView.getChildCount(), f0Var.itemView.getLayoutParams());
                    z11 = z10;
                } else {
                    z11 = false;
                }
                recyclerView.mAdapter.bindViewHolder(f0Var, foxtrot3);
                if (z11) {
                    recyclerView.detachViewFromParent(f0Var.itemView);
                }
                long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                S alpha2 = this.golf.alpha(f0Var.getItemViewType());
                long j13 = alpha2.delta;
                if (j13 != 0) {
                    nanoTime4 = (nanoTime4 / j7) + ((j13 / j7) * j6);
                }
                alpha2.delta = nanoTime4;
                if (recyclerView.isAccessibilityEnabled()) {
                    View view3 = f0Var.itemView;
                    WeakHashMap weakHashMap = s1.au.alpha;
                    if (view3.getImportantForAccessibility() == 0) {
                        z12 = z10;
                        view3.setImportantForAccessibility(z12 ? 1 : 0);
                    } else {
                        z12 = z10;
                    }
                    h0 h0Var = recyclerView.mAccessibilityDelegate;
                    if (h0Var != null) {
                        g0 g0Var2 = h0Var.echo;
                        if (g0Var2 != null) {
                            r82 = z12 ? 1 : 0;
                        } else {
                            r82 = false;
                        }
                        if (r82 != false) {
                            g0Var2.getClass();
                            View.AccessibilityDelegate delta = s1.au.delta(view3);
                            if (delta != null) {
                                if (delta instanceof C2568a) {
                                    g0Var = ((C2568a) delta).alpha;
                                } else {
                                    g0Var = new C2569b(delta);
                                }
                            }
                            if (g0Var != null && g0Var != g0Var2) {
                                g0Var2.echo.put(view3, g0Var);
                            }
                        }
                        s1.au.november(view3, g0Var2);
                    }
                } else {
                    z12 = z10;
                }
                if (recyclerView.mState.golf) {
                    f0Var.mPreLayoutPosition = i4;
                }
                r12 = z12 ? 1 : 0;
                layoutParams = f0Var.itemView.getLayoutParams();
                if (layoutParams != null) {
                    m4 = (M) recyclerView.generateDefaultLayoutParams();
                    f0Var.itemView.setLayoutParams(m4);
                } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                    m4 = (M) recyclerView.generateLayoutParams(layoutParams);
                    f0Var.itemView.setLayoutParams(m4);
                } else {
                    m4 = (M) layoutParams;
                }
                m4.alpha = f0Var;
                if (z2 || r12 == false) {
                    z12 = false;
                }
                m4.silver = z12;
                return f0Var;
            }
            r12 = false;
            z12 = z10;
            layoutParams = f0Var.itemView.getLayoutParams();
            if (layoutParams != null) {
            }
            m4.alpha = f0Var;
            if (z2) {
            }
            z12 = false;
            m4.silver = z12;
            return f0Var;
        }
        StringBuilder hotel2 = av.q.hotel(i4, i4, "Invalid item position ", "(", "). Item count:");
        hotel2.append(recyclerView.mState.bravo());
        hotel2.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(hotel2.toString());
    }

    public final void november(f0 f0Var) {
        if (f0Var.mInChangeScrap) {
            this.bravo.remove(f0Var);
        } else {
            this.alpha.remove(f0Var);
        }
        f0Var.mScrapContainer = null;
        f0Var.mInChangeScrap = false;
        f0Var.clearReturnedFromScrapFlag();
    }

    public final void oscar() {
        int i4;
        L l10 = this.hotel.mLayout;
        if (l10 != null) {
            i4 = l10.juliet;
        } else {
            i4 = 0;
        }
        this.foxtrot = this.echo + i4;
        ArrayList arrayList = this.charlie;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.foxtrot; size--) {
            india(size);
        }
    }
}
