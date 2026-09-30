package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public final void charlie(int i4, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a.class.getClassLoader());
        }
        if (i4 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    if (parcelableArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Parcelable parcelable : parcelableArray) {
                            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
                        }
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
