package com.google.maps.android.data.kml;

import V5.x;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import com.google.maps.android.data.Renderer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x6.k;
import z6.b;
import z6.d;
import z6.f;

/* loaded from: classes2.dex */
public class KmlRenderer extends Renderer {
    private static final String LOG_TAG = "KmlRenderer";
    private ArrayList<KmlContainer> mContainers;
    private boolean mGroundOverlayImagesDownloaded;
    private final Set<String> mGroundOverlayUrls;
    private boolean mMarkerIconsDownloaded;

    /* loaded from: classes2.dex */
    public class GroundOverlayImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mGroundOverlayUrl;

        public GroundOverlayImageDownload(String str) {
            this.mGroundOverlayUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        @Override // android.os.AsyncTask
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mGroundOverlayUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mGroundOverlayUrl);
            } catch (IOException e) {
                Log.e(KmlRenderer.LOG_TAG, "Image [" + this.mGroundOverlayUrl + "] download issue", e);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                KmlRenderer.this.cacheBitmap(this.mGroundOverlayUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addGroundOverlayToMap(this.mGroundOverlayUrl, kmlRenderer.getGroundOverlayMap(), true);
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addGroundOverlayInContainerGroups(this.mGroundOverlayUrl, kmlRenderer2.mContainers, true);
                }
            } else {
                Log.e(KmlRenderer.LOG_TAG, "Image at this URL could not be found " + this.mGroundOverlayUrl);
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    /* loaded from: classes2.dex */
    public class MarkerIconImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mIconUrl;

        public MarkerIconImageDownload(String str) {
            this.mIconUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        @Override // android.os.AsyncTask
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mIconUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mIconUrl);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                KmlRenderer.this.cacheBitmap(this.mIconUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addIconToMarkers(this.mIconUrl, kmlRenderer.getAllFeatures());
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addContainerGroupIconsToMarkers(this.mIconUrl, kmlRenderer2.mContainers);
                }
            } else {
                Log.e(KmlRenderer.LOG_TAG, "Image at this URL could not be found " + this.mIconUrl);
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    public KmlRenderer(k kVar, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, Renderer.ImagesCache imagesCache) {
        super(kVar, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
        this.mGroundOverlayUrls = new HashSet();
        this.mMarkerIconsDownloaded = false;
        this.mGroundOverlayImagesDownloaded = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addContainerGroupIconsToMarkers(String str, Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            addIconToMarkers(str, kmlContainer.getPlacemarksHashMap());
            if (kmlContainer.hasContainers()) {
                addContainerGroupIconsToMarkers(str, kmlContainer.getContainers());
            }
        }
    }

    private void addContainerGroupToMap(Iterable<KmlContainer> iterable, boolean z2) {
        for (KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z2);
            if (kmlContainer.getStyles() != null) {
                putStyles(kmlContainer.getStyles());
            }
            if (kmlContainer.getStyleMap() != null) {
                super.assignStyleMap(kmlContainer.getStyleMap(), getStylesRenderer());
            }
            addContainerObjectToMap(kmlContainer, containerVisibility);
            if (kmlContainer.hasContainers()) {
                addContainerGroupToMap(kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    private void addContainerObjectToMap(KmlContainer kmlContainer, boolean z2) {
        boolean z10;
        for (KmlPlacemark kmlPlacemark : kmlContainer.getPlacemarks()) {
            boolean placemarkVisibility = Renderer.getPlacemarkVisibility(kmlPlacemark);
            if (z2 && placemarkVisibility) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (kmlPlacemark.getGeometry() != null) {
                KmlPlacemark kmlPlacemark2 = kmlPlacemark;
                Object addKmlPlacemarkToMap = addKmlPlacemarkToMap(kmlPlacemark2, kmlPlacemark.getGeometry(), getPlacemarkStyle(kmlPlacemark.getId()), kmlPlacemark2.getInlineStyle(), z11);
                kmlContainer.setPlacemark(kmlPlacemark2, addKmlPlacemarkToMap);
                putContainerFeature(addKmlPlacemarkToMap, kmlPlacemark);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayInContainerGroups(String str, Iterable<KmlContainer> iterable, boolean z2) {
        for (KmlContainer kmlContainer : iterable) {
            boolean containerVisibility = getContainerVisibility(kmlContainer, z2);
            addGroundOverlayToMap(str, kmlContainer.getGroundOverlayHashMap(), containerVisibility);
            if (kmlContainer.hasContainers()) {
                addGroundOverlayInContainerGroups(str, kmlContainer.getContainers(), containerVisibility);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroundOverlayToMap(String str, HashMap<KmlGroundOverlay, d> hashMap, boolean z2) {
        b cachedGroundOverlayImage = getCachedGroundOverlayImage(str);
        for (KmlGroundOverlay kmlGroundOverlay : hashMap.keySet()) {
            if (kmlGroundOverlay.getImageUrl().equals(str)) {
                GroundOverlayOptions groundOverlayOptions = kmlGroundOverlay.getGroundOverlayOptions();
                groundOverlayOptions.getClass();
                x.india(cachedGroundOverlayImage, "imageDescriptor must not be null");
                groundOverlayOptions.alpha = cachedGroundOverlayImage;
                d attachGroundOverlay = attachGroundOverlay(groundOverlayOptions);
                if (!z2) {
                    attachGroundOverlay.alpha(false);
                }
                hashMap.put(kmlGroundOverlay, attachGroundOverlay);
            }
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, d> hashMap, Iterable<KmlContainer> iterable) {
        addGroundOverlays(hashMap);
        for (KmlContainer kmlContainer : iterable) {
            addGroundOverlays(kmlContainer.getGroundOverlayHashMap(), kmlContainer.getContainers());
        }
    }

    private void addIconToGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Geometry geometry, Object obj) {
        if (geometry != null) {
            if ("Point".equals(geometry.getGeometryType())) {
                addIconToMarker(str, kmlStyle, kmlStyle2, (f) obj);
            } else if ("MultiGeometry".equals(geometry.getGeometryType())) {
                addIconToMultiGeometry(str, kmlStyle, kmlStyle2, (MultiGeometry) geometry, (List) obj);
            }
        }
    }

    private void addIconToMarker(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, f fVar) {
        boolean z2;
        boolean z10 = false;
        if (kmlStyle2 != null && str.equals(kmlStyle2.getIconUrl())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kmlStyle != null && str.equals(kmlStyle.getIconUrl())) {
            z10 = true;
        }
        if (z2) {
            scaleBitmap(kmlStyle2, fVar);
        } else if (z10) {
            scaleBitmap(kmlStyle, fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIconToMarkers(String str, HashMap<KmlPlacemark, Object> hashMap) {
        for (KmlPlacemark kmlPlacemark : hashMap.keySet()) {
            addIconToGeometry(str, getStylesRenderer().get(kmlPlacemark.getId()), kmlPlacemark.getInlineStyle(), kmlPlacemark.getGeometry(), hashMap.get(kmlPlacemark));
        }
    }

    private void addIconToMultiGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, MultiGeometry multiGeometry, List<Object> list) {
        Iterator<Geometry> it = multiGeometry.getGeometryObject().iterator();
        Iterator<Object> it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            addIconToGeometry(str, kmlStyle, kmlStyle2, it.next(), it2.next());
        }
    }

    private void addPlacemarksToMap(HashMap<? extends Feature, Object> hashMap) {
        Iterator<? extends Feature> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            addFeature(it.next());
        }
    }

    private void downloadGroundOverlays() {
        this.mGroundOverlayImagesDownloaded = true;
        Iterator<String> it = this.mGroundOverlayUrls.iterator();
        while (it.hasNext()) {
            new GroundOverlayImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private void downloadMarkerIcons() {
        this.mMarkerIconsDownloaded = true;
        Iterator<String> it = getMarkerIconUrls().iterator();
        while (it.hasNext()) {
            new MarkerIconImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getBitmapFromUrl(String str) throws IOException {
        return BitmapFactory.decodeStream(openConnectionCheckRedirects((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())));
    }

    public static boolean getContainerVisibility(KmlContainer kmlContainer, boolean z2) {
        boolean z10;
        if (kmlContainer.hasProperty("visibility") && Integer.parseInt(kmlContainer.getProperty("visibility")) == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z2 || !z10) {
            return false;
        }
        return true;
    }

    private InputStream openConnectionCheckRedirects(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        boolean z2;
        HttpURLConnection httpURLConnection;
        int responseCode;
        URL url;
        int i4 = 0;
        do {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            }
            inputStream = uRLConnection.getInputStream();
            if ((uRLConnection instanceof HttpURLConnection) && (responseCode = (httpURLConnection = (HttpURLConnection) uRLConnection).getResponseCode()) >= 300 && responseCode <= 307 && responseCode != 306 && responseCode != 304) {
                URL url2 = httpURLConnection.getURL();
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField != null) {
                    url = new URL(url2, headerField);
                } else {
                    url = null;
                }
                httpURLConnection.disconnect();
                if (url != null && ((url.getProtocol().equals("http") || url.getProtocol().equals("https")) && i4 < 5)) {
                    uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                    i4++;
                    z2 = true;
                } else {
                    throw new SecurityException("illegal URL redirect");
                }
            } else {
                z2 = false;
            }
        } while (z2);
        return inputStream;
    }

    private void removeContainers(Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            removePlacemarks(kmlContainer.getPlacemarksHashMap());
            removeGroundOverlays(kmlContainer.getGroundOverlayHashMap());
            removeContainers(kmlContainer.getContainers());
        }
    }

    private void removePlacemarks(HashMap<? extends Feature, Object> hashMap) {
        removeFeatures(hashMap);
    }

    private void scaleBitmap(KmlStyle kmlStyle, f fVar) {
        fVar.foxtrot(getCachedMarkerImage(kmlStyle.getIconUrl(), kmlStyle.getIconScale()));
    }

    public void addLayerToMap() {
        setLayerVisibility(true);
        this.mContainers = getContainerList();
        putStyles();
        assignStyleMap(getStyleMaps(), getStylesRenderer());
        addGroundOverlays(getGroundOverlayMap(), this.mContainers);
        addContainerGroupToMap(this.mContainers, true);
        addPlacemarksToMap(getAllFeatures());
        if (!this.mGroundOverlayImagesDownloaded) {
            downloadGroundOverlays();
        }
        if (!this.mMarkerIconsDownloaded) {
            downloadMarkerIcons();
        }
        checkClearBitmapCache();
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return getGroundOverlayMap().keySet();
    }

    public Iterable<? extends Feature> getKmlPlacemarks() {
        return getFeatures();
    }

    public Iterable<KmlContainer> getNestedContainers() {
        return this.mContainers;
    }

    public boolean hasKmlPlacemarks() {
        return hasFeatures();
    }

    public boolean hasNestedContainers() {
        if (this.mContainers.size() > 0) {
            return true;
        }
        return false;
    }

    public void removeLayerFromMap() {
        removePlacemarks(getAllFeatures());
        removeGroundOverlays(getGroundOverlayMap());
        if (hasNestedContainers()) {
            removeContainers(getNestedContainers());
        }
        setLayerVisibility(false);
        clearStylesRenderer();
    }

    @Override // com.google.maps.android.data.Renderer
    public void setMap(k kVar) {
        removeLayerFromMap();
        super.setMap(kVar);
        addLayerToMap();
    }

    public void storeKmlData(HashMap<String, KmlStyle> hashMap, HashMap<String, String> hashMap2, HashMap<KmlPlacemark, Object> hashMap3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, d> hashMap4) {
        storeData(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
    }

    public void storeKmzData(HashMap<String, KmlStyle> hashMap, HashMap<String, String> hashMap2, HashMap<KmlPlacemark, Object> hashMap3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, d> hashMap4, HashMap<String, Bitmap> hashMap5) {
        storeData(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
        for (Map.Entry<String, Bitmap> entry : hashMap5.entrySet()) {
            cacheBitmap(entry.getKey(), entry.getValue());
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, d> hashMap) {
        for (KmlGroundOverlay kmlGroundOverlay : hashMap.keySet()) {
            String imageUrl = kmlGroundOverlay.getImageUrl();
            if (imageUrl != null && kmlGroundOverlay.getLatLngBox() != null) {
                if (getCachedGroundOverlayImage(imageUrl) != null) {
                    addGroundOverlayToMap(imageUrl, hashMap, true);
                } else {
                    this.mGroundOverlayUrls.add(imageUrl);
                }
            }
        }
    }
}
