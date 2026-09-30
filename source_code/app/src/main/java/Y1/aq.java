package Y1;

import android.os.Bundle;

/* loaded from: classes3.dex */
public abstract class aq {
    public static final e bravo;
    public static final e charlie;
    public static final d delta;
    public static final d echo;
    public static final e foxtrot;
    public static final d golf;
    public static final d hotel;
    public static final e india;
    public static final d juliet;
    public static final d kilo;
    public static final e lima;
    public static final d mike;
    public static final d november;
    public static final e oscar;
    public static final d papa;
    public static final d quebec;
    public final boolean alpha;

    static {
        boolean z2 = false;
        bravo = new e(2, z2);
        charlie = new e(4, z2);
        boolean z10 = true;
        delta = new d(4, z10);
        echo = new d(5, z10);
        foxtrot = new e(3, z2);
        golf = new d(6, z10);
        hotel = new d(7, z10);
        india = new e(1, z2);
        juliet = new d(2, z10);
        kilo = new d(3, z10);
        lima = new e(0, z2);
        mike = new d(0, z10);
        november = new d(1, z10);
        oscar = new e(5, z10);
        papa = new d(8, z10);
        quebec = new d(9, z10);
    }

    public aq(boolean z2) {
        this.alpha = z2;
    }

    public abstract Object alpha(Bundle bundle, String str);

    public abstract String bravo();

    public Object charlie(Object obj, String str) {
        return delta(str);
    }

    public abstract Object delta(String str);

    public abstract void echo(Bundle bundle, String str, Object obj);

    public String foxtrot(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return bravo();
    }
}
