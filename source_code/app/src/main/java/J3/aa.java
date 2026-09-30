package J3;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes3.dex */
public final class aa implements r {
    public final /* synthetic */ int alpha;
    public final r bravo;

    public /* synthetic */ aa(r rVar, int i4) {
        this.alpha = i4;
        this.bravo = rVar;
    }

    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, E3.i iVar) {
        Uri uri;
        switch (this.alpha) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null) {
                    return null;
                }
                r rVar = this.bravo;
                if (!rVar.bravo(uri)) {
                    return null;
                }
                return rVar.alpha(uri, i4, i5, iVar);
            default:
                return this.bravo.alpha(new h((URL) obj), i4, i5, iVar);
        }
    }

    @Override // J3.r
    public final /* bridge */ /* synthetic */ boolean bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
