package g7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import f7.C1694a;
import g.C1718a;
import java.util.BitSet;
import java.util.Objects;
import s6.G7;
import s6.Q4;
import s6.R4;

/* loaded from: classes2.dex */
public class i extends Drawable implements x {

    /* renamed from: y, reason: collision with root package name */
    public static final Paint f12648y;

    /* renamed from: z, reason: collision with root package name */
    public static final h[] f12649z;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f12650a;
    public final com.google.android.material.internal.s alpha;

    /* renamed from: b, reason: collision with root package name */
    public final Path f12651b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f12652c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f12653d;
    public final RectF e;

    /* renamed from: f, reason: collision with root package name */
    public final Region f12654f;

    /* renamed from: g, reason: collision with root package name */
    public final Region f12655g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f12656h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f12657i;

    /* renamed from: j, reason: collision with root package name */
    public final C1694a f12658j;

    /* renamed from: k, reason: collision with root package name */
    public final C1718a f12659k;

    /* renamed from: l, reason: collision with root package name */
    public final o f12660l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuffColorFilter f12661m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuffColorFilter f12662n;

    /* renamed from: o, reason: collision with root package name */
    public int f12663o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f12664p;
    public g purple;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12665q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12666r;
    public final v[] red;

    /* renamed from: s, reason: collision with root package name */
    public m f12667s;
    public final v[] silver;

    /* renamed from: t, reason: collision with root package name */
    public J1.g f12668t;
    public final BitSet teal;

    /* renamed from: u, reason: collision with root package name */
    public final J1.f[] f12669u;

    /* renamed from: v, reason: collision with root package name */
    public float[] f12670v;

    /* renamed from: w, reason: collision with root package name */
    public float[] f12671w;
    public boolean white;

    /* renamed from: x, reason: collision with root package name */
    public a4.u f12672x;
    public boolean yellow;

    static {
        int i4 = 0;
        Q4 alpha = R4.alpha(0);
        l.bravo(alpha);
        l.bravo(alpha);
        l.bravo(alpha);
        l.bravo(alpha);
        Paint paint = new Paint(1);
        f12648y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f12649z = new h[4];
        while (true) {
            h[] hVarArr = f12649z;
            if (i4 < hVarArr.length) {
                hVarArr[i4] = new h(i4);
                i4++;
            } else {
                return;
            }
        }
    }

    public i() {
        this(new m());
    }

