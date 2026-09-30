package s1;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import f2.AbstractC1688a;
import j1.C1929c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class F extends WindowInsetsAnimation$Callback {
    public final Pf.g alpha;
    public List bravo;
    public ArrayList charlie;
    public final HashMap delta;

    public F(Pf.g gVar) {
        super(gVar.alpha);
        this.delta = new HashMap();
        this.alpha = gVar;
    }

    public final I alpha(WindowInsetsAnimation windowInsetsAnimation) {
        I i4 = (I) this.delta.get(windowInsetsAnimation);
        if (i4 == null) {
            i4 = new I(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                i4.alpha = new G(windowInsetsAnimation);
            }
            this.delta.put(windowInsetsAnimation, i4);
        }
        return i4;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.alpha.delta(alpha(windowInsetsAnimation));
        this.delta.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        Pf.g gVar = this.alpha;
        alpha(windowInsetsAnimation);
        gVar.echo();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.charlie;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.charlie = arrayList2;
            this.bravo = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation hotel = E.hotel(list.get(size));
            I alpha = alpha(hotel);
            fraction = hotel.getFraction();
            alpha.alpha.echo(fraction);
            this.charlie.add(alpha);
        }
        return this.alpha.foxtrot(a0.hotel(null, windowInsets), this.bravo).golf();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        com.google.android.play.core.integrity.k golf = this.alpha.golf(alpha(windowInsetsAnimation), new com.google.android.play.core.integrity.k(bounds));
        golf.getClass();
        AbstractC1688a.quebec();
        return E.foxtrot(((C1929c) golf.purple).delta(), ((C1929c) golf.red).delta());
    }
}
