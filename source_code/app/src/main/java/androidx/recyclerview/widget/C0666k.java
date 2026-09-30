package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0666k {
    public final ax alpha;
    public View echo;
    public int delta = 0;
    public final C0665j bravo = new C0665j();
    public final ArrayList charlie = new ArrayList();

    public C0666k(ax axVar) {
        this.alpha = axVar;
    }

    public final void alpha(View view, int i4, boolean z2) {
        int foxtrot;
        RecyclerView recyclerView = this.alpha.alpha;
        if (i4 < 0) {
            foxtrot = recyclerView.getChildCount();
        } else {
            foxtrot = foxtrot(i4);
        }
        this.bravo.foxtrot(foxtrot, z2);
        if (z2) {
            india(view);
        }
        recyclerView.addView(view, foxtrot);
        recyclerView.dispatchChildAttached(view);
    }

    public final void bravo(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int foxtrot;
        RecyclerView recyclerView = this.alpha.alpha;
        if (i4 < 0) {
            foxtrot = recyclerView.getChildCount();
        } else {
            foxtrot = foxtrot(i4);
        }
        this.bravo.foxtrot(foxtrot, z2);
        if (z2) {
            india(view);
        }
        f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(P0.black(recyclerView, sb2));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(foxtrot);
            throw new IllegalArgumentException(P0.black(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, foxtrot, layoutParams);
    }

    public final void charlie(int i4) {
        int foxtrot = foxtrot(i4);
        this.bravo.hotel(foxtrot);
        RecyclerView recyclerView = this.alpha.alpha;
        View childAt = recyclerView.getChildAt(foxtrot);
        if (childAt != null) {
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(childViewHolderInt);
                    throw new IllegalArgumentException(P0.black(recyclerView, sb2));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(Barcode.FORMAT_QR_CODE);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(foxtrot);
            throw new IllegalArgumentException(P0.black(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(foxtrot);
    }

    public final View delta(int i4) {
        return this.alpha.alpha.getChildAt(foxtrot(i4));
    }

    public final int echo() {
        return this.alpha.alpha.getChildCount() - this.charlie.size();
    }

    public final int foxtrot(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int childCount = this.alpha.alpha.getChildCount();
        int i5 = i4;
        while (i5 < childCount) {
            C0665j c0665j = this.bravo;
            int charlie = i4 - (i5 - c0665j.charlie(i5));
            if (charlie == 0) {
                while (c0665j.echo(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += charlie;
        }
        return -1;
    }

    public final View golf(int i4) {
        return this.alpha.alpha.getChildAt(i4);
    }

    public final int hotel() {
        return this.alpha.alpha.getChildCount();
    }

    public final void india(View view) {
        this.charlie.add(view);
        ax axVar = this.alpha;
        f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(axVar.alpha);
        }
    }

    public final void juliet(int i4) {
        ax axVar = this.alpha;
        int i5 = this.delta;
        if (i5 != 1) {
            if (i5 != 2) {
                try {
                    int foxtrot = foxtrot(i4);
                    View childAt = axVar.alpha.getChildAt(foxtrot);
                    if (childAt != null) {
                        this.delta = 1;
                        this.echo = childAt;
                        if (this.bravo.hotel(foxtrot)) {
                            kilo(childAt);
                        }
                        axVar.charlie(foxtrot);
                    }
                    this.delta = 0;
                    this.echo = null;
                    return;
                } catch (Throwable th) {
                    this.delta = 0;
                    this.echo = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void kilo(View view) {
        if (this.charlie.remove(view)) {
            ax axVar = this.alpha;
            f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(axVar.alpha);
            }
        }
    }

    public final String toString() {
        return this.bravo.toString() + ", hidden list:" + this.charlie.size();
    }
}
