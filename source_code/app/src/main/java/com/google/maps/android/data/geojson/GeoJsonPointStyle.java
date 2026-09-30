package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;
import z6.b;

/* loaded from: classes2.dex */
public class GeoJsonPointStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"Point", "MultiPoint", "GeometryCollection"};

    public GeoJsonPointStyle() {
        this.mMarkerOptions = new MarkerOptions();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public float getAlpha() {
        return this.mMarkerOptions.f7481f;
    }

    public float getAnchorU() {
        return this.mMarkerOptions.teal;
    }

    public float getAnchorV() {
        return this.mMarkerOptions.white;
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public b getIcon() {
        return this.mMarkerOptions.silver;
    }

    public float getInfoWindowAnchorU() {
        return this.mMarkerOptions.f7480d;
    }

    public float getInfoWindowAnchorV() {
        return this.mMarkerOptions.e;
    }

    @Override // com.google.maps.android.data.Style
    public float getRotation() {
        return this.mMarkerOptions.f7479c;
    }

    public String getSnippet() {
        return this.mMarkerOptions.red;
    }

    public String getTitle() {
        return this.mMarkerOptions.purple;
    }

    public float getZIndex() {
        return this.mMarkerOptions.f7482g;
    }

    public boolean isDraggable() {
        return this.mMarkerOptions.yellow;
    }

    public boolean isFlat() {
        return this.mMarkerOptions.f7478b;
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mMarkerOptions.f7477a;
    }

    public void setAlpha(float f5) {
        this.mMarkerOptions.o(f5);
        styleChanged();
    }

    public void setAnchor(float f5, float f10) {
        setMarkerHotSpot(f5, f10, "fraction", "fraction");
        styleChanged();
    }

    public void setDraggable(boolean z2) {
        this.mMarkerOptions.F(z2);
        styleChanged();
    }

    public void setFlat(boolean z2) {
        this.mMarkerOptions.G(z2);
        styleChanged();
    }

    public void setIcon(b bVar) {
        this.mMarkerOptions.H(bVar);
        styleChanged();
    }

    public void setInfoWindowAnchor(float f5, float f10) {
        this.mMarkerOptions.I(f5, f10);
        styleChanged();
    }

    public void setRotation(float f5) {
        setMarkerRotation(f5);
        styleChanged();
    }

    public void setSnippet(String str) {
        this.mMarkerOptions.L(str);
        styleChanged();
    }

    public void setTitle(String str) {
        this.mMarkerOptions.M(str);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z2) {
        this.mMarkerOptions.N(z2);
        styleChanged();
    }

    public void setZIndex(float f5) {
        this.mMarkerOptions.O(f5);
        styleChanged();
    }

    public MarkerOptions toMarkerOptions() {
        MarkerOptions markerOptions = new MarkerOptions();
        MarkerOptions markerOptions2 = this.mMarkerOptions;
        markerOptions.f7481f = markerOptions2.f7481f;
        float f5 = markerOptions2.teal;
        float f10 = markerOptions2.white;
        markerOptions.teal = f5;
        markerOptions.white = f10;
        markerOptions.yellow = markerOptions2.yellow;
        markerOptions.f7478b = markerOptions2.f7478b;
        markerOptions.silver = markerOptions2.silver;
        float f11 = markerOptions2.f7480d;
        float f12 = markerOptions2.e;
        markerOptions.f7480d = f11;
        markerOptions.e = f12;
        markerOptions.f7479c = markerOptions2.f7479c;
        markerOptions.red = markerOptions2.red;
        markerOptions.purple = markerOptions2.purple;
        markerOptions.f7477a = markerOptions2.f7477a;
        markerOptions.f7482g = markerOptions2.f7482g;
        return markerOptions;
    }

    public String toString() {
        return "PointStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n alpha=" + getAlpha() + ",\n anchor U=" + getAnchorU() + ",\n anchor V=" + getAnchorV() + ",\n draggable=" + isDraggable() + ",\n flat=" + isFlat() + ",\n info window anchor U=" + getInfoWindowAnchorU() + ",\n info window anchor V=" + getInfoWindowAnchorV() + ",\n rotation=" + getRotation() + ",\n snippet=" + getSnippet() + ",\n title=" + getTitle() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + "\n}\n";
    }
}
