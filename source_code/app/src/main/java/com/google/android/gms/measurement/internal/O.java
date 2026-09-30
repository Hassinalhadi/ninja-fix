package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.google.android.gms.internal.measurement.AbstractBinderC1398z;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import e6.AbstractC1630b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class O extends AbstractBinderC1398z implements ae {
    public final Z0 golf;
    public Boolean hotel;
    public String india;

    public O(Z0 z02) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        V5.x.hotel(z02);
        this.golf = z02;
        this.india = null;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final String amber(zzr zzrVar) {
        ivory(zzrVar);
        Z0 z02 = this.golf;
        try {
            return (String) z02.u().c0(new J2.q(4, z02, zzrVar)).get(OkHttpConstants.READ_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ar crimson = z02.crimson();
            crimson.white.charlie(ar.e0(zzrVar.alpha), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void beige(zzr zzrVar, zzpc zzpcVar, ai aiVar) {
        Z0 z02 = this.golf;
        if (!z02.white().j0(null, ac.f7568I)) {
            try {
                aiVar.sierra(new zzpe(Collections.EMPTY_LIST));
                z02.crimson().f7636g.alpha("[sgtm] Client upload is not enabled on the service side.");
                return;
            } catch (RemoteException e) {
                z02.crimson().f7632b.bravo(e, "[sgtm] UploadBatchesCallback failed.");
                return;
            }
        }
        ivory(zzrVar);
        String str = zzrVar.alpha;
        V5.x.hotel(str);
        z02.u().g0(new ao.d(this, str, zzpcVar, aiVar, 1, false));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void black(String str, String str2, String str3, long j5) {
        delta(new L(this, str2, str3, str, j5, 0));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final byte[] blue(zzbh zzbhVar, String str) {
        V5.x.echo(str);
        V5.x.hotel(zzbhVar);
        jade(str, true);
        Z0 z02 = this.golf;
        ar crimson = z02.crimson();
        G g2 = z02.e;
        am amVar = g2.f7510f;
        String str2 = zzbhVar.alpha;
        crimson.f7635f.bravo(amVar.delta(str2), "Log and bundle. event");
        z02.pink().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) z02.u().d0(new C3.b(this, zzbhVar, str)).get();
            if (bArr == null) {
                z02.crimson().white.bravo(ar.e0(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            z02.pink().getClass();
            z02.crimson().f7635f.delta("Log and bundle processed. event, size, time_ms", g2.f7510f.delta(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            ar crimson2 = z02.crimson();
            crimson2.white.delta("Failed to log and bundle. appId, event, error", ar.e0(str), g2.f7510f.delta(str2), e);
            return null;
        } catch (ExecutionException e4) {
            e = e4;
            ar crimson22 = z02.crimson();
            crimson22.white.delta("Failed to log and bundle. appId, event, error", ar.e0(str), g2.f7510f.delta(str2), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.google.android.gms.internal.measurement.y] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.gms.internal.measurement.y] */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1398z
    public final boolean bravo(int i4, Parcel parcel, Parcel parcel2) {
        List list;
        Z0 z02 = this.golf;
        ArrayList arrayList = null;
        ag agVar = null;
        ai aiVar = null;
        boolean z2 = false;
        switch (i4) {
            case 1:
                zzbh zzbhVar = (zzbh) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzbh.CREATOR);
                zzr zzrVar = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                golf(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzqb zzqbVar = (zzqb) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzqb.CREATOR);
                zzr zzrVar2 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                coral(zzqbVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                yankee(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbh zzbhVar2 = (zzbh) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzbh.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                V5.x.hotel(zzbhVar2);
                V5.x.echo(readString);
                jade(readString, true);
                delta(new D2.d(this, zzbhVar2, readString, 7, false));
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                uniform(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                ivory(zzrVar5);
                String str = zzrVar5.alpha;
                V5.x.hotel(str);
                try {
                    List<c1> list2 = (List) z02.u().c0(new J2.q(2, this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (c1 c1Var : list2) {
                        if (!z2 && d1.Q0(c1Var.charlie)) {
                        }
                        arrayList2.add(new zzqb(c1Var));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    z02.crimson().white.charlie(ar.e0(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e4) {
                    e = e4;
                    z02.crimson().white.charlie(ar.e0(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbh zzbhVar3 = (zzbh) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzbh.CREATOR);
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                byte[] blue = blue(zzbhVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(blue);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                black(readString3, readString4, readString5, readLong);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                String amber = amber(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(amber);
                return true;
            case 12:
                zzai zzaiVar = (zzai) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzai.CREATOR);
                zzr zzrVar7 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                bronze(zzaiVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzai zzaiVar2 = (zzai) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzai.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                V5.x.hotel(zzaiVar2);
                V5.x.hotel(zzaiVar2.red);
                V5.x.echo(zzaiVar2.alpha);
                jade(zzaiVar2.alpha, true);
                delta(new be.g(10, this, new zzai(zzaiVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.aa.alpha;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                zzr zzrVar8 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                List hotel = hotel(readString6, readString7, z2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(hotel);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.aa.alpha;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                List echo = echo(readString8, readString9, z2, readString10);
                parcel2.writeNoException();
                parcel2.writeTypedList(echo);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzr zzrVar9 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                List indigo = indigo(readString11, readString12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(indigo);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                List papa = papa(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(papa);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                foxtrot(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.aa.alpha(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                juliet(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                green(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                zzap gray = gray(zzrVar13);
                parcel2.writeNoException();
                if (gray == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                gray.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.aa.alpha(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                ivory(zzrVar14);
                String str2 = zzrVar14.alpha;
                V5.x.hotel(str2);
                if (z02.white().j0(null, ac.f7586a0)) {
                    try {
                        list = (List) z02.u().d0(new N(this, zzrVar14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e5) {
                        z02.crimson().white.charlie(ar.e0(str2), e5, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) z02.u().c0(new N(this, zzrVar14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        z02.crimson().white.charlie(ar.e0(str2), e10, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                crimson(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                quebec(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                fuchsia(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                zzpc zzpcVar = (zzpc) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzpc.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    if (queryLocalInterface instanceof ai) {
                        aiVar = (ai) queryLocalInterface;
                    } else {
                        aiVar = new AbstractC1394y(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                    }
                }
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                beige(zzrVar18, zzpcVar, aiVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                zzag zzagVar = (zzag) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzag.CREATOR);
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                gold(zzrVar19, zzagVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.aa.alpha(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    if (queryLocalInterface2 instanceof ag) {
                        agVar = (ag) queryLocalInterface2;
                    } else {
                        agVar = new AbstractC1394y(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                    }
                }
                com.google.android.gms.internal.measurement.aa.bravo(parcel);
                whiskey(zzrVar20, bundle3, agVar);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void bronze(zzai zzaiVar, zzr zzrVar) {
        V5.x.hotel(zzaiVar);
        V5.x.hotel(zzaiVar.red);
        ivory(zzrVar);
        zzai zzaiVar2 = new zzai(zzaiVar);
        zzaiVar2.alpha = zzrVar.alpha;
        delta(new D2.d(this, zzaiVar2, zzrVar, 5, false));
    }

    public final void charlie(Runnable runnable) {
        Z0 z02 = this.golf;
        if (z02.u().i0()) {
            runnable.run();
        } else {
            z02.u().h0(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void coral(zzqb zzqbVar, zzr zzrVar) {
        V5.x.hotel(zzqbVar);
        ivory(zzrVar);
        delta(new D2.d(this, zzqbVar, zzrVar, 8, false));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void crimson(zzr zzrVar) {
        V5.x.echo(zzrVar.alpha);
        V5.x.hotel(zzrVar.f7709n);
        charlie(new I(this, zzrVar, 0));
    }

    public final void delta(Runnable runnable) {
        Z0 z02 = this.golf;
        if (z02.u().i0()) {
            runnable.run();
        } else {
            z02.u().g0(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List echo(String str, String str2, boolean z2, String str3) {
        jade(str, true);
        Z0 z02 = this.golf;
        try {
            List<c1> list = (List) z02.u().c0(new M(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (c1 c1Var : list) {
                if (!z2 && d1.Q0(c1Var.charlie)) {
                }
                arrayList.add(new zzqb(c1Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            Object obj = e;
            ar crimson = z02.crimson();
            crimson.white.charlie(ar.e0(str), obj, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e4) {
            e = e4;
            Object obj2 = e;
            ar crimson2 = z02.crimson();
            crimson2.white.charlie(ar.e0(str), obj2, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void foxtrot(zzr zzrVar) {
        String str = zzrVar.alpha;
        V5.x.echo(str);
        jade(str, false);
        delta(new J(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void fuchsia(zzr zzrVar) {
        ivory(zzrVar);
        delta(new I(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void gold(zzr zzrVar, zzag zzagVar) {
        if (!this.golf.white().j0(null, ac.f7568I)) {
            return;
        }
        ivory(zzrVar);
        delta(new D2.d(this, zzrVar, zzagVar, 4));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void golf(zzbh zzbhVar, zzr zzrVar) {
        V5.x.hotel(zzbhVar);
        ivory(zzrVar);
        delta(new D2.d(this, zzbhVar, zzrVar, 6, false));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final zzap gray(zzr zzrVar) {
        ivory(zzrVar);
        String str = zzrVar.alpha;
        V5.x.echo(str);
        Z0 z02 = this.golf;
        try {
            return (zzap) z02.u().d0(new J2.q(3, this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ar crimson = z02.crimson();
            crimson.white.charlie(ar.e0(str), e, "Failed to get consent. appId");
            return new zzap(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void green(zzr zzrVar) {
        V5.x.echo(zzrVar.alpha);
        V5.x.hotel(zzrVar.f7709n);
        charlie(new K(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List hotel(String str, String str2, boolean z2, zzr zzrVar) {
        ivory(zzrVar);
        String str3 = zzrVar.alpha;
        V5.x.hotel(str3);
        Z0 z02 = this.golf;
        try {
            List<c1> list = (List) z02.u().c0(new M(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (c1 c1Var : list) {
                if (!z2 && d1.Q0(c1Var.charlie)) {
                }
                arrayList.add(new zzqb(c1Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            Object obj = e;
            ar crimson = z02.crimson();
            crimson.white.charlie(ar.e0(str3), obj, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e4) {
            e = e4;
            Object obj2 = e;
            ar crimson2 = z02.crimson();
            crimson2.white.charlie(ar.e0(str3), obj2, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List indigo(String str, String str2, zzr zzrVar) {
        ivory(zzrVar);
        String str3 = zzrVar.alpha;
        V5.x.hotel(str3);
        Z0 z02 = this.golf;
        try {
            return (List) z02.u().c0(new M(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            z02.crimson().white.bravo(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    public final void ivory(zzr zzrVar) {
        V5.x.hotel(zzrVar);
        String str = zzrVar.alpha;
        V5.x.echo(str);
        jade(str, false);
        this.golf.bravo().F0(zzrVar.purple, zzrVar.f7704i);
    }

    public final void jade(String str, boolean z2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        Z0 z02 = this.golf;
        if (!isEmpty) {
            if (z2) {
                try {
                    if (this.hotel == null) {
                        boolean z10 = true;
                        if (!"com.google.android.gms".equals(this.india) && !AbstractC1630b.echo(z02.e.alpha, Binder.getCallingUid()) && !com.google.android.gms.common.f.bravo(z02.e.alpha).charlie(Binder.getCallingUid())) {
                            z10 = false;
                        }
                        this.hotel = Boolean.valueOf(z10);
                    }
                    if (this.hotel.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    z02.crimson().white.bravo(ar.e0(str), "Measurement Service called with invalid calling package. appId");
                    throw e;
                }
            }
            if (this.india == null && com.google.android.gms.common.e.uidHasPackageName(z02.e.alpha, Binder.getCallingUid(), str)) {
                this.india = str;
            }
            if (str.equals(this.india)) {
                return;
            }
            throw new SecurityException("Unknown calling package name '" + str + "'.");
        }
        z02.crimson().white.alpha("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void juliet(Bundle bundle, zzr zzrVar) {
        ivory(zzrVar);
        String str = zzrVar.alpha;
        V5.x.hotel(str);
        delta(new ao.d(this, bundle, str, zzrVar, 2, false));
    }

    public final void lavender(zzbh zzbhVar, zzr zzrVar) {
        Z0 z02 = this.golf;
        z02.echo();
        z02.lima(zzbhVar, zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List papa(String str, String str2, String str3) {
        jade(str, true);
        Z0 z02 = this.golf;
        try {
            return (List) z02.u().c0(new M(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            z02.crimson().white.bravo(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void quebec(zzr zzrVar) {
        V5.x.echo(zzrVar.alpha);
        V5.x.hotel(zzrVar.f7709n);
        charlie(new J(this, zzrVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void uniform(zzr zzrVar) {
        ivory(zzrVar);
        delta(new I(this, zzrVar, 2));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void whiskey(zzr zzrVar, Bundle bundle, ag agVar) {
        ivory(zzrVar);
        String str = zzrVar.alpha;
        V5.x.hotel(str);
        this.golf.u().g0(new H(this, zzrVar, bundle, agVar, str, 0));
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void yankee(zzr zzrVar) {
        ivory(zzrVar);
        delta(new K(this, zzrVar, 0));
    }
}
