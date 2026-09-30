package com.google.maps.android.data;

import android.util.Log;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* loaded from: classes2.dex */
public abstract class Style extends Observable {
    private static final String LOG_TAG = "Style";
    protected MarkerOptions mMarkerOptions = new MarkerOptions();
    protected PolygonOptions mPolygonOptions;
    protected PolylineOptions mPolylineOptions;

    public Style() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.mPolylineOptions = polylineOptions;
        polylineOptions.yellow = true;
        PolygonOptions polygonOptions = new PolygonOptions();
        this.mPolygonOptions = polygonOptions;
        polygonOptions.f7489b = true;
    }

    public float getRotation() {
        return this.mMarkerOptions.f7479c;
    }

    public void setLineStringWidth(float f5) {
        this.mPolylineOptions.purple = f5;
    }

    public void setMarkerHotSpot(float f5, float f10, String str, String str2) {
        if (!str.equals("fraction")) {
            Log.w(LOG_TAG, "Hotspot xUnits other than \"fraction\" are not supported.");
            f5 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            Log.w(LOG_TAG, "Hotspot yUnits other than \"fraction\" are not supported.");
            f10 = 1.0f;
        }
        this.mMarkerOptions.E(f5, f10);
    }

    public void setMarkerRotation(float f5) {
        this.mMarkerOptions.K(f5);
    }

    public void setPolygonFillColor(int i4) {
        this.mPolygonOptions.teal = i4;
    }

    public void setPolygonStrokeWidth(float f5) {
        this.mPolygonOptions.red = f5;
    }
}
