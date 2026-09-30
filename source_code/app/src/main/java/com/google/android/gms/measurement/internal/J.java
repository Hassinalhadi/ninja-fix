package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ zzr purple;
    public final /* synthetic */ O red;

    public /* synthetic */ J(O o5, zzr zzrVar, int i4) {
        this.alpha = i4;
        this.red = o5;
        this.purple = zzrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                Z0 z02 = this.red.golf;
                z02.echo();
                z02.ivory(this.purple);
                return;
            default:
                O o5 = this.red;
                o5.golf.echo();
                Z0 z03 = o5.golf;
                if (z03.f7554r != null) {
                    ArrayList arrayList = new ArrayList();
                    z03.f7555s = arrayList;
                    arrayList.addAll(z03.f7554r);
                }
                C1450j c1450j = z03.red;
                Z0.cyan(c1450j);
                G g2 = (G) c1450j.alpha;
                zzr zzrVar = this.purple;
                String str = zzrVar.alpha;
                V5.x.hotel(str);
                V5.x.echo(str);
                c1450j.W();
                c1450j.X();
                try {
                    SQLiteDatabase S02 = c1450j.S0();
                    String[] strArr = {str};
                    int delete = S02.delete("apps", "app_id=?", strArr) + S02.delete("events", "app_id=?", strArr) + S02.delete("events_snapshot", "app_id=?", strArr) + S02.delete("user_attributes", "app_id=?", strArr) + S02.delete("conditional_properties", "app_id=?", strArr) + S02.delete("raw_events", "app_id=?", strArr) + S02.delete("raw_events_metadata", "app_id=?", strArr) + S02.delete("queue", "app_id=?", strArr) + S02.delete("audience_filter_values", "app_id=?", strArr) + S02.delete("main_event_params", "app_id=?", strArr) + S02.delete("default_event_params", "app_id=?", strArr) + S02.delete("trigger_uris", "app_id=?", strArr) + S02.delete("upload_queue", "app_id=?", strArr);
                    if (delete > 0) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.f7636g.charlie(str, Integer.valueOf(delete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(ar.e0(str), e, "Error resetting analytics data. appId, error");
                }
                if (zzrVar.f7697a) {
                    z03.gold(zzrVar);
                    return;
                }
                return;
        }
    }
}
