package Z;

import com.clevertap.android.sdk.Constants;
import t6.G2;

/* loaded from: classes3.dex */
public final class a {
    public final /* synthetic */ int alpha;
    public float bravo;
    public float charlie;
    public float delta;
    public float echo;

    public a(float f5, float f10) {
        this.alpha = 1;
        this.charlie = f5;
        this.delta = f10;
    }

    public float alpha() {
        return this.echo;
    }

    public float bravo() {
        return this.charlie;
    }

    public float charlie() {
        return this.delta;
    }

    public float delta() {
        return this.bravo;
    }

    public void echo(float f5, float f10, float f11, float f12) {
        this.bravo = Math.max(f5, this.bravo);
        this.charlie = Math.max(f10, this.charlie);
        this.delta = Math.min(f11, this.delta);
        this.echo = Math.min(f12, this.echo);
    }

    public boolean foxtrot() {
        boolean z2;
        boolean z10 = false;
        if (this.bravo >= this.delta) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.charlie >= this.echo) {
            z10 = true;
        }
        return z2 | z10;
    }

    public void golf() {
        float f5 = 1.0f;
        float f10 = this.charlie;
        float f11 = this.delta;
        if (1.0f <= f10 && 1.0f >= f11) {
            this.bravo = 1.0f;
            if (f10 != f11) {
                if (1.0f != f10) {
                    if (1.0f != f11) {
                        float f12 = 1.0f / f11;
                        f5 = (1.0f - f12) / ((1.0f / f10) - f12);
                    }
                }
                this.echo = f5;
                return;
            }
            f5 = 0.0f;
            this.echo = f5;
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + f11 + " , " + f10 + Constants.AES_SUFFIX);
    }

    public String toString() {
        switch (this.alpha) {
            case 0:
                return "MutableRect(" + G2.alpha(this.bravo) + ", " + G2.alpha(this.charlie) + ", " + G2.alpha(this.delta) + ", " + G2.alpha(this.echo) + ')';
            default:
                return super.toString();
        }
    }

    public a() {
        this.alpha = 0;
        this.bravo = 0.0f;
        this.charlie = 0.0f;
        this.delta = 0.0f;
        this.echo = 0.0f;
    }
}
