package s1;

import android.os.Build;
import android.view.View;
import j1.C1929c;
import java.util.Objects;

/* loaded from: classes3.dex */
public class X {
    public static final a0 bravo;
    public final a0 alpha;

    static {
        O j5;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            j5 = new N();
        } else if (i4 >= 31) {
            j5 = new M();
        } else if (i4 >= 30) {
            j5 = new L();
        } else if (i4 >= 29) {
            j5 = new K();
        } else {
            j5 = new J();
        }
        bravo = j5.bravo().alpha.alpha().alpha.bravo().alpha.charlie();
    }

    public X(a0 a0Var) {
        this.alpha = a0Var;
    }

    public a0 alpha() {
        return this.alpha;
    }

    public a0 bravo() {
        return this.alpha;
    }

    public a0 charlie() {
        return this.alpha;
    }

    public void delta(View view) {
    }

    public void echo(a0 a0Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x4 = (X) obj;
        if (papa() == x4.papa() && oscar() == x4.oscar() && Objects.equals(lima(), x4.lima()) && Objects.equals(juliet(), x4.juliet()) && Objects.equals(foxtrot(), x4.foxtrot())) {
            return true;
        }
        return false;
    }

    public C2575h foxtrot() {
        return null;
    }

    public C1929c golf(int i4) {
        return C1929c.echo;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(papa()), Boolean.valueOf(oscar()), lima(), juliet(), foxtrot());
    }

    public C1929c hotel(int i4) {
        if ((i4 & 8) == 0) {
            return C1929c.echo;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public C1929c india() {
        return lima();
    }

    public C1929c juliet() {
        return C1929c.echo;
    }

    public C1929c kilo() {
        return lima();
    }

    public C1929c lima() {
        return C1929c.echo;
    }

    public C1929c mike() {
        return lima();
    }

    public a0 november(int i4, int i5, int i10, int i11) {
        return bravo;
    }

    public boolean oscar() {
        return false;
    }

    public boolean papa() {
        return false;
    }

    public boolean quebec(int i4) {
        return true;
    }

    public void romeo(C1929c[] c1929cArr) {
    }

    public void sierra(C1929c c1929c) {
    }

    public void tango(a0 a0Var) {
    }

    public void uniform(C1929c c1929c) {
    }

    public void victor(int i4) {
    }
}
