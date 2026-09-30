package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.data.Style;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class GeoJsonPolygonStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};

    public GeoJsonPolygonStyle() {
        PolygonOptions polygonOptions = new PolygonOptions();
        this.mPolygonOptions = polygonOptions;
        polygonOptions.f7489b = true;
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public int getFillColor() {
        return this.mPolygonOptions.teal;
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getStrokeColor() {
        return this.mPolygonOptions.silver;
    }

    public int getStrokeJointType() {
        return this.mPolygonOptions.f7490c;
    }

    public List<PatternItem> getStrokePattern() {
        return this.mPolygonOptions.f7491d;
    }

    public float getStrokeWidth() {
        return this.mPolygonOptions.red;
    }

    public float getZIndex() {
        return this.mPolygonOptions.white;
    }

    public boolean isClickable() {
        return this.mPolygonOptions.f7489b;
    }

    public boolean isGeodesic() {
        return this.mPolygonOptions.f7488a;
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolygonOptions.yellow;
    }

    public void setClickable(boolean z2) {
        this.mPolygonOptions.f7489b = z2;
        styleChanged();
    }

    public void setFillColor(int i4) {
        setPolygonFillColor(i4);
        styleChanged();
    }

    public void setGeodesic(boolean z2) {
        this.mPolygonOptions.f7488a = z2;
        styleChanged();
    }

    public void setStrokeColor(int i4) {
        this.mPolygonOptions.silver = i4;
        styleChanged();
    }

    public void setStrokeJointType(int i4) {
        this.mPolygonOptions.f7490c = i4;
        styleChanged();
    }

    public void setStrokePattern(List<PatternItem> list) {
        this.mPolygonOptions.f7491d = list;
        styleChanged();
    }

    public void setStrokeWidth(float f5) {
        setPolygonStrokeWidth(f5);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z2) {
        this.mPolygonOptions.yellow = z2;
        styleChanged();
    }

    public void setZIndex(float f5) {
        this.mPolygonOptions.white = f5;
        styleChanged();
    }

    public PolygonOptions toPolygonOptions() {
        PolygonOptions polygonOptions = new PolygonOptions();
        PolygonOptions polygonOptions2 = this.mPolygonOptions;
        polygonOptions.teal = polygonOptions2.teal;
        polygonOptions.f7488a = polygonOptions2.f7488a;
        polygonOptions.silver = polygonOptions2.silver;
        polygonOptions.f7490c = polygonOptions2.f7490c;
        polygonOptions.f7491d = polygonOptions2.f7491d;
        polygonOptions.red = polygonOptions2.red;
        polygonOptions.yellow = polygonOptions2.yellow;
        polygonOptions.white = polygonOptions2.white;
        polygonOptions.f7489b = polygonOptions2.f7489b;
        return polygonOptions;
    }

    public String toString() {
        return "PolygonStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n fill color=" + getFillColor() + ",\n geodesic=" + isGeodesic() + ",\n stroke color=" + getStrokeColor() + ",\n stroke joint type=" + getStrokeJointType() + ",\n stroke pattern=" + getStrokePattern() + ",\n stroke width=" + getStrokeWidth() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + ",\n clickable=" + isClickable() + "\n}\n";
    }
}
