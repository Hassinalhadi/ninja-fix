package d7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import e1.AbstractC1625a;
import i1.k;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import s6.AbstractC2719n0;
import s6.AbstractC2728o0;
import s6.AbstractC2737p0;

/* loaded from: classes2.dex */
public final class e {
    public final ColorStateList alpha;
    public final String bravo;
    public final String charlie;
    public final int delta;
    public final int echo;
    public final float foxtrot;
    public final float golf;
    public final float hotel;
    public final boolean india;
    public final float juliet;
    public final ColorStateList kilo;
    public float lima;
    public final int mike;
    public boolean november = false;
    public boolean oscar = false;
    public Typeface papa;

    public e(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, aj.a.xray);
        this.lima = obtainStyledAttributes.getDimension(0, 0.0f);
        this.kilo = AbstractC2719n0.alpha(context, obtainStyledAttributes, 3);
        AbstractC2719n0.alpha(context, obtainStyledAttributes, 4);
        AbstractC2719n0.alpha(context, obtainStyledAttributes, 5);
        this.delta = obtainStyledAttributes.getInt(2, 0);
        this.echo = obtainStyledAttributes.getInt(1, 1);
        int i5 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.mike = obtainStyledAttributes.getResourceId(i5, 0);
        this.bravo = obtainStyledAttributes.getString(i5);
        obtainStyledAttributes.getBoolean(14, false);
        this.alpha = AbstractC2719n0.alpha(context, obtainStyledAttributes, 6);
        this.foxtrot = obtainStyledAttributes.getFloat(7, 0.0f);
        this.golf = obtainStyledAttributes.getFloat(8, 0.0f);
        this.hotel = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i4, L6.a.blue);
        this.india = obtainStyledAttributes2.hasValue(0);
        this.juliet = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.charlie = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final void alpha() {
        String str;
        Typeface typeface = this.papa;
        int i4 = this.delta;
        if (typeface == null && (str = this.bravo) != null) {
            this.papa = Typeface.create(str, i4);
        }
        if (this.papa == null) {
            int i5 = this.echo;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        this.papa = Typeface.DEFAULT;
                    } else {
                        this.papa = Typeface.MONOSPACE;
                    }
                } else {
                    this.papa = Typeface.SERIF;
                }
            } else {
                this.papa = Typeface.SANS_SERIF;
            }
            this.papa = Typeface.create(this.papa, i4);
        }
    }

    public final void bravo(Context context, AbstractC2728o0 abstractC2728o0) {
        if (!charlie(context)) {
            alpha();
        }
        int i4 = this.mike;
        if (i4 == 0) {
            this.november = true;
        }
        if (this.november) {
            abstractC2728o0.charlie(this.papa, true);
            return;
        }
        try {
            c cVar = new c(this, abstractC2728o0);
            ThreadLocal threadLocal = k.alpha;
            if (context.isRestricted()) {
                cVar.alpha(-4);
            } else {
                k.bravo(context, i4, new TypedValue(), 0, cVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.november = true;
            abstractC2728o0.bravo(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.bravo, e);
            this.november = true;
            abstractC2728o0.bravo(-3);
        }
    }

    public final boolean charlie(Context context) {
        Context context2;
        Typeface bravo;
        String str;
        Typeface create;
        if (this.november) {
            return true;
        }
        int i4 = this.mike;
        if (i4 != 0) {
            ThreadLocal threadLocal = k.alpha;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                bravo = null;
            } else {
                context2 = context;
                bravo = k.bravo(context2, i4, new TypedValue(), 0, null, false, true);
            }
            if (bravo != null) {
                this.papa = bravo;
                this.november = true;
                return true;
            }
            if (!this.oscar) {
                this.oscar = true;
                Resources resources = context2.getResources();
                int i5 = this.mike;
                if (i5 != 0 && resources.getResourceTypeName(i5).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i5);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC1625a.bravo);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.delta);
                }
            }
            if (typeface != null) {
                this.papa = typeface;
                this.november = true;
                return true;
            }
        }
        return false;
    }

    public final void delta(Context context, TextPaint textPaint, AbstractC2728o0 abstractC2728o0) {
        int i4;
        int i5;
        echo(context, textPaint, abstractC2728o0);
        ColorStateList colorStateList = this.kilo;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i4 = ShapeBuilder.DEFAULT_SHAPE_COLOR;
        }
        textPaint.setColor(i4);
        ColorStateList colorStateList2 = this.alpha;
        if (colorStateList2 != null) {
            i5 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i5 = 0;
        }
        textPaint.setShadowLayer(this.hotel, this.foxtrot, this.golf, i5);
    }

    public final void echo(Context context, TextPaint textPaint, AbstractC2728o0 abstractC2728o0) {
        Typeface typeface;
        if (charlie(context) && this.november && (typeface = this.papa) != null) {
            foxtrot(context, textPaint, typeface);
            return;
        }
        alpha();
        foxtrot(context, textPaint, this.papa);
        bravo(context, new d(this, context, textPaint, abstractC2728o0));
    }

    public final void foxtrot(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z2;
        float f5;
        Typeface alpha = AbstractC2737p0.alpha(context.getResources().getConfiguration(), typeface);
        if (alpha != null) {
            typeface = alpha;
        }
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.delta;
        if ((i4 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        textPaint.setFakeBoldText(z2);
        if ((i4 & 2) != 0) {
            f5 = -0.25f;
        } else {
            f5 = 0.0f;
        }
        textPaint.setTextSkewX(f5);
        textPaint.setTextSize(this.lima);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.charlie);
        }
        if (this.india) {
            textPaint.setLetterSpacing(this.juliet);
        }
    }
}
