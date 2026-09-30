package P6;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import delivery.samurai.android.R;
import g7.e;
import g7.i;
import g7.k;
import g7.l;
import g7.m;
import s6.Q4;
import x2.q;

/* loaded from: classes2.dex */
public final class d {
    public static final double yankee = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable zulu;
    public final MaterialCardView alpha;
    public final i charlie;
    public final i delta;
    public int echo;
    public int foxtrot;
    public int golf;
    public int hotel;
    public Drawable india;
    public Drawable juliet;
    public ColorStateList kilo;
    public ColorStateList lima;
    public m mike;
    public ColorStateList november;
    public RippleDrawable oscar;
    public LayerDrawable papa;
    public i quebec;
    public boolean sierra;
    public ValueAnimator tango;
    public final TimeInterpolator uniform;
    public final int victor;
    public final int whiskey;
    public final Rect bravo = new Rect();
    public boolean romeo = false;
    public float xray = 0.0f;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        zulu = colorDrawable;
    }

    public d(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.alpha = materialCardView;
        i iVar = new i(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, 2132083899);
        this.charlie = iVar;
        iVar.mike(materialCardView.getContext());
        iVar.sierra();
        l golf = iVar.purple.alpha.golf();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, bt.a.alpha, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            golf.charlie(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.delta = new i();
        hotel(golf.alpha());
        this.uniform = q.foxtrot(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, M6.a.alpha);
        this.victor = q.echo(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.whiskey = q.echo(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float bravo(Q4 q4, float f5) {
        if (q4 instanceof k) {
            return (float) ((1.0d - yankee) * f5);
        }
        if (q4 instanceof e) {
            return f5 / 2.0f;
        }
        return 0.0f;
    }

    public final float alpha() {
        float alpha;
        float alpha2;
        float alpha3;
        Q4 q4 = this.mike.alpha;
        i iVar = this.charlie;
        float bravo = bravo(q4, iVar.kilo());
        Q4 q42 = this.mike.bravo;
        float[] fArr = iVar.f12670v;
        if (fArr != null) {
            alpha = fArr[0];
        } else {
            alpha = iVar.purple.alpha.foxtrot.alpha(iVar.hotel());
        }
        float max = Math.max(bravo, bravo(q42, alpha));
        Q4 q43 = this.mike.charlie;
        float[] fArr2 = iVar.f12670v;
        if (fArr2 != null) {
            alpha2 = fArr2[1];
        } else {
            alpha2 = iVar.purple.alpha.golf.alpha(iVar.hotel());
        }
        float bravo2 = bravo(q43, alpha2);
        Q4 q44 = this.mike.delta;
        float[] fArr3 = iVar.f12670v;
        if (fArr3 != null) {
            alpha3 = fArr3[2];
        } else {
            alpha3 = iVar.purple.alpha.hotel.alpha(iVar.hotel());
        }
        return Math.max(max, Math.max(bravo2, bravo(q44, alpha3)));
    }

    public final LayerDrawable charlie() {
        if (this.oscar == null) {
            this.quebec = new i(this.mike);
            this.oscar = new RippleDrawable(this.kilo, null, this.quebec);
        }
        if (this.papa == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.oscar, this.delta, this.juliet});
            this.papa = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.papa;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.InsetDrawable, P6.c] */
    public final c delta(Drawable drawable) {
        int i4;
        int i5;
        float f5;
        MaterialCardView materialCardView = this.alpha;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            float f10 = 0.0f;
            if (india()) {
                f5 = alpha();
            } else {
                f5 = 0.0f;
            }
            int ceil = (int) Math.ceil(maxCardElevation + f5);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (india()) {
                f10 = alpha();
            }
            i4 = (int) Math.ceil(maxCardElevation2 + f10);
            i5 = ceil;
        } else {
            i4 = 0;
            i5 = 0;
        }
        return new InsetDrawable(drawable, i4, i5, i4, i5);
    }

    public final void echo(int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f5;
        if (this.papa != null) {
            MaterialCardView materialCardView = this.alpha;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                float f10 = 0.0f;
                if (india()) {
                    f5 = alpha();
                } else {
                    f5 = 0.0f;
                }
                i10 = (int) Math.ceil((maxCardElevation + f5) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (india()) {
                    f10 = alpha();
                }
                i11 = (int) Math.ceil((maxCardElevation2 + f10) * 2.0f);
            } else {
                i10 = 0;
                i11 = 0;
            }
            int i18 = this.golf;
            if ((i18 & 8388613) == 8388613) {
                i12 = ((i4 - this.echo) - this.foxtrot) - i11;
            } else {
                i12 = this.echo;
            }
            if ((i18 & 80) == 80) {
                i13 = this.echo;
            } else {
                i13 = ((i5 - this.echo) - this.foxtrot) - i10;
            }
            int i19 = i13;
            if ((i18 & 8388613) == 8388613) {
                i14 = this.echo;
            } else {
                i14 = ((i4 - this.echo) - this.foxtrot) - i11;
            }
            if ((i18 & 80) == 80) {
                i15 = ((i5 - this.echo) - this.foxtrot) - i10;
            } else {
                i15 = this.echo;
            }
            int i20 = i15;
            if (materialCardView.getLayoutDirection() == 1) {
                i17 = i14;
                i16 = i12;
            } else {
                i16 = i14;
                i17 = i12;
            }
            this.papa.setLayerInset(2, i17, i20, i16, i19);
        }
    }

    public final void foxtrot(boolean z2, boolean z10) {
        float f5;
        int i4;
        int i5 = 0;
        Drawable drawable = this.juliet;
        if (drawable != null) {
            float f10 = 0.0f;
            if (z10) {
                if (z2) {
                    f10 = 1.0f;
                }
                if (z2) {
                    f5 = 1.0f - this.xray;
                } else {
                    f5 = this.xray;
                }
                ValueAnimator valueAnimator = this.tango;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.tango = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.xray, f10);
                this.tango = ofFloat;
                ofFloat.addUpdateListener(new b(0, this));
                this.tango.setInterpolator(this.uniform);
                ValueAnimator valueAnimator2 = this.tango;
                if (z2) {
                    i4 = this.victor;
                } else {
                    i4 = this.whiskey;
                }
                valueAnimator2.setDuration(i4 * f5);
                this.tango.start();
                return;
            }
            if (z2) {
                i5 = 255;
            }
            drawable.setAlpha(i5);
            if (z2) {
                f10 = 1.0f;
            }
            this.xray = f10;
        }
    }

    public final void golf(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.juliet = mutate;
            mutate.setTintList(this.lima);
            foxtrot(this.alpha.f7940c, false);
        } else {
            this.juliet = zulu;
        }
        LayerDrawable layerDrawable = this.papa;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.juliet);
        }
    }

    public final void hotel(m mVar) {
        this.mike = mVar;
        i iVar = this.charlie;
        iVar.setShapeAppearanceModel(mVar);
        iVar.f12665q = !iVar.november();
        i iVar2 = this.delta;
        if (iVar2 != null) {
            iVar2.setShapeAppearanceModel(mVar);
        }
        i iVar3 = this.quebec;
        if (iVar3 != null) {
            iVar3.setShapeAppearanceModel(mVar);
        }
    }

    public final boolean india() {
        MaterialCardView materialCardView = this.alpha;
        if (materialCardView.getPreventCornerOverlap() && this.charlie.november() && materialCardView.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final boolean juliet() {
        View view = this.alpha;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void kilo() {
        Drawable drawable;
        Drawable drawable2 = this.india;
        if (juliet()) {
            drawable = charlie();
        } else {
            drawable = this.delta;
        }
        this.india = drawable;
        if (drawable2 != drawable) {
            MaterialCardView materialCardView = this.alpha;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
            } else {
                materialCardView.setForeground(delta(drawable));
            }
        }
    }

    public final void lima() {
        boolean z2;
        float alpha;
        MaterialCardView materialCardView = this.alpha;
        if (materialCardView.getPreventCornerOverlap() && !this.charlie.november()) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f5 = 0.0f;
        if (!z2 && !india()) {
            alpha = 0.0f;
        } else {
            alpha = alpha();
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f5 = (float) ((1.0d - yankee) * materialCardView.getCardViewRadius());
        }
        int i4 = (int) (alpha - f5);
        Rect rect = this.bravo;
        materialCardView.red.set(rect.left + i4, rect.top + i4, rect.right + i4, rect.bottom + i4);
        J2.e eVar = materialCardView.teal;
        if (!((CardView) eVar.red).getUseCompatPadding()) {
            eVar.K(0, 0, 0, 0);
            return;
        }
        bu.a aVar = (bu.a) ((Drawable) eVar.purple);
        float f10 = aVar.echo;
        float f11 = aVar.alpha;
        CardView cardView = (CardView) eVar.red;
        int ceil = (int) Math.ceil(bu.b.alpha(f10, f11, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(bu.b.bravo(f10, f11, cardView.getPreventCornerOverlap()));
        eVar.K(ceil, ceil2, ceil, ceil2);
    }

    public final void mike() {
        boolean z2 = this.romeo;
        MaterialCardView materialCardView = this.alpha;
        if (!z2) {
            materialCardView.setBackgroundInternal(delta(this.charlie));
        }
        materialCardView.setForeground(delta(this.india));
    }
}
