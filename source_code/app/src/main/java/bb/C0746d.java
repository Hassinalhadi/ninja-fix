package bb;

import S2.l;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.at;
import androidx.camera.core.impl.ai;
import androidx.camera.core.impl.ar;
import androidx.camera.core.v;
import androidx.camera.core.w;
import ao.ad;
import com.google.firebase.messaging.o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import s6.T7;
import t6.j4;
import tg.k;

/* renamed from: bb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0746d implements v {
    public o purple;
    public final ArrayList red;
    public final ArrayDeque alpha = new ArrayDeque();
    public boolean silver = false;

    public C0746d(at atVar) {
        j4.alpha();
        this.red = new ArrayList();
    }

    public final void alpha() {
        j4.alpha();
        new ImageCaptureException(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.alpha;
        Iterator it = arrayDeque.iterator();
        if (!it.hasNext()) {
            arrayDeque.clear();
            Iterator it2 = new ArrayList(this.red).iterator();
            if (!it2.hasNext()) {
                return;
            }
            ad.cyan(it2.next());
            throw null;
        }
        throw ad.yankee(it);
    }

    public final void bravo() {
        boolean z2;
        int uniform;
        j4.alpha();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.silver) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        o oVar = this.purple;
        oVar.getClass();
        j4.alpha();
        w.o oVar2 = (w.o) oVar.bravo;
        oVar2.getClass();
        j4.alpha();
        if (((l) oVar2.purple) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("The ImageReader is not initialized.", z2);
        l lVar = (l) oVar2.purple;
        synchronized (lVar.red) {
            uniform = ((ar) lVar.silver).uniform() - lVar.alpha;
        }
        if (uniform == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
        } else {
            if (this.alpha.poll() == null) {
                Log.d("TakePictureManager", "No new request.");
                return;
            }
            throw new ClassCastException();
        }
    }

    @Override // androidx.camera.core.v
    public final void charlie(w wVar) {
        k.echo().execute(new ai(9, this));
    }
}
