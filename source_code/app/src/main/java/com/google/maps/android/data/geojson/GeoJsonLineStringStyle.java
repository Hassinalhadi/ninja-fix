package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class GeoJsonLineStringStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"LineString", "MultiLineString", "GeometryCollection"};

    public GeoJsonLineStringStyle() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.mPolylineOptions = polylineOptions;
        polylineOptions.yellow = true;
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public int getColor() {
        return this.mPolylineOptions.red;
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public List<PatternItem> getPattern() {
        return this.mPolylineOptions.f7495d;
    }

    public float getWidth() {
        return this.mPolylineOptions.purple;
    }

    public float getZIndex() {
        return this.mPolylineOptions.silver;
    }

    public boolean isClickable() {
        return this.mPolylineOptions.yellow;
    }

    public boolean isGeodesic() {
        return this.mPolylineOptions.white;
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolylineOptions.teal;
    }

    public void setClickable(boolean z2) {
        this.mPolylineOptions.yellow = z2;
        styleChanged();
    }

    public void setColor(int i4) {
        this.mPolylineOptions.red = i4;
        styleChanged();
    }

    public void setGeodesic(boolean z2) {
        this.mPolylineOptions.white = z2;
        styleChanged();
    }

    public void setPattern(List<PatternItem> list) {
        this.mPolylineOptions.f7495d = list;
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z2) {
        this.mPolylineOptions.teal = z2;
        styleChanged();
    }

    public void setWidth(float f5) {
        setLineStringWidth(f5);
        styleChanged();
    }

    public void setZIndex(float f5) {
        this.mPolylineOptions.silver = f5;
        styleChanged();
    }

    public PolylineOptions toPolylineOptions() {
        PolylineOptions polylineOptions = new PolylineOptions();
        PolylineOptions polylineOptions2 = this.mPolylineOptions;
        polylineOptions.red = polylineOptions2.red;
        polylineOptions.yellow = polylineOptions2.yellow;
        polylineOptions.white = polylineOptions2.white;
        polylineOptions.teal = polylineOptions2.teal;
        polylineOptions.purple = polylineOptions2.purple;
        polylineOptions.silver = polylineOptions2.silver;
        polylineOptions.f7495d = getPattern();
        return polylineOptions;
    }

    public String toString() {
        return "LineStringStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n color=" + getColor() + ",\n clickable=" + isClickable() + ",\n geodesic=" + isGeodesic() + ",\n visible=" + isVisible() + ",\n width=" + getWidth() + ",\n z index=" + getZIndex() + ",\n pattern=" + getPattern() + "\n}\n";
    }
}
