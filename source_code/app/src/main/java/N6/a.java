package N6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.w;
import com.google.android.material.internal.x;
import com.google.android.material.internal.z;
import d7.e;
import delivery.samurai.android.R;
import g7.i;
import g7.l;
import g7.m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* loaded from: classes2.dex */
public final class a extends Drawable implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f1871a;
    public final WeakReference alpha;

    /* renamed from: b, reason: collision with root package name */
    public float f1872b;

    /* renamed from: c, reason: collision with root package name */
    public float f1873c;

    /* renamed from: d, reason: collision with root package name */
    public float f1874d;
    public WeakReference e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f1875f;
    public final i purple;
    public final x red;
    public final Rect silver;
    public final b teal;
    public float white;
    public float yellow;

    public a(Context context) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        e eVar;
        WeakReference weakReference = new WeakReference(context);
        this.alpha = weakReference;
        z.charlie(context, z.bravo, "Theme.MaterialComponents");
        this.silver = new Rect();
        x xVar = new x(this);
        this.red = xVar;
        TextPaint textPaint = xVar.alpha;
        textPaint.setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context);
        this.teal = bVar;
        boolean foxtrot = foxtrot();
        BadgeState$State badgeState$State = bVar.bravo;
        if (foxtrot) {
            intValue = badgeState$State.yellow.intValue();
        } else {
            intValue = badgeState$State.teal.intValue();
        }
        if (foxtrot()) {
            intValue2 = badgeState$State.f7822a.intValue();
        } else {
            intValue2 = badgeState$State.white.intValue();
        }
        i iVar = new i(m.alpha(context, intValue, intValue2).alpha());
        this.purple = iVar;
        hotel();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && xVar.golf != (eVar = new e(context2, badgeState$State.silver.intValue()))) {
            xVar.bravo(eVar, context2);
            textPaint.setColor(badgeState$State.red.intValue());
            invalidateSelf();
            juliet();
            invalidateSelf();
        }
        int i4 = badgeState$State.e;
        if (i4 != -2) {
            this.f1871a = ((int) Math.pow(10.0d, i4 - 1.0d)) - 1;
        } else {
            this.f1871a = badgeState$State.f7826f;
        }
        xVar.echo = true;
        juliet();
        invalidateSelf();
        xVar.echo = true;
        hotel();
        juliet();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState$State.purple.intValue());
        if (iVar.purple.delta != valueOf) {
            iVar.quebec(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State.red.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.e;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.e.get();
            WeakReference weakReference3 = this.f1875f;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            india(view, frameLayout);
        }
        juliet();
        setVisible(badgeState$State.f7833m.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.w
    public final void alpha() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void bravo(View view, View view2) {
        float f5;
        float f10;
        View view3;
        boolean z2;
        FrameLayout delta = delta();
        if (delta == null) {
            float y10 = view.getY();
            f10 = view.getX();
            view3 = view.getParent();
            f5 = y10;
        } else {
            f5 = 0.0f;
            f10 = 0.0f;
            view3 = delta;
        }
        while (true) {
            z2 = view3 instanceof View;
            if (!z2 || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f5 += view4.getY();
            f10 += view4.getX();
            view3 = view3.getParent();
        }
        if (z2) {
            float f11 = (this.yellow - this.f1874d) + f5;
            float f12 = (this.white - this.f1873c) + f10;
            View view5 = view3;
            float height = ((this.yellow + this.f1874d) - view5.getHeight()) + f5;
            float width = ((this.white + this.f1873c) - view5.getWidth()) + f10;
            if (f11 < 0.0f) {
                this.yellow = Math.abs(f11) + this.yellow;
            }
            if (f12 < 0.0f) {
                this.white = Math.abs(f12) + this.white;
            }
            if (height > 0.0f) {
                this.yellow -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.white -= Math.abs(width);
            }
        }
    }

    public final String charlie() {
        boolean z2;
        int i4 = this.f1871a;
        b bVar = this.teal;
        BadgeState$State badgeState$State = bVar.bravo;
        String str = badgeState$State.f7824c;
        if (str != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        WeakReference weakReference = this.alpha;
        if (z2) {
            int i5 = badgeState$State.e;
            if (i5 != -2 && str != null && str.length() > i5) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i5 - 1), "…");
                }
                return "";
            }
            return str;
        }
        if (golf()) {
            BadgeState$State badgeState$State2 = bVar.bravo;
            if (i4 != -2 && echo() > i4) {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return "";
                }
                return String.format(badgeState$State2.f7827g, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i4), "+");
            }
            return NumberFormat.getInstance(badgeState$State2.f7827g).format(echo());
        }
        return null;
    }

    public final FrameLayout delta() {
        WeakReference weakReference = this.f1875f;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String charlie;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.purple.draw(canvas);
            if (foxtrot() && (charlie = charlie()) != null) {
                Rect rect = new Rect();
                x xVar = this.red;
                xVar.alpha.getTextBounds(charlie, 0, charlie.length(), rect);
                float exactCenterY = this.yellow - rect.exactCenterY();
                float f5 = this.white;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(charlie, f5, round, xVar.alpha);
            }
        }
    }

    public final int echo() {
        int i4 = this.teal.bravo.f7825d;
        if (i4 != -1) {
            return i4;
        }
        return 0;
    }

    public final boolean foxtrot() {
        if (this.teal.bravo.f7824c != null || golf()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.teal.bravo.f7823b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.silver.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.silver.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean golf() {
        BadgeState$State badgeState$State = this.teal.bravo;
        if (badgeState$State.f7824c == null && badgeState$State.f7825d != -1) {
            return true;
        }
        return false;
    }

    public final void hotel() {
        int intValue;
        int intValue2;
        Context context = (Context) this.alpha.get();
        if (context == null) {
            return;
        }
        boolean foxtrot = foxtrot();
        b bVar = this.teal;
        if (foxtrot) {
            intValue = bVar.bravo.yellow.intValue();
        } else {
            intValue = bVar.bravo.teal.intValue();
        }
        if (foxtrot()) {
            intValue2 = bVar.bravo.f7822a.intValue();
        } else {
            intValue2 = bVar.bravo.white.intValue();
        }
        this.purple.setShapeAppearanceModel(m.alpha(context, intValue, intValue2).alpha());
        invalidateSelf();
    }

    public final void india(View view, FrameLayout frameLayout) {
        this.e = new WeakReference(view);
        this.f1875f = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        juliet();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void juliet() {
        View view;
        ViewGroup viewGroup;
        float f5;
        float f10;
        float f11;
        int intValue;
        float f12;
        float f13;
        int i4;
        float f14;
        float f15;
        WeakReference weakReference = this.alpha;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.e;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.silver;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference3 = this.f1875f;
            if (weakReference3 != null) {
                viewGroup = (ViewGroup) weakReference3.get();
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean foxtrot = foxtrot();
            b bVar = this.teal;
            if (foxtrot) {
                f5 = bVar.delta;
            } else {
                f5 = bVar.charlie;
            }
            this.f1872b = f5;
            if (f5 != -1.0f) {
                this.f1873c = f5;
                this.f1874d = f5;
            } else {
                if (foxtrot()) {
                    f10 = bVar.golf;
                } else {
                    f10 = bVar.echo;
                }
                this.f1873c = Math.round(f10 / 2.0f);
                if (foxtrot()) {
                    f11 = bVar.hotel;
                } else {
                    f11 = bVar.foxtrot;
                }
                this.f1874d = Math.round(f11 / 2.0f);
            }
            if (foxtrot()) {
                String charlie = charlie();
                float f16 = this.f1873c;
                x xVar = this.red;
                if (!xVar.echo) {
                    f14 = xVar.charlie;
                } else {
                    xVar.alpha(charlie);
                    f14 = xVar.charlie;
                }
                this.f1873c = Math.max(f16, (f14 / 2.0f) + bVar.bravo.f7834n.intValue());
                float f17 = this.f1874d;
                if (!xVar.echo) {
                    f15 = xVar.delta;
                } else {
                    xVar.alpha(charlie);
                    f15 = xVar.delta;
                }
                float max = Math.max(f17, (f15 / 2.0f) + bVar.bravo.f7835o.intValue());
                this.f1874d = max;
                this.f1873c = Math.max(this.f1873c, max);
            }
            int intValue2 = bVar.bravo.f7837q.intValue();
            boolean foxtrot2 = foxtrot();
            BadgeState$State badgeState$State = bVar.bravo;
            if (foxtrot2) {
                intValue2 = badgeState$State.f7839s.intValue();
                Context context2 = (Context) weakReference.get();
                if (context2 != null) {
                    intValue2 = M6.a.charlie(intValue2, intValue2 - badgeState$State.f7842v.intValue(), M6.a.bravo(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
                }
            }
            int i5 = bVar.kilo;
            if (i5 == 0) {
                intValue2 -= Math.round(this.f1874d);
            }
            int intValue3 = badgeState$State.f7841u.intValue() + intValue2;
            int intValue4 = badgeState$State.f7832l.intValue();
            if (intValue4 != 8388691 && intValue4 != 8388693) {
                this.yellow = rect3.top + intValue3;
            } else {
                this.yellow = rect3.bottom - intValue3;
            }
            if (foxtrot()) {
                intValue = badgeState$State.f7838r.intValue();
            } else {
                intValue = badgeState$State.f7836p.intValue();
            }
            if (i5 == 1) {
                if (foxtrot()) {
                    i4 = bVar.juliet;
                } else {
                    i4 = bVar.india;
                }
                intValue += i4;
            }
            int intValue5 = badgeState$State.f7840t.intValue() + intValue;
            int intValue6 = badgeState$State.f7832l.intValue();
            int i10 = bVar.lima;
            if (intValue6 != 8388659 && intValue6 != 8388691) {
                if (i10 == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f13 = (rect3.right + this.f1873c) - intValue5;
                    } else {
                        f13 = (rect3.left - this.f1873c) + intValue5;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f13 = (rect3.right - this.f1873c) + ((this.f1874d * 2.0f) - intValue5);
                } else {
                    f13 = (rect3.left + this.f1873c) - ((this.f1874d * 2.0f) - intValue5);
                }
                this.white = f13;
            } else {
                if (i10 == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f12 = (rect3.left + this.f1873c) - ((this.f1874d * 2.0f) - intValue5);
                    } else {
                        f12 = (rect3.right - this.f1873c) + ((this.f1874d * 2.0f) - intValue5);
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f12 = (rect3.left - this.f1873c) + intValue5;
                } else {
                    f12 = (rect3.right + this.f1873c) - intValue5;
                }
                this.white = f12;
            }
            if (badgeState$State.f7843w.booleanValue()) {
                ViewParent delta = delta();
                if (delta == null) {
                    delta = view.getParent();
                }
                if ((delta instanceof View) && (delta.getParent() instanceof View)) {
                    bravo(view, (View) delta.getParent());
                }
            } else {
                bravo(view, null);
            }
            float f18 = this.white;
            float f19 = this.yellow;
            float f20 = this.f1873c;
            float f21 = this.f1874d;
            rect2.set((int) (f18 - f20), (int) (f19 - f21), (int) (f18 + f20), (int) (f19 + f21));
            float f22 = this.f1872b;
            i iVar = this.purple;
            if (f22 != -1.0f) {
                l golf = iVar.purple.alpha.golf();
                golf.charlie(f22);
                iVar.setShapeAppearanceModel(golf.alpha());
            }
            if (!rect.equals(rect2)) {
                iVar.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.w
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        b bVar = this.teal;
        bVar.alpha.f7823b = i4;
        bVar.bravo.f7823b = i4;
        this.red.alpha.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
