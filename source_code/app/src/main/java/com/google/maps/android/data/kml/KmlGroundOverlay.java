package com.google.maps.android.data.kml;

import V5.x;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class KmlGroundOverlay {
    private final GroundOverlayOptions mGroundOverlayOptions;
    private String mImageUrl;
    private LatLngBounds mLatLngBox;
    private final Map<String, String> mProperties;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.maps.model.GroundOverlayOptions, java.lang.Object] */
    public KmlGroundOverlay(String str, LatLngBounds latLngBounds, float f5, int i4, HashMap<String, String> hashMap, float f10) {
        boolean z2;
        ?? obj = new Object();
        obj.f7473a = true;
        obj.f7474b = 0.0f;
        obj.f7475c = 0.5f;
        obj.f7476d = 0.5f;
        obj.e = false;
        this.mGroundOverlayOptions = obj;
        this.mImageUrl = str;
        this.mProperties = hashMap;
        if (latLngBounds != null) {
            this.mLatLngBox = latLngBounds;
            LatLng latLng = obj.purple;
            String valueOf = String.valueOf(latLng);
            if (latLng == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            x.juliet("Position has already been set using position: ".concat(valueOf), z2);
            obj.teal = latLngBounds;
            obj.white = ((f10 % 360.0f) + 360.0f) % 360.0f;
            obj.yellow = f5;
            obj.f7473a = i4 != 0;
            return;
        }
        throw new IllegalArgumentException("No LatLonBox given");
    }

    public GroundOverlayOptions getGroundOverlayOptions() {
        return this.mGroundOverlayOptions;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public LatLngBounds getLatLngBox() {
        return this.mLatLngBox;
    }

    public Iterable<String> getProperties() {
        return this.mProperties.keySet();
    }

    public String getProperty(String str) {
        return this.mProperties.get(str);
    }

    public boolean hasProperty(String str) {
        if (this.mProperties.get(str) != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "GroundOverlay{\n properties=" + this.mProperties + ",\n image url=" + this.mImageUrl + ",\n LatLngBox=" + this.mLatLngBox + "\n}\n";
    }
}
