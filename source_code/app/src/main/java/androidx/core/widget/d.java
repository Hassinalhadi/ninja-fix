package androidx.core.widget;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.Z;
import com.zendesk.service.HttpConstants;
import java.util.WeakHashMap;
import s1.au;

/* loaded from: classes3.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: k, reason: collision with root package name */
    public static final int f3060k = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final int f3061a;
    public final a alpha;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3062b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f3063c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f3064d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3065f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3066g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3067h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3068i;

    /* renamed from: j, reason: collision with root package name */
    public final Z f3069j;
    public final AccelerateInterpolator purple;
    public final ListView red;
    public F6.b silver;
    public final float[] teal;
    public final float[] white;
    public final int yellow;

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.core.widget.a, java.lang.Object] */
    public d(Z z2) {
        ?? obj = new Object();
        obj.echo = Long.MIN_VALUE;
        obj.golf = -1L;
        obj.foxtrot = 0L;
        this.alpha = obj;
        this.purple = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.teal = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.white = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3062b = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3063c = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3064d = fArr5;
        this.red = z2;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f5) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f5 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.yellow = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3061a = f3060k;
        obj.alpha = HttpConstants.HTTP_INTERNAL_ERROR;
        obj.bravo = HttpConstants.HTTP_INTERNAL_ERROR;
        this.f3069j = z2;
    }

    public static float bravo(float f5, float f10, float f11) {
        if (f5 > f11) {
            return f11;
        }
        if (f5 < f10) {
            return f10;
        }
        return f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float alpha(float f5, float f10, float f11, int i4) {
        float f12;
        float interpolation;
        float bravo = bravo(this.teal[i4] * f10, 0.0f, this.white[i4]);
        float charlie = charlie(f10 - f5, bravo) - charlie(f5, bravo);
        AccelerateInterpolator accelerateInterpolator = this.purple;
        if (charlie < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-charlie);
        } else if (charlie > 0.0f) {
            interpolation = accelerateInterpolator.getInterpolation(charlie);
        } else {
            f12 = 0.0f;
            if (f12 != 0.0f) {
                return 0.0f;
            }
            float f13 = this.f3062b[i4];
            float f14 = this.f3063c[i4];
            float f15 = this.f3064d[i4];
            float f16 = f13 * f11;
            if (f12 > 0.0f) {
                return bravo(f12 * f16, f14, f15);
            }
            return -bravo((-f12) * f16, f14, f15);
        }
        f12 = bravo(interpolation, -1.0f, 1.0f);
        if (f12 != 0.0f) {
        }
    }

    public final float charlie(float f5, float f10) {
        if (f10 != 0.0f) {
            int i4 = this.yellow;
            if (i4 != 0 && i4 != 1) {
                if (i4 == 2 && f5 < 0.0f) {
                    return f5 / (-f10);
                }
            } else if (f5 < f10) {
                if (f5 >= 0.0f) {
                    return 1.0f - (f5 / f10);
                }
                if (this.f3067h && i4 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void delta() {
        int i4 = 0;
        if (this.f3065f) {
            this.f3067h = false;
            return;
        }
        a aVar = this.alpha;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (currentAnimationTimeMillis - aVar.echo);
        int i10 = aVar.bravo;
        if (i5 > i10) {
            i4 = i10;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        aVar.india = i4;
        aVar.hotel = aVar.alpha(currentAnimationTimeMillis);
        aVar.golf = currentAnimationTimeMillis;
    }

    public final boolean echo() {
        Z z2;
        int count;
        a aVar = this.alpha;
        float f5 = aVar.delta;
        int abs = (int) (f5 / Math.abs(f5));
        Math.abs(aVar.charlie);
        if (abs != 0 && (count = (z2 = this.f3069j).getCount()) != 0) {
            int childCount = z2.getChildCount();
            int firstVisiblePosition = z2.getFirstVisiblePosition();
            int i4 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && z2.getChildAt(0).getTop() >= 0)) : !(i4 >= count && z2.getChildAt(childCount - 1).getBottom() <= z2.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i4;
        if (this.f3068i) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                delta();
                return false;
            }
            this.f3066g = true;
            this.e = false;
            float x4 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.red;
            float alpha = alpha(x4, width, listView.getWidth(), 0);
            float alpha2 = alpha(motionEvent.getY(), view.getHeight(), listView.getHeight(), 1);
            a aVar = this.alpha;
            aVar.charlie = alpha;
            aVar.delta = alpha2;
            if (!this.f3067h && echo()) {
                if (this.silver == null) {
                    this.silver = new F6.b(11, this);
                }
                this.f3067h = true;
                this.f3065f = true;
                if (!this.e && (i4 = this.f3061a) > 0) {
                    F6.b bVar = this.silver;
                    long j5 = i4;
                    WeakHashMap weakHashMap = au.alpha;
                    listView.postOnAnimationDelayed(bVar, j5);
                } else {
                    this.silver.run();
                }
                this.e = true;
            }
        }
        return false;
    }
}
