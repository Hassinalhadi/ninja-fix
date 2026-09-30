package m0;

import android.os.Build;
import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.C1290a1;
import java.util.List;

/* loaded from: classes3.dex */
public final class k {
    public final List alpha;
    public final C1290a1 bravo;
    public final int charlie;
    public final int delta;
    public int echo;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(List list, C1290a1 c1290a1) {
        int i4;
        MotionEvent motionEvent;
        int i5;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        this.alpha = list;
        this.bravo = c1290a1;
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            if (c1290a1 != null) {
                motionEvent4 = (MotionEvent) ((com.google.android.play.core.integrity.c) c1290a1.charlie).red;
            } else {
                motionEvent4 = null;
            }
            if (motionEvent4 != null) {
                i4 = motionEvent4.getClassification();
                this.charlie = i4;
                if (c1290a1 == null) {
                    motionEvent = (MotionEvent) ((com.google.android.play.core.integrity.c) c1290a1.charlie).red;
                } else {
                    motionEvent = null;
                }
                if (motionEvent == null) {
                    i5 = motionEvent.getButtonState();
                } else {
                    i5 = 0;
                }
                this.delta = i5;
                if (c1290a1 == null) {
                    motionEvent2 = (MotionEvent) ((com.google.android.play.core.integrity.c) c1290a1.charlie).red;
                } else {
                    motionEvent2 = null;
                }
                if (motionEvent2 != null) {
                    motionEvent2.getMetaState();
                }
                motionEvent3 = c1290a1 != null ? (MotionEvent) ((com.google.android.play.core.integrity.c) c1290a1.charlie).red : null;
                if (motionEvent3 == null) {
                    int actionMasked = motionEvent3.getActionMasked();
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            if (actionMasked != 2) {
                                switch (actionMasked) {
                                    case 8:
                                        i10 = 6;
                                        break;
                                    case 9:
                                        i10 = 4;
                                        break;
                                    case 10:
                                        i10 = 5;
                                        break;
                                }
                            }
                            i10 = 3;
                        }
                        i10 = 2;
                    }
                    i10 = 1;
                } else {
                    int size = list.size();
                    while (i10 < size) {
                        r rVar = (r) list.get(i10);
                        if (q.charlie(rVar)) {
                            i10 = 2;
                        } else if (q.alpha(rVar)) {
                            i10 = 1;
                        } else {
                            i10++;
                        }
                    }
                    i10 = 3;
                }
                this.echo = i10;
            }
        }
        i4 = 0;
        this.charlie = i4;
        if (c1290a1 == null) {
        }
        if (motionEvent == null) {
        }
        this.delta = i5;
        if (c1290a1 == null) {
        }
        if (motionEvent2 != null) {
        }
        if (c1290a1 != null) {
        }
        if (motionEvent3 == null) {
        }
        this.echo = i10;
    }
}
