package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import k0.AbstractC1996c;
import r1.C2483b;
import s6.AbstractC2710m0;
import s6.AbstractC2815x7;
import s6.T7;

/* loaded from: classes2.dex */
public class RangeDateSelector implements DateSelector<C2483b> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new x(3);
    public String alpha;
    public Long purple = null;
    public Long red = null;
    public Long silver = null;
    public Long teal = null;

    public static void charlie(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, t tVar) {
        Long l10 = rangeDateSelector.silver;
        if (l10 != null && rangeDateSelector.teal != null) {
            if (l10.longValue() <= rangeDateSelector.teal.longValue()) {
                Long l11 = rangeDateSelector.silver;
                rangeDateSelector.purple = l11;
                Long l12 = rangeDateSelector.teal;
                rangeDateSelector.red = l12;
                tVar.bravo(new C2483b(l11, l12));
            } else {
                textInputLayout.setError(rangeDateSelector.alpha);
                textInputLayout2.setError(" ");
                tVar.alpha();
            }
        } else {
            if (textInputLayout.getError() != null && rangeDateSelector.alpha.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            tVar.alpha();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else if (!TextUtils.isEmpty(textInputLayout2.getError())) {
            textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean d() {
        Long l10 = this.purple;
        if (l10 != null && this.red != null && l10.longValue() <= this.red.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        Long l10 = this.purple;
        if (l10 != null) {
            arrayList.add(l10);
        }
        Long l11 = this.red;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int magenta() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object p() {
        return new C2483b(this.purple, this.red);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String peach(Context context) {
        String str;
        String str2;
        Resources resources = context.getResources();
        C2483b bravo = AbstractC1996c.bravo(this.purple, this.red);
        Object obj = bravo.alpha;
        if (obj == null) {
            str = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            str = (String) obj;
        }
        Object obj2 = bravo.bravo;
        if (obj2 == null) {
            str2 = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            str2 = (String) obj2;
        }
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, str, str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String quebec(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.purple;
        if (l10 == null && this.red == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.red;
        if (l11 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, AbstractC1996c.charlie(l10.longValue()));
        }
        if (l10 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, AbstractC1996c.charlie(l11.longValue()));
        }
        C2483b bravo = AbstractC1996c.bravo(l10, l11);
        return resources.getString(R.string.mtrl_picker_range_header_selected, bravo.alpha, bravo.bravo);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int silver(Context context) {
        int i4;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i4 = R.attr.materialCalendarTheme;
        } else {
            i4 = R.attr.materialCalendarFullscreenTheme;
        }
        return AbstractC2710m0.delta(context, i4, v.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void u(C2483b c2483b) {
        Long valueOf;
        boolean z2;
        Object obj = c2483b.alpha;
        Object obj2 = c2483b.bravo;
        if (obj != null && obj2 != null) {
            if (((Long) obj).longValue() <= ((Long) obj2).longValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            T7.charlie(z2);
        }
        Long l10 = null;
        Object obj3 = c2483b.alpha;
        if (obj3 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(ai.alpha(((Long) obj3).longValue()));
        }
        this.purple = valueOf;
        if (obj2 != null) {
            l10 = Long.valueOf(ai.alpha(((Long) obj2).longValue()));
        }
        this.red = l10;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList uniform() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2483b(this.purple, this.red));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (r3.equals("samsung") != false) goto L15;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, t tVar) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer echo = AbstractC2815x7.echo(R.attr.colorOnSurfaceVariant, inflate.getContext());
        if (echo != null) {
            editText.setHintTextColor(echo.intValue());
            editText2.setHintTextColor(echo.intValue());
        }
        String str2 = Build.MANUFACTURER;
        String str3 = "";
        if (str2 == null) {
            str = "";
        } else {
            str = str2.toLowerCase(Locale.ENGLISH);
        }
        if (!str.equals("lge")) {
            if (str2 != null) {
                str3 = str2.toLowerCase(Locale.ENGLISH);
            }
        }
        editText.setInputType(17);
        editText2.setInputType(17);
        this.alpha = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat echo2 = ai.echo();
        Long l10 = this.purple;
        if (l10 != null) {
            editText.setText(echo2.format(l10));
            this.silver = this.purple;
        }
        Long l11 = this.red;
        if (l11 != null) {
            editText2.setText(echo2.format(l11));
            this.teal = this.red;
        }
        String foxtrot = ai.foxtrot(inflate.getResources(), echo2);
        textInputLayout.setPlaceholderText(foxtrot);
        textInputLayout2.setPlaceholderText(foxtrot);
        editText.addTextChangedListener(new ad(this, foxtrot, echo2, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, tVar, 0));
        editText2.addTextChangedListener(new ad(this, foxtrot, echo2, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, tVar, 1));
        AccessibilityManager accessibilityManager = (AccessibilityManager) inflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return inflate;
        }
        j.victor(editText, editText2);
        return inflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeValue(this.purple);
        parcel.writeValue(this.red);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void x(long j5) {
        Long l10 = this.purple;
        if (l10 == null) {
            this.purple = Long.valueOf(j5);
        } else if (this.red == null && l10.longValue() <= j5) {
            this.red = Long.valueOf(j5);
        } else {
            this.red = null;
            this.purple = Long.valueOf(j5);
        }
    }
}
