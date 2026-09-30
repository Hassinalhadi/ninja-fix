package com.google.maps.android.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class MultiGeometry implements Geometry {
    private String geometryType = "MultiGeometry";
    private List<Geometry> mGeometries;

    public MultiGeometry(List<? extends Geometry> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Geometry> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            this.mGeometries = arrayList;
            return;
        }
        throw new IllegalArgumentException("Geometries cannot be null");
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return this.geometryType;
    }

    public void setGeometryType(String str) {
        this.geometryType = str;
    }

    public String toString() {
        String str;
        if (this.geometryType.equals("MultiPoint")) {
            str = "LineStrings=";
        } else {
            str = "Geometries=";
        }
        if (this.geometryType.equals("MultiLineString")) {
            str = "points=";
        }
        if (this.geometryType.equals("MultiPolygon")) {
            str = "Polygons=";
        }
        return getGeometryType() + "{" + "\n ".concat(str) + getGeometryObject() + "\n}\n";
    }

    @Override // com.google.maps.android.data.Geometry
    public List<Geometry> getGeometryObject() {
        return this.mGeometries;
    }
}
