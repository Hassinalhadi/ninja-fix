package kotlin.collections;

import S.ah;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aa extends e {
    public final /* synthetic */ int alpha = 0;
    public final Object purple;

    public aa(List delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.purple = delegate;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                return ((List) this.purple).size();
            default:
                return ((kotlin.text.k) this.purple).alpha.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.alpha) {
            case 1:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i4) {
        switch (this.alpha) {
            case 0:
                return ((List) this.purple).get(q.tango(i4, this));
            default:
                String group = ((kotlin.text.k) this.purple).alpha.group(i4);
                if (group == null) {
                    return "";
                }
                return group;
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.alpha) {
            case 1:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new ah(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.alpha) {
            case 1:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public ListIterator listIterator() {
        switch (this.alpha) {
            case 0:
                return new ah(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public ListIterator listIterator(int i4) {
        switch (this.alpha) {
            case 0:
                return new ah(this, i4);
            default:
                return super.listIterator(i4);
        }
    }

    public aa(kotlin.text.k kVar) {
        this.purple = kVar;
    }
}
