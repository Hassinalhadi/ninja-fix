package T5;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class ak extends Fragment implements h {
    public static final WeakHashMap purple = new WeakHashMap();
    public final B0.a alpha = new B0.a((byte) 0, 3);

    @Override // T5.h
    public final aj alpha(Class cls, String str) {
        return (aj) cls.cast(((Map) this.alpha.charlie).get(str));
    }

    @Override // T5.h
    public final Activity bravo() {
        return getActivity();
    }

    @Override // T5.h
    public final void delta(String str, aj ajVar) {
        this.alpha.papa(str, ajVar);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.alpha.charlie).values().iterator();
        while (it.hasNext()) {
            ((aj) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        this.alpha.romeo(i4, i5, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.alpha.sierra(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        B0.a aVar = this.alpha;
        aVar.bravo = 5;
        Iterator it = ((Map) aVar.charlie).values().iterator();
        while (it.hasNext()) {
            ((aj) it.next()).delta();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B0.a aVar = this.alpha;
        aVar.bravo = 3;
        Iterator it = ((Map) aVar.charlie).values().iterator();
        while (it.hasNext()) {
            ((aj) it.next()).echo();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.alpha.tango(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B0.a aVar = this.alpha;
        aVar.bravo = 2;
        Iterator it = ((Map) aVar.charlie).values().iterator();
        while (it.hasNext()) {
            ((aj) it.next()).foxtrot();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        B0.a aVar = this.alpha;
        aVar.bravo = 4;
        Iterator it = ((Map) aVar.charlie).values().iterator();
        while (it.hasNext()) {
            ((aj) it.next()).golf();
        }
    }
}
