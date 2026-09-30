package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes3.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public final void charlie(int i4, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a.class.getClassLoader());
        }
        if (i4 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("media_item")) {
                    Parcelable parcelable = bundle.getParcelable("media_item");
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
