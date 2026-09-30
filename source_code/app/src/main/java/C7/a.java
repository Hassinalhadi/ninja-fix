package C7;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a {
    public static final String[] golf = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat hotel = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final Date delta;
    public final long echo;
    public final long foxtrot;

    public a(String str, String str2, String str3, Date date, long j5, long j6) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        this.delta = date;
        this.echo = j5;
        this.foxtrot = j6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F7.a, java.lang.Object] */
    public final F7.a alpha() {
        ?? obj = new Object();
        obj.alpha = "frc";
        obj.mike = this.delta.getTime();
        obj.bravo = this.alpha;
        obj.charlie = this.bravo;
        String str = this.charlie;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.delta = str;
        obj.echo = this.echo;
        obj.juliet = this.foxtrot;
        return obj;
    }
}
