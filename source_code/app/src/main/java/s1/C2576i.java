package s1;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.network.network.models.Country;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import g.C1718a;
import j9.InterfaceC1954a;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3080x2;
import t6.AbstractC3090z2;
import ue.C3158b;
import x9.InterfaceC3312f;

/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2576i implements ComponentSupplier, InterfaceC3312f, InterfaceC1954a {
    public Object alpha;

    public /* synthetic */ C2576i(Object obj) {
        this.alpha = obj;
    }

    public static C2576i bravo(String str, byte[] bArr) {
        z7.G g2;
        z7.ap tango = z7.aq.tango();
        tango.charlie();
        z7.aq.mike((z7.aq) tango.purple, str);
        C1489g delta = AbstractC1490h.delta(bArr, 0, bArr.length);
        tango.charlie();
        z7.aq.november((z7.aq) tango.purple, delta);
        int mike = av.q.mike(1);
        if (mike != 0) {
            if (mike != 1) {
                if (mike != 2) {
                    if (mike == 3) {
                        g2 = z7.G.CRUNCHY;
                    } else {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                } else {
                    g2 = z7.G.RAW;
                }
            } else {
                g2 = z7.G.LEGACY;
            }
        } else {
            g2 = z7.G.TINK;
        }
        tango.charlie();
        z7.aq.oscar((z7.aq) tango.purple, g2);
        return new C2576i((z7.aq) tango.alpha());
    }

    public static C2576i hotel(int i4, int i5, int i10, int i11, boolean z2, boolean z10) {
        return new C2576i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i4, i5, i10, i11, z2, z10));
    }

    public static int india() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i4 = 0;
        while (i4 == 0) {
            secureRandom.nextBytes(bArr);
            i4 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i4;
    }

    public synchronized void alpha(z7.aq aqVar) {
        z7.au foxtrot = foxtrot(aqVar);
        z7.as asVar = (z7.as) this.alpha;
        asVar.charlie();
        z7.av.november((z7.av) asVar.purple, foxtrot);
    }

    @Override // x9.InterfaceC3312f
    public void black(View view, int i4, Object obj) {
        Country item = (Country) obj;
        Intrinsics.echo(item, "item");
        Intrinsics.echo(view, "view");
        ((StartWorkFragment) this.alpha).uniform(item);
    }

    public D8.c charlie(Ne.b classId, Me.f jvmMetadataVersion) {
        C3158b alpha;
        Intrinsics.echo(classId, "classId");
        Intrinsics.echo(jvmMetadataVersion, "jvmMetadataVersion");
        String november = kotlin.text.r.november(classId.hotel().bravo(), '.', '$');
        if (!classId.golf().delta()) {
            november = classId.golf() + '.' + november;
        }
        Class bravo = AbstractC3080x2.bravo((ClassLoader) this.alpha, november);
        if (bravo != null && (alpha = AbstractC3090z2.alpha(bravo)) != null) {
            return new D8.c(12, alpha);
        }
        return null;
    }

    public synchronized C1718a delta() {
        z7.av avVar;
        avVar = (z7.av) ((z7.as) this.alpha).alpha();
        if (avVar.papa() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new C1718a(26, avVar);
    }

    public synchronized boolean echo(int i4) {
        Iterator it = Collections.unmodifiableList(((z7.av) ((z7.as) this.alpha).purple).quebec()).iterator();
        while (it.hasNext()) {
            if (((z7.au) it.next()).romeo() == i4) {
                return true;
            }
        }
        return false;
    }

    public synchronized z7.au foxtrot(z7.aq aqVar) {
        z7.at victor;
        try {
            z7.an delta = s7.j.delta(aqVar);
            int golf = golf();
            z7.G quebec = aqVar.quebec();
            if (quebec == z7.G.UNKNOWN_PREFIX) {
                quebec = z7.G.TINK;
            }
            victor = z7.au.victor();
            victor.charlie();
            z7.au.mike((z7.au) victor.purple, delta);
            victor.charlie();
            z7.au.papa((z7.au) victor.purple, golf);
            victor.charlie();
            z7.au.oscar((z7.au) victor.purple);
            victor.charlie();
            z7.au.november((z7.au) victor.purple, quebec);
        } catch (Throwable th) {
            throw th;
        }
        return (z7.au) victor.alpha();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [M9.b, java.lang.Object] */
    @Override // dagger.hilt.android.internal.managers.ComponentSupplier
    public Object get() {
        return new w9.p(new Q9.a(), new ApplicationContextModule((AndroidApp) this.alpha), new Q9.d(), new Object(), new Q9.e(), new Q9.f());
    }

    public synchronized int golf() {
        int india;
        india = india();
        while (echo(india)) {
            india = india();
        }
        return india;
    }

    @Override // j9.InterfaceC1954a
    public boolean gray() {
        return ((ShiftBookingListingActivityV2) this.alpha).f12470M;
    }

    @Override // j9.InterfaceC1954a
    public boolean isLoading() {
        return ((SwipeRefreshLayout) ((ShiftBookingListingActivityV2) this.alpha).green().foxtrot).red;
    }

    public synchronized void juliet(int i4) {
        for (int i5 = 0; i5 < ((z7.av) ((z7.as) this.alpha).purple).papa(); i5++) {
            try {
                z7.au oscar = ((z7.av) ((z7.as) this.alpha).purple).oscar(i5);
                if (oscar.romeo() == i4) {
                    if (oscar.tango().equals(z7.ao.ENABLED)) {
                        z7.as asVar = (z7.as) this.alpha;
                        asVar.charlie();
                        z7.av.mike((z7.av) asVar.purple, i4);
                    } else {
                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new GeneralSecurityException("key not found: " + i4);
    }

    @Override // j9.InterfaceC1954a
    public void whiskey() {
        ShiftBookingListingActivityV2 shiftBookingListingActivityV2 = (ShiftBookingListingActivityV2) this.alpha;
        shiftBookingListingActivityV2.f12469L++;
        shiftBookingListingActivityV2.gold();
    }
}
