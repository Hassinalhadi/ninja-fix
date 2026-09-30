package V5;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaj;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ad {
    public static final Uri delta = new Uri.Builder().scheme(Constants.KEY_CONTENT).authority("com.google.android.gms.chimera").build();
    public final String alpha;
    public final String bravo;
    public final boolean charlie;

    public ad(String str, boolean z2) {
        x.echo(str);
        this.alpha = str;
        x.echo("com.google.android.gms");
        this.bravo = "com.google.android.gms";
        this.charlie = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent alpha(Context context) {
        Bundle bundle;
        PendingIntent pendingIntent;
        ContentProviderClient acquireUnstableContentProviderClient;
        Intent intent = null;
        String str = this.alpha;
        if (str != null) {
            if (this.charlie) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(delta);
                } catch (RemoteException e) {
                    e = e;
                    bundle = null;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    bundle = null;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                }
                if (acquireUnstableContentProviderClient != null) {
                    try {
                        bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                        try {
                        } catch (RemoteException e5) {
                            e = e5;
                            Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                            if (bundle == null) {
                            }
                            if (intent == null) {
                            }
                            if (intent == null) {
                            }
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                            if (bundle == null) {
                            }
                            if (intent == null) {
                            }
                            if (intent == null) {
                            }
                        }
                        if (bundle == null && (intent = (Intent) bundle.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                            Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                            throw new zzaj(new ConnectionResult(25, pendingIntent));
                        }
                        if (intent == null) {
                            Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                        }
                    } finally {
                        acquireUnstableContentProviderClient.release();
                    }
                } else {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.bravo);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        if (x.lima(this.alpha, adVar.alpha) && x.lima(this.bravo, adVar.bravo) && x.lima(null, null) && this.charlie == adVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, this.bravo, null, 4225, Boolean.valueOf(this.charlie)});
    }

    public final String toString() {
        String str = this.alpha;
        if (str != null) {
            return str;
        }
        x.hotel(null);
        throw null;
    }
}
