package z6;

import V5.x;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class e {
    public double alpha;
    public double bravo;
    public double charlie;
    public double delta;

    public final LatLngBounds alpha() {
        x.juliet("no included points", !Double.isNaN(this.charlie));
        return new LatLngBounds(new LatLng(this.alpha, this.charlie), new LatLng(this.bravo, this.delta));
    }

    public final void bravo(LatLng latLng) {
        double d4 = this.alpha;
        double d9 = latLng.alpha;
        this.alpha = Math.min(d4, d9);
        this.bravo = Math.max(this.bravo, d9);
        boolean isNaN = Double.isNaN(this.charlie);
        double d10 = latLng.purple;
        if (isNaN) {
            this.charlie = d10;
            this.delta = d10;
            return;
        }
        double d11 = this.charlie;
        double d12 = this.delta;
        if (d11 <= d12) {
            if (d11 <= d10 && d10 <= d12) {
                return;
            }
        } else if (d11 <= d10 || d10 <= d12) {
            return;
        }
        if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
            this.charlie = d10;
        } else {
            this.delta = d10;
        }
    }
}
