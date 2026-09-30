package Oe;

import androidx.datastore.preferences.protobuf.au;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.O;
import com.google.protobuf.aw;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ah extends AbstractSet {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Map purple;

    public /* synthetic */ ah(Map map, int i4) {
        this.alpha = i4;
        this.purple = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((ab) this.purple).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    ((au) this.purple).put((Comparable) entry2.getKey(), entry2.getValue());
                    return true;
                }
                return false;
            case 2:
            default:
                return super.add(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    ((O) this.purple).put((Comparable) entry3.getKey(), entry3.getValue());
                    return true;
                }
                return false;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    ((aw) this.purple).put((Comparable) entry4.getKey(), entry4.getValue());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.alpha) {
            case 0:
                ((ab) this.purple).clear();
                return;
            case 1:
                ((au) this.purple).clear();
                return;
            case 2:
            default:
                super.clear();
                return;
            case 3:
                ((O) this.purple).clear();
                return;
            case 4:
                ((aw) this.purple).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((ab) this.purple).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((au) this.purple).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj3 != value2 && (obj3 == null || !obj3.equals(value2))) {
                    return false;
                }
                return true;
            case 2:
            default:
                return super.contains(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((O) this.purple).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj4 == value3) {
                    return true;
                }
                if (obj4 != null && obj4.equals(value3)) {
                    return true;
                }
                return false;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj5 = ((aw) this.purple).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj5 != value4 && (obj5 == null || !obj5.equals(value4))) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new ag((ab) this.purple, 0);
            case 1:
                return new ag((au) this.purple, 1);
            case 2:
                return new bv.c((bv.e) this.purple);
            case 3:
                return new ag((O) this.purple, 2);
            default:
                return new ag((aw) this.purple, 3);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((ab) this.purple).remove(entry.getKey());
                    return true;
                }
                return false;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((au) this.purple).remove(entry2.getKey());
                    return true;
                }
                return false;
            case 2:
            default:
                return super.remove(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    ((O) this.purple).remove(entry3.getKey());
                    return true;
                }
                return false;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    ((aw) this.purple).remove(entry4.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.alpha) {
            case 0:
                return ((ab) this.purple).size();
            case 1:
                return ((au) this.purple).size();
            case 2:
                return ((bv.e) this.purple).red;
            case 3:
                return ((O) this.purple).size();
            default:
                return ((aw) this.purple).size();
        }
    }
}
