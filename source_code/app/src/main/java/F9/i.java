package F9;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* loaded from: classes2.dex */
public final class i implements E9.c {
    public final File alpha(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        if (externalFilesDir != null) {
            if ((!externalFilesDir.exists() && !externalFilesDir.mkdirs()) || !externalFilesDir.canWrite()) {
                return null;
            }
            return externalFilesDir;
        }
        return null;
    }
}
