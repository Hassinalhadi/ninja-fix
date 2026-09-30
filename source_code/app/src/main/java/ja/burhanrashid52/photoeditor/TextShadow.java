package ja.burhanrashid52.photoeditor;

import Q0.c;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lja/burhanrashid52/photoeditor/TextShadow;", "", Constants.KEY_RADIUS, "", "dx", "dy", Constants.KEY_COLOR, "", "(FFFI)V", "getColor", "()I", "setColor", "(I)V", "getDx", "()F", "setDx", "(F)V", "getDy", "setDy", "getRadius", "setRadius", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextShadow {
    private int color;
    private float dx;
    private float dy;
    private float radius;

    public TextShadow(float f5, float f10, float f11, int i4) {
        this.radius = f5;
        this.dx = f10;
        this.dy = f11;
        this.color = i4;
    }

    public static /* synthetic */ TextShadow copy$default(TextShadow textShadow, float f5, float f10, float f11, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = textShadow.radius;
        }
        if ((i5 & 2) != 0) {
            f10 = textShadow.dx;
        }
        if ((i5 & 4) != 0) {
            f11 = textShadow.dy;
        }
        if ((i5 & 8) != 0) {
            i4 = textShadow.color;
        }
        return textShadow.copy(f5, f10, f11, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDx() {
        return this.dx;
    }

    /* renamed from: component3, reason: from getter */
    public final float getDy() {
        return this.dy;
    }

    /* renamed from: component4, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final TextShadow copy(float radius, float dx, float dy, int color) {
        return new TextShadow(radius, dx, dy, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextShadow)) {
            return false;
        }
        TextShadow textShadow = (TextShadow) other;
        return Float.compare(this.radius, textShadow.radius) == 0 && Float.compare(this.dx, textShadow.dx) == 0 && Float.compare(this.dy, textShadow.dy) == 0 && this.color == textShadow.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getDx() {
        return this.dx;
    }

    public final float getDy() {
        return this.dy;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return ad.sierra(this.dy, ad.sierra(this.dx, Float.floatToIntBits(this.radius) * 31, 31), 31) + this.color;
    }

    public final void setColor(int i4) {
        this.color = i4;
    }

    public final void setDx(float f5) {
        this.dx = f5;
    }

    public final void setDy(float f5) {
        this.dy = f5;
    }

    public final void setRadius(float f5) {
        this.radius = f5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextShadow(radius=");
        sb2.append(this.radius);
        sb2.append(", dx=");
        sb2.append(this.dx);
        sb2.append(", dy=");
        sb2.append(this.dy);
        sb2.append(", color=");
        return c.quebec(sb2, this.color, ')');
    }
}
