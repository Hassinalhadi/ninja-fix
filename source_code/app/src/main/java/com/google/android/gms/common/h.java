package com.google.android.gms.common;

import com.google.android.gms.tasks.Task;
import s6.V4;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements G6.g {
    public static final /* synthetic */ h purple = new h(0);
    public static final /* synthetic */ h red = new h(1);
    public final /* synthetic */ int alpha;

    public /* synthetic */ h(int i4) {
        this.alpha = i4;
    }

    @Override // G6.g
    public final Task then(Object obj) {
        int i4 = this.alpha;
        int i5 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        switch (i4) {
            case 0:
                return V4.echo(null);
            default:
                return V4.echo(null);
        }
    }
}
