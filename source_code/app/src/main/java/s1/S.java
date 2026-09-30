package s1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes3.dex */
public class S extends Q {
    public S(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
    }

    @Override // s1.X
    public a0 alpha() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.charlie.consumeDisplayCutout();
        return a0.hotel(null, consumeDisplayCutout);
    }

    @Override // s1.P, s1.X
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s3 = (S) obj;
        if (Objects.equals(this.charlie, s3.charlie) && Objects.equals(this.golf, s3.golf) && P.beige(this.hotel, s3.hotel)) {
            return true;
        }
        return false;
    }

    @Override // s1.X
    public C2575h foxtrot() {
        DisplayCutout displayCutout;
        displayCutout = this.charlie.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2575h(displayCutout);
    }

    @Override // s1.X
    public int hashCode() {
        return this.charlie.hashCode();
    }

    public S(a0 a0Var, S s3) {
        super(a0Var, s3);
    }
}
