package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import id.C1915c;
import t6.AbstractC3032n3;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0486w {
    public ColorStateList alpha = null;
    public PorterDuff.Mode bravo = null;
    public boolean charlie = false;
    public boolean delta = false;
    public boolean echo;
    public final TextView foxtrot;

    public /* synthetic */ C0486w(TextView textView) {
        this.foxtrot = textView;
    }

    public void alpha() {
        CompoundButton compoundButton = (CompoundButton) this.foxtrot;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.charlie || this.delta) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.charlie) {
                    mutate.setTintList(this.alpha);
                }
                if (this.delta) {
                    mutate.setTintMode(this.bravo);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void bravo() {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) this.foxtrot;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.charlie || this.delta) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.charlie) {
                    mutate.setTintList(this.alpha);
                }
                if (this.delta) {
                    mutate.setTintMode(this.bravo);
                }
                if (mutate.isStateful()) {
                    mutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void charlie(AttributeSet attributeSet, int i4) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.foxtrot;
        Context context = compoundButton.getContext();
        int[] iArr = aj.a.mike;
        C1915c victor = C1915c.victor(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) victor.red;
        s1.au.mike(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) victor.red, i4);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC3032n3.echo(resourceId2, compoundButton.getContext()));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(victor.november(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(S.bravo(typedArray.getInt(3, -1), null));
                }
                victor.xray();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC3032n3.echo(resourceId, compoundButton.getContext()));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            victor.xray();
        } catch (Throwable th) {
            victor.xray();
            throw th;
        }
    }
}
