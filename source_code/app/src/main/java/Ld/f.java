package Ld;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import s1.C2568a;
import s1.C2569b;
import s1.au;

/* loaded from: classes2.dex */
public abstract class f {
    public int alpha;
    public int purple;
    public int red;
    public Object silver;

    public f() {
        if (com.google.mlkit.common.sdkinternal.b.purple == null) {
            com.google.mlkit.common.sdkinternal.b.purple = new com.google.mlkit.common.sdkinternal.b(14);
        }
    }

    public int alpha(int i4) {
        if (i4 < this.red) {
            return ((ByteBuffer) this.silver).getShort(this.purple + i4);
        }
        return 0;
    }

    public void bravo() {
        if (((g) this.silver).f1832a == this.red) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object charlie(View view);

    public abstract void delta(View view, Object obj);

    public void echo() {
        while (true) {
            int i4 = this.alpha;
            g gVar = (g) this.silver;
            if (i4 < gVar.white && gVar.red[i4] < 0) {
                this.alpha = i4 + 1;
            } else {
                return;
            }
        }
    }

    public void foxtrot(View view, Object obj) {
        Object tag;
        C2569b c2569b;
        if (Build.VERSION.SDK_INT >= this.purple) {
            delta(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.purple) {
            tag = charlie(view);
        } else {
            tag = view.getTag(this.alpha);
            if (!((Class) this.silver).isInstance(tag)) {
                tag = null;
            }
        }
        if (golf(tag, obj)) {
            View.AccessibilityDelegate delta = au.delta(view);
            if (delta == null) {
                c2569b = null;
            } else if (delta instanceof C2568a) {
                c2569b = ((C2568a) delta).alpha;
            } else {
                c2569b = new C2569b(delta);
            }
            if (c2569b == null) {
                c2569b = new C2569b();
            }
            au.november(view, c2569b);
            view.setTag(this.alpha, obj);
            au.hotel(this.red, view);
        }
    }

    public abstract boolean golf(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.alpha < ((g) this.silver).white) {
            return true;
        }
        return false;
    }

    public void remove() {
        bravo();
        if (this.purple != -1) {
            g gVar = (g) this.silver;
            gVar.charlie();
            gVar.lima(this.purple);
            this.purple = -1;
            this.red = gVar.f1832a;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
