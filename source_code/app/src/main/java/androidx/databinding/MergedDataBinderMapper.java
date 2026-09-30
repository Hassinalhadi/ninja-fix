package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z1.b;
import z1.g;

/* loaded from: classes3.dex */
public class MergedDataBinderMapper extends b {
    public final HashSet alpha = new HashSet();
    public final CopyOnWriteArrayList bravo = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList charlie = new CopyOnWriteArrayList();

    @Override // z1.b
    public final g bravo(int i4, View view) {
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            g bravo = ((b) it.next()).bravo(i4, view);
            if (bravo != null) {
                return bravo;
            }
        }
        if (foxtrot()) {
            return bravo(i4, view);
        }
        return null;
    }

    @Override // z1.b
    public final g charlie(View[] viewArr, int i4) {
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            g charlie = ((b) it.next()).charlie(viewArr, i4);
            if (charlie != null) {
                return charlie;
            }
        }
        if (foxtrot()) {
            return charlie(viewArr, i4);
        }
        return null;
    }

    @Override // z1.b
    public final int delta(String str) {
        Iterator it = this.bravo.iterator();
        while (it.hasNext()) {
            int delta = ((b) it.next()).delta(str);
            if (delta != 0) {
                return delta;
            }
        }
        if (foxtrot()) {
            return delta(str);
        }
        return 0;
    }

    public final void echo(b bVar) {
        if (this.alpha.add(bVar.getClass())) {
            this.bravo.add(bVar);
            Iterator it = bVar.alpha().iterator();
            while (it.hasNext()) {
                echo((b) it.next());
            }
        }
    }

    public final boolean foxtrot() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.charlie;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (b.class.isAssignableFrom(cls)) {
                    echo((b) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z2 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e4) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e4);
            }
        }
        return z2;
    }
}
