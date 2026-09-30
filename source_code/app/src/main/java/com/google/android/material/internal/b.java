package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import av.ah;
import s6.AbstractC2737p0;
import s6.AbstractC2815x7;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f8051a;
    public final ViewGroup alpha;
    public Typeface amber;
    public Typeface azure;

    /* renamed from: b, reason: collision with root package name */
    public StaticLayout f8052b;
    public Typeface beige;
    public Typeface black;
    public d7.b blue;
    public float bravo;
    public d7.b bronze;

    /* renamed from: c, reason: collision with root package name */
    public float f8053c;
    public boolean charlie;
    public CharSequence crimson;
    public CharSequence cyan;

    /* renamed from: d, reason: collision with root package name */
    public float f8054d;
    public float delta;
    public float e;
    public float echo;
    public boolean emerald;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f8055f;
    public int foxtrot;
    public float gold;
    public final Rect golf;
    public float gray;
    public float green;
    public final Rect hotel;
    public Rect india;
    public float indigo;
    public float ivory;
    public int jade;
    public final RectF juliet;
    public int lavender;
    public int[] lime;
    public boolean magenta;
    public final TextPaint maroon;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8063n;
    public final TextPaint navy;
    public TimeInterpolator ochre;
    public BaseInterpolator olive;
    public float orange;
    public ColorStateList oscar;
    public ColorStateList papa;
    public float peach;
    public float pink;
    public ColorStateList plum;
    public float purple;
    public int quebec;
    public float red;
    public float romeo;
    public float sierra;
    public float silver;
    public float tango;
    public ColorStateList teal;
    public float uniform;
    public float victor;
    public float whiskey;
    public float white;
    public Typeface xray;
    public Typeface yankee;
    public float yellow;
    public Typeface zulu;
    public int kilo = 16;
    public int lima = 16;
    public float mike = 15.0f;
    public float november = 15.0f;
    public TextUtils.TruncateAt coral = TextUtils.TruncateAt.END;
    public boolean fuchsia = true;

    /* renamed from: g, reason: collision with root package name */
    public int f8056g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f8057h = 1;

    /* renamed from: i, reason: collision with root package name */
    public float f8058i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f8059j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f8060k = 1;

    /* renamed from: l, reason: collision with root package name */
    public int f8061l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f8062m = -1;

    public b(ViewGroup viewGroup) {
        this.alpha = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.maroon = textPaint;
        this.navy = new TextPaint(textPaint);
        this.hotel = new Rect();
        this.golf = new Rect();
        this.juliet = new RectF();
        float f5 = this.delta;
        this.echo = Q0.c.lima(1.0f, f5, 0.5f, f5);
        kilo(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int alpha(float f5, int i4, int i5) {
        float f10 = 1.0f - f5;
        return Color.argb(Math.round((Color.alpha(i5) * f5) + (Color.alpha(i4) * f10)), Math.round((Color.red(i5) * f5) + (Color.red(i4) * f10)), Math.round((Color.green(i5) * f5) + (Color.green(i4) * f10)), Math.round((Color.blue(i5) * f5) + (Color.blue(i4) * f10)));
    }

    public static float juliet(float f5, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return M6.a.alpha(f5, f10, f11);
    }

    public static boolean mike(Rect rect, int i4, int i5, int i10, int i11) {
        if (rect.left == i4 && rect.top == i5 && rect.right == i10 && rect.bottom == i11) {
            return true;
        }
        return false;
    }

    public final void amber(float f5) {
        float alpha = O6.c.alpha(f5, 0.0f, 1.0f);
        if (alpha != this.bravo) {
            this.bravo = alpha;
            bravo();
        }
    }

    public final void azure(CharSequence charSequence) {
        if (charSequence != null && TextUtils.equals(this.crimson, charSequence)) {
            return;
        }
        this.crimson = charSequence;
        this.cyan = null;
        lima(false);
    }

    public final boolean beige() {
        if (this.f8057h == 1) {
            return true;
        }
        return false;
    }

    public final void bravo() {
        float f5;
        float bravo;
        float f10 = this.bravo;
        boolean z2 = this.charlie;
        RectF rectF = this.juliet;
        Rect rect = this.hotel;
        Rect rect2 = this.golf;
        if (z2) {
            if (f10 < this.echo) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = juliet(rect2.left, rect.left, f10, this.ochre);
            rectF.top = juliet(this.romeo, this.sierra, f10, this.ochre);
            rectF.right = juliet(rect2.right, rect.right, f10, this.ochre);
            rectF.bottom = juliet(rect2.bottom, rect.bottom, f10, this.ochre);
        }
        boolean z10 = this.charlie;
        ViewGroup viewGroup = this.alpha;
        if (z10) {
            if (f10 < this.echo) {
                this.victor = this.tango;
                this.whiskey = this.romeo;
                delta(0.0f, false);
                viewGroup.postInvalidateOnAnimation();
                f5 = 0.0f;
            } else {
                this.victor = this.uniform;
                this.whiskey = this.sierra - Math.max(0, this.foxtrot);
                delta(1.0f, false);
                viewGroup.postInvalidateOnAnimation();
                f5 = 1.0f;
            }
        } else {
            this.victor = juliet(this.tango, this.uniform, f10, this.ochre);
            this.whiskey = juliet(this.romeo, this.sierra, f10, this.ochre);
            delta(f10, false);
            viewGroup.postInvalidateOnAnimation();
            f5 = f10;
        }
        P1.a aVar = M6.a.bravo;
        this.f8054d = 1.0f - juliet(0.0f, 1.0f, 1.0f - f10, aVar);
        viewGroup.postInvalidateOnAnimation();
        this.e = juliet(1.0f, 0.0f, f10, aVar);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.papa;
        ColorStateList colorStateList2 = this.oscar;
        TextPaint textPaint = this.maroon;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(alpha(f5, hotel(colorStateList2), hotel(this.papa)));
        } else {
            textPaint.setColor(hotel(colorStateList));
        }
        float f11 = this.white;
        float f12 = this.yellow;
        if (f11 != f12) {
            textPaint.setLetterSpacing(juliet(f12, f11, f10, aVar));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        this.green = M6.a.alpha(this.purple, this.orange, f10);
        this.indigo = M6.a.alpha(this.red, this.peach, f10);
        this.ivory = M6.a.alpha(this.silver, this.pink, f10);
        int alpha = alpha(f10, hotel(this.teal), hotel(this.plum));
        this.jade = alpha;
        textPaint.setShadowLayer(this.green, this.indigo, this.ivory, alpha);
        if (this.charlie) {
            int alpha2 = textPaint.getAlpha();
            float f13 = this.echo;
            if (f10 <= f13) {
                bravo = M6.a.bravo(1.0f, 0.0f, this.delta, f13, f10);
            } else {
                bravo = M6.a.bravo(0.0f, 1.0f, f13, 1.0f, f10);
            }
            textPaint.setAlpha((int) (bravo * alpha2));
            if (Build.VERSION.SDK_INT >= 31) {
                textPaint.setShadowLayer(this.green, this.indigo, this.ivory, AbstractC2815x7.bravo(this.jade, textPaint.getAlpha()));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final boolean charlie(CharSequence charSequence) {
        Pf.j jVar;
        boolean z2 = true;
        if (this.alpha.getLayoutDirection() != 1) {
            z2 = false;
        }
        if (this.fuchsia) {
            if (z2) {
                jVar = q1.g.delta;
            } else {
                jVar = q1.g.charlie;
            }
            return jVar.golf(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void delta(float f5, boolean z2) {
        boolean z10;
        float f10;
        Typeface typeface;
        float f11;
        int i4;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        float juliet;
        if (this.crimson != null) {
            float width = this.hotel.width();
            float width2 = this.golf.width();
            float f12 = 1.0f;
            boolean z17 = false;
            if (Math.abs(f5 - 1.0f) < 1.0E-5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (beige()) {
                    f10 = this.november;
                } else {
                    f10 = this.mike;
                }
                if (beige()) {
                    f11 = this.white;
                } else {
                    f11 = this.yellow;
                }
                if (beige()) {
                    juliet = 1.0f;
                } else {
                    juliet = juliet(this.mike, this.november, f5, this.olive) / this.mike;
                }
                this.gold = juliet;
                if (!beige()) {
                    width = width2;
                }
                typeface = this.xray;
                width2 = width;
            } else {
                f10 = this.mike;
                float f13 = this.yellow;
                typeface = this.amber;
                if (Math.abs(f5 - 0.0f) < 1.0E-5f) {
                    this.gold = 1.0f;
                } else {
                    this.gold = juliet(this.mike, this.november, f5, this.olive) / this.mike;
                }
                float f14 = this.november / this.mike;
                float f15 = width2 * f14;
                if (!z2 && !this.charlie && f15 > width && beige()) {
                    width2 = Math.min(width / f14, width2);
                }
                f11 = f13;
            }
            if (f5 < 0.5f) {
                i4 = this.f8056g;
            } else {
                i4 = this.f8057h;
            }
            TextPaint textPaint = this.maroon;
            if (width2 > 0.0f) {
                if (this.gray != f10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f8051a != f11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.black != typeface) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.f8052b != null && width2 != r13.getWidth()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.lavender != i4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z11 && !z12 && !z14 && !z13 && !z15 && !this.magenta) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                this.gray = f10;
                this.f8051a = f11;
                this.black = typeface;
                this.magenta = false;
                this.lavender = i4;
                if (this.gold != 1.0f) {
                    z17 = true;
                }
                textPaint.setLinearText(z17);
                z17 = z16;
            }
            if (this.cyan != null && !z17) {
                return;
            }
            textPaint.setTextSize(this.gray);
            textPaint.setTypeface(this.black);
            textPaint.setLetterSpacing(this.f8051a);
            boolean charlie = charlie(this.crimson);
            this.emerald = charlie;
            if ((this.f8056g <= 1 && this.f8057h <= 1) || (charlie && !this.charlie)) {
                i4 = 1;
            }
            float f16 = width2;
            CharSequence charSequence = this.crimson;
            if (!beige()) {
                f12 = this.gold;
            }
            StaticLayout echo = echo(i4, textPaint, charSequence, f12 * f16, this.emerald);
            this.f8052b = echo;
            this.cyan = echo.getText();
        }
    }

    public final StaticLayout echo(int i4, TextPaint textPaint, CharSequence charSequence, float f5, boolean z2) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        try {
            if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.kilo, this.emerald ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        if (this.emerald) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.emerald) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            u uVar = new u(charSequence, textPaint, (int) f5);
            uVar.lima = this.coral;
            uVar.kilo = z2;
            uVar.echo = alignment;
            uVar.juliet = false;
            uVar.foxtrot = i4;
            float f10 = this.f8058i;
            float f11 = this.f8059j;
            uVar.golf = f10;
            uVar.hotel = f11;
            uVar.india = this.f8060k;
            uVar.mike = null;
            staticLayout = uVar.alpha();
        } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        staticLayout.getClass();
        return staticLayout;
    }

    public final void foxtrot(Canvas canvas) {
        int save = canvas.save();
        if (this.cyan != null) {
            RectF rectF = this.juliet;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.maroon;
                textPaint.setTextSize(this.gray);
                float f5 = this.victor;
                float f10 = this.whiskey;
                float f11 = this.gold;
                if (f11 != 1.0f && !this.charlie) {
                    canvas.scale(f11, f11, f5, f10);
                }
                if ((this.f8056g > 1 || this.f8057h > 1) && ((!this.emerald || this.charlie) && beige() && (!this.charlie || this.bravo > this.echo))) {
                    float lineStart = this.victor - this.f8052b.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f10);
                    if (!this.charlie) {
                        textPaint.setAlpha((int) (this.e * alpha));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(this.green, this.indigo, this.ivory, AbstractC2815x7.bravo(this.jade, textPaint.getAlpha()));
                        }
                        this.f8052b.draw(canvas);
                    }
                    if (!this.charlie) {
                        textPaint.setAlpha((int) (this.f8054d * alpha));
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(this.green, this.indigo, this.ivory, AbstractC2815x7.bravo(this.jade, textPaint.getAlpha()));
                    }
                    int lineBaseline = this.f8052b.getLineBaseline(0);
                    CharSequence charSequence = this.f8055f;
                    float f12 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                    if (i4 >= 31) {
                        textPaint.setShadowLayer(this.green, this.indigo, this.ivory, this.jade);
                    }
                    if (!this.charlie) {
                        String trim = this.f8055f.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(this.f8052b.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas = canvas;
                } else {
                    canvas.translate(f5, f10);
                    this.f8052b.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public final float golf() {
        int i4 = this.f8061l;
        if (i4 != -1) {
            return i4;
        }
        TextPaint textPaint = this.navy;
        textPaint.setTextSize(this.november);
        textPaint.setTypeface(this.xray);
        textPaint.setLetterSpacing(this.white);
        return -textPaint.ascent();
    }

    public final int hotel(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.lime;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final float india() {
        TextPaint textPaint = this.navy;
        textPaint.setTextSize(this.mike);
        textPaint.setTypeface(this.amber);
        textPaint.setLetterSpacing(this.yellow);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public final void kilo(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.zulu;
            if (typeface != null) {
                this.yankee = AbstractC2737p0.alpha(configuration, typeface);
            }
            Typeface typeface2 = this.beige;
            if (typeface2 != null) {
                this.azure = AbstractC2737p0.alpha(configuration, typeface2);
            }
            Typeface typeface3 = this.yankee;
            if (typeface3 == null) {
                typeface3 = this.zulu;
            }
            this.xray = typeface3;
            Typeface typeface4 = this.azure;
            if (typeface4 == null) {
                typeface4 = this.beige;
            }
            this.amber = typeface4;
            lima(true);
        }
    }

    public final void lima(boolean z2) {
        float f5;
        float f10;
        int i4;
        CharSequence charSequence;
        ViewGroup viewGroup = this.alpha;
        if ((viewGroup.getHeight() > 0 && viewGroup.getWidth() > 0) || z2) {
            delta(1.0f, z2);
            CharSequence charSequence2 = this.cyan;
            TextPaint textPaint = this.maroon;
            if (charSequence2 != null && this.f8052b != null) {
                if (beige()) {
                    charSequence = TextUtils.ellipsize(this.cyan, textPaint, this.f8052b.getWidth(), this.coral);
                } else {
                    charSequence = this.cyan;
                }
                this.f8055f = charSequence;
            }
            CharSequence charSequence3 = this.f8055f;
            float f11 = 0.0f;
            if (charSequence3 != null) {
                this.f8053c = textPaint.measureText(charSequence3, 0, charSequence3.length());
            } else {
                this.f8053c = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.lima, this.emerald ? 1 : 0);
            Rect rect = this.india;
            Rect rect2 = this.hotel;
            if (rect == null) {
                rect = rect2;
            }
            int i5 = absoluteGravity & 112;
            if (i5 != 48) {
                if (i5 != 80) {
                    this.sierra = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.sierra = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.sierra = rect.top;
            }
            int i10 = absoluteGravity & 8388615;
            if (i10 != 1) {
                if (i10 != 5) {
                    this.uniform = rect.left;
                } else {
                    this.uniform = rect.right - this.f8053c;
                }
            } else {
                this.uniform = rect.centerX() - (this.f8053c / 2.0f);
            }
            if (this.f8053c <= rect2.width()) {
                float f12 = this.uniform;
                float max = Math.max(0.0f, rect2.left - f12) + f12;
                this.uniform = max;
                this.uniform = Math.min(0.0f, rect2.right - (this.f8053c + max)) + max;
            }
            TextPaint textPaint2 = this.navy;
            textPaint2.setTextSize(this.november);
            textPaint2.setTypeface(this.xray);
            textPaint2.setLetterSpacing(this.white);
            if (textPaint2.descent() + (-textPaint2.ascent()) <= rect2.height()) {
                float f13 = this.sierra;
                float max2 = Math.max(0.0f, rect2.top - f13) + f13;
                this.sierra = max2;
                this.sierra = Math.min(0.0f, rect2.bottom - (golf() + max2)) + max2;
            }
            delta(0.0f, z2);
            StaticLayout staticLayout = this.f8052b;
            if (staticLayout != null) {
                f5 = staticLayout.getHeight();
            } else {
                f5 = 0.0f;
            }
            StaticLayout staticLayout2 = this.f8052b;
            if (staticLayout2 != null && this.f8056g > 1) {
                f10 = staticLayout2.getWidth();
            } else {
                CharSequence charSequence4 = this.cyan;
                if (charSequence4 != null) {
                    f10 = textPaint.measureText(charSequence4, 0, charSequence4.length());
                } else {
                    f10 = 0.0f;
                }
            }
            StaticLayout staticLayout3 = this.f8052b;
            if (staticLayout3 != null) {
                i4 = staticLayout3.getLineCount();
            } else {
                i4 = 0;
            }
            this.quebec = i4;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.kilo, this.emerald ? 1 : 0);
            int i11 = absoluteGravity2 & 112;
            Rect rect3 = this.golf;
            if (i11 != 48) {
                if (i11 != 80) {
                    this.romeo = rect3.centerY() - (f5 / 2.0f);
                } else {
                    float f14 = rect3.bottom - f5;
                    if (this.f8063n) {
                        f11 = textPaint.descent();
                    }
                    this.romeo = f14 + f11;
                }
            } else {
                this.romeo = rect3.top;
            }
            int i12 = absoluteGravity2 & 8388615;
            if (i12 != 1) {
                if (i12 != 5) {
                    this.tango = rect3.left;
                } else {
                    this.tango = rect3.right - f10;
                }
            } else {
                this.tango = rect3.centerX() - (f10 / 2.0f);
            }
            delta(this.bravo, false);
            viewGroup.postInvalidateOnAnimation();
            bravo();
        }
    }

    public final void november(ColorStateList colorStateList) {
        if (this.papa == colorStateList && this.oscar == colorStateList) {
            return;
        }
        this.papa = colorStateList;
        this.oscar = colorStateList;
        lima(false);
    }

    public final void oscar(int i4, int i5, int i10, int i11) {
        Rect rect = this.hotel;
        if (!mike(rect, i4, i5, i10, i11)) {
            rect.set(i4, i5, i10, i11);
            this.magenta = true;
        }
    }

    public final void papa(int i4, int i5, int i10, int i11) {
        if (this.india == null) {
            this.india = new Rect(i4, i5, i10, i11);
            this.magenta = true;
        }
        if (!mike(this.india, i4, i5, i10, i11)) {
            this.india.set(i4, i5, i10, i11);
            this.magenta = true;
        }
    }

    public final void quebec(int i4) {
        ViewGroup viewGroup = this.alpha;
        d7.e eVar = new d7.e(viewGroup.getContext(), i4);
        ColorStateList colorStateList = eVar.kilo;
        if (colorStateList != null) {
            this.papa = colorStateList;
        }
        float f5 = eVar.lima;
        if (f5 != 0.0f) {
            this.november = f5;
        }
        ColorStateList colorStateList2 = eVar.alpha;
        if (colorStateList2 != null) {
            this.plum = colorStateList2;
        }
        this.peach = eVar.foxtrot;
        this.pink = eVar.golf;
        this.orange = eVar.hotel;
        this.white = eVar.juliet;
        d7.b bVar = this.bronze;
        if (bVar != null) {
            bVar.charlie = true;
        }
        androidx.core.widget.f fVar = new androidx.core.widget.f(29, this);
        eVar.alpha();
        this.bronze = new d7.b(fVar, eVar.papa);
        eVar.bravo(viewGroup.getContext(), this.bronze);
        lima(false);
    }

    public final void romeo(ColorStateList colorStateList) {
        if (this.papa != colorStateList) {
            this.papa = colorStateList;
            lima(false);
        }
    }

    public final void sierra(int i4) {
        if (this.lima != i4) {
            this.lima = i4;
            lima(false);
        }
    }

    public final boolean tango(Typeface typeface) {
        d7.b bVar = this.bronze;
        if (bVar != null) {
            bVar.charlie = true;
        }
        if (this.zulu != typeface) {
            this.zulu = typeface;
            Typeface alpha = AbstractC2737p0.alpha(this.alpha.getContext().getResources().getConfiguration(), typeface);
            this.yankee = alpha;
            if (alpha == null) {
                alpha = this.zulu;
            }
            this.xray = alpha;
            return true;
        }
        return false;
    }

    public final void uniform(boolean z2, int i4, int i5, int i10, int i11) {
        Rect rect = this.golf;
        if (mike(rect, i4, i5, i10, i11) && z2 == this.f8063n) {
            return;
        }
        rect.set(i4, i5, i10, i11);
        this.magenta = true;
        this.f8063n = z2;
    }

    public final void victor(int i4) {
        if (i4 != this.f8056g) {
            this.f8056g = i4;
            lima(false);
        }
    }

    public final void whiskey(int i4) {
        ViewGroup viewGroup = this.alpha;
        d7.e eVar = new d7.e(viewGroup.getContext(), i4);
        ColorStateList colorStateList = eVar.kilo;
        if (colorStateList != null) {
            this.oscar = colorStateList;
        }
        float f5 = eVar.lima;
        if (f5 != 0.0f) {
            this.mike = f5;
        }
        ColorStateList colorStateList2 = eVar.alpha;
        if (colorStateList2 != null) {
            this.teal = colorStateList2;
        }
        this.red = eVar.foxtrot;
        this.silver = eVar.golf;
        this.purple = eVar.hotel;
        this.yellow = eVar.juliet;
        d7.b bVar = this.blue;
        if (bVar != null) {
            bVar.charlie = true;
        }
        ah ahVar = new ah(24, this);
        eVar.alpha();
        this.blue = new d7.b(ahVar, eVar.papa);
        eVar.bravo(viewGroup.getContext(), this.blue);
        lima(false);
    }

    public final void xray(int i4) {
        if (this.kilo != i4) {
            this.kilo = i4;
            lima(false);
        }
    }

    public final void yankee(float f5) {
        if (this.mike != f5) {
            this.mike = f5;
            lima(false);
        }
    }

    public final boolean zulu(Typeface typeface) {
        d7.b bVar = this.blue;
        if (bVar != null) {
            bVar.charlie = true;
        }
        if (this.beige != typeface) {
            this.beige = typeface;
            Typeface alpha = AbstractC2737p0.alpha(this.alpha.getContext().getResources().getConfiguration(), typeface);
            this.azure = alpha;
            if (alpha == null) {
                alpha = this.beige;
            }
            this.amber = alpha;
            return true;
        }
        return false;
    }
}
