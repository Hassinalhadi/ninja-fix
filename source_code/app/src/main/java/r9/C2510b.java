package r9;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.s;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q9.InterfaceC2431a;
import y5.j;

/* renamed from: r9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2510b extends androidx.viewpager.widget.a {
    public final List charlie;
    public final Context echo;
    public final InterfaceC2431a foxtrot;
    public final boolean golf;
    public final SparseArray alpha = new SparseArray();
    public SparseArray bravo = new SparseArray();
    public final ArrayList delta = new ArrayList();

    public C2510b(Context context, List list, InterfaceC2431a interfaceC2431a, boolean z2) {
        this.echo = context;
        this.foxtrot = interfaceC2431a;
        this.golf = z2;
        this.charlie = list;
    }

    @Override // androidx.viewpager.widget.a
    public final void destroyItem(ViewGroup viewGroup, int i4, Object item) {
        Intrinsics.foxtrot(item, "item");
        if (item instanceof C2509a) {
            C2509a c2509a = (C2509a) item;
            viewGroup.removeView(c2509a.charlie);
            c2509a.bravo = false;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final int getCount() {
        return this.charlie.size();
    }

    @Override // androidx.viewpager.widget.a
    public final int getItemPosition(Object item) {
        Intrinsics.foxtrot(item, "item");
        return -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // androidx.viewpager.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object instantiateItem(ViewGroup viewGroup, int i4) {
        C2509a c2509a;
        SparseArray<Parcelable> sparseArray;
        SparseArray sparseArray2 = this.alpha;
        int i5 = 0;
        p9.a aVar = (p9.a) sparseArray2.get(0);
        if (aVar == null) {
            aVar = new p9.a(this);
            sparseArray2.put(0, aVar);
        }
        while (true) {
            ArrayList arrayList = aVar.alpha;
            if (i5 < arrayList.size()) {
                c2509a = (C2509a) arrayList.get(i5);
                if (!c2509a.bravo) {
                    break;
                }
                i5++;
            } else {
                C2510b c2510b = aVar.bravo;
                c2510b.getClass();
                j jVar = new j(c2510b.echo);
                jVar.setEnabled(c2510b.golf);
                jVar.setOnViewDragListener(new s(28, jVar));
                C2509a c2509a2 = new C2509a(c2510b, jVar);
                c2510b.delta.add(c2509a2);
                arrayList.add(c2509a2);
                c2509a = c2509a2;
                break;
            }
        }
        c2509a.bravo = true;
        c2509a.alpha = i4;
        j jVar2 = c2509a.charlie;
        viewGroup.addView(jVar2);
        c2509a.alpha = i4;
        C2510b c2510b2 = c2509a.echo;
        c2510b2.foxtrot.foxtrot(c2509a.delta, c2510b2.charlie.get(i4));
        Parcelable parcelable = (Parcelable) this.bravo.get(i4);
        if (parcelable != null && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("a")) {
                sparseArray = bundle.getSparseParcelableArray("a");
                if (sparseArray != null) {
                    jVar2.restoreHierarchyState(sparseArray);
                }
                return c2509a;
            }
        }
        sparseArray = null;
        if (sparseArray != null) {
        }
        return c2509a;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean isViewFromObject(View view, Object obj) {
        Intrinsics.foxtrot(view, "view");
        Intrinsics.foxtrot(obj, "obj");
        if ((obj instanceof C2509a) && ((C2509a) obj).charlie == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.a
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("b");
            if (sparseParcelableArray == null) {
                sparseParcelableArray = new SparseArray();
            }
            this.bravo = sparseParcelableArray;
        }
        super.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.a
    public final Parcelable saveState() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.alpha;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (size == sparseArray.size()) {
                sparseArray.keyAt(i4);
                Iterator it = ((p9.a) sparseArray.valueAt(i4)).alpha.iterator();
                while (it.hasNext()) {
                    C2509a c2509a = (C2509a) it.next();
                    if (c2509a.bravo) {
                        arrayList.add(c2509a);
                    }
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2509a c2509a2 = (C2509a) it2.next();
            SparseArray sparseArray2 = this.bravo;
            int i5 = c2509a2.alpha;
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            c2509a2.charlie.saveHierarchyState(sparseArray3);
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("a", sparseArray3);
            sparseArray2.put(i5, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putSparseParcelableArray("b", this.bravo);
        return bundle2;
    }
}
