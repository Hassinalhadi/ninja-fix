package androidx.compose.foundation.layout;

import android.view.View;
import delivery.samurai.android.R;
import java.util.WeakHashMap;
import s1.C2575h;

/* loaded from: classes3.dex */
public final class b0 {
    public static final WeakHashMap whiskey = new WeakHashMap();
    public final C0535a alpha = C0537c.delta(4, "captionBar");
    public final C0535a bravo;
    public final C0535a charlie;
    public final C0535a delta;
    public final C0535a echo;
    public final C0535a foxtrot;
    public final C0535a golf;
    public final C0535a hotel;
    public final C0535a india;
    public final Z juliet;
    public final X kilo;
    public final X lima;
    public final Z mike;
    public final Z november;
    public final Z oscar;
    public final Z papa;
    public final Z quebec;
    public final Z romeo;
    public final Z sierra;
    public final boolean tango;
    public int uniform;
    public final av victor;

    public b0(View view) {
        View view2;
        Object obj;
        boolean z2;
        C0535a delta = C0537c.delta(128, "displayCutout");
        this.bravo = delta;
        C0535a delta2 = C0537c.delta(8, "ime");
        this.charlie = delta2;
        C0535a delta3 = C0537c.delta(32, "mandatorySystemGestures");
        this.delta = delta3;
        this.echo = C0537c.delta(2, "navigationBars");
        this.foxtrot = C0537c.delta(1, "statusBars");
        C0535a delta4 = C0537c.delta(519, "systemBars");
        this.golf = delta4;
        C0535a delta5 = C0537c.delta(16, "systemGestures");
        this.hotel = delta5;
        C0535a delta6 = C0537c.delta(64, "tappableElement");
        this.india = delta6;
        Z z10 = new Z(new az(0, 0, 0, 0), "waterfall");
        this.juliet = z10;
        X x4 = new X(new X(delta4, delta2), delta);
        this.kilo = x4;
        this.lima = new X(x4, new X(new X(new X(delta6, delta3), delta5), z10));
        this.mike = C0537c.echo(4, "captionBarIgnoringVisibility");
        this.november = C0537c.echo(2, "navigationBarsIgnoringVisibility");
        this.oscar = C0537c.echo(1, "statusBarsIgnoringVisibility");
        this.papa = C0537c.echo(519, "systemBarsIgnoringVisibility");
        this.quebec = C0537c.echo(64, "tappableElementIgnoringVisibility");
        this.romeo = C0537c.echo(8, "imeAnimationTarget");
        this.sierra = C0537c.echo(8, "imeAnimationSource");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        this.tango = z2;
        this.victor = new av(this);
    }

    public static void alpha(b0 b0Var, s1.a0 a0Var) {
        boolean z2 = false;
        b0Var.alpha.foxtrot(a0Var, 0);
        b0Var.charlie.foxtrot(a0Var, 0);
        b0Var.bravo.foxtrot(a0Var, 0);
        b0Var.echo.foxtrot(a0Var, 0);
        b0Var.foxtrot.foxtrot(a0Var, 0);
        b0Var.golf.foxtrot(a0Var, 0);
        b0Var.hotel.foxtrot(a0Var, 0);
        b0Var.india.foxtrot(a0Var, 0);
        b0Var.delta.foxtrot(a0Var, 0);
        b0Var.mike.foxtrot(AbstractC0538d.yankee(a0Var.alpha.hotel(4)));
        b0Var.november.foxtrot(AbstractC0538d.yankee(a0Var.alpha.hotel(2)));
        b0Var.oscar.foxtrot(AbstractC0538d.yankee(a0Var.alpha.hotel(1)));
        b0Var.papa.foxtrot(AbstractC0538d.yankee(a0Var.alpha.hotel(519)));
        b0Var.quebec.foxtrot(AbstractC0538d.yankee(a0Var.alpha.hotel(64)));
        C2575h foxtrot = a0Var.alpha.foxtrot();
        if (foxtrot != null) {
            b0Var.juliet.foxtrot(AbstractC0538d.yankee(foxtrot.alpha()));
        }
        synchronized (S.n.charlie) {
            bv.am amVar = S.n.juliet.hotel;
            if (amVar != null) {
                if (amVar.hotel()) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            S.n.alpha();
        }
    }
}