    public static float charlie(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.foxtrot(rectF)) {
                return mVar.echo.alpha(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f5 = fArr[0];
            for (int i4 = 1; i4 < fArr.length; i4++) {
                if (fArr[i4] != f5) {
                    return -1.0f;
                }
            }
        }
        if (mVar.echo()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void bravo(RectF rectF, Path path) {
        g gVar = this.purple;
        this.f12660l.alpha(gVar.alpha, this.f12670v, gVar.juliet, rectF, this.f12659k, path);
        if (this.purple.india != 1.0f) {
            Matrix matrix = this.f12650a;
            matrix.reset();
            float f5 = this.purple.india;
            matrix.setScale(f5, f5, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f12664p, true);
    }

    public final int delta(int i4) {
        g gVar = this.purple;
        float f5 = gVar.november + 0.0f + gVar.mike;
        V6.a aVar = gVar.charlie;
        if (aVar != null) {
            return aVar.alpha(f5, i4);
        }
        return i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f12656h;
        paint.setColorFilter(this.f12661m);
        int alpha = paint.getAlpha();
        int i4 = this.purple.lima;
        paint.setAlpha(((i4 + (i4 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f12657i;
        paint2.setColorFilter(this.f12662n);
        paint2.setStrokeWidth(this.purple.kilo);
        int alpha2 = paint2.getAlpha();
        int i5 = this.purple.lima;
        paint2.setAlpha(((i5 + (i5 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.purple.quebec;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.white;
            Path path = this.f12651b;
            if (z2) {
                bravo(hotel(), path);
                this.white = false;
            }
            g gVar = this.purple;
            gVar.getClass();
            if (gVar.oscar > 0 && !november() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d4 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d4)) * this.purple.papa), (int) (Math.cos(Math.toRadians(d4)) * this.purple.papa));
                if (!this.f12665q) {
                    echo(canvas);
                    canvas.restore();
                } else {
                    RectF rectF = this.f12664p;
                    int width = (int) (rectF.width() - getBounds().width());
                    int height = (int) (rectF.height() - getBounds().height());
                    if (width >= 0 && height >= 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(A0.z.foxtrot(this.purple.oscar, 2, (int) rectF.width(), width), A0.z.foxtrot(this.purple.oscar, 2, (int) rectF.height(), height), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f5 = (getBounds().left - this.purple.oscar) - width;
                        float f10 = (getBounds().top - this.purple.oscar) - height;
                        canvas2.translate(-f5, -f10);
                        echo(canvas2);
                        canvas.drawBitmap(createBitmap, f5, f10, (Paint) null);
                        createBitmap.recycle();
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                }
            }
            foxtrot(canvas, paint, path, this.purple.alpha, this.f12670v, hotel());
        }
        if (lima()) {
            if (this.yellow) {
                m mVar = this.purple.alpha;
                l golf = mVar.golf();
                d dVar = mVar.echo;
                com.google.android.material.internal.s sVar = this.alpha;
                golf.echo = sVar.zulu(dVar);
                golf.foxtrot = sVar.zulu(mVar.foxtrot);
                golf.hotel = sVar.zulu(mVar.hotel);
                golf.golf = sVar.zulu(mVar.golf);
                this.f12667s = golf.alpha();
                float[] fArr = this.f12670v;
                if (fArr == null) {
                    this.f12671w = null;
                } else {
                    if (this.f12671w == null) {
                        this.f12671w = new float[fArr.length];
                    }
                    float juliet = juliet();
                    int i10 = 0;
                    while (true) {
                        float[] fArr2 = this.f12670v;
                        if (i10 >= fArr2.length) {
                            break;
                        }
                        this.f12671w[i10] = Math.max(0.0f, fArr2[i10] - juliet);
                        i10++;
                    }
                }
                m mVar2 = this.f12667s;
                float[] fArr3 = this.f12671w;
                float f11 = this.purple.juliet;
                RectF rectF2 = this.e;
                rectF2.set(hotel());
                float juliet2 = juliet();
                rectF2.inset(juliet2, juliet2);
                this.f12660l.alpha(mVar2, fArr3, f11, rectF2, null, this.f12652c);
                this.yellow = false;
            }
            golf(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void echo(Canvas canvas) {
        if (this.teal.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i4 = this.purple.papa;
        Path path = this.f12651b;
        C1694a c1694a = this.f12658j;
        if (i4 != 0) {
            canvas.drawPath(path, c1694a.alpha);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            v vVar = this.red[i5];
            int i10 = this.purple.oscar;
            Matrix matrix = v.bravo;
            vVar.alpha(matrix, c1694a, i10, canvas);
            this.silver[i5].alpha(matrix, c1694a, this.purple.oscar, canvas);
        }
        if (this.f12665q) {
            double d4 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d4)) * this.purple.papa);
            int cos = (int) (Math.cos(Math.toRadians(d4)) * this.purple.papa);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f12648y);
            canvas.translate(sin, cos);
        }
    }

    public final void foxtrot(Canvas canvas, Paint paint, Path path, m mVar, float[] fArr, RectF rectF) {
        float charlie = charlie(rectF, mVar, fArr);
        if (charlie >= 0.0f) {
            float f5 = charlie * this.purple.juliet;
            canvas.drawRoundRect(rectF, f5, f5, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.purple.lima;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.purple;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.purple.getClass();
        RectF hotel = hotel();
        if (hotel.isEmpty()) {
            return;
        }
        float charlie = charlie(hotel, this.purple.alpha, this.f12670v);
        if (charlie >= 0.0f) {
            outline.setRoundRect(getBounds(), charlie * this.purple.juliet);
            return;
        }
        boolean z2 = this.white;
        Path path = this.f12651b;
        if (z2) {
            bravo(hotel, path);
            this.white = false;
        }
        G7.charlie(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.purple.hotel;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f12654f;
        region.set(bounds);
        RectF hotel = hotel();
        Path path = this.f12651b;
        bravo(hotel, path);
        Region region2 = this.f12655g;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public void golf(Canvas canvas) {
        Paint paint = this.f12657i;
        Path path = this.f12652c;
        m mVar = this.f12667s;
        float[] fArr = this.f12671w;
        RectF rectF = this.e;
        rectF.set(hotel());
        float juliet = juliet();
        rectF.inset(juliet, juliet);
        foxtrot(canvas, paint, path, mVar, fArr, rectF);
    }

    public final RectF hotel() {
        RectF rectF = this.f12653d;
        rectF.set(getBounds());
        return rectF;
    }

    public final float india() {
        float[] fArr = this.f12670v;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF hotel = hotel();
        m mVar = this.purple.alpha;
        o oVar = this.f12660l;
        oVar.getClass();
        float alpha = mVar.echo.alpha(hotel);
        m mVar2 = this.purple.alpha;
        oVar.getClass();
        float alpha2 = mVar2.hotel.alpha(hotel) + alpha;
        m mVar3 = this.purple.alpha;
        oVar.getClass();
        float alpha3 = alpha2 - mVar3.golf.alpha(hotel);
        m mVar4 = this.purple.alpha;
        oVar.getClass();
        return (alpha3 - mVar4.foxtrot.alpha(hotel)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.white = true;
        this.yellow = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.purple.foxtrot;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.purple.getClass();
                ColorStateList colorStateList2 = this.purple.echo;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.purple.delta;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ad adVar = this.purple.bravo;
                        if (adVar == null || !adVar.delta()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final float juliet() {
        if (lima()) {
            return this.f12657i.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float kilo() {
        float[] fArr = this.f12670v;
        if (fArr != null) {
            return fArr[3];
        }
        return this.purple.alpha.echo.alpha(hotel());
    }

    public final boolean lima() {
        Paint.Style style = this.purple.quebec;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f12657i.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void mike(Context context) {
        this.purple.charlie = new V6.a(context);
        xray();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.purple = new g(this.purple);
        return this;
    }

    public final boolean november() {
        if (!this.purple.alpha.foxtrot(hotel())) {
            float[] fArr = this.f12670v;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f5 = fArr[0];
                    for (int i4 = 1; i4 < fArr.length; i4++) {
                        if (fArr[i4] != f5) {
                            break;
                        }
                    }
                }
                if (this.purple.alpha.echo()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.white = true;
        this.yellow = true;
        super.onBoundsChange(rect);
        if (this.purple.bravo != null && !rect.isEmpty()) {
            victor(getState(), this.f12666r);
        }
        this.f12666r = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.w
    public boolean onStateChange(int[] iArr) {
        boolean z2 = false;
        if (this.purple.bravo != null) {
            victor(iArr, false);
        }
        boolean uniform = uniform(iArr);
        boolean whiskey = whiskey();
        if (uniform || whiskey) {
            z2 = true;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final void oscar(J1.g gVar) {
        if (this.f12668t != gVar) {
            this.f12668t = gVar;
            int i4 = 0;
            while (true) {
                J1.f[] fVarArr = this.f12669u;
                if (i4 < fVarArr.length) {
                    if (fVarArr[i4] == null) {
                        fVarArr[i4] = new J1.f(this, f12649z[i4]);
                    }
                    J1.f fVar = fVarArr[i4];
                    J1.g gVar2 = new J1.g();
                    gVar2.alpha((float) gVar.bravo);
                    double d4 = gVar.alpha;
                    gVar2.bravo((float) (d4 * d4));
                    fVar.mike = gVar2;
                    i4++;
                } else {
                    victor(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void papa(float f5) {
        g gVar = this.purple;
        if (gVar.november != f5) {
            gVar.november = f5;
            xray();
        }
    }

    public final void quebec(ColorStateList colorStateList) {
        g gVar = this.purple;
        if (gVar.delta != colorStateList) {
            gVar.delta = colorStateList;
            onStateChange(getState());
        }
    }

    public final void romeo(float f5) {
        g gVar = this.purple;
        if (gVar.juliet != f5) {
            gVar.juliet = f5;
            this.white = true;
            this.yellow = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        g gVar = this.purple;
        if (gVar.lima != i4) {
            gVar.lima = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.purple.getClass();
        super.invalidateSelf();
    }

    @Override // g7.x
    public final void setShapeAppearanceModel(m mVar) {
        g gVar = this.purple;
        gVar.alpha = mVar;
        gVar.bravo = null;
        this.f12670v = null;
        this.f12671w = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.purple.foxtrot = colorStateList;
        whiskey();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.purple;
        if (gVar.golf != mode) {
            gVar.golf = mode;
            whiskey();
            super.invalidateSelf();
        }
    }

    public final void sierra() {
        this.f12658j.alpha(-12303292);
        this.purple.getClass();
        super.invalidateSelf();
    }

    public final void tango(ad adVar) {
        g gVar = this.purple;
        if (gVar.bravo != adVar) {
            gVar.bravo = adVar;
            victor(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean uniform(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.purple.delta != null && color2 != (colorForState2 = this.purple.delta.getColorForState(iArr, (color2 = (paint2 = this.f12656h).getColor())))) {
            paint2.setColor(colorForState2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.purple.echo != null && color != (colorForState = this.purple.echo.getColorForState(iArr, (color = (paint = this.f12657i).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z2;
    }

    public final void victor(int[] iArr, boolean z2) {
        boolean z10;
        int i4;
        int[][] iArr2;
        m alpha;
        d dVar;
        RectF hotel = hotel();
        if (this.purple.bravo != null && !hotel.isEmpty()) {
            if (this.f12668t == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z2 | z10;
            if (this.f12670v == null) {
                this.f12670v = new float[4];
            }
            ad adVar = this.purple.bravo;
            int i5 = 0;
            while (true) {
                int i10 = adVar.alpha;
                i4 = -1;
                iArr2 = adVar.charlie;
                if (i5 < i10) {
                    if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    i5 = -1;
                    break;
                }
            }
            if (i5 < 0) {
                int[] iArr3 = StateSet.WILD_CARD;
                int i11 = 0;
                while (true) {
                    if (i11 >= adVar.alpha) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr2[i11], iArr3)) {
                        i4 = i11;
                        break;
                    }
                    i11++;
                }
                i5 = i4;
            }
            m[] mVarArr = adVar.delta;
            ab abVar = adVar.hotel;
            ab abVar2 = adVar.golf;
            ab abVar3 = adVar.foxtrot;
            ab abVar4 = adVar.echo;
            if (abVar4 == null && abVar3 == null && abVar2 == null && abVar == null) {
                alpha = mVarArr[i5];
            } else {
                l golf = mVarArr[i5].golf();
                if (abVar4 != null) {
                    golf.echo = abVar4.charlie(iArr);
                }
                if (abVar3 != null) {
                    golf.foxtrot = abVar3.charlie(iArr);
                }
                if (abVar2 != null) {
                    golf.hotel = abVar2.charlie(iArr);
                }
                if (abVar != null) {
                    golf.golf = abVar.charlie(iArr);
                }
                alpha = golf.alpha();
            }
            for (int i12 = 0; i12 < 4; i12++) {
                this.f12660l.getClass();
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            dVar = alpha.foxtrot;
                        } else {
                            dVar = alpha.echo;
                        }
                    } else {
                        dVar = alpha.hotel;
                    }
                } else {
                    dVar = alpha.golf;
                }
                float alpha2 = dVar.alpha(hotel);
                if (z11) {
                    this.f12670v[i12] = alpha2;
                }
                J1.f[] fVarArr = this.f12669u;
                J1.f fVar = fVarArr[i12];
                if (fVar != null) {
                    fVar.alpha(alpha2);
                    if (z11) {
                        fVarArr[i12].delta();
                    }
                }
            }
            if (z11) {
                invalidateSelf();
            }
        }
    }

    public final boolean whiskey() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f12661m;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f12662n;
        g gVar = this.purple;
        ColorStateList colorStateList = gVar.foxtrot;
        PorterDuff.Mode mode = gVar.golf;
        Paint paint = this.f12656h;
        if (colorStateList != null && mode != null) {
            int delta = delta(colorStateList.getColorForState(getState(), 0));
            this.f12663o = delta;
            porterDuffColorFilter = new PorterDuffColorFilter(delta, mode);
        } else {
            int color = paint.getColor();
            int delta2 = delta(color);
            this.f12663o = delta2;
            if (delta2 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(delta2, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.f12661m = porterDuffColorFilter;
        this.purple.getClass();
        this.f12662n = null;
        this.purple.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.f12661m) || !Objects.equals(porterDuffColorFilter3, this.f12662n)) {
            return true;
        }
        return false;
    }

    public final void xray() {
        g gVar = this.purple;
        float f5 = gVar.november + 0.0f;
        gVar.oscar = (int) Math.ceil(0.75f * f5);
        this.purple.papa = (int) Math.ceil(f5 * 0.25f);
        whiskey();
        super.invalidateSelf();
    }

    public i(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(m.charlie(context, attributeSet, i4, i5).alpha());
    }

    public i(m mVar) {
        this(new g(mVar));
    }

    public i(g gVar) {
        o oVar;
        this.alpha = new com.google.android.material.internal.s(9, this);
        this.red = new v[4];
        this.silver = new v[4];
        this.teal = new BitSet(8);
        this.f12650a = new Matrix();
        this.f12651b = new Path();
        this.f12652c = new Path();
        this.f12653d = new RectF();
        this.e = new RectF();
        this.f12654f = new Region();
        this.f12655g = new Region();
        Paint paint = new Paint(1);
        this.f12656h = paint;
        Paint paint2 = new Paint(1);
        this.f12657i = paint2;
        this.f12658j = new C1694a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = n.alpha;
        } else {
            oVar = new o();
        }
        this.f12660l = oVar;
        this.f12664p = new RectF();
        this.f12665q = true;
        this.f12666r = true;
        this.f12669u = new J1.f[4];
        this.purple = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        whiskey();
        uniform(getState());
        this.f12659k = new C1718a(1, this);
    }
}
