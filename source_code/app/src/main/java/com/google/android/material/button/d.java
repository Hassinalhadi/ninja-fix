package com.google.android.material.button;

import J1.g;
import a4.u;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import delivery.samurai.android.R;
import e7.AbstractC1632a;
import g7.ad;
import g7.i;
import g7.m;
import g7.x;
import s6.AbstractC2815x7;

/* loaded from: classes2.dex */
public final class d {
    public final MaterialButton alpha;
    public m bravo;
    public ad charlie;
    public g delta;
    public u echo;
    public int foxtrot;
    public int golf;
    public int hotel;
    public int india;
    public int juliet;
    public int kilo;
    public PorterDuff.Mode lima;
    public ColorStateList mike;
    public ColorStateList november;
    public ColorStateList oscar;
    public i papa;
    public boolean tango;
    public RippleDrawable victor;
    public int whiskey;
    public boolean quebec = false;
    public boolean romeo = false;
    public boolean sierra = false;
    public boolean uniform = true;

    public d(MaterialButton materialButton, m mVar) {
        this.alpha = materialButton;
        this.bravo = mVar;
    }

    public final i alpha(boolean z2) {
        RippleDrawable rippleDrawable = this.victor;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (i) ((LayerDrawable) ((InsetDrawable) this.victor.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
        }
        return null;
    }

    public final void bravo(int i4, int i5) {
        MaterialButton materialButton = this.alpha;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i10 = this.hotel;
        int i11 = this.india;
        this.india = i5;
        this.hotel = i4;
        if (!this.romeo) {
            charlie();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i4) - i10, paddingEnd, (paddingBottom + i5) - i11);
    }

    public final void charlie() {
        int i4;
        i iVar = new i(this.bravo);
        ad adVar = this.charlie;
        if (adVar != null) {
            iVar.tango(adVar);
        }
        g gVar = this.delta;
        if (gVar != null) {
            iVar.oscar(gVar);
        }
        u uVar = this.echo;
        if (uVar != null) {
            iVar.f12672x = uVar;
        }
        MaterialButton materialButton = this.alpha;
        iVar.mike(materialButton.getContext());
        iVar.setTintList(this.mike);
        PorterDuff.Mode mode = this.lima;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f5 = this.kilo;
        ColorStateList colorStateList = this.november;
        iVar.purple.kilo = f5;
        iVar.invalidateSelf();
        g7.g gVar2 = iVar.purple;
        if (gVar2.echo != colorStateList) {
            gVar2.echo = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        i iVar2 = new i(this.bravo);
        ad adVar2 = this.charlie;
        if (adVar2 != null) {
            iVar2.tango(adVar2);
        }
        g gVar3 = this.delta;
        if (gVar3 != null) {
            iVar2.oscar(gVar3);
        }
        iVar2.setTint(0);
        float f10 = this.kilo;
        if (this.quebec) {
            i4 = AbstractC2815x7.charlie(R.attr.colorSurface, materialButton);
        } else {
            i4 = 0;
        }
        iVar2.purple.kilo = f10;
        iVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i4);
        g7.g gVar4 = iVar2.purple;
        if (gVar4.echo != valueOf) {
            gVar4.echo = valueOf;
            iVar2.onStateChange(iVar2.getState());
        }
        i iVar3 = new i(this.bravo);
        this.papa = iVar3;
        ad adVar3 = this.charlie;
        if (adVar3 != null) {
            iVar3.tango(adVar3);
        }
        g gVar5 = this.delta;
        if (gVar5 != null) {
            this.papa.oscar(gVar5);
        }
        this.papa.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1632a.bravo(this.oscar), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.foxtrot, this.hotel, this.golf, this.india), this.papa);
        this.victor = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i alpha = alpha(false);
        if (alpha != null) {
            alpha.papa(this.whiskey);
            alpha.setState(materialButton.getDrawableState());
        }
    }

    public final void delta() {
        x xVar;
        i alpha = alpha(false);
        if (alpha != null) {
            ad adVar = this.charlie;
            if (adVar != null) {
                alpha.tango(adVar);
            } else {
                alpha.setShapeAppearanceModel(this.bravo);
            }
            g gVar = this.delta;
            if (gVar != null) {
                alpha.oscar(gVar);
            }
        }
        i alpha2 = alpha(true);
        if (alpha2 != null) {
            ad adVar2 = this.charlie;
            if (adVar2 != null) {
                alpha2.tango(adVar2);
            } else {
                alpha2.setShapeAppearanceModel(this.bravo);
            }
            g gVar2 = this.delta;
            if (gVar2 != null) {
                alpha2.oscar(gVar2);
            }
        }
        RippleDrawable rippleDrawable = this.victor;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.victor.getNumberOfLayers() > 2) {
                xVar = (x) this.victor.getDrawable(2);
            } else {
                xVar = (x) this.victor.getDrawable(1);
            }
        } else {
            xVar = null;
        }
        if (xVar != null) {
            xVar.setShapeAppearanceModel(this.bravo);
            if (xVar instanceof i) {
                i iVar = (i) xVar;
                ad adVar3 = this.charlie;
                if (adVar3 != null) {
                    iVar.tango(adVar3);
                }
                g gVar3 = this.delta;
                if (gVar3 != null) {
                    iVar.oscar(gVar3);
                }
            }
        }
    }

    public final void echo() {
        int i4 = 0;
        i alpha = alpha(false);
        i alpha2 = alpha(true);
        if (alpha != null) {
            float f5 = this.kilo;
            ColorStateList colorStateList = this.november;
            alpha.purple.kilo = f5;
            alpha.invalidateSelf();
            g7.g gVar = alpha.purple;
            if (gVar.echo != colorStateList) {
                gVar.echo = colorStateList;
                alpha.onStateChange(alpha.getState());
            }
            if (alpha2 != null) {
                float f10 = this.kilo;
                if (this.quebec) {
                    i4 = AbstractC2815x7.charlie(R.attr.colorSurface, this.alpha);
                }
                alpha2.purple.kilo = f10;
                alpha2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i4);
                g7.g gVar2 = alpha2.purple;
                if (gVar2.echo != valueOf) {
                    gVar2.echo = valueOf;
                    alpha2.onStateChange(alpha2.getState());
                }
            }
        }
    }
}
