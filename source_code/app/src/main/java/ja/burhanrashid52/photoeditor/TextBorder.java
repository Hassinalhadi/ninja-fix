package ja.burhanrashid52.photoeditor;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lja/burhanrashid52/photoeditor/TextBorder;", "", "corner", "", "backGroundColor", "", "strokeWidth", "strokeColor", "(FIII)V", "getBackGroundColor", "()I", "setBackGroundColor", "(I)V", "getCorner", "()F", "setCorner", "(F)V", "getStrokeColor", "setStrokeColor", "getStrokeWidth", "setStrokeWidth", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextBorder {
    private int backGroundColor;
    private float corner;
    private int strokeColor;
    private int strokeWidth;

    public TextBorder(float f5, int i4, int i5, int i10) {
        this.corner = f5;
        this.backGroundColor = i4;
        this.strokeWidth = i5;
        this.strokeColor = i10;
    }

    public final int getBackGroundColor() {
        return this.backGroundColor;
    }

    public final float getCorner() {
        return this.corner;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    public final void setBackGroundColor(int i4) {
        this.backGroundColor = i4;
    }

    public final void setCorner(float f5) {
        this.corner = f5;
    }

    public final void setStrokeColor(int i4) {
        this.strokeColor = i4;
    }

    public final void setStrokeWidth(int i4) {
        this.strokeWidth = i4;
    }
}
