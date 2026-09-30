package V5;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class q implements DialogInterface.OnClickListener {
    public abstract void alpha();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            try {
                alpha();
            } catch (ActivityNotFoundException e) {
                String str = "Failed to start resolution intent.";
                if (true == Build.FINGERPRINT.contains("generic")) {
                    str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
                }
                Log.e("DialogRedirect", str, e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
