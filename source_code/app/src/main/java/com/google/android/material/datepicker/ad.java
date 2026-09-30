package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public final class ad extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f7980c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f7981d;
    public final /* synthetic */ t e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RangeDateSelector f7982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, t tVar, int i4) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f7979b = i4;
        this.f7982f = rangeDateSelector;
        this.f7980c = textInputLayout2;
        this.f7981d = textInputLayout3;
        this.e = tVar;
    }

    @Override // com.google.android.material.datepicker.i
    public final void alpha() {
        switch (this.f7979b) {
            case 0:
                RangeDateSelector rangeDateSelector = this.f7982f;
                rangeDateSelector.silver = null;
                RangeDateSelector.charlie(rangeDateSelector, this.f7980c, this.f7981d, this.e);
                return;
            default:
                RangeDateSelector rangeDateSelector2 = this.f7982f;
                rangeDateSelector2.teal = null;
                RangeDateSelector.charlie(rangeDateSelector2, this.f7980c, this.f7981d, this.e);
                return;
        }
    }

    @Override // com.google.android.material.datepicker.i
    public final void bravo(Long l10) {
        switch (this.f7979b) {
            case 0:
                RangeDateSelector rangeDateSelector = this.f7982f;
                rangeDateSelector.silver = l10;
                RangeDateSelector.charlie(rangeDateSelector, this.f7980c, this.f7981d, this.e);
                return;
            default:
                RangeDateSelector rangeDateSelector2 = this.f7982f;
                rangeDateSelector2.teal = l10;
                RangeDateSelector.charlie(rangeDateSelector2, this.f7980c, this.f7981d, this.e);
                return;
        }
    }
}
