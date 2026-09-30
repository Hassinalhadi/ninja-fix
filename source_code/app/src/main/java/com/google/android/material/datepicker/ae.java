package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public final class ae extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f7983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f7984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SingleDateSelector f7985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, t tVar, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f7985d = singleDateSelector;
        this.f7983b = tVar;
        this.f7984c = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.i
    public final void alpha() {
        this.f7984c.getError();
        this.f7985d.getClass();
        this.f7983b.alpha();
    }

    @Override // com.google.android.material.datepicker.i
    public final void bravo(Long l10) {
        SingleDateSelector singleDateSelector = this.f7985d;
        if (l10 == null) {
            singleDateSelector.alpha = null;
        } else {
            singleDateSelector.alpha = l10;
        }
        singleDateSelector.getClass();
        this.f7983b.bravo(singleDateSelector.alpha);
    }
}
