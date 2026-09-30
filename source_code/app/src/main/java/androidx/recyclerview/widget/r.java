package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class r extends i0 {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<f0> mAddAnimations;
    ArrayList<ArrayList<f0>> mAdditionsList;
    ArrayList<f0> mChangeAnimations;
    ArrayList<ArrayList<C0671p>> mChangesList;
    ArrayList<f0> mMoveAnimations;
    ArrayList<ArrayList<C0672q>> mMovesList;
    private ArrayList<f0> mPendingAdditions;
    private ArrayList<C0671p> mPendingChanges;
    private ArrayList<C0672q> mPendingMoves;
    private ArrayList<f0> mPendingRemovals;
    ArrayList<f0> mRemoveAnimations;

    public r() {
        this.mSupportsChangeAnimations = true;
        this.mPendingRemovals = new ArrayList<>();
        this.mPendingAdditions = new ArrayList<>();
        this.mPendingMoves = new ArrayList<>();
        this.mPendingChanges = new ArrayList<>();
        this.mAdditionsList = new ArrayList<>();
        this.mMovesList = new ArrayList<>();
        this.mChangesList = new ArrayList<>();
        this.mAddAnimations = new ArrayList<>();
        this.mMoveAnimations = new ArrayList<>();
        this.mRemoveAnimations = new ArrayList<>();
        this.mChangeAnimations = new ArrayList<>();
    }

    public final void alpha(f0 f0Var, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0671p c0671p = (C0671p) list.get(size);
            if (bravo(c0671p, f0Var) && c0671p.alpha == null && c0671p.bravo == null) {
                list.remove(c0671p);
            }
        }
    }

    @Override // androidx.recyclerview.widget.i0
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(f0 f0Var) {
        charlie(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(f0Var);
        return true;
    }

    public void animateAddImpl(f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(f0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C0668m(this, f0Var, view, animate)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.recyclerview.widget.p, java.lang.Object] */
    @Override // androidx.recyclerview.widget.i0
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(f0 f0Var, f0 f0Var2, int i4, int i5, int i10, int i11) {
        if (f0Var == f0Var2) {
            return animateMove(f0Var, i4, i5, i10, i11);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        charlie(f0Var);
        int i12 = (int) ((i10 - i4) - translationX);
        int i13 = (int) ((i11 - i5) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            charlie(f0Var2);
            f0Var2.itemView.setTranslationX(-i12);
            f0Var2.itemView.setTranslationY(-i13);
            f0Var2.itemView.setAlpha(0.0f);
        }
        ArrayList<C0671p> arrayList = this.mPendingChanges;
        ?? obj = new Object();
        obj.alpha = f0Var;
        obj.bravo = f0Var2;
        obj.charlie = i4;
        obj.delta = i5;
        obj.echo = i10;
        obj.foxtrot = i11;
        arrayList.add(obj);
        return true;
    }

    public void animateChangeImpl(C0671p c0671p) {
        View view;
        r rVar;
        C0671p c0671p2;
        f0 f0Var = c0671p.alpha;
        View view2 = null;
        if (f0Var == null) {
            view = null;
        } else {
            view = f0Var.itemView;
        }
        f0 f0Var2 = c0671p.bravo;
        if (f0Var2 != null) {
            view2 = f0Var2.itemView;
        }
        View view3 = view2;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(c0671p.alpha);
            duration.translationX(c0671p.echo - c0671p.charlie);
            duration.translationY(c0671p.foxtrot - c0671p.delta);
            rVar = this;
            c0671p2 = c0671p;
            duration.alpha(0.0f).setListener(new C0670o(rVar, c0671p2, duration, view, 0)).start();
        } else {
            rVar = this;
            c0671p2 = c0671p;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            rVar.mChangeAnimations.add(c0671p2.bravo);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C0670o(rVar, c0671p2, animate, view3, 1)).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, androidx.recyclerview.widget.q] */
    @Override // androidx.recyclerview.widget.i0
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(f0 f0Var, int i4, int i5, int i10, int i11) {
        View view = f0Var.itemView;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) f0Var.itemView.getTranslationY());
        charlie(f0Var);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            dispatchMoveFinished(f0Var);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX(-i12);
        }
        if (i13 != 0) {
            view.setTranslationY(-i13);
        }
        ArrayList<C0672q> arrayList = this.mPendingMoves;
        ?? obj = new Object();
        obj.alpha = f0Var;
        obj.bravo = translationX;
        obj.charlie = translationY;
        obj.delta = i10;
        obj.echo = i11;
        arrayList.add(obj);
        return true;
    }

    public void animateMoveImpl(f0 f0Var, int i4, int i5, int i10, int i11) {
        View view = f0Var.itemView;
        int i12 = i10 - i4;
        int i13 = i11 - i5;
        if (i12 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i13 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(f0Var);
        animate.setDuration(getMoveDuration()).setListener(new C0669n(this, f0Var, i12, view, i13, animate)).start();
    }

    @Override // androidx.recyclerview.widget.i0
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(f0 f0Var) {
        charlie(f0Var);
        this.mPendingRemovals.add(f0Var);
        return true;
    }

    public final boolean bravo(C0671p c0671p, f0 f0Var) {
        boolean z2 = false;
        if (c0671p.bravo == f0Var) {
            c0671p.bravo = null;
        } else {
            if (c0671p.alpha != f0Var) {
                return false;
            }
            c0671p.alpha = null;
            z2 = true;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(0.0f);
        f0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(f0Var, z2);
        return true;
    }

    @Override // androidx.recyclerview.widget.H
    public boolean canReuseUpdatedViewHolder(f0 f0Var, List<Object> list) {
        if (list.isEmpty() && !canReuseUpdatedViewHolder(f0Var)) {
            return false;
        }
        return true;
    }

    public void cancelAll(List<f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public final void charlie(f0 f0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(f0Var);
    }

    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.H
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(f0 f0Var) {
        View view = f0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).alpha == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(f0Var);
                this.mPendingMoves.remove(size);
            }
        }
        alpha(f0Var, this.mPendingChanges);
        if (this.mPendingRemovals.remove(f0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(f0Var);
        }
        if (this.mPendingAdditions.remove(f0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(f0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<C0671p> arrayList = this.mChangesList.get(size2);
            alpha(f0Var, arrayList);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<C0672q> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).alpha == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<f0> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(f0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(f0Var);
        this.mAddAnimations.remove(f0Var);
        this.mChangeAnimations.remove(f0Var);
        this.mMoveAnimations.remove(f0Var);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.H
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0672q c0672q = this.mPendingMoves.get(size);
            View view = c0672q.alpha.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c0672q.alpha);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f0 f0Var = this.mPendingAdditions.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(f0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            C0671p c0671p = this.mPendingChanges.get(size4);
            f0 f0Var2 = c0671p.alpha;
            if (f0Var2 != null) {
                bravo(c0671p, f0Var2);
            }
            f0 f0Var3 = c0671p.bravo;
            if (f0Var3 != null) {
                bravo(c0671p, f0Var3);
            }
        }
        this.mPendingChanges.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
            ArrayList<C0672q> arrayList = this.mMovesList.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                C0672q c0672q2 = arrayList.get(size6);
                View view2 = c0672q2.alpha.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                dispatchMoveFinished(c0672q2.alpha);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.mMovesList.remove(arrayList);
                }
            }
        }
        for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
            ArrayList<f0> arrayList2 = this.mAdditionsList.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                f0 f0Var4 = arrayList2.get(size8);
                f0Var4.itemView.setAlpha(1.0f);
                dispatchAddFinished(f0Var4);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.mAdditionsList.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
            ArrayList<C0671p> arrayList3 = this.mChangesList.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                C0671p c0671p2 = arrayList3.get(size10);
                f0 f0Var5 = c0671p2.alpha;
                if (f0Var5 != null) {
                    bravo(c0671p2, f0Var5);
                }
                f0 f0Var6 = c0671p2.bravo;
                if (f0Var6 != null) {
                    bravo(c0671p2, f0Var6);
                }
                if (arrayList3.isEmpty()) {
                    this.mChangesList.remove(arrayList3);
                }
            }
        }
        cancelAll(this.mRemoveAnimations);
        cancelAll(this.mMoveAnimations);
        cancelAll(this.mAddAnimations);
        cancelAll(this.mChangeAnimations);
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.H
    public boolean isRunning() {
        if (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.H
    public void runPendingAnimations() {
        long j5;
        long j6;
        int i4 = 0;
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator<f0> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                f0 next = it.next();
                View view = next.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.mRemoveAnimations.add(next);
                animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C0668m(this, next, animate, view)).start();
            }
            this.mPendingRemovals.clear();
            if (!isEmpty2) {
                ArrayList<C0672q> arrayList = new ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                RunnableC0667l runnableC0667l = new RunnableC0667l(i4, this, arrayList);
                if (!isEmpty) {
                    View view2 = arrayList.get(0).alpha.itemView;
                    long removeDuration = getRemoveDuration();
                    WeakHashMap weakHashMap = s1.au.alpha;
                    view2.postOnAnimationDelayed(runnableC0667l, removeDuration);
                } else {
                    runnableC0667l.run();
                }
            }
            if (!isEmpty3) {
                ArrayList<C0671p> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                RunnableC0667l runnableC0667l2 = new RunnableC0667l(1, this, arrayList2);
                if (!isEmpty) {
                    View view3 = arrayList2.get(0).alpha.itemView;
                    long removeDuration2 = getRemoveDuration();
                    WeakHashMap weakHashMap2 = s1.au.alpha;
                    view3.postOnAnimationDelayed(runnableC0667l2, removeDuration2);
                } else {
                    runnableC0667l2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList<f0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                RunnableC0667l runnableC0667l3 = new RunnableC0667l(2, this, arrayList3);
                if (isEmpty && isEmpty2 && isEmpty3) {
                    runnableC0667l3.run();
                    return;
                }
                long j7 = 0;
                if (!isEmpty) {
                    j5 = getRemoveDuration();
                } else {
                    j5 = 0;
                }
                if (!isEmpty2) {
                    j6 = getMoveDuration();
                } else {
                    j6 = 0;
                }
                if (!isEmpty3) {
                    j7 = getChangeDuration();
                }
                long max = Math.max(j6, j7) + j5;
                View view4 = arrayList3.get(0).itemView;
                WeakHashMap weakHashMap3 = s1.au.alpha;
                view4.postOnAnimationDelayed(runnableC0667l3, max);
            }
        }
    }
}
