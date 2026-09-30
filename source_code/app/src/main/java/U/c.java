package U;

import A0.u;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import bv.ab;
import t0.C2946x;
import t6.O2;
import vg.al;

/* loaded from: classes3.dex */
public final class c extends j {
    public final O7.j alpha;
    public final u bravo;
    public final C2946x charlie;
    public final B0.b delta;
    public final String echo;
    public final Rect foxtrot = new Rect();
    public final AutofillId golf;
    public final ab hotel;
    public boolean india;

    public c(O7.j jVar, u uVar, C2946x c2946x, B0.b bVar, String str) {
        AutofillId autofillId;
        this.alpha = jVar;
        this.bravo = uVar;
        this.charlie = c2946x;
        this.delta = bVar;
        this.echo = str;
        c2946x.setImportantForAutofill(1);
        ai.a bravo = O2.bravo(c2946x);
        if (bravo != null) {
            autofillId = al.hotel(bravo.alpha);
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.golf = autofillId;
            this.hotel = new ab();
            return;
        }
        throw Q0.c.xray("Required value was null.");
    }
}
