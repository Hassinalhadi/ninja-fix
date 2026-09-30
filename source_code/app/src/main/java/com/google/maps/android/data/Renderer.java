package com.google.maps.android.data;

import V5.x;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.R;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import com.google.maps.android.data.geojson.BiMultiMap;
import com.google.maps.android.data.geojson.GeoJsonFeature;
import com.google.maps.android.data.geojson.GeoJsonGeometryCollection;
import com.google.maps.android.data.geojson.GeoJsonLineString;
import com.google.maps.android.data.geojson.GeoJsonLineStringStyle;
import com.google.maps.android.data.geojson.GeoJsonMultiLineString;
import com.google.maps.android.data.geojson.GeoJsonMultiPoint;
import com.google.maps.android.data.geojson.GeoJsonMultiPolygon;
import com.google.maps.android.data.geojson.GeoJsonPoint;
import com.google.maps.android.data.geojson.GeoJsonPointStyle;
import com.google.maps.android.data.geojson.GeoJsonPolygon;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;
import com.google.maps.android.data.kml.KmlContainer;
import com.google.maps.android.data.kml.KmlGroundOverlay;
import com.google.maps.android.data.kml.KmlMultiGeometry;
import com.google.maps.android.data.kml.KmlPlacemark;
import com.google.maps.android.data.kml.KmlPoint;
import com.google.maps.android.data.kml.KmlPolygon;
import com.google.maps.android.data.kml.KmlStyle;
import com.google.maps.android.data.kml.KmlUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q6.C2414d;
import q6.g;
import q6.w;
import t6.T3;
import x6.InterfaceC3296a;
import x6.k;
import z6.b;
import z6.d;
import z6.f;
import z6.h;

/* loaded from: classes2.dex */
public class Renderer {
    private static final Object FEATURE_NOT_ON_MAP = null;
    private static final int MARKER_ICON_SIZE = 32;
    private static final DecimalFormat sScaleFormat = new DecimalFormat("#.####");
    private final BiMultiMap<Feature> mContainerFeatures;
    private ArrayList<KmlContainer> mContainers;
    private Context mContext;
    private final GeoJsonLineStringStyle mDefaultLineStringStyle;
    private final GeoJsonPointStyle mDefaultPointStyle;
    private final GeoJsonPolygonStyle mDefaultPolygonStyle;
    private final BiMultiMap<Feature> mFeatures;
    private HashMap<KmlGroundOverlay, d> mGroundOverlayMap;
    private final GroundOverlayManager.Collection mGroundOverlays;
    private ImagesCache mImagesCache;
    private boolean mLayerOnMap;
    private k mMap;
    private final Set<String> mMarkerIconUrls;
    private final MarkerManager.Collection mMarkers;
    private int mNumActiveDownloads;
    private final PolygonManager.Collection mPolygons;
    private final PolylineManager.Collection mPolylines;
    private HashMap<String, String> mStyleMaps;
    private HashMap<String, KmlStyle> mStyles;
    private HashMap<String, KmlStyle> mStylesRenderer;

    /* loaded from: classes2.dex */
    public static final class ImagesCache {
        final Map<String, Map<String, b>> markerImagesCache = new HashMap();
        final Map<String, b> groundOverlayImagesCache = new HashMap();
        final Map<String, Bitmap> bitmapCache = new HashMap();
    }

    public Renderer(k kVar, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, ImagesCache imagesCache) {
        this(kVar, new HashSet(), null, null, null, new BiMultiMap(), markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.mContext = context;
        this.mStylesRenderer = new HashMap<>();
        this.mImagesCache = imagesCache == null ? new ImagesCache() : imagesCache;
    }

    private ArrayList<Object> addGeometryCollectionToMap(GeoJsonFeature geoJsonFeature, List<Geometry> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<Geometry> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(addGeoJsonFeatureToMap(geoJsonFeature, it.next()));
        }
        return arrayList;
    }

