package com.google.maps.android.data.geojson;

import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Renderer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import x6.k;

/* loaded from: classes2.dex */
public class GeoJsonRenderer extends Renderer implements Observer {
    private static final Object FEATURE_NOT_ON_MAP = null;

    public GeoJsonRenderer(k kVar, HashMap<GeoJsonFeature, Object> hashMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        super(kVar, hashMap, markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    private void redrawFeatureToMap(GeoJsonFeature geoJsonFeature) {
        redrawFeatureToMap(geoJsonFeature, getMap());
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        super.addFeature((Feature) geoJsonFeature);
        if (isLayerOnMap()) {
            geoJsonFeature.addObserver(this);
        }
    }

    public void addLayerToMap() {
        if (!isLayerOnMap()) {
            setLayerVisibility(true);
            Iterator<Feature> it = super.getFeatures().iterator();
            while (it.hasNext()) {
                addFeature((GeoJsonFeature) it.next());
            }
        }
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        super.removeFeature((Feature) geoJsonFeature);
        if (super.getFeatures().contains(geoJsonFeature)) {
            geoJsonFeature.deleteObserver(this);
        }
    }

    public void removeLayerFromMap() {
        if (isLayerOnMap()) {
            for (Feature feature : super.getFeatures()) {
                removeFromMap(super.getAllFeatures().get(feature));
                feature.deleteObserver(this);
            }
            setLayerVisibility(false);
        }
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(k kVar) {
        super.setMap(kVar);
        Iterator<Feature> it = super.getFeatures().iterator();
        while (it.hasNext()) {
            redrawFeatureToMap((GeoJsonFeature) it.next(), kVar);
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        boolean z2;
        if (observable instanceof GeoJsonFeature) {
            GeoJsonFeature geoJsonFeature = (GeoJsonFeature) observable;
            Object obj2 = getAllFeatures().get(geoJsonFeature);
            Object obj3 = FEATURE_NOT_ON_MAP;
            if (obj2 != obj3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && geoJsonFeature.hasGeometry()) {
                redrawFeatureToMap(geoJsonFeature);
                return;
            }
            if (z2 && !geoJsonFeature.hasGeometry()) {
                removeFromMap(getAllFeatures().get(geoJsonFeature));
                putFeatures(geoJsonFeature, obj3);
            } else if (!z2 && geoJsonFeature.hasGeometry()) {
                addFeature(geoJsonFeature);
            }
        }
    }

    private void redrawFeatureToMap(GeoJsonFeature geoJsonFeature, k kVar) {
        removeFromMap(getAllFeatures().get(geoJsonFeature));
        putFeatures(geoJsonFeature, FEATURE_NOT_ON_MAP);
        if (kVar == null || !geoJsonFeature.hasGeometry()) {
            return;
        }
        putFeatures(geoJsonFeature, addGeoJsonFeatureToMap(geoJsonFeature, geoJsonFeature.getGeometry()));
    }
}
