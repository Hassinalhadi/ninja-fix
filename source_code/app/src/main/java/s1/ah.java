package s1;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes3.dex */
public final class ah extends Ld.f {
    public final /* synthetic */ int teal;

    public ah(int i4, Class cls, int i5, int i10, int i11) {
        this.teal = i11;
        this.alpha = i4;
        this.silver = cls;
        this.red = i5;
        this.purple = i10;
    }

    @Override // Ld.f
    public final Object charlie(View view) {
        switch (this.teal) {
            case 0:
                return Boolean.valueOf(ap.charlie(view));
            case 1:
                return ap.alpha(view);
            default:
                return Boolean.valueOf(ap.bravo(view));
        }
    }

    @Override // Ld.f
    public final void delta(View view, Object obj) {
        switch (this.teal) {
            case 0:
                ap.foxtrot(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                ap.echo(view, (CharSequence) obj);
                return;
            default:
                ap.delta(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // Ld.f
    public final boolean golf(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.teal) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z13 = false;
                if (bool != null && bool.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z2 == z10) {
                    z13 = true;
                }
                return !z13;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z14 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 == z12) {
                    z14 = true;
                }
                return !z14;
        }
    }
}