    private h addLineStringToMap(PolylineOptions polylineOptions, LineString lineString) {
        List<LatLng> geometryObject = lineString.getGeometryObject();
        polylineOptions.getClass();
        x.india(geometryObject, "points must not be null.");
        Iterator<T> it = geometryObject.iterator();
        while (it.hasNext()) {
            polylineOptions.alpha.add((LatLng) it.next());
        }
        h addPolyline = this.mPolylines.addPolyline(polylineOptions);
        boolean z2 = polylineOptions.yellow;
        addPolyline.getClass();
        try {
            g gVar = (g) addPolyline.alpha;
            Parcel ivory = gVar.ivory();
            int i4 = w.alpha;
            ivory.writeInt(z2 ? 1 : 0);
            gVar.lavender(ivory, 17);
            return addPolyline;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    private void addMarkerIcons(String str, double d4, MarkerOptions markerOptions) {
        b cachedMarkerImage = getCachedMarkerImage(str, d4);
        if (cachedMarkerImage != null) {
            markerOptions.H(cachedMarkerImage);
        } else {
            this.mMarkerIconUrls.add(str);
        }
    }

    private ArrayList<Object> addMultiGeometryToMap(KmlPlacemark kmlPlacemark, KmlMultiGeometry kmlMultiGeometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z2) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<Geometry> it = kmlMultiGeometry.getGeometryObject().iterator();
        while (it.hasNext()) {
            KmlPlacemark kmlPlacemark2 = kmlPlacemark;
            arrayList.add(addKmlPlacemarkToMap(kmlPlacemark2, it.next(), kmlStyle, kmlStyle2, z2));
            kmlPlacemark = kmlPlacemark2;
        }
        return arrayList;
    }

    private ArrayList<h> addMultiLineStringToMap(GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonMultiLineString geoJsonMultiLineString) {
        ArrayList<h> arrayList = new ArrayList<>();
        Iterator<GeoJsonLineString> it = geoJsonMultiLineString.getLineStrings().iterator();
        while (it.hasNext()) {
            arrayList.add(addLineStringToMap(geoJsonLineStringStyle.toPolylineOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList<f> addMultiPointToMap(GeoJsonPointStyle geoJsonPointStyle, GeoJsonMultiPoint geoJsonMultiPoint) {
        ArrayList<f> arrayList = new ArrayList<>();
        Iterator<GeoJsonPoint> it = geoJsonMultiPoint.getPoints().iterator();
        while (it.hasNext()) {
            arrayList.add(addPointToMap(geoJsonPointStyle.toMarkerOptions(), it.next()));
        }
        return arrayList;
    }

    private ArrayList<z6.g> addMultiPolygonToMap(GeoJsonPolygonStyle geoJsonPolygonStyle, GeoJsonMultiPolygon geoJsonMultiPolygon) {
        ArrayList<z6.g> arrayList = new ArrayList<>();
        Iterator<GeoJsonPolygon> it = geoJsonMultiPolygon.getPolygons().iterator();
        while (it.hasNext()) {
            arrayList.add(addPolygonToMap(geoJsonPolygonStyle.toPolygonOptions(), it.next()));
        }
        return arrayList;
    }

    private f addPointToMap(MarkerOptions markerOptions, Point point) {
        markerOptions.J(point.getGeometryObject());
        return this.mMarkers.addMarker(markerOptions);
    }

    private z6.g addPolygonToMap(PolygonOptions polygonOptions, DataPolygon dataPolygon) {
        List<LatLng> outerBoundaryCoordinates = dataPolygon.getOuterBoundaryCoordinates();
        polygonOptions.getClass();
        x.india(outerBoundaryCoordinates, "points must not be null.");
        Iterator<T> it = outerBoundaryCoordinates.iterator();
        while (it.hasNext()) {
            polygonOptions.alpha.add((LatLng) it.next());
        }
        for (List<LatLng> list : dataPolygon.getInnerBoundaryCoordinates()) {
            x.india(list, "points must not be null.");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add((LatLng) it2.next());
            }
            polygonOptions.purple.add(arrayList);
        }
        z6.g addPolygon = this.mPolygons.addPolygon(polygonOptions);
        boolean z2 = polygonOptions.f7489b;
        addPolygon.getClass();
        try {
            C2414d c2414d = (C2414d) addPolygon.alpha;
            Parcel ivory = c2414d.ivory();
            int i4 = w.alpha;
            ivory.writeInt(z2 ? 1 : 0);
            c2414d.lavender(ivory, 21);
            return addPolygon;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    private void createInfoWindow() {
        this.mMarkers.setInfoWindowAdapter(new InterfaceC3296a() { // from class: com.google.maps.android.data.Renderer.1
            @Override // x6.InterfaceC3296a
            public View getInfoContents(f fVar) {
                View inflate = LayoutInflater.from(Renderer.this.mContext).inflate(R.layout.amu_info_window, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.window);
                if (fVar.charlie() != null) {
                    textView.setText(Html.fromHtml(fVar.delta() + "<br>" + fVar.charlie()));
                    return inflate;
                }
                textView.setText(Html.fromHtml(fVar.delta()));
                return inflate;
            }

            @Override // x6.InterfaceC3296a
            public View getInfoWindow(f fVar) {
                return null;
            }
        });
    }

    public static boolean getPlacemarkVisibility(Feature feature) {
        if (feature.hasProperty("visibility") && Integer.parseInt(feature.getProperty("visibility")) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFeatureClickListener$0(Layer.OnFeatureClickListener onFeatureClickListener, z6.g gVar) {
        if (getFeature(gVar) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(gVar));
        } else if (getContainerFeature(gVar) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(gVar));
        } else {
            onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(gVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setOnFeatureClickListener$1(Layer.OnFeatureClickListener onFeatureClickListener, f fVar) {
        if (getFeature(fVar) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(fVar));
            return false;
        }
        if (getContainerFeature(fVar) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(fVar));
            return false;
        }
        onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(fVar)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFeatureClickListener$2(Layer.OnFeatureClickListener onFeatureClickListener, h hVar) {
        if (getFeature(hVar) != null) {
            onFeatureClickListener.onFeatureClick(getFeature(hVar));
        } else if (getContainerFeature(hVar) != null) {
            onFeatureClickListener.onFeatureClick(getContainerFeature(hVar));
        } else {
            onFeatureClickListener.onFeatureClick(getFeature(multiObjectHandler(hVar)));
        }
    }

    private ArrayList<?> multiObjectHandler(Object obj) {
        for (Object obj2 : getValues()) {
            if (obj2.getClass().getSimpleName().equals("ArrayList")) {
                ArrayList<?> arrayList = (ArrayList) obj2;
                if (arrayList.contains(obj)) {
                    return arrayList;
                }
            }
        }
        return null;
    }

    private void putMarkerImagesCache(String str, String str2, b bVar) {
        Map<String, b> map = this.mImagesCache.markerImagesCache.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.mImagesCache.markerImagesCache.put(str, map);
        }
        map.put(str2, bVar);
    }

    private b scaleIcon(Bitmap bitmap, double d4) {
        int i4;
        int i5 = (int) (this.mContext.getResources().getDisplayMetrics().density * 32.0f * d4);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i4 = (int) ((height * i5) / width);
        } else if (width > height) {
            int i10 = (int) ((width * i5) / height);
            i4 = i5;
            i5 = i10;
        } else {
            i4 = i5;
        }
        return T3.charlie(Bitmap.createScaledBitmap(bitmap, i5, i4, false));
    }

    private void setFeatureDefaultStyles(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature.getPointStyle() == null) {
            geoJsonFeature.setPointStyle(this.mDefaultPointStyle);
        }
        if (geoJsonFeature.getLineStringStyle() == null) {
            geoJsonFeature.setLineStringStyle(this.mDefaultLineStringStyle);
        }
        if (geoJsonFeature.getPolygonStyle() == null) {
            geoJsonFeature.setPolygonStyle(this.mDefaultPolygonStyle);
        }
    }

    private void setInlineLineStringStyle(PolylineOptions polylineOptions, KmlStyle kmlStyle) {
        PolylineOptions polylineOptions2 = kmlStyle.getPolylineOptions();
        if (kmlStyle.isStyleSet("outlineColor")) {
            polylineOptions.red = polylineOptions2.red;
        }
        if (kmlStyle.isStyleSet("width")) {
            polylineOptions.purple = polylineOptions2.purple;
        }
        if (kmlStyle.isLineRandomColorMode()) {
            polylineOptions.red = KmlStyle.computeRandomColor(polylineOptions2.red);
        }
    }

    private void setInlinePointStyle(MarkerOptions markerOptions, KmlStyle kmlStyle, KmlStyle kmlStyle2) {
        double d4;
        MarkerOptions markerOptions2 = kmlStyle.getMarkerOptions();
        if (kmlStyle.isStyleSet("heading")) {
            markerOptions.K(markerOptions2.f7479c);
        }
        if (kmlStyle.isStyleSet("hotSpot")) {
            markerOptions.E(markerOptions2.teal, markerOptions2.white);
        }
        if (kmlStyle.isStyleSet("markerColor")) {
            markerOptions.H(markerOptions2.silver);
        }
        if (kmlStyle.isStyleSet("iconScale")) {
            d4 = kmlStyle.getIconScale();
        } else if (kmlStyle2.isStyleSet("iconScale")) {
            d4 = kmlStyle2.getIconScale();
        } else {
            d4 = 1.0d;
        }
        if (kmlStyle.isStyleSet("iconUrl")) {
            addMarkerIcons(kmlStyle.getIconUrl(), d4, markerOptions);
        } else if (kmlStyle2.getIconUrl() != null) {
            addMarkerIcons(kmlStyle2.getIconUrl(), d4, markerOptions);
        }
    }

    private void setInlinePolygonStyle(PolygonOptions polygonOptions, KmlStyle kmlStyle) {
        PolygonOptions polygonOptions2 = kmlStyle.getPolygonOptions();
        if (kmlStyle.hasFill() && kmlStyle.isStyleSet("fillColor")) {
            polygonOptions.teal = polygonOptions2.teal;
        }
        if (kmlStyle.hasOutline()) {
            if (kmlStyle.isStyleSet("outlineColor")) {
                polygonOptions.silver = polygonOptions2.silver;
            }
            if (kmlStyle.isStyleSet("width")) {
                polygonOptions.red = polygonOptions2.red;
            }
        }
        if (kmlStyle.isPolyRandomColorMode()) {
            polygonOptions.teal = KmlStyle.computeRandomColor(polygonOptions2.teal);
        }
    }

    private void setMarkerInfoWindow(KmlStyle kmlStyle, f fVar, KmlPlacemark kmlPlacemark) {
        boolean hasProperty = kmlPlacemark.hasProperty("name");
        boolean hasProperty2 = kmlPlacemark.hasProperty("description");
        boolean hasBalloonStyle = kmlStyle.hasBalloonStyle();
        boolean containsKey = kmlStyle.getBalloonOptions().containsKey(Constants.KEY_TEXT);
        if (hasBalloonStyle && containsKey) {
            fVar.india(KmlUtil.substituteProperties(kmlStyle.getBalloonOptions().get(Constants.KEY_TEXT), kmlPlacemark));
            createInfoWindow();
            return;
        }
        if (hasBalloonStyle && hasProperty) {
            fVar.india(kmlPlacemark.getProperty("name"));
            createInfoWindow();
            return;
        }
        if (hasProperty && hasProperty2) {
            fVar.india(kmlPlacemark.getProperty("name"));
            fVar.hotel(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (hasProperty2) {
            fVar.india(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (hasProperty) {
            fVar.india(kmlPlacemark.getProperty("name"));
            createInfoWindow();
        }
    }

    public void addFeature(Feature feature) {
        Renderer renderer;
        Object obj = FEATURE_NOT_ON_MAP;
        if (feature instanceof GeoJsonFeature) {
            setFeatureDefaultStyles((GeoJsonFeature) feature);
        }
        if (this.mLayerOnMap) {
            if (this.mFeatures.containsKey(feature)) {
                removeFromMap(this.mFeatures.get(feature));
            }
            if (feature.hasGeometry()) {
                if (feature instanceof KmlPlacemark) {
                    KmlPlacemark kmlPlacemark = (KmlPlacemark) feature;
                    renderer = this;
                    obj = renderer.addKmlPlacemarkToMap(kmlPlacemark, feature.getGeometry(), getPlacemarkStyle(feature.getId()), kmlPlacemark.getInlineStyle(), getPlacemarkVisibility(feature));
                } else {
                    renderer = this;
                    obj = addGeoJsonFeatureToMap(feature, feature.getGeometry());
                }
                renderer.mFeatures.put((BiMultiMap<Feature>) feature, obj);
            }
        }
        renderer = this;
        renderer.mFeatures.put((BiMultiMap<Feature>) feature, obj);
    }

    public Object addGeoJsonFeatureToMap(Feature feature, Geometry geometry) {
        String geometryType = geometry.getGeometryType();
        geometryType.getClass();
        MarkerOptions markerOptions = null;
        PolylineOptions polylineOptions = null;
        PolygonOptions polygonOptions = null;
        char c3 = 65535;
        switch (geometryType.hashCode()) {
            case -2116761119:
                if (geometryType.equals("MultiPolygon")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1065891849:
                if (geometryType.equals("MultiPoint")) {
                    c3 = 1;
                    break;
                }
                break;
            case -627102946:
                if (geometryType.equals("MultiLineString")) {
                    c3 = 2;
                    break;
                }
                break;
            case 77292912:
                if (geometryType.equals("Point")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1267133722:
                if (geometryType.equals(KmlPolygon.GEOMETRY_TYPE)) {
                    c3 = 4;
                    break;
                }
                break;
            case 1806700869:
                if (geometryType.equals("LineString")) {
                    c3 = 5;
                    break;
                }
                break;
            case 1950410960:
                if (geometryType.equals("GeometryCollection")) {
                    c3 = 6;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return addMultiPolygonToMap(((GeoJsonFeature) feature).getPolygonStyle(), (GeoJsonMultiPolygon) geometry);
            case 1:
                return addMultiPointToMap(((GeoJsonFeature) feature).getPointStyle(), (GeoJsonMultiPoint) geometry);
            case 2:
                return addMultiLineStringToMap(((GeoJsonFeature) feature).getLineStringStyle(), (GeoJsonMultiLineString) geometry);
            case 3:
                if (feature instanceof GeoJsonFeature) {
                    markerOptions = ((GeoJsonFeature) feature).getMarkerOptions();
                } else if (feature instanceof KmlPlacemark) {
                    markerOptions = ((KmlPlacemark) feature).getMarkerOptions();
                }
                return addPointToMap(markerOptions, (GeoJsonPoint) geometry);
            case 4:
                if (feature instanceof GeoJsonFeature) {
                    polygonOptions = ((GeoJsonFeature) feature).getPolygonOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polygonOptions = ((KmlPlacemark) feature).getPolygonOptions();
                }
                return addPolygonToMap(polygonOptions, (DataPolygon) geometry);
            case 5:
                if (feature instanceof GeoJsonFeature) {
                    polylineOptions = ((GeoJsonFeature) feature).getPolylineOptions();
                } else if (feature instanceof KmlPlacemark) {
                    polylineOptions = ((KmlPlacemark) feature).getPolylineOptions();
                }
                return addLineStringToMap(polylineOptions, (GeoJsonLineString) geometry);
            case 6:
                return addGeometryCollectionToMap((GeoJsonFeature) feature, ((GeoJsonGeometryCollection) geometry).getGeometries());
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004c, code lost:
    
        if (r1.equals("Point") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object addKmlPlacemarkToMap(KmlPlacemark kmlPlacemark, Geometry geometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z2) {
        char c3 = 0;
        String geometryType = geometry.getGeometryType();
        boolean hasProperty = kmlPlacemark.hasProperty("drawOrder");
        float f5 = 0.0f;
        if (hasProperty) {
            try {
                f5 = Float.parseFloat(kmlPlacemark.getProperty("drawOrder"));
            } catch (NumberFormatException unused) {
                hasProperty = false;
            }
        }
        geometryType.getClass();
        switch (geometryType.hashCode()) {
            case 77292912:
                break;
            case 89139371:
                if (geometryType.equals("MultiGeometry")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 1267133722:
                if (geometryType.equals(KmlPolygon.GEOMETRY_TYPE)) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 1806700869:
                if (geometryType.equals("LineString")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                MarkerOptions markerOptions = kmlStyle.getMarkerOptions();
                if (kmlStyle2 != null) {
                    setInlinePointStyle(markerOptions, kmlStyle2, kmlStyle);
                } else if (kmlStyle.getIconUrl() != null) {
                    addMarkerIcons(kmlStyle.getIconUrl(), kmlStyle.getIconScale(), markerOptions);
                }
                f addPointToMap = addPointToMap(markerOptions, (KmlPoint) geometry);
                addPointToMap.juliet(z2);
                setMarkerInfoWindow(kmlStyle, addPointToMap, kmlPlacemark);
                if (hasProperty) {
                    addPointToMap.kilo(f5);
                }
                return addPointToMap;
            case 1:
                return addMultiGeometryToMap(kmlPlacemark, (KmlMultiGeometry) geometry, kmlStyle, kmlStyle2, z2);
            case 2:
                PolygonOptions polygonOptions = kmlStyle.getPolygonOptions();
                if (kmlStyle2 != null) {
                    setInlinePolygonStyle(polygonOptions, kmlStyle2);
                } else if (kmlStyle.isPolyRandomColorMode()) {
                    polygonOptions.teal = KmlStyle.computeRandomColor(polygonOptions.teal);
                }
                z6.g addPolygonToMap = addPolygonToMap(polygonOptions, (DataPolygon) geometry);
                addPolygonToMap.alpha(z2);
                if (hasProperty) {
                    try {
                        C2414d c2414d = (C2414d) addPolygonToMap.alpha;
                        Parcel ivory = c2414d.ivory();
                        ivory.writeFloat(f5);
                        c2414d.lavender(ivory, 13);
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
                return addPolygonToMap;
            case 3:
                PolylineOptions polylineOptions = kmlStyle.getPolylineOptions();
                if (kmlStyle2 != null) {
                    setInlineLineStringStyle(polylineOptions, kmlStyle2);
                } else if (kmlStyle.isLineRandomColorMode()) {
                    polylineOptions.red = KmlStyle.computeRandomColor(polylineOptions.red);
                }
                h addLineStringToMap = addLineStringToMap(polylineOptions, (LineString) geometry);
                addLineStringToMap.alpha(z2);
                if (hasProperty) {
                    try {
                        g gVar = (g) addLineStringToMap.alpha;
                        Parcel ivory2 = gVar.ivory();
                        ivory2.writeFloat(f5);
                        gVar.lavender(ivory2, 9);
                    } catch (RemoteException e4) {
                        throw new RuntimeRemoteException(e4);
                    }
                }
                return addLineStringToMap;
            default:
                return null;
        }
    }

    public void assignStyleMap(HashMap<String, String> hashMap, HashMap<String, KmlStyle> hashMap2) {
        for (String str : hashMap.keySet()) {
            String str2 = hashMap.get(str);
            if (hashMap2.containsKey(str2)) {
                hashMap2.put(str, hashMap2.get(str2));
            }
        }
    }

    public d attachGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        return this.mGroundOverlays.addGroundOverlay(groundOverlayOptions);
    }

    public void cacheBitmap(String str, Bitmap bitmap) {
        this.mImagesCache.bitmapCache.put(str, bitmap);
    }

    public void checkClearBitmapCache() {
        ImagesCache imagesCache;
        if (this.mNumActiveDownloads == 0 && (imagesCache = this.mImagesCache) != null && !imagesCache.bitmapCache.isEmpty()) {
            this.mImagesCache.bitmapCache.clear();
        }
    }

    public void clearStylesRenderer() {
        this.mStylesRenderer.clear();
    }

    public void downloadFinished() {
        this.mNumActiveDownloads--;
        checkClearBitmapCache();
    }

    public void downloadStarted() {
        this.mNumActiveDownloads++;
    }

    public HashMap<? extends Feature, Object> getAllFeatures() {
        return this.mFeatures;
    }

    public b getCachedGroundOverlayImage(String str) {
        Bitmap bitmap;
        b bVar = this.mImagesCache.groundOverlayImagesCache.get(str);
        if (bVar == null && (bitmap = this.mImagesCache.bitmapCache.get(str)) != null) {
            b charlie = T3.charlie(bitmap);
            this.mImagesCache.groundOverlayImagesCache.put(str, charlie);
            return charlie;
        }
        return bVar;
    }

    public b getCachedMarkerImage(String str, double d4) {
        b bVar;
        Bitmap bitmap;
        String format = sScaleFormat.format(d4);
        Map<String, b> map = this.mImagesCache.markerImagesCache.get(str);
        if (map != null) {
            bVar = map.get(format);
        } else {
            bVar = null;
        }
        if (bVar == null && (bitmap = this.mImagesCache.bitmapCache.get(str)) != null) {
            b scaleIcon = scaleIcon(bitmap, d4);
            putMarkerImagesCache(str, format, scaleIcon);
            return scaleIcon;
        }
        return bVar;
    }

    public Feature getContainerFeature(Object obj) {
        BiMultiMap<Feature> biMultiMap = this.mContainerFeatures;
        if (biMultiMap != null) {
            return biMultiMap.getKey(obj);
        }
        return null;
    }

    public ArrayList<KmlContainer> getContainerList() {
        return this.mContainers;
    }

    public GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.mDefaultLineStringStyle;
    }

    public GeoJsonPointStyle getDefaultPointStyle() {
        return this.mDefaultPointStyle;
    }

    public GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.mDefaultPolygonStyle;
    }

    public Feature getFeature(Object obj) {
        return this.mFeatures.getKey(obj);
    }

    public Set<Feature> getFeatures() {
        return this.mFeatures.keySet();
    }

    public HashMap<KmlGroundOverlay, d> getGroundOverlayMap() {
        return this.mGroundOverlayMap;
    }

    public k getMap() {
        return this.mMap;
    }

    public Set<String> getMarkerIconUrls() {
        return this.mMarkerIconUrls;
    }

    public KmlStyle getPlacemarkStyle(String str) {
        KmlStyle kmlStyle = this.mStylesRenderer.get(null);
        if (this.mStylesRenderer.get(str) != null) {
            return this.mStylesRenderer.get(str);
        }
        return kmlStyle;
    }

    public HashMap<String, String> getStyleMaps() {
        return this.mStyleMaps;
    }

    public HashMap<String, KmlStyle> getStylesRenderer() {
        return this.mStylesRenderer;
    }

    public Collection<Object> getValues() {
        return this.mFeatures.values();
    }

    public boolean hasFeatures() {
        if (this.mFeatures.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isLayerOnMap() {
        return this.mLayerOnMap;
    }

    public void putContainerFeature(Object obj, Feature feature) {
        this.mContainerFeatures.put((BiMultiMap<Feature>) feature, obj);
    }

    public void putFeatures(Feature feature, Object obj) {
        this.mFeatures.put((BiMultiMap<Feature>) feature, obj);
    }

    public void putStyles() {
        this.mStylesRenderer.putAll(this.mStyles);
    }

    public void removeFeature(Feature feature) {
        if (this.mFeatures.containsKey(feature)) {
            removeFromMap(this.mFeatures.remove(feature));
        }
    }

    public void removeFeatures(HashMap<? extends Feature, Object> hashMap) {
        removeFeatures(hashMap.values());
    }

    public void removeFromMap(Object obj) {
        if (obj instanceof f) {
            this.mMarkers.remove((f) obj);
            return;
        }
        if (obj instanceof h) {
            this.mPolylines.remove((h) obj);
            return;
        }
        if (obj instanceof z6.g) {
            this.mPolygons.remove((z6.g) obj);
            return;
        }
        if (obj instanceof d) {
            this.mGroundOverlays.remove((d) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                removeFromMap(it.next());
            }
        }
    }

    public void removeGroundOverlays(HashMap<KmlGroundOverlay, d> hashMap) {
        for (d dVar : hashMap.values()) {
            if (dVar != null) {
                this.mGroundOverlays.remove(dVar);
            }
        }
    }

    public void setLayerVisibility(boolean z2) {
        this.mLayerOnMap = z2;
    }

    public void setMap(k kVar) {
        this.mMap = kVar;
    }

    public void setOnFeatureClickListener(Layer.OnFeatureClickListener onFeatureClickListener) {
        this.mPolygons.setOnPolygonClickListener(new a(this, onFeatureClickListener));
        this.mMarkers.setOnMarkerClickListener(new a(this, onFeatureClickListener));
        this.mPolylines.setOnPolylineClickListener(new a(this, onFeatureClickListener));
    }

    public void storeData(HashMap<String, KmlStyle> hashMap, HashMap<String, String> hashMap2, HashMap<KmlPlacemark, Object> hashMap3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, d> hashMap4) {
        this.mStyles = hashMap;
        this.mStyleMaps = hashMap2;
        this.mFeatures.putAll(hashMap3);
        this.mContainers = arrayList;
        this.mGroundOverlayMap = hashMap4;
    }

    private void removeFeatures(Collection collection) {
        for (Object obj : collection) {
            if (obj instanceof Collection) {
                removeFeatures((Collection) obj);
            } else if (obj instanceof f) {
                this.mMarkers.remove((f) obj);
            } else if (obj instanceof h) {
                this.mPolylines.remove((h) obj);
            } else if (obj instanceof z6.g) {
                this.mPolygons.remove((z6.g) obj);
            }
        }
    }

    public void putStyles(HashMap<String, KmlStyle> hashMap) {
        this.mStylesRenderer.putAll(hashMap);
    }

    public Renderer(k kVar, HashMap<? extends Feature, Object> hashMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this(kVar, null, new GeoJsonPointStyle(), new GeoJsonLineStringStyle(), new GeoJsonPolygonStyle(), null, markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.mFeatures.putAll(hashMap);
        this.mImagesCache = null;
    }

    private Renderer(k kVar, Set<String> set, GeoJsonPointStyle geoJsonPointStyle, GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonPolygonStyle geoJsonPolygonStyle, BiMultiMap<Feature> biMultiMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this.mFeatures = new BiMultiMap<>();
        this.mNumActiveDownloads = 0;
        this.mMap = kVar;
        this.mLayerOnMap = false;
        this.mMarkerIconUrls = set;
        this.mDefaultPointStyle = geoJsonPointStyle;
        this.mDefaultLineStringStyle = geoJsonLineStringStyle;
        this.mDefaultPolygonStyle = geoJsonPolygonStyle;
        this.mContainerFeatures = biMultiMap;
        if (kVar != null) {
            this.mMarkers = (markerManager == null ? new MarkerManager(kVar) : markerManager).newCollection();
            this.mPolygons = (polygonManager == null ? new PolygonManager(kVar) : polygonManager).newCollection();
            this.mPolylines = (polylineManager == null ? new PolylineManager(kVar) : polylineManager).newCollection();
            this.mGroundOverlays = (groundOverlayManager == null ? new GroundOverlayManager(kVar) : groundOverlayManager).newCollection();
            return;
        }
        this.mMarkers = null;
        this.mPolygons = null;
        this.mPolylines = null;
        this.mGroundOverlays = null;
    }
}
