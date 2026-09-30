package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class V {
    public int bravo;
    public int charlie;
    public int delta;
    public int echo;
    public int foxtrot;
    public boolean golf;
    public String india;
    public int juliet;
    public CharSequence kilo;
    public int lima;
    public CharSequence mike;
    public ArrayList november;
    public ArrayList oscar;
    public ArrayList quebec;
    public final ArrayList alpha = new ArrayList();
    public boolean hotel = true;
    public boolean papa = false;

    public final void bravo(U u4) {
        this.alpha.add(u4);
        u4.delta = this.bravo;
        u4.echo = this.charlie;
        u4.foxtrot = this.delta;
        u4.golf = this.echo;
    }

    public final void charlie(String str) {
        if (this.hotel) {
            this.golf = true;
            this.india = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract void delta(int i4, ai aiVar, String str, int i5);

    public final void echo(ai aiVar, String str, int i4) {
        if (i4 != 0) {
            delta(i4, aiVar, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public abstract C0606a foxtrot(ai aiVar, androidx.lifecycle.ab abVar);
}
