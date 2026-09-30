package com.google.maps.android.data.kml;

import android.graphics.Color;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import t6.T3;

/* loaded from: classes2.dex */
public class KmlStyle extends Style {
    private static final int HSV_VALUES = 3;
    private static final int HUE_VALUE = 0;
    private static final int INITIAL_SCALE = 1;
    private String mIconUrl;
    private boolean mFill = true;
    private boolean mOutline = true;
    private String mStyleId = null;
    private final HashMap<String, String> mBalloonOptions = new HashMap<>();
    private final HashSet<String> mStylesSet = new HashSet<>();
    private double mScale = 1.0d;
    float mMarkerColor = 0.0f;
    private boolean mIconRandomColorMode = false;
    private boolean mLineRandomColorMode = false;
    private boolean mPolyRandomColorMode = false;

    public static int computeRandomColor(int i4) {
        Random random = new Random();
        int red = Color.red(i4);
        int green = Color.green(i4);
        int blue = Color.blue(i4);
        if (red != 0) {
            red = random.nextInt(red);
        }
        if (blue != 0) {
            blue = random.nextInt(blue);
        }
        if (green != 0) {
            green = random.nextInt(green);
        }
        return Color.rgb(red, green, blue);
    }

    private static String convertColor(String str) {
        String trim = str.trim();
        if (trim.length() > 6) {
            return trim.substring(0, 2) + trim.substring(6, 8) + trim.substring(4, 6) + trim.substring(2, 4);
        }
        return trim.substring(4, 6) + trim.substring(2, 4) + trim.substring(0, 2);
    }

    private static MarkerOptions createMarkerOptions(MarkerOptions markerOptions, boolean z2, float f5) {
        MarkerOptions markerOptions2 = new MarkerOptions();
        markerOptions2.f7479c = markerOptions.f7479c;
        float f10 = markerOptions.teal;
        float f11 = markerOptions.white;
        markerOptions2.teal = f10;
        markerOptions2.white = f11;
        if (z2) {
            markerOptions.H(T3.bravo(getHueValue(computeRandomColor((int) f5))));
        }
        markerOptions2.silver = markerOptions.silver;
        return markerOptions2;
    }

    private static PolygonOptions createPolygonOptions(PolygonOptions polygonOptions, boolean z2, boolean z10) {
        float f5;
        PolygonOptions polygonOptions2 = new PolygonOptions();
        if (z2) {
            polygonOptions2.teal = polygonOptions.teal;
        }
        if (z10) {
            polygonOptions2.silver = polygonOptions.silver;
            f5 = polygonOptions.red;
        } else {
            f5 = 0.0f;
        }
        polygonOptions2.red = f5;
        polygonOptions2.f7489b = polygonOptions.f7489b;
        return polygonOptions2;
    }

    private static PolylineOptions createPolylineOptions(PolylineOptions polylineOptions) {
        PolylineOptions polylineOptions2 = new PolylineOptions();
        polylineOptions2.red = polylineOptions.red;
        polylineOptions2.purple = polylineOptions.purple;
        polylineOptions2.yellow = polylineOptions.yellow;
        return polylineOptions2;
    }

    private static float getHueValue(int i4) {
        float[] fArr = new float[3];
        Color.colorToHSV(i4, fArr);
        return fArr[0];
    }

    public HashMap<String, String> getBalloonOptions() {
        return this.mBalloonOptions;
    }

    public double getIconScale() {
        return this.mScale;
    }

    public String getIconUrl() {
        return this.mIconUrl;
    }

    public MarkerOptions getMarkerOptions() {
        return createMarkerOptions(this.mMarkerOptions, isIconRandomColorMode(), this.mMarkerColor);
    }

    public PolygonOptions getPolygonOptions() {
        return createPolygonOptions(this.mPolygonOptions, this.mFill, this.mOutline);
    }

    public PolylineOptions getPolylineOptions() {
        return createPolylineOptions(this.mPolylineOptions);
    }

    public String getStyleId() {
        return this.mStyleId;
    }

    public boolean hasBalloonStyle() {
        if (this.mBalloonOptions.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasFill() {
        return this.mFill;
    }

    public boolean hasOutline() {
        return this.mOutline;
    }

    public boolean isIconRandomColorMode() {
        return this.mIconRandomColorMode;
    }

    public boolean isLineRandomColorMode() {
        return this.mLineRandomColorMode;
    }

    public boolean isPolyRandomColorMode() {
        return this.mPolyRandomColorMode;
    }

    public boolean isStyleSet(String str) {
        return this.mStylesSet.contains(str);
    }

    public void setFill(boolean z2) {
        this.mFill = z2;
    }

    public void setFillColor(String str) {
        setPolygonFillColor(Color.parseColor("#" + convertColor(str)));
        this.mStylesSet.add("fillColor");
    }

    public void setHeading(float f5) {
        setMarkerRotation(f5);
        this.mStylesSet.add("heading");
    }

    public void setHotSpot(float f5, float f10, String str, String str2) {
        setMarkerHotSpot(f5, f10, str, str2);
        this.mStylesSet.add("hotSpot");
    }

    public void setIconColorMode(String str) {
        this.mIconRandomColorMode = str.equals("random");
        this.mStylesSet.add("iconColorMode");
    }

    public void setIconScale(double d4) {
        this.mScale = d4;
        this.mStylesSet.add("iconScale");
    }

    public void setIconUrl(String str) {
        this.mIconUrl = str;
        this.mStylesSet.add("iconUrl");
    }

    public void setInfoWindowText(String str) {
        this.mBalloonOptions.put(Constants.KEY_TEXT, str);
    }

    public void setLineColorMode(String str) {
        this.mLineRandomColorMode = str.equals("random");
        this.mStylesSet.add("lineColorMode");
    }

    public void setMarkerColor(String str) {
        float hueValue = getHueValue(Color.parseColor("#" + convertColor(str)));
        this.mMarkerColor = hueValue;
        this.mMarkerOptions.H(T3.bravo(hueValue));
        this.mStylesSet.add("markerColor");
    }

    public void setOutline(boolean z2) {
        this.mOutline = z2;
        this.mStylesSet.add("outline");
    }

    public void setOutlineColor(String str) {
        this.mPolylineOptions.red = Color.parseColor("#" + convertColor(str));
        this.mPolygonOptions.silver = Color.parseColor("#" + convertColor(str));
        this.mStylesSet.add("outlineColor");
    }

    public void setPolyColorMode(String str) {
        this.mPolyRandomColorMode = str.equals("random");
        this.mStylesSet.add("polyColorMode");
    }

    public void setStyleId(String str) {
        this.mStyleId = str;
    }

    public void setWidth(Float f5) {
        setLineStringWidth(f5.floatValue());
        setPolygonStrokeWidth(f5.floatValue());
        this.mStylesSet.add("width");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Style{\n balloon options=");
        sb2.append(this.mBalloonOptions);
        sb2.append(",\n fill=");
        sb2.append(this.mFill);
        sb2.append(",\n outline=");
        sb2.append(this.mOutline);
        sb2.append(",\n icon url=");
        sb2.append(this.mIconUrl);
        sb2.append(",\n scale=");
        sb2.append(this.mScale);
        sb2.append(",\n style id=");
        return P0.gold(sb2, this.mStyleId, "\n}\n");
    }
}
