package Oe;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class r extends AbstractList implements RandomAccess, s {
    public static final ak purple = new ak(new r());
    public final ArrayList alpha;

    public r() {
        this.alpha = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        this.alpha.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.alpha.size(), collection);
    }

    @Override // Oe.s
    public final void beige(u uVar) {
        this.alpha.add(uVar);
        ((AbstractList) this).modCount++;
    }

    @Override // Oe.s
    public final List charlie() {
        return Collections.unmodifiableList(this.alpha);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.alpha.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // Oe.s
    public final ak echo() {
        return new ak(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        ArrayList arrayList = this.alpha;
        Object obj = arrayList.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String sierra = eVar.sierra();
            if (eVar.lima()) {
                arrayList.set(i4, sierra);
            }
            return sierra;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = q.alpha;
        try {
            String str = new String(bArr, "UTF-8");
            if (ae.charlie(bArr, 0, bArr.length) == 0) {
                arrayList.set(i4, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // Oe.s
    public final e j(int i4) {
        e uVar;
        ArrayList arrayList = this.alpha;
        Object obj = arrayList.get(i4);
        if (obj instanceof e) {
            uVar = (e) obj;
        } else if (obj instanceof String) {
            try {
                uVar = new u(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            uVar = new u(bArr2);
        }
        if (uVar != obj) {
            arrayList.set(i4, uVar);
        }
        return uVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        Object remove = this.alpha.remove(i4);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof e) {
            return ((e) remove).sierra();
        }
        byte[] bArr = (byte[]) remove;
        byte[] bArr2 = q.alpha;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        Object obj2 = this.alpha.set(i4, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof e) {
            return ((e) obj2).sierra();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = q.alpha;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.alpha.size();
    }

    public r(s sVar) {
        this.alpha = new ArrayList(sVar.size());
        addAll(sVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (collection instanceof s) {
            collection = ((s) collection).charlie();
        }
        boolean addAll = this.alpha.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
