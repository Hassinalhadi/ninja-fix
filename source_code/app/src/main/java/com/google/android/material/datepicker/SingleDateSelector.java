package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
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

/* loaded from: classes2.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new x(4);
    public Long alpha;

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean d() {
        if (this.alpha != null) {
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
        Long l10 = this.alpha;
        if (l10 != null) {
            arrayList.add(l10);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int magenta() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object p() {
        return this.alpha;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String peach(Context context) {
        String golf;
        Resources resources = context.getResources();
        Long l10 = this.alpha;
        if (l10 == null) {
            golf = resources.getString(R.string.mtrl_picker_announce_current_selection_none);
        } else {
            golf = AbstractC1996c.golf(l10.longValue(), Locale.getDefault());
        }
        return resources.getString(R.string.mtrl_picker_announce_current_selection, golf);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String quebec(Context context) {
        Resources resources = context.getResources();
        Long l10 = this.alpha;
        if (l10 == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, AbstractC1996c.golf(l10.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int silver(Context context) {
        return AbstractC2710m0.delta(context, R.attr.materialCalendarTheme, v.class.getCanonicalName()).data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.datepicker.DateSelector
    public final void u(C2483b c2483b) {
        Long valueOf;
        Long l10 = (Long) c2483b;
        if (l10 == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(ai.alpha(l10.longValue()));
        }
        this.alpha = valueOf;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList uniform() {
        return new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r2.equals("samsung") != false) goto L15;
     */
    @Override // com.google.android.material.datepicker.DateSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, t tVar) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer echo = AbstractC2815x7.echo(R.attr.colorOnSurfaceVariant, inflate.getContext());
        if (echo != null) {
            editText.setHintTextColor(echo.intValue());
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
        SimpleDateFormat echo2 = ai.echo();
        String foxtrot = ai.foxtrot(inflate.getResources(), echo2);
        textInputLayout.setPlaceholderText(foxtrot);
        Long l10 = this.alpha;
        if (l10 != null) {
            editText.setText(echo2.format(l10));
        }
        editText.addTextChangedListener(new ae(this, foxtrot, echo2, textInputLayout, calendarConstraints, tVar, textInputLayout));
        AccessibilityManager accessibilityManager = (AccessibilityManager) inflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return inflate;
        }
        j.victor(editText);
        return inflate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeValue(this.alpha);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void x(long j5) {
        this.alpha = Long.valueOf(j5);
    }
}
