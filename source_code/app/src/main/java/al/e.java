package al;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0487w0;
import com.clevertap.android.sdk.leanplum.Constants;
import i1.AbstractC1881b;
import org.xmlpull.v1.XmlPullParserException;
import t6.AbstractC3037o3;

/* loaded from: classes3.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f2683m = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2684a;
    public b alpha;

    /* renamed from: b, reason: collision with root package name */
    public F6.b f2685b;

    /* renamed from: c, reason: collision with root package name */
    public long f2686c;

    /* renamed from: d, reason: collision with root package name */
    public long f2687d;
    public f e;

    /* renamed from: f, reason: collision with root package name */
    public b f2688f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2689g;

    /* renamed from: h, reason: collision with root package name */
    public b f2690h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC3037o3 f2691i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2694l;
    public Rect purple;
    public Drawable red;
    public Drawable silver;
    public boolean white;
    public int teal = 255;
    public int yellow = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f2692j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f2693k = -1;

    public e(b bVar, Resources resources) {
        india(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0273, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x027a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r6 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        r6 = r26.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (r6 != 4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        if (r6 != 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r26.getName().equals("vector") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        r6 = new androidx.vectordrawable.graphics.drawable.p();
        r6.inflate(r1, r26, r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
    
        r6 = am.a.alpha(r25, r26, r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        if (r6 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        r9 = r5.f2690h;
        r6 = r9.alpha(r6);
        r9.crimson[r6] = r8;
        r9.emerald.foxtrot(r6, java.lang.Integer.valueOf(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016e, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e charlie(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        Drawable drawable;
        long j5;
        int next;
        Drawable drawable2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (name.equals("animated-selector")) {
            e eVar = new e(null, null);
            TypedArray hotel = AbstractC1881b.hotel(resources2, theme, attributeSet, am.b.alpha);
            int i4 = 1;
            eVar.setVisible(hotel.getBoolean(1, true), true);
            b bVar = eVar.f2690h;
            bVar.delta |= am.a.bravo(hotel);
            int i5 = 2;
            bVar.india = hotel.getBoolean(2, bVar.india);
            int i10 = 3;
            bVar.lima = hotel.getBoolean(3, bVar.lima);
            bVar.yankee = hotel.getInt(4, bVar.yankee);
            bVar.zulu = hotel.getInt(5, bVar.zulu);
            boolean z2 = false;
            eVar.setDither(hotel.getBoolean(0, bVar.whiskey));
            b bVar2 = eVar.alpha;
            if (resources2 != null) {
                bVar2.bravo = resources2;
                int i11 = resources2.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = bVar2.charlie;
                bVar2.charlie = i11;
                if (i12 != i11) {
                    bVar2.mike = false;
                    bVar2.juliet = false;
                }
            } else {
                bVar2.getClass();
            }
            hotel.recycle();
            int depth2 = xmlResourceParser.getDepth() + 1;
            while (true) {
                int next2 = xmlResourceParser.next();
                if (next2 == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == i10)) {
                    break;
                }
                if (next2 == i5 && depth <= depth2) {
                    if (xmlResourceParser.getName().equals(Constants.IAP_ITEM_PARAM)) {
                        TypedArray hotel2 = AbstractC1881b.hotel(resources2, theme, attributeSet, am.b.bravo);
                        int resourceId = hotel2.getResourceId(z2 ? 1 : 0, z2 ? 1 : 0);
                        int resourceId2 = hotel2.getResourceId(i4, -1);
                        if (resourceId2 > 0) {
                            drawable2 = C0487w0.delta().foxtrot(resourceId2, context2);
                        } else {
                            drawable2 = null;
                        }
                        hotel2.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i13 = z2 ? 1 : 0;
                        for (int i14 = i13; i14 < attributeCount; i14++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                                int i15 = i13 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i14, z2)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i13] = attributeNameResource;
                                i13 = i15;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i13);
                    } else if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray hotel3 = AbstractC1881b.hotel(resources2, theme, attributeSet, am.b.charlie);
                        int resourceId3 = hotel3.getResourceId(2, -1);
                        int resourceId4 = hotel3.getResourceId(1, -1);
                        int resourceId5 = hotel3.getResourceId(z2 ? 1 : 0, -1);
                        if (resourceId5 > 0) {
                            drawable = C0487w0.delta().foxtrot(resourceId5, context2);
                        } else {
                            drawable = null;
                        }
                        boolean z10 = hotel3.getBoolean(3, z2);
                        hotel3.recycle();
                        if (drawable == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next == 2) {
                                if (xmlResourceParser.getName().equals("animated-vector")) {
                                    drawable = new androidx.vectordrawable.graphics.drawable.e(context2);
                                    drawable.inflate(resources2, xmlResourceParser, attributeSet, theme);
                                } else {
                                    drawable = am.a.alpha(resources, xmlResourceParser, attributeSet, theme);
                                }
                            } else {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        if (drawable != null) {
                            if (resourceId3 == -1 || resourceId4 == -1) {
                                break;
                            }
                            b bVar3 = eVar.f2690h;
                            int alpha = bVar3.alpha(drawable);
                            long j6 = resourceId3;
                            long j7 = resourceId4;
                            long j10 = (j6 << 32) | j7;
                            if (z10) {
                                j5 = 8589934592L;
                            } else {
                                j5 = 0;
                            }
                            long j11 = alpha;
                            bVar3.cyan.alpha(j10, Long.valueOf(j11 | j5));
                            if (z10) {
                                bVar3.cyan.alpha((j7 << 32) | j6, Long.valueOf(j11 | 4294967296L | j5));
                            }
                            context2 = context;
                            resources2 = resources;
                            i4 = 1;
                            z2 = false;
                            i5 = 2;
                            i10 = 3;
                        } else {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i4 = 1;
                    i5 = 2;
                    i10 = 3;
                }
            }
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(boolean z2) {
        boolean z10;
        Drawable drawable;
        boolean z11 = true;
        this.white = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.red;
        if (drawable2 != null) {
            long j5 = this.f2686c;
            if (j5 != 0) {
                if (j5 <= uptimeMillis) {
                    drawable2.setAlpha(this.teal);
                    this.f2686c = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j5 - uptimeMillis) * 255)) / this.alpha.yankee)) * this.teal) / 255);
                    z10 = true;
                    drawable = this.silver;
                    if (drawable == null) {
                        long j6 = this.f2687d;
                        if (j6 != 0) {
                            if (j6 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.silver = null;
                                this.f2687d = 0L;
                            } else {
                                drawable.setAlpha(((((int) ((j6 - uptimeMillis) * 255)) / this.alpha.zulu) * this.teal) / 255);
                                if (z2 && z11) {
                                    scheduleSelf(this.f2685b, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        this.f2687d = 0L;
                    }
                    z11 = z10;
                    if (z2) {
                        return;
                    } else {
                        return;
                    }
                }
            }
        } else {
            this.f2686c = 0L;
        }
        z10 = false;
        drawable = this.silver;
        if (drawable == null) {
        }
        z11 = z10;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        bravo(theme);
        onStateChange(getState());
    }

    public final void bravo(Resources.Theme theme) {
        b bVar = this.alpha;
        if (theme != null) {
            bVar.charlie();
            int i4 = bVar.hotel;
            Drawable[] drawableArr = bVar.golf;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i5].applyTheme(theme);
                    bVar.echo |= drawableArr[i5].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.bravo = resources;
                int i10 = resources.getDisplayMetrics().densityDpi;
                if (i10 == 0) {
                    i10 = 160;
                }
                int i11 = bVar.charlie;
                bVar.charlie = i10;
                if (i11 != i10) {
                    bVar.mike = false;
                    bVar.juliet = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.alpha.canApplyTheme();
    }

    public final void delta(Drawable drawable) {
        if (this.e == null) {
            this.e = new f();
        }
        f fVar = this.e;
        fVar.purple = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.alpha.yankee <= 0 && this.white) {
                drawable.setAlpha(this.teal);
            }
            b bVar = this.alpha;
            if (bVar.beige) {
                drawable.setColorFilter(bVar.azure);
            } else {
                if (bVar.bronze) {
                    drawable.setTintList(bVar.black);
                }
                b bVar2 = this.alpha;
                if (bVar2.coral) {
                    drawable.setTintMode(bVar2.blue);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.alpha.whiskey);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.alpha.amber);
            Rect rect = this.purple;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.e;
            Drawable.Callback callback = (Drawable.Callback) fVar2.purple;
            fVar2.purple = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            f fVar3 = this.e;
            Drawable.Callback callback2 = (Drawable.Callback) fVar3.purple;
            fVar3.purple = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.red;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.silver;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void echo() {
        boolean z2;
        Drawable drawable = this.silver;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.silver = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.red;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.white) {
                this.red.setAlpha(this.teal);
            }
        }
        if (this.f2687d != 0) {
            this.f2687d = 0L;
            z2 = true;
        }
        if (this.f2686c != 0) {
            this.f2686c = 0L;
        } else {
            z10 = z2;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final Drawable foxtrot() {
        if (!this.f2689g) {
            golf();
            b bVar = this.f2688f;
            bVar.cyan = bVar.cyan.clone();
            bVar.emerald = bVar.emerald.clone();
            this.f2689g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.teal;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.alpha.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        b bVar = this.alpha;
        if (bVar.uniform) {
            z2 = bVar.victor;
        } else {
            bVar.charlie();
            bVar.uniform = true;
            int i4 = bVar.hotel;
            Drawable[] drawableArr = bVar.golf;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    if (drawableArr[i5].getConstantState() == null) {
                        bVar.victor = false;
                        z2 = false;
                        break;
                    }
                    i5++;
                } else {
                    bVar.victor = true;
                    z2 = true;
                    break;
                }
            }
        }
        if (z2) {
            this.alpha.delta = getChangingConfigurations();
            return this.alpha;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.red;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.purple;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.alpha;
        if (bVar.lima) {
            if (!bVar.mike) {
                bVar.bravo();
            }
            return bVar.oscar;
        }
        Drawable drawable = this.red;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.alpha;
        if (bVar.lima) {
            if (!bVar.mike) {
                bVar.bravo();
            }
            return bVar.november;
        }
        Drawable drawable = this.red;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.alpha;
        if (bVar.lima) {
            if (!bVar.mike) {
                bVar.bravo();
            }
            return bVar.quebec;
        }
        Drawable drawable = this.red;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.alpha;
        if (bVar.lima) {
            if (!bVar.mike) {
                bVar.bravo();
            }
            return bVar.papa;
        }
        Drawable drawable = this.red;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.red;
        int i4 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.alpha;
            if (bVar.romeo) {
                return bVar.sierra;
            }
            bVar.charlie();
            int i5 = bVar.hotel;
            Drawable[] drawableArr = bVar.golf;
            if (i5 > 0) {
                i4 = drawableArr[0].getOpacity();
            }
            for (int i10 = 1; i10 < i5; i10++) {
                i4 = Drawable.resolveOpacity(i4, drawableArr[i10].getOpacity());
            }
            bVar.sierra = i4;
            bVar.romeo = true;
        }
        return i4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.red;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.alpha;
        boolean z2 = false;
        Rect rect2 = null;
        if (!bVar.india) {
            Rect rect3 = bVar.kilo;
            if (rect3 == null && !bVar.juliet) {
                bVar.charlie();
                Rect rect4 = new Rect();
                int i4 = bVar.hotel;
                Drawable[] drawableArr = bVar.golf;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i10 = rect4.left;
                        if (i10 > rect2.left) {
                            rect2.left = i10;
                        }
                        int i11 = rect4.top;
                        if (i11 > rect2.top) {
                            rect2.top = i11;
                        }
                        int i12 = rect4.right;
                        if (i12 > rect2.right) {
                            rect2.right = i12;
                        }
                        int i13 = rect4.bottom;
                        if (i13 > rect2.bottom) {
                            rect2.bottom = i13;
                        }
                    }
                }
                bVar.juliet = true;
                bVar.kilo = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z2 = true;
            }
        } else {
            Drawable drawable = this.red;
            if (drawable != null) {
                z2 = drawable.getPadding(rect);
            } else {
                z2 = super.getPadding(rect);
            }
        }
        if (this.alpha.amber && getLayoutDirection() == 1) {
            int i14 = rect.left;
            rect.left = rect.right;
            rect.right = i14;
        }
        return z2;
    }

    public final Drawable golf() {
        if (!this.f2684a && super.mutate() == this) {
            b bVar = new b(this.f2690h, this, null);
            bVar.cyan = bVar.cyan.clone();
            bVar.emerald = bVar.emerald.clone();
            india(bVar);
            this.f2684a = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hotel(int i4) {
        F6.b bVar;
        if (i4 == this.yellow) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.alpha.zulu > 0) {
            Drawable drawable = this.silver;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.red;
            if (drawable2 != null) {
                this.silver = drawable2;
                this.f2687d = this.alpha.zulu + uptimeMillis;
            } else {
                this.silver = null;
                this.f2687d = 0L;
            }
        } else {
            Drawable drawable3 = this.red;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i4 >= 0) {
            b bVar2 = this.alpha;
            if (i4 < bVar2.hotel) {
                Drawable delta = bVar2.delta(i4);
                this.red = delta;
                this.yellow = i4;
                if (delta != null) {
                    int i5 = this.alpha.yankee;
                    if (i5 > 0) {
                        this.f2686c = uptimeMillis + i5;
                    }
                    delta(delta);
                }
                if (this.f2686c == 0 || this.f2687d != 0) {
                    bVar = this.f2685b;
                    if (bVar != null) {
                        this.f2685b = new F6.b(9, this);
                    } else {
                        unscheduleSelf(bVar);
                    }
                    alpha(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.red = null;
        this.yellow = -1;
        if (this.f2686c == 0) {
        }
        bVar = this.f2685b;
        if (bVar != null) {
        }
        alpha(true);
        invalidateSelf();
        return true;
    }

    public final void india(b bVar) {
        this.alpha = bVar;
        int i4 = this.yellow;
        if (i4 >= 0) {
            Drawable delta = bVar.delta(i4);
            this.red = delta;
            if (delta != null) {
                delta(delta);
            }
        }
        this.silver = null;
        this.f2688f = bVar;
        this.f2690h = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.alpha;
        if (bVar != null) {
            bVar.romeo = false;
            bVar.tango = false;
        }
        if (drawable == this.red && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.alpha.amber;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean juliet(boolean z2, boolean z10) {
        boolean visible = super.setVisible(z2, z10);
        Drawable drawable = this.silver;
        if (drawable != null) {
            drawable.setVisible(z2, z10);
        }
        Drawable drawable2 = this.red;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        echo();
        AbstractC3037o3 abstractC3037o3 = this.f2691i;
        if (abstractC3037o3 != null) {
            abstractC3037o3.delta();
            this.f2691i = null;
            hotel(this.f2692j);
            this.f2692j = -1;
            this.f2693k = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f2694l) {
            foxtrot();
            b bVar = this.f2690h;
            bVar.cyan = bVar.cyan.clone();
            bVar.emerald = bVar.emerald.clone();
            this.f2694l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.silver;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.red;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        b bVar = this.alpha;
        int i5 = this.yellow;
        int i10 = bVar.hotel;
        Drawable[] drawableArr = bVar.golf;
        boolean z2 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i4);
                if (i11 == i5) {
                    z2 = layoutDirection;
                }
            }
        }
        bVar.xray = i4;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.silver;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.red;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (hotel(r1) != false) goto L45;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        AbstractC3037o3 aVar;
        b bVar = this.f2690h;
        int foxtrot = bVar.foxtrot(iArr);
        if (foxtrot < 0) {
            foxtrot = bVar.foxtrot(StateSet.WILD_CARD);
        }
        int i4 = this.yellow;
        boolean z10 = false;
        if (foxtrot != i4) {
            AbstractC3037o3 abstractC3037o3 = this.f2691i;
            if (abstractC3037o3 != null) {
                if (foxtrot != this.f2692j) {
                    if (foxtrot == this.f2693k && abstractC3037o3.alpha()) {
                        abstractC3037o3.bravo();
                        this.f2692j = this.f2693k;
                        this.f2693k = foxtrot;
                    } else {
                        i4 = this.f2692j;
                        abstractC3037o3.delta();
                    }
                }
                z10 = true;
            }
            this.f2691i = null;
            this.f2693k = -1;
            this.f2692j = -1;
            b bVar2 = this.f2690h;
            int echo = bVar2.echo(i4);
            int echo2 = bVar2.echo(foxtrot);
            if (echo2 != 0 && echo != 0) {
                long j5 = echo2 | (echo << 32);
                int longValue = (int) ((Long) bVar2.cyan.echo(j5)).longValue();
                if (longValue >= 0) {
                    if ((((Long) bVar2.cyan.echo(j5)).longValue() & 8589934592L) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hotel(longValue);
                    Object obj = this.red;
                    if (obj instanceof AnimationDrawable) {
                        if ((((Long) bVar2.cyan.echo(j5)).longValue() & 4294967296L) != 0) {
                            z10 = true;
                        }
                        aVar = new c((AnimationDrawable) obj, z10, z2);
                    } else if (obj instanceof androidx.vectordrawable.graphics.drawable.e) {
                        aVar = new a((androidx.vectordrawable.graphics.drawable.e) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    }
                    aVar.charlie();
                    this.f2691i = aVar;
                    this.f2693k = i4;
                    this.f2692j = foxtrot;
                    z10 = true;
                }
            }
        }
        Drawable drawable = this.red;
        if (drawable != null) {
            return drawable.setState(iArr) | z10;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        if (drawable == this.red && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (!this.white || this.teal != i4) {
            this.white = true;
            this.teal = i4;
            Drawable drawable = this.red;
            if (drawable != null) {
                if (this.f2686c == 0) {
                    drawable.setAlpha(i4);
                } else {
                    alpha(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        b bVar = this.alpha;
        if (bVar.amber != z2) {
            bVar.amber = z2;
            Drawable drawable = this.red;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.alpha;
        bVar.beige = true;
        if (bVar.azure != colorFilter) {
            bVar.azure = colorFilter;
            Drawable drawable = this.red;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        b bVar = this.alpha;
        if (bVar.whiskey != z2) {
            bVar.whiskey = z2;
            Drawable drawable = this.red;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f5, float f10) {
        Drawable drawable = this.red;
        if (drawable != null) {
            drawable.setHotspot(f5, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i4, int i5, int i10, int i11) {
        Rect rect = this.purple;
        if (rect == null) {
            this.purple = new Rect(i4, i5, i10, i11);
        } else {
            rect.set(i4, i5, i10, i11);
        }
        Drawable drawable = this.red;
        if (drawable != null) {
            drawable.setHotspotBounds(i4, i5, i10, i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.alpha;
        bVar.bronze = true;
        if (bVar.black != colorStateList) {
            bVar.black = colorStateList;
            this.red.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.alpha;
        bVar.coral = true;
        if (bVar.blue != mode) {
            bVar.blue = mode;
            this.red.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z10) {
        boolean juliet = juliet(z2, z10);
        AbstractC3037o3 abstractC3037o3 = this.f2691i;
        if (abstractC3037o3 != null && (juliet || z10)) {
            if (z2) {
                abstractC3037o3.charlie();
                return juliet;
            }
            jumpToCurrentState();
        }
        return juliet;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.red && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
