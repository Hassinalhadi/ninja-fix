package p1;

import android.net.Uri;
import com.zendesk.service.HttpConstants;

/* loaded from: classes3.dex */
public final class h {
    public final Uri alpha;
    public final int bravo;
    public final int charlie;
    public final boolean delta;
    public final String echo;
    public final int foxtrot;

    public h(Uri uri, int i4, int i5, boolean z2, int i10) {
        uri.getClass();
        this.alpha = uri;
        this.bravo = i4;
        this.charlie = i5;
        this.delta = z2;
        this.echo = null;
        this.foxtrot = i10;
    }

    public h(String str, String str2) {
        this.alpha = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.bravo = 0;
        this.charlie = HttpConstants.HTTP_BAD_REQUEST;
        this.delta = false;
        this.echo = str2;
        this.foxtrot = 0;
    }
}
