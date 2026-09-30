package O7;

import com.clevertap.android.sdk.leanplum.Constants;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements FilenameFilter {
    public final /* synthetic */ int alpha;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.alpha) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case 2:
                return str.startsWith(Constants.CHARGED_EVENT_PARAM);
            default:
                if (str.startsWith(Constants.CHARGED_EVENT_PARAM) && !str.endsWith("_")) {
                    return true;
                }
                return false;
        }
    }
}
