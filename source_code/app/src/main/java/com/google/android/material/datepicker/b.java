package com.google.android.material.datepicker;

import android.os.Bundle;
import com.google.android.material.datepicker.CalendarConstraints;

/* loaded from: classes2.dex */
public final class b {
    public static final long foxtrot = ai.alpha(Month.delta(1900, 0).white);
    public static final long golf = ai.alpha(Month.delta(2100, 11).white);
    public Long charlie;
    public int delta;
    public long alpha = foxtrot;
    public long bravo = golf;
    public CalendarConstraints.DateValidator echo = new DateValidatorPointForward(Long.MIN_VALUE);

    public final CalendarConstraints alpha() {
        Month echo;
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.echo);
        Month echo2 = Month.echo(this.alpha);
        Month echo3 = Month.echo(this.bravo);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = this.charlie;
        if (l10 == null) {
            echo = null;
        } else {
            echo = Month.echo(l10.longValue());
        }
        return new CalendarConstraints(echo2, echo3, dateValidator, echo, this.delta);
    }
}
