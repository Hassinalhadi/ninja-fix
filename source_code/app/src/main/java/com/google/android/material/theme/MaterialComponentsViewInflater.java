package com.google.android.material.theme;

import L6.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.app.ag;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0478s;
import androidx.appcompat.widget.C0482u;
import androidx.appcompat.widget.C0484v;
import androidx.appcompat.widget.ah;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import com.google.android.material.internal.z;
import com.google.android.material.textfield.s;
import com.google.android.material.textview.MaterialTextView;
import delivery.samurai.android.R;
import l7.AbstractC2059a;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends ag {
    @Override // androidx.appcompat.app.ag
    public final C0478s alpha(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    @Override // androidx.appcompat.app.ag
    public final C0482u bravo(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.ag
    public final C0484v charlie(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.CompoundButton, android.view.View, c7.a, androidx.appcompat.widget.ah] */
    @Override // androidx.appcompat.app.ag
    public final ah delta(Context context, AttributeSet attributeSet) {
        ?? ahVar = new ah(AbstractC2059a.alpha(context, attributeSet, R.attr.radioButtonStyle, 2132083912), attributeSet);
        Context context2 = ahVar.getContext();
        TypedArray golf = z.golf(context2, attributeSet, a.azure, R.attr.radioButtonStyle, 2132083912, new int[0]);
        if (golf.hasValue(0)) {
            ahVar.setButtonTintList(AbstractC2719n0.alpha(context2, golf, 0));
        }
        ahVar.white = golf.getBoolean(1, false);
        golf.recycle();
        return ahVar;
    }

    @Override // androidx.appcompat.app.ag
    public final AppCompatTextView echo(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
