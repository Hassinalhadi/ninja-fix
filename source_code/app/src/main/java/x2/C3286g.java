package x2;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;

/* renamed from: x2.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3286g extends aw {
    public C3286g(int i4) {
        this.f14066y = i4;
    }

    public static float magenta(ai aiVar, float f5) {
        Float f10;
        if (aiVar != null && (f10 = (Float) aiVar.alpha.get("android:fade:transitionAlpha")) != null) {
            return f10.floatValue();
        }
        return f5;
    }

    @Override // x2.z
    public final void golf(ai aiVar) {
        aw.indigo(aiVar);
        View view = aiVar.bravo;
        Float f5 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f5 == null) {
            if (view.getVisibility() == 0) {
                f5 = Float.valueOf(al.alpha.alpha(view));
            } else {
                f5 = Float.valueOf(0.0f);
            }
        }
        aiVar.alpha.put("android:fade:transitionAlpha", f5);
    }

    @Override // x2.aw
    public final ObjectAnimator jade(ViewGroup viewGroup, View view, ai aiVar, ai aiVar2) {
        al.alpha.getClass();
        return lime(view, magenta(aiVar, 0.0f), 1.0f);
    }

    @Override // x2.aw
    public final ObjectAnimator lavender(ViewGroup viewGroup, View view, ai aiVar, ai aiVar2) {
        ar arVar = al.alpha;
        arVar.getClass();
        ObjectAnimator lime = lime(view, magenta(aiVar, 1.0f), 0.0f);
        if (lime == null) {
            arVar.bravo(view, magenta(aiVar2, 1.0f));
        }
        return lime;
    }

    public final ObjectAnimator lime(View view, float f5, float f10) {
        if (f5 == f10) {
            return null;
        }
        al.alpha.bravo(view, f5);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, al.bravo, f10);
        C3285f c3285f = new C3285f(view);
        ofFloat.addListener(c3285f);
        papa().alpha(c3285f);
        return ofFloat;
    }

    @Override // x2.z
    public final boolean uniform() {
        return true;
    }
}
