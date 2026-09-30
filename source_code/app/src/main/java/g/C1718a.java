package g;

import Cf.d;
import G6.f;
import G6.h;
import S.g;
import T5.j;
import T5.m;
import V5.ak;
import Y1.aa;
import Y1.r;
import a0.C0366t;
import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.i1;
import androidx.compose.foundation.lazy.layout.ai;
import androidx.compose.runtime.t0;
import androidx.lifecycle.T;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.base.BaseViewModel;
import com.app.network.network.models.SignedAppAgreement;
import com.app.network.network.models.captian.Assets;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.crypto.tink.shaded.protobuf.AbstractC1483a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;
import com.google.crypto.tink.shaded.protobuf.C1494l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.p;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.TrophiesListFragment;
import delivery.samurai.android.ui.about.viewmodel.TrophiesListViewModel;
import delivery.samurai.android.ui.agreement.AgreementFragment;
import delivery.samurai.android.ui.assets.AssetsDetailActivity;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.points.presentation.PointsFragment;
import delivery.samurai.android.ui.points.presentation.PointsViewModel;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import g3.z;
import h6.AbstractC1811a;
import h6.InterfaceC1813c;
import i7.AbstractC1900f;
import j.l;
import j.t;
import j2.InterfaceC1935b;
import j9.InterfaceC1954a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import je.C1961B;
import je.E;
import je.Q;
import je.ah;
import je.an;
import je.ay;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import oe.C2243n;
import of.InterfaceC2247b;
import p0.AbstractC2264a;
import p1.InterfaceC2266a;
import p6.ab;
import p6.e;
import p6.q;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2337m;
import pe.InterfaceC2345u;
import r6.u;
import s0.AbstractC2557q;
import s0.al;
import s0.f0;
import s1.InterfaceC2572e;
import s6.AbstractC2636d7;
import s7.AbstractC2835b;
import s7.k;
import sd.AbstractC2850a;
import sd.x;
import sd.y;
import se.AbstractC2858h;
import se.C2859i;
import se.C2871u;
import se.C2873w;
import se.aj;
import se.aq;
import t1.C2952d;
import t1.C2953e;
import t6.AbstractC3011j2;
import vf.ad;
import vf.ao;
import w.o;
import x9.InterfaceC3312f;
import z7.G;
import z7.af;
import z7.am;
import z7.au;
import z7.av;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1718a implements InterfaceC1954a, InterfaceC1935b, InterfaceC2337m, InterfaceC3312f, InterfaceC2247b, InterfaceC2266a, m, j, f, InterfaceC2572e, x {
    public final /* synthetic */ int alpha;
    public Object purple;

    public /* synthetic */ C1718a(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static final C1718a bronze(gd.a aVar, t7.b bVar) {
        af quebec = af.quebec(aVar.golf(), p.alpha());
        if (quebec.oscar().size() != 0) {
            try {
                av tango = av.tango(bVar.bravo(quebec.oscar().kilo(), new byte[0]), p.alpha());
                if (tango.papa() > 0) {
                    return new C1718a(26, tango);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static C1718a zulu(int i4, int i5, int i10) {
        return new C1718a(28, AccessibilityNodeInfo.CollectionInfo.obtain(i4, i5, false, i10));
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        h hVar = (h) obj2;
        q qVar = (q) obj;
        switch (this.alpha) {
            case 15:
                qVar.blue((LastLocationRequest) this.purple, hVar);
                return;
            default:
                LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) this.purple;
                ab abVar = (ab) qVar.tango();
                p6.j jVar = new p6.j(0, hVar);
                Parcel ivory = abVar.ivory();
                e.bravo(ivory, locationSettingsRequest);
                ivory.writeStrongBinder(jVar);
                ivory.writeString(null);
                abVar.lavender(ivory, 63);
                return;
        }
    }

    @Override // G6.f
    public void alpha() {
        try {
            ak akVar = (ak) ((V5.j) this.purple);
            Parcel ivory = akVar.ivory();
            try {
                akVar.hotel.transact(2, ivory, null, 1);
            } finally {
                ivory.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // pe.InterfaceC2337m
    public Object amber(InterfaceC2345u interfaceC2345u, Object obj) {
        Unit data = (Unit) obj;
        Intrinsics.echo(data, "data");
        return new ah((je.af) this.purple, interfaceC2345u);
    }

    public void azure(InterfaceC1813c interfaceC1813c) {
        AbstractC1811a abstractC1811a = (AbstractC1811a) this.purple;
        abstractC1811a.alpha = interfaceC1813c;
        Iterator it = abstractC1811a.charlie.iterator();
        while (it.hasNext()) {
            ((h6.j) it.next()).bravo();
        }
        abstractC1811a.charlie.clear();
        abstractC1811a.bravo = null;
    }

    public void beige(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((AbstractC1900f) this.purple).alpha(0);
    }

    @Override // x9.InterfaceC3312f
    public void black(View view, int i4, Object obj) {
        int i5;
        switch (this.alpha) {
            case 9:
                SignedAppAgreement item = (SignedAppAgreement) obj;
                Intrinsics.echo(item, "item");
                Intrinsics.echo(view, "view");
                Integer id2 = item.getId();
                if (id2 != null) {
                    i5 = id2.intValue();
                } else {
                    i5 = 0;
                }
                AgreementFragment agreementFragment = (AgreementFragment) this.purple;
                agreementFragment.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("agreementId", i5);
                r alpha = B7.b.alpha(agreementFragment);
                aa foxtrot = alpha.bravo.foxtrot();
                if (foxtrot == null || foxtrot.purple.charlie != R.id.nav_agreement) {
                    alpha = null;
                }
                if (alpha != null) {
                    alpha.charlie(R.id.action_nav_agreement_to_agreementDetailFragment, bundle, null);
                    return;
                }
                return;
            default:
                Assets item2 = (Assets) obj;
                Intrinsics.echo(item2, "item");
                Intrinsics.echo(view, "view");
                AssetsListActivity assetsListActivity = (AssetsListActivity) this.purple;
                Intent intent = new Intent(assetsListActivity, (Class<?>) AssetsDetailActivity.class);
                intent.putExtra("ASSET_OBJECT", assetsListActivity.f12157K.india(item2));
                assetsListActivity.startActivityForResult(intent, assetsListActivity.f12158L);
                return;
        }
    }

    public boolean blue(int i4, int i5, Bundle bundle) {
        return false;
    }

    @Override // s1.InterfaceC2572e
    public ClipData bravo() {
        return z.foxtrot((ContentInfo) this.purple);
    }

    @Override // j2.InterfaceC1935b
    public void charlie(int i4, Serializable serializable) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.purple).setResultCode(i4);
    }

    @Override // p1.InterfaceC2266a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.purple;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // pe.InterfaceC2337m
    public Object coral(Object obj, se.z zVar) {
        return null;
    }

    public boolean crimson(al alVar) {
        if (!alVar.cyan()) {
            AbstractC2264a.bravo("DepthSortedSet.remove called on an unattached node");
        }
        return ((f0) this.purple).remove(alVar);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.s, java.lang.Object] */
    public ArrayList cyan(int i4) {
        Function1 function1;
        l lVar;
        boolean z2 = true;
        ArrayList arrayList = new ArrayList();
        t tVar = (t) this.purple;
        g echo = u.echo();
        ArrayList arrayList2 = null;
        if (echo != null) {
            function1 = echo.echo();
        } else {
            function1 = null;
        }
        g foxtrot = u.foxtrot(echo);
        try {
            if (tVar.bravo) {
                lVar = tVar.charlie;
            } else {
                lVar = (l) ((t0) tVar.echo).getValue();
            }
            l lVar2 = lVar;
            if (lVar2 != null) {
                ?? obj = new Object();
                obj.alpha = 1;
                List list = (List) lVar2.kilo.invoke(Integer.valueOf(i4));
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    Pair pair = (Pair) list.get(i5);
                    ai aiVar = tVar.oscar;
                    int intValue = ((Number) pair.getFirst()).intValue();
                    boolean z10 = z2;
                    long j5 = ((Q0.a) pair.getSecond()).alpha;
                    J2.l lVar3 = t.whiskey;
                    arrayList = arrayList;
                    arrayList.add(aiVar.alpha(intValue, j5, false, new X9.e(arrayList2, (s) obj, list, i4, lVar2)));
                    i5++;
                    z2 = z10;
                }
            }
            return arrayList;
        } finally {
            u.juliet(echo, foxtrot, function1);
        }
    }

    @Override // pe.InterfaceC2337m
    public Object delta(AbstractC2858h abstractC2858h, Object obj) {
        return null;
    }

    @Override // s1.InterfaceC2572e
    public int echo() {
        return z.beige((ContentInfo) this.purple);
    }

    @Override // zd.q
    public Set foxtrot() {
        return ((zd.r) AbstractC3011j2.bravo((y) this.purple)).foxtrot();
    }

    @Override // pe.InterfaceC2337m
    public Object gold(se.ai aiVar, Object obj) {
        return amber(aiVar, obj);
    }

    @Override // of.InterfaceC2247b
    public Iterable golf(Object obj) {
        InterfaceC2332h interfaceC2332h;
        InterfaceC2330f interfaceC2330f;
        C2243n this$0 = (C2243n) this.purple;
        Intrinsics.echo(this$0, "this$0");
        Collection lima = ((InterfaceC2330f) obj).tango().lima();
        Intrinsics.delta(lima, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator it = lima.iterator();
        while (it.hasNext()) {
            InterfaceC2332h kilo = ((kotlin.reflect.jvm.internal.impl.types.y) it.next()).green().kilo();
            Ce.j jVar = null;
            if (kilo != null) {
                interfaceC2332h = kilo.alpha();
            } else {
                interfaceC2332h = null;
            }
            if (interfaceC2332h instanceof InterfaceC2330f) {
                interfaceC2330f = (InterfaceC2330f) interfaceC2332h;
            } else {
                interfaceC2330f = null;
            }
            if (interfaceC2330f != null) {
                jVar = this$0.foxtrot(interfaceC2330f);
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }

    @Override // j9.InterfaceC1954a
    public boolean gray() {
        switch (this.alpha) {
            case 2:
                return ((TrophiesListFragment) this.purple).f12115g;
            case 10:
                return ((PointsFragment) this.purple).f12438i;
            default:
                return ((RedeemFragment) this.purple).f12446j;
        }
    }

    @Override // pe.InterfaceC2337m
    public Object hotel(C2859i c2859i, Object obj) {
        return amber(c2859i, obj);
    }

    @Override // pe.InterfaceC2337m
    public Object india(aj ajVar, Object obj) {
        return amber(ajVar, obj);
    }

    @Override // zd.q
    public void indigo(String name, List values) {
        int collectionSizeOrDefault;
        Intrinsics.echo(name, "name");
        Intrinsics.echo(values, "values");
        String echo = AbstractC2850a.echo(name, false);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Intrinsics.echo(str, "<this>");
            arrayList.add(AbstractC2850a.echo(str, true));
        }
        ((y) this.purple).indigo(echo, arrayList);
    }

    @Override // j9.InterfaceC1954a
    public boolean isLoading() {
        switch (this.alpha) {
            case 2:
                o oVar = ((TrophiesListFragment) this.purple).f12112c;
                if (oVar != null) {
                    return ((SwipeRefreshLayout) oVar.red).red;
                }
                Intrinsics.lima("binding");
                throw null;
            case 10:
                i1 i1Var = ((PointsFragment) this.purple).f12435f;
                if (i1Var != null) {
                    return ((SwipeRefreshLayout) i1Var.foxtrot).red;
                }
                Intrinsics.lima("binding");
                throw null;
            default:
                B9.ab abVar = ((RedeemFragment) this.purple).f12442f;
                if (abVar != null) {
                    return ((SwipeRefreshLayout) abVar.teal).red;
                }
                Intrinsics.lima("binding");
                throw null;
        }
    }

    @Override // pe.InterfaceC2337m
    public Object jade(se.y yVar, Object obj) {
        return null;
    }

    @Override // T5.j
    public /* synthetic */ void juliet(Object obj) {
        ((LocationCallback) obj).onLocationAvailability((LocationAvailability) this.purple);
    }

    @Override // pe.InterfaceC2337m
    public Object kilo(C2871u c2871u, Object obj) {
        return null;
    }

    @Override // j2.InterfaceC1935b
    public void lima() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // pe.InterfaceC2337m
    public Object magenta(C2873w c2873w, Object obj) {
        return null;
    }

    @Override // pe.InterfaceC2337m
    public Object maroon(aq aqVar, Object obj) {
        return null;
    }

    public void mike(al alVar) {
        if (!alVar.cyan()) {
            AbstractC2264a.bravo("DepthSortedSet.add called on an unattached node");
        }
        ((f0) this.purple).add(alVar);
    }

    @Override // zd.q
    public Set names() {
        int collectionSizeOrDefault;
        Set keySet = ((Map) ((y) this.purple).alpha).keySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2850a.delta(0, 0, 15, (String) it.next()));
        }
        return CollectionsKt.D(arrayList);
    }

    @Override // pe.InterfaceC2337m
    public Object navy(ef.s sVar, Object obj) {
        return null;
    }

    @Override // s1.InterfaceC2572e
    public int november() {
        return z.echo((ContentInfo) this.purple);
    }

    @Override // pe.InterfaceC2337m
    public Object ochre(se.ah descriptor, Object obj) {
        int i4;
        Unit data = (Unit) obj;
        Intrinsics.echo(descriptor, "descriptor");
        Intrinsics.echo(data, "data");
        int i5 = 0;
        if (descriptor.f13729m != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (descriptor.f13730n != null) {
            i5 = 1;
        }
        int i10 = i4 + i5;
        boolean z2 = descriptor.white;
        je.af afVar = (je.af) this.purple;
        if (z2) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return new an(afVar, descriptor);
                    }
                } else {
                    return new je.al(afVar, descriptor);
                }
            } else {
                return new je.aj(afVar, descriptor);
            }
        } else if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return new E(afVar, descriptor);
                }
            } else {
                return new C1961B(afVar, descriptor);
            }
        } else {
            return new ay(afVar, descriptor);
        }
        throw new Q("Unsupported property: " + descriptor);
    }

    @Override // s1.InterfaceC2572e
    public ContentInfo oscar() {
        return (ContentInfo) this.purple;
    }

    @Override // zd.q
    public List p(String name) {
        int collectionSizeOrDefault;
        Intrinsics.echo(name, "name");
        List p4 = ((y) this.purple).p(AbstractC2850a.echo(name, false));
        if (p4 != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(p4, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = p4.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC2850a.delta(0, 0, 11, (String) it.next()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // p1.InterfaceC2266a
    public Cursor papa(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.purple;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void quebec(int i4, C2952d c2952d, String str, Bundle bundle) {
    }

    public C2952d romeo(int i4) {
        return null;
    }

    @Override // pe.InterfaceC2337m
    public Object sierra(se.ab abVar, Object obj) {
        return null;
    }

    public long tango() {
        int i4 = C0366t.lima;
        long readLong = ((Parcel) this.purple).readLong();
        long j5 = 63 & readLong;
        if (j5 < 16) {
            return readLong;
        }
        return (readLong & (-64)) | (j5 + 1);
    }

    public String toString() {
        switch (this.alpha) {
            case 20:
                return ((f0) this.purple).toString();
            case 21:
                return "ContentInfoCompat{" + ((ContentInfo) this.purple) + "}";
            case 26:
                return k.alpha((av) this.purple).toString();
            default:
                return super.toString();
        }
    }

    public long uniform() {
        long j5;
        Parcel parcel = (Parcel) this.purple;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j5 = 4294967296L;
        } else if (readByte == 2) {
            j5 = 8589934592L;
        } else {
            j5 = 0;
        }
        if (Q0.q.alpha(j5, 0L)) {
            return Q0.p.charlie;
        }
        return AbstractC2636d7.delta(parcel.readFloat(), j5);
    }

    public C2952d victor(int i4) {
        return null;
    }

    @Override // j9.InterfaceC1954a
    public void whiskey() {
        switch (this.alpha) {
            case 2:
                if (!isLoading()) {
                    TrophiesListFragment trophiesListFragment = (TrophiesListFragment) this.purple;
                    TrophiesListViewModel trophiesListViewModel = (TrophiesListViewModel) trophiesListFragment.f12111b.getValue();
                    BaseViewModel.launchApi$default(trophiesListViewModel, null, new ka.h(trophiesListViewModel, trophiesListFragment.e, trophiesListFragment.f12114f, null), 1, null);
                    trophiesListFragment.f12114f++;
                    return;
                }
                return;
            case 10:
                PointsFragment pointsFragment = (PointsFragment) this.purple;
                pointsFragment.f12437h++;
                if (!isLoading() && pointsFragment.f12437h != 0) {
                    PointsViewModel quebec = pointsFragment.quebec();
                    int i4 = pointsFragment.f12437h;
                    V1.a hotel = T.hotel(quebec);
                    Cf.e eVar = ao.alpha;
                    ad.zulu(hotel, d.purple, null, new lc.k(quebec, i4, null), 2);
                    return;
                }
                return;
            default:
                RedeemFragment redeemFragment = (RedeemFragment) this.purple;
                redeemFragment.f12445i++;
                redeemFragment.quebec().alpha(redeemFragment.f12445i);
                return;
        }
    }

    public Object xray(Class cls) {
        Class alpha;
        byte[] array;
        s7.h hVar = (s7.h) s7.j.echo.get(cls);
        if (hVar == null) {
            alpha = null;
        } else {
            alpha = hVar.alpha();
        }
        if (alpha != null) {
            int i4 = k.alpha;
            av avVar = (av) this.purple;
            int romeo = avVar.romeo();
            Iterator it = avVar.quebec().iterator();
            int i5 = 0;
            boolean z2 = false;
            boolean z10 = true;
            while (true) {
                boolean hasNext = it.hasNext();
                z7.ao aoVar = z7.ao.ENABLED;
                if (hasNext) {
                    au auVar = (au) it.next();
                    if (auVar.tango() == aoVar) {
                        if (auVar.uniform()) {
                            if (auVar.sierra() != G.UNKNOWN_PREFIX) {
                                if (auVar.tango() != z7.ao.UNKNOWN_STATUS) {
                                    if (auVar.romeo() == romeo) {
                                        if (!z2) {
                                            z2 = true;
                                        } else {
                                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                                        }
                                    }
                                    if (auVar.quebec().quebec() != am.ASYMMETRIC_PUBLIC) {
                                        z10 = false;
                                    }
                                    i5++;
                                } else {
                                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(auVar.romeo())));
                                }
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(auVar.romeo())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(auVar.romeo())));
                        }
                    }
                } else {
                    if (i5 != 0) {
                        if (!z2 && !z10) {
                            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                        }
                        com.bumptech.glide.load.engine.h hVar2 = new com.bumptech.glide.load.engine.h(alpha);
                        for (au auVar2 : avVar.quebec()) {
                            if (auVar2.tango() == aoVar) {
                                Object charlie = s7.j.charlie(auVar2.quebec().romeo(), auVar2.quebec().sierra(), alpha);
                                if (auVar2.tango() == aoVar) {
                                    int ordinal = auVar2.sierra().ordinal();
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            if (ordinal != 3) {
                                                if (ordinal != 4) {
                                                    throw new GeneralSecurityException("unknown output prefix type");
                                                }
                                            } else {
                                                array = AbstractC2835b.alpha;
                                            }
                                        }
                                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(auVar2.romeo()).array();
                                    } else {
                                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(auVar2.romeo()).array();
                                    }
                                    s7.f fVar = new s7.f(charlie, array, auVar2.tango(), auVar2.sierra());
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(fVar);
                                    s7.g gVar = new s7.g(fVar.alpha());
                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar2.purple;
                                    List list = (List) concurrentHashMap.put(gVar, Collections.unmodifiableList(arrayList));
                                    if (list != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.addAll(list);
                                        arrayList2.add(fVar);
                                        concurrentHashMap.put(gVar, Collections.unmodifiableList(arrayList2));
                                    }
                                    if (auVar2.romeo() != avVar.romeo()) {
                                        continue;
                                    } else if (fVar.charlie == aoVar) {
                                        if (!hVar2.juliet(fVar.alpha()).isEmpty()) {
                                            hVar2.red = fVar;
                                        } else {
                                            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                                    }
                                } else {
                                    throw new GeneralSecurityException("only ENABLED key is allowed");
                                }
                            }
                        }
                        s7.h hVar3 = (s7.h) s7.j.echo.get(cls);
                        Class cls2 = (Class) hVar2.silver;
                        if (hVar3 != null) {
                            if (hVar3.alpha().equals(cls2)) {
                                return hVar3.bravo(hVar2);
                            }
                            throw new GeneralSecurityException("Wrong input primitive class, expected " + hVar3.alpha() + ", got " + cls2);
                        }
                        throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
                    }
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
            }
        } else {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
    }

    public z7.an yankee(AbstractC1490h abstractC1490h) {
        A2.aj ajVar = (A2.aj) this.purple;
        try {
            G3.a india = ajVar.india();
            com.google.crypto.tink.shaded.protobuf.ao P4 = india.P(abstractC1490h);
            india.T(P4);
            com.google.crypto.tink.shaded.protobuf.ao aoVar = (com.google.crypto.tink.shaded.protobuf.ao) india.I(P4);
            z7.al tango = z7.an.tango();
            String golf = ajVar.golf();
            tango.charlie();
            z7.an.mike((z7.an) tango.purple, golf);
            AbstractC1483a abstractC1483a = (AbstractC1483a) aoVar;
            try {
                com.google.crypto.tink.shaded.protobuf.x xVar = (com.google.crypto.tink.shaded.protobuf.x) abstractC1483a;
                int foxtrot = xVar.foxtrot();
                byte[] bArr = new byte[foxtrot];
                C1494l c1494l = new C1494l(foxtrot, bArr);
                xVar.lima(c1494l);
                if (c1494l.charlie - c1494l.delta == 0) {
                    C1489g c1489g = new C1489g(bArr);
                    tango.charlie();
                    z7.an.november((z7.an) tango.purple, c1489g);
                    am juliet = ajVar.juliet();
                    tango.charlie();
                    z7.an.oscar((z7.an) tango.purple, juliet);
                    return (z7.an) tango.alpha();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e) {
                throw new RuntimeException(abstractC1483a.alpha("ByteString"), e);
            }
        } catch (InvalidProtocolBufferException e4) {
            throw new GeneralSecurityException("Unexpected proto", e4);
        }
    }

    public C1718a(je.af container) {
        this.alpha = 8;
        Intrinsics.echo(container, "container");
        this.purple = container;
    }

    public C1718a(eg.a _koin) {
        this.alpha = 11;
        Intrinsics.echo(_koin, "_koin");
        this.purple = new ConcurrentHashMap();
    }

    public C1718a(A2.aj ajVar, Class cls) {
        this.alpha = 25;
        if (!((Map) ajVar.charlie).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(av.q.foxtrot("Given internalKeyMananger ", ajVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.purple = ajVar;
    }

    public C1718a(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 24:
                return;
            case 29:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.purple = new C2953e(this);
                    return;
                } else {
                    this.purple = new C2953e(this);
                    return;
                }
            default:
                this.purple = new TreeSet(AbstractC2557q.alpha);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [s1.ac, java.lang.Object, s1.aa] */
    public C1718a(View view) {
        this.alpha = 23;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? aaVar = new s1.aa(view);
            aaVar.bravo = view;
            this.purple = aaVar;
            return;
        }
        this.purple = new s1.aa(view);
    }

    public C1718a(String str) {
        this.alpha = 0;
        Parcel obtain = Parcel.obtain();
        this.purple = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public C1718a(Context context, Uri uri) {
        this.alpha = 14;
        this.purple = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C1718a(ContentInfo contentInfo) {
        this.alpha = 21;
        contentInfo.getClass();
        this.purple = z.november(contentInfo);
    }
}
