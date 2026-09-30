package B7;

import V5.x;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import delivery.samurai.android.R;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final String foxtrot;
    public final String golf;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        boolean z2;
        int i4 = e6.d.alpha;
        if (str != null && !str.trim().isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        x.juliet("ApplicationId must be set.", true ^ z2);
        this.bravo = str;
        this.alpha = str2;
        this.charlie = str3;
        this.delta = str4;
        this.echo = str5;
        this.foxtrot = str6;
        this.golf = str7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J2.l, java.lang.Object] */
    public static i alpha(Context context) {
        ?? obj = new Object();
        x.hotel(context);
        Resources resources = context.getResources();
        obj.alpha = resources;
        obj.purple = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String juliet = obj.juliet("google_app_id");
        if (TextUtils.isEmpty(juliet)) {
            return null;
        }
        return new i(juliet, obj.juliet("google_api_key"), obj.juliet("firebase_database_url"), obj.juliet("ga_trackingId"), obj.juliet("gcm_defaultSenderId"), obj.juliet("google_storage_bucket"), obj.juliet("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!x.lima(this.bravo, iVar.bravo) || !x.lima(this.alpha, iVar.alpha) || !x.lima(this.charlie, iVar.charlie) || !x.lima(this.delta, iVar.delta) || !x.lima(this.echo, iVar.echo) || !x.lima(this.foxtrot, iVar.foxtrot) || !x.lima(this.golf, iVar.golf)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.bravo, this.alpha, this.charlie, this.delta, this.echo, this.foxtrot, this.golf});
    }

    public final String toString() {
        J2.e eVar = new J2.e(this);
        eVar.y(this.bravo, "applicationId");
        eVar.y(this.alpha, "apiKey");
        eVar.y(this.charlie, "databaseUrl");
        eVar.y(this.echo, "gcmSenderId");
        eVar.y(this.foxtrot, "storageBucket");
        eVar.y(this.golf, "projectId");
        return eVar.toString();
    }
}
