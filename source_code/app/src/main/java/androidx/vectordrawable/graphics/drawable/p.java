package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import i1.AbstractC1881b;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s6.C5;
import s6.Q5;

/* loaded from: classes3.dex */
public final class p extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final PorterDuff.Mode f3159c = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3161b;
    public n purple;
    public PorterDuffColorFilter red;
    public ColorFilter silver;
    public boolean teal;
    public boolean white;
    public final float[] yellow;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, androidx.vectordrawable.graphics.drawable.n] */
    public p() {
        this.white = true;
        this.yellow = new float[9];
        this.f3160a = new Matrix();
        this.f3161b = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.charlie = null;
        constantState.delta = f3159c;
        constantState.bravo = new m();
        this.purple = constantState;
    }

    public static p alpha(int i4, Resources.Theme theme, Resources resources) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            p pVar = new p();
            ThreadLocal threadLocal = i1.k.alpha;
            pVar.alpha = resources.getDrawable(i4, theme);
            new o(pVar.alpha.getConstantState());
            return pVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i4);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                p pVar2 = new p();
                pVar2.inflate(resources, xml, asAttributeSet, theme);
                return pVar2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e4) {
            Log.e("VectorDrawableCompat", "parser error", e4);
            return null;
        }
    }

    public final PorterDuffColorFilter bravo(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f3161b;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.silver;
            if (colorFilter == null) {
                colorFilter = this.red;
            }
            Matrix matrix = this.f3160a;
            canvas.getMatrix(matrix);
            float[] fArr = this.yellow;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.purple;
                Bitmap bitmap = nVar.foxtrot;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.foxtrot.getHeight()) {
                    nVar.foxtrot = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.kilo = true;
                }
                if (!this.white) {
                    n nVar2 = this.purple;
                    nVar2.foxtrot.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.foxtrot);
                    m mVar = nVar2.bravo;
                    mVar.alpha(mVar.golf, m.papa, canvas2, min, min2);
                } else {
                    n nVar3 = this.purple;
                    if (nVar3.kilo || nVar3.golf != nVar3.charlie || nVar3.hotel != nVar3.delta || nVar3.juliet != nVar3.echo || nVar3.india != nVar3.bravo.getRootAlpha()) {
                        n nVar4 = this.purple;
                        nVar4.foxtrot.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.foxtrot);
                        m mVar2 = nVar4.bravo;
                        mVar2.alpha(mVar2.golf, m.papa, canvas3, min, min2);
                        n nVar5 = this.purple;
                        nVar5.golf = nVar5.charlie;
                        nVar5.hotel = nVar5.delta;
                        nVar5.india = nVar5.bravo.getRootAlpha();
                        nVar5.juliet = nVar5.echo;
                        nVar5.kilo = false;
                    }
                }
                n nVar6 = this.purple;
                if (nVar6.bravo.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.lima == null) {
                        Paint paint2 = new Paint();
                        nVar6.lima = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.lima.setAlpha(nVar6.bravo.getRootAlpha());
                    nVar6.lima.setColorFilter(colorFilter);
                    paint = nVar6.lima;
                }
                canvas.drawBitmap(nVar6.foxtrot, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.purple.bravo.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.purple.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.silver;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.alpha != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.alpha.getConstantState());
        }
        this.purple.alpha = getChangingConfigurations();
        return this.purple;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.purple.bravo.india;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.purple.bravo.hotel;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.purple.echo;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.purple;
            if (nVar != null) {
                m mVar = nVar.bravo;
                if (mVar.november == null) {
                    mVar.november = Boolean.valueOf(mVar.golf.alpha());
                }
                if (!mVar.november.booleanValue()) {
                    ColorStateList colorStateList = this.purple.charlie;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, androidx.vectordrawable.graphics.drawable.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.teal && super.mutate() == this) {
            n nVar = this.purple;
            ?? constantState = new Drawable.ConstantState();
            constantState.charlie = null;
            constantState.delta = f3159c;
            if (nVar != null) {
                constantState.alpha = nVar.alpha;
                m mVar = new m(nVar.bravo);
                constantState.bravo = mVar;
                if (nVar.bravo.echo != null) {
                    mVar.echo = new Paint(nVar.bravo.echo);
                }
                if (nVar.bravo.delta != null) {
                    constantState.bravo.delta = new Paint(nVar.bravo.delta);
                }
                constantState.charlie = nVar.charlie;
                constantState.delta = nVar.delta;
                constantState.echo = nVar.echo;
            }
            this.purple = constantState;
            this.teal = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.purple;
        ColorStateList colorStateList = nVar.charlie;
        if (colorStateList != null && (mode = nVar.delta) != null) {
            this.red = bravo(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        } else {
            z2 = false;
        }
        m mVar = nVar.bravo;
        if (mVar.november == null) {
            mVar.november = Boolean.valueOf(mVar.golf.alpha());
        }
        if (mVar.november.booleanValue()) {
            boolean bravo = nVar.bravo.golf.bravo(iArr);
            nVar.kilo |= bravo;
            if (bravo) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.purple.bravo.getRootAlpha() != i4) {
            this.purple.bravo.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.purple.echo = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.silver = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            Q5.india(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.purple;
        if (nVar.charlie != colorStateList) {
            nVar.charlie = colorStateList;
            this.red = bravo(colorStateList, nVar.delta);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.purple;
        if (nVar.delta != mode) {
            nVar.delta = mode;
            this.red = bravo(nVar.charlie, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            return drawable.setVisible(z2, z10);
        }
        return super.setVisible(z2, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, androidx.vectordrawable.graphics.drawable.l, androidx.vectordrawable.graphics.drawable.i] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        boolean z2;
        int i4;
        int i5;
        int i10;
        char c3;
        int i11;
        Paint.Cap cap;
        Paint.Join join;
        Resources resources2 = resources;
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.purple;
        nVar.bravo = new m();
        TypedArray hotel = AbstractC1881b.hotel(resources2, theme, attributeSet, a.alpha);
        n nVar2 = this.purple;
        m mVar2 = nVar2.bravo;
        int i12 = !AbstractC1881b.echo(xmlPullParser, "tintMode") ? -1 : hotel.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i13 = 3;
        if (i12 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i12 != 5) {
            if (i12 != 9) {
                switch (i12) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.delta = mode;
        ColorStateList bravo = AbstractC1881b.bravo(hotel, xmlPullParser, theme);
        if (bravo != null) {
            nVar2.charlie = bravo;
        }
        boolean z10 = nVar2.echo;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = hotel.getBoolean(5, z10);
        }
        nVar2.echo = z10;
        float f5 = mVar2.juliet;
        boolean z11 = false;
        int i14 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f5 = hotel.getFloat(7, f5);
        }
        mVar2.juliet = f5;
        float f10 = mVar2.kilo;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = hotel.getFloat(8, f10);
        }
        mVar2.kilo = f10;
        if (mVar2.juliet <= 0.0f) {
            throw new XmlPullParserException(hotel.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 > 0.0f) {
            mVar2.hotel = hotel.getDimension(3, mVar2.hotel);
            int i15 = 2;
            float dimension = hotel.getDimension(2, mVar2.india);
            mVar2.india = dimension;
            if (mVar2.hotel <= 0.0f) {
                throw new XmlPullParserException(hotel.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = hotel.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = hotel.getString(0);
                if (string != null) {
                    mVar2.mike = string;
                    mVar2.oscar.put(string, mVar2);
                }
                hotel.recycle();
                nVar.alpha = getChangingConfigurations();
                nVar.kilo = true;
                n nVar3 = this.purple;
                m mVar3 = nVar3.bravo;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.golf);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z12 = true;
                while (eventType != i14 && (xmlPullParser.getDepth() >= depth || eventType != i13)) {
                    if (eventType == i15) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        bv.e eVar = mVar3.oscar;
                        mVar = mVar3;
                        if (equals) {
                            ?? lVar = new l();
                            lVar.echo = 0.0f;
                            lVar.golf = 1.0f;
                            lVar.hotel = 1.0f;
                            i4 = depth;
                            lVar.india = 0.0f;
                            lVar.juliet = 1.0f;
                            lVar.kilo = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.lima = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.mike = join2;
                            lVar.november = 4.0f;
                            TypedArray hotel2 = AbstractC1881b.hotel(resources2, theme, attributeSet, a.charlie);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = hotel2.getString(0);
                                if (string2 != null) {
                                    lVar.bravo = string2;
                                }
                                String string3 = hotel2.getString(2);
                                if (string3 != null) {
                                    lVar.alpha = C5.charlie(string3);
                                }
                                lVar.foxtrot = AbstractC1881b.charlie(hotel2, xmlPullParser, theme, "fillColor", 1);
                                float f11 = lVar.hotel;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f11 = hotel2.getFloat(12, f11);
                                }
                                lVar.hotel = f11;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? hotel2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.lima;
                                if (i16 == 0) {
                                    cap = cap2;
                                } else if (i16 != 1) {
                                    cap = i16 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.lima = cap;
                                int i17 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? hotel2.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.mike;
                                if (i17 == 0) {
                                    join = join2;
                                } else if (i17 != 1) {
                                    join = i17 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.mike = join;
                                float f12 = lVar.november;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f12 = hotel2.getFloat(10, f12);
                                }
                                lVar.november = f12;
                                lVar.delta = AbstractC1881b.charlie(hotel2, xmlPullParser, theme, "strokeColor", 3);
                                float f13 = lVar.golf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f13 = hotel2.getFloat(11, f13);
                                }
                                lVar.golf = f13;
                                float f14 = lVar.echo;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f14 = hotel2.getFloat(4, f14);
                                }
                                lVar.echo = f14;
                                float f15 = lVar.juliet;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f15 = hotel2.getFloat(6, f15);
                                }
                                lVar.juliet = f15;
                                float f16 = lVar.kilo;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f16 = hotel2.getFloat(7, f16);
                                }
                                lVar.kilo = f16;
                                float f17 = lVar.india;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f17 = hotel2.getFloat(5, f17);
                                }
                                lVar.india = f17;
                                int i18 = lVar.charlie;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i18 = hotel2.getInt(13, i18);
                                }
                                lVar.charlie = i18;
                            }
                            hotel2.recycle();
                            jVar.bravo.add(lVar);
                            if (lVar.getPathName() != null) {
                                eVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.alpha = nVar3.alpha;
                            z2 = false;
                            c3 = 5;
                            i11 = 1;
                            z12 = false;
                        } else {
                            i4 = depth;
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray hotel3 = AbstractC1881b.hotel(resources2, theme, attributeSet, a.delta);
                                    String string4 = hotel3.getString(0);
                                    if (string4 != null) {
                                        lVar2.bravo = string4;
                                    }
                                    String string5 = hotel3.getString(1);
                                    if (string5 != null) {
                                        lVar2.alpha = C5.charlie(string5);
                                    }
                                    lVar2.charlie = !AbstractC1881b.echo(xmlPullParser, "fillType") ? 0 : hotel3.getInt(2, 0);
                                    hotel3.recycle();
                                }
                                jVar.bravo.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    eVar.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.alpha = nVar3.alpha;
                            } else if (CTVariableUtils.DICTIONARY.equals(name)) {
                                j jVar2 = new j();
                                TypedArray hotel4 = AbstractC1881b.hotel(resources2, theme, attributeSet, a.bravo);
                                float f18 = jVar2.charlie;
                                if (AbstractC1881b.echo(xmlPullParser, "rotation")) {
                                    c3 = 5;
                                    f18 = hotel4.getFloat(5, f18);
                                } else {
                                    c3 = 5;
                                }
                                jVar2.charlie = f18;
                                i11 = 1;
                                jVar2.delta = hotel4.getFloat(1, jVar2.delta);
                                jVar2.echo = hotel4.getFloat(2, jVar2.echo);
                                float f19 = jVar2.foxtrot;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f19 = hotel4.getFloat(3, f19);
                                }
                                jVar2.foxtrot = f19;
                                float f20 = jVar2.golf;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f20 = hotel4.getFloat(4, f20);
                                }
                                jVar2.golf = f20;
                                float f21 = jVar2.hotel;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f21 = hotel4.getFloat(6, f21);
                                }
                                jVar2.hotel = f21;
                                float f22 = jVar2.india;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f22 = hotel4.getFloat(7, f22);
                                }
                                jVar2.india = f22;
                                z2 = false;
                                String string6 = hotel4.getString(0);
                                if (string6 != null) {
                                    jVar2.kilo = string6;
                                }
                                jVar2.charlie();
                                hotel4.recycle();
                                jVar.bravo.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    eVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.alpha = nVar3.alpha;
                            }
                            z2 = false;
                            c3 = 5;
                            i11 = 1;
                        }
                        i10 = i11;
                        i5 = 3;
                    } else {
                        mVar = mVar3;
                        z2 = z11;
                        i4 = depth;
                        i5 = i13;
                        i10 = 1;
                        if (eventType == i5 && CTVariableUtils.DICTIONARY.equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    z11 = z2;
                    i13 = i5;
                    i14 = i10;
                    mVar3 = mVar;
                    depth = i4;
                    i15 = 2;
                    resources2 = resources;
                }
                if (!z12) {
                    this.red = bravo(nVar.charlie, nVar.delta);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(hotel.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(hotel.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.white = true;
        this.yellow = new float[9];
        this.f3160a = new Matrix();
        this.f3161b = new Rect();
        this.purple = nVar;
        this.red = bravo(nVar.charlie, nVar.delta);
    }
}
