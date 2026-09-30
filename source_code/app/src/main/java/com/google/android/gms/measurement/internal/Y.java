package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdh;

/* loaded from: classes2.dex */
public final class Y {
    public final Context alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final Boolean echo;
    public final long foxtrot;
    public final zzdh golf;
    public final boolean hotel;
    public final Long india;
    public final String juliet;

    public Y(Context context, zzdh zzdhVar, Long l10) {
        this.hotel = true;
        V5.x.hotel(context);
        Context applicationContext = context.getApplicationContext();
        V5.x.hotel(applicationContext);
        this.alpha = applicationContext;
        this.india = l10;
        if (zzdhVar != null) {
            this.golf = zzdhVar;
            this.bravo = zzdhVar.white;
            this.charlie = zzdhVar.teal;
            this.delta = zzdhVar.silver;
            this.hotel = zzdhVar.red;
            this.foxtrot = zzdhVar.purple;
            this.juliet = zzdhVar.f6749a;
            Bundle bundle = zzdhVar.yellow;
            if (bundle != null) {
                this.echo = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
