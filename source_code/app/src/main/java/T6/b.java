package T6;

import Fe.c;
import an.d;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.g;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import g7.i;
import g7.l;
import l7.AbstractC2059a;
import s6.AbstractC2710m0;

/* loaded from: classes2.dex */
public final class b extends c {
    public final i silver;
    public final Rect teal;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Context context) {
        super(r3, r14);
        int i4;
        int i5;
        int i10;
        int i11;
        TypedValue bravo = AbstractC2710m0.bravo(R.attr.materialAlertDialogTheme, context);
        if (bravo == null) {
            i4 = 0;
        } else {
            i4 = bravo.data;
        }
        Context bravo2 = AbstractC2059a.bravo(context, null, R.attr.alertDialogStyle, 2132083032, new int[0]);
        bravo2 = i4 != 0 ? new d(bravo2, i4) : bravo2;
        TypedValue bravo3 = AbstractC2710m0.bravo(R.attr.materialAlertDialogTheme, context);
        if (bravo3 == null) {
            i5 = 0;
        } else {
            i5 = bravo3.data;
        }
        ContextThemeWrapper contextThemeWrapper = ((androidx.appcompat.app.d) this.red).alpha;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        int[] iArr = L6.a.romeo;
        z.alpha(contextThemeWrapper, null, R.attr.alertDialogStyle, 2132083032);
        z.bravo(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, 2132083032, new int[0]);
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, 2132083032);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        obtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        if (layoutDirection == 1) {
            i10 = dimensionPixelSize3;
        } else {
            i10 = dimensionPixelSize;
        }
        this.teal = new Rect(i10, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        TypedValue delta = AbstractC2710m0.delta(contextThemeWrapper, R.attr.colorSurface, b.class.getCanonicalName());
        int i12 = delta.resourceId;
        if (i12 != 0) {
            i11 = contextThemeWrapper.getColor(i12);
        } else {
            i11 = delta.data;
        }
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, 2132083032);
        int color = obtainStyledAttributes2.getColor(4, i11);
        obtainStyledAttributes2.recycle();
        i iVar = new i(contextThemeWrapper, null, R.attr.alertDialogStyle, 2132083032);
        iVar.mike(contextThemeWrapper);
        iVar.quebec(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((androidx.appcompat.app.d) this.red).alpha.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                l golf = iVar.purple.alpha.golf();
                golf.charlie(dimension);
                iVar.setShapeAppearanceModel(golf.alpha());
            }
        }
        this.silver = iVar;
    }

    @Override // Fe.c
    public final g foxtrot() {
        g foxtrot = super.foxtrot();
        Window window = foxtrot.getWindow();
        View decorView = window.getDecorView();
        i iVar = this.silver;
        if (iVar != null) {
            iVar.papa(decorView.getElevation());
        }
        Rect rect = this.teal;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) iVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(foxtrot, rect));
        return foxtrot;
    }

    @Override // Fe.c
    public final c lima(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }

    @Override // Fe.c
    public final c mike(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        throw null;
    }
}
