package x2;

import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ad {
    public static final C3280a alpha;
    public static final ThreadLocal bravo;
    public static final ArrayList charlie;

    /* JADX WARN: Type inference failed for: r0v0, types: [x2.a, x2.af] */
    static {
        ?? afVar = new af();
        afVar.maroon(1);
        afVar.ivory(new C3286g(2));
        afVar.ivory(new z());
        afVar.ivory(new C3286g(1));
        alpha = afVar;
        bravo = new ThreadLocal();
        charlie = new ArrayList();
    }

    public static void alpha(ViewGroup viewGroup, z zVar) {
        ArrayList arrayList = charlie;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (zVar == null) {
                zVar = alpha;
            }
            z clone = zVar.clone();
            echo(viewGroup, clone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            delta(viewGroup, clone);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [bv.e, java.lang.Object, bv.aw] */
    public static bv.e bravo() {
        bv.e eVar;
        ThreadLocal threadLocal = bravo;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (bv.e) weakReference.get()) != null) {
            return eVar;
        }
        ?? awVar = new bv.aw(0);
        threadLocal.set(new WeakReference(awVar));
        return awVar;
    }

    public static void charlie(C3293n c3293n, z zVar) {
        ViewGroup viewGroup = c3293n.alpha;
        ArrayList arrayList = charlie;
        if (!arrayList.contains(viewGroup)) {
            C3293n c3293n2 = (C3293n) viewGroup.getTag(R.id.transition_current_scene);
            if (zVar == null) {
                if (c3293n2 != null) {
                }
                View view = c3293n.bravo;
                ViewGroup viewGroup2 = c3293n.alpha;
                if (view != null) {
                    viewGroup2.removeAllViews();
                    viewGroup2.addView(view);
                }
                viewGroup2.setTag(R.id.transition_current_scene, c3293n);
                return;
            }
            arrayList.add(viewGroup);
            z clone = zVar.clone();
            echo(viewGroup, clone);
            View view2 = c3293n.bravo;
            ViewGroup viewGroup3 = c3293n.alpha;
            if (view2 != null) {
                viewGroup3.removeAllViews();
                viewGroup3.addView(view2);
            }
            viewGroup3.setTag(R.id.transition_current_scene, c3293n);
            delta(viewGroup, clone);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x2.ac, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void delta(ViewGroup viewGroup, z zVar) {
        if (zVar != null && viewGroup != 0) {
            ?? obj = new Object();
            obj.alpha = zVar;
            obj.purple = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    public static void echo(ViewGroup viewGroup, z zVar) {
        ArrayList arrayList = (ArrayList) bravo().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((z) it.next()).zulu(viewGroup);
            }
        }
        if (zVar != null) {
            zVar.hotel(viewGroup, true);
        }
        C3293n c3293n = (C3293n) viewGroup.getTag(R.id.transition_current_scene);
        if (c3293n != null) {
        }
    }
}
