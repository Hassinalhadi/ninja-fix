package com.google.android.gms.common;

import androidx.appcompat.widget.P0;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes2.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i4) {
        super(i4, P0.azure(d.GOOGLE_PLAY_SERVICES_VERSION_CODE, i4, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    }
}
