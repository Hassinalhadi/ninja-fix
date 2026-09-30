package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import androidx.lifecycle.RunnableC0643m;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import k0.AbstractC1996c;

/* loaded from: classes2.dex */
public abstract class i extends com.google.android.material.internal.y {

    /* renamed from: a, reason: collision with root package name */
    public int f7986a = 0;
    public final TextInputLayout alpha;
    public final String purple;
    public final SimpleDateFormat red;
    public final CalendarConstraints silver;
    public final String teal;
    public final RunnableC0643m white;
    public h yellow;

    public i(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.purple = str;
        this.red = simpleDateFormat;
        this.alpha = textInputLayout;
        this.silver = calendarConstraints;
        this.teal = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.white = new RunnableC0643m(15, this, str);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0) {
            int length = editable.length();
            String str = this.purple;
            if (length < str.length() && editable.length() >= this.f7986a) {
                char charAt = str.charAt(editable.length());
                if (!Character.isLetterOrDigit(charAt)) {
                    editable.append(charAt);
                }
            }
        }
    }

    public abstract void alpha();

    @Override // com.google.android.material.internal.y, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        this.f7986a = charSequence.length();
    }

    public abstract void bravo(Long l10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.material.datepicker.h, java.lang.Runnable] */
    @Override // com.google.android.material.internal.y, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        CalendarConstraints calendarConstraints = this.silver;
        TextInputLayout textInputLayout = this.alpha;
        RunnableC0643m runnableC0643m = this.white;
        textInputLayout.removeCallbacks(runnableC0643m);
        textInputLayout.removeCallbacks(this.yellow);
        textInputLayout.setError(null);
        bravo(null);
        if (!TextUtils.isEmpty(charSequence) && charSequence.length() >= this.purple.length()) {
            try {
                Date parse = this.red.parse(charSequence.toString());
                textInputLayout.setError(null);
                final long time = parse.getTime();
                if (calendarConstraints.red.white(time)) {
                    Calendar delta = ai.delta(calendarConstraints.alpha.alpha);
                    delta.set(5, 1);
                    if (delta.getTimeInMillis() <= time) {
                        Month month = calendarConstraints.purple;
                        int i11 = month.teal;
                        Calendar delta2 = ai.delta(month.alpha);
                        delta2.set(5, i11);
                        if (time <= delta2.getTimeInMillis()) {
                            bravo(Long.valueOf(parse.getTime()));
                            return;
                        }
                    }
                }
                ?? r72 = new Runnable() { // from class: com.google.android.material.datepicker.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i iVar = i.this;
                        iVar.alpha.setError(String.format(iVar.teal, AbstractC1996c.charlie(time).replace(' ', (char) 160)));
                        iVar.alpha();
                    }
                };
                this.yellow = r72;
                textInputLayout.post(r72);
            } catch (ParseException unused) {
                textInputLayout.post(runnableC0643m);
            }
        }
    }
}
