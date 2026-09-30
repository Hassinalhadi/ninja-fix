package j8;

import com.google.android.play.core.integrity.k;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import k8.C2019a;

/* renamed from: j8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1945b implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1946c purple;

    public /* synthetic */ RunnableC1945b(C1946c c1946c, int i4) {
        this.alpha = i4;
        this.purple = c1946c;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C2019a charlie;
        boolean z2;
        C2019a india;
        int i4;
        switch (this.alpha) {
            case 0:
                this.purple.bravo();
                return;
            case 1:
                this.purple.bravo();
                return;
            default:
                C1946c c1946c = this.purple;
                c1946c.getClass();
                synchronized (C1946c.mike) {
                    try {
                        B7.g gVar = c1946c.alpha;
                        gVar.alpha();
                        k delta = k.delta(gVar.alpha);
                        try {
                            charlie = c1946c.charlie.charlie();
                            if (delta != null) {
                                delta.india();
                            }
                        } catch (Throwable th) {
                            if (delta != null) {
                                delta.india();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i5 = charlie.bravo;
                    boolean z10 = false;
                    if (i5 == 5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (i5 == 3) {
                            z10 = true;
                        }
                        if (!z10) {
                            if (c1946c.delta.alpha(charlie)) {
                                india = c1946c.charlie(charlie);
                                c1946c.foxtrot(india);
                                c1946c.mike(charlie, india);
                                if (india.bravo == 4) {
                                    c1946c.lima(india.alpha);
                                }
                                i4 = india.bravo;
                                if (i4 != 5) {
                                    c1946c.juliet(new FirebaseInstallationsException(EnumC1948e.alpha));
                                    return;
                                } else if (i4 != 2 && i4 != 1) {
                                    c1946c.kilo(india);
                                    return;
                                } else {
                                    c1946c.juliet(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    india = c1946c.india(charlie);
                    c1946c.foxtrot(india);
                    c1946c.mike(charlie, india);
                    if (india.bravo == 4) {
                    }
                    i4 = india.bravo;
                    if (i4 != 5) {
                    }
                } catch (FirebaseInstallationsException e) {
                    c1946c.juliet(e);
                    return;
                }
        }
    }
}
