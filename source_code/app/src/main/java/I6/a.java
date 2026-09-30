package I6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.wallet.button.ButtonOptions;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class a extends FrameLayout implements View.OnClickListener {
    public View.OnClickListener alpha;
    public View purple;

    public final void alpha(ButtonOptions buttonOptions) {
        int i4;
        removeAllViews();
        if (buttonOptions.purple == 2) {
            i4 = R.style.PayButtonGenericLightTheme;
        } else {
            i4 = R.style.PayButtonGenericDarkTheme;
        }
        LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(getContext(), i4), null);
        LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.paybutton_generic, (ViewGroup) linearLayout, true).findViewById(R.id.pay_button_view);
        Context context = linearLayout.getContext();
        int i5 = buttonOptions.red;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericBackground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable.mutate();
        gradientDrawable.setCornerRadius(i5);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.payButtonGenericRippleColor});
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        linearLayout2.setBackground(new RippleDrawable(ColorStateList.valueOf(color), gradientDrawable, null));
        linearLayout.setContentDescription(linearLayout.getContext().getString(R.string.gpay_logo_description));
        this.purple = linearLayout;
        addView(linearLayout);
        this.purple.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.alpha;
        if (onClickListener != null && view == this.purple) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.alpha = onClickListener;
    }
}
