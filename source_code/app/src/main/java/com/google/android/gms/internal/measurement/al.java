package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class al extends AbstractBinderC1398z implements am {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.measurement.y, com.google.android.gms.internal.measurement.am] */
    public static am asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof am) {
            return (am) queryLocalInterface;
        }
        return new AbstractC1394y(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v38, types: [com.google.android.gms.internal.measurement.y] */
    /* JADX WARN: Type inference failed for: r5v98, types: [com.google.android.gms.internal.measurement.y] */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1398z
    public final boolean bravo(int i4, Parcel parcel, Parcel parcel2) {
        boolean z2;
        boolean z10;
        boolean z11 = false;
        ao aoVar = null;
        aq aqVar = null;
        ao aoVar2 = null;
        ao aoVar3 = null;
        ao aoVar4 = null;
        ao aoVar5 = null;
        as asVar = null;
        as asVar2 = null;
        as asVar3 = null;
        ao aoVar6 = null;
        ao aoVar7 = null;
        ao aoVar8 = null;
        ao aoVar9 = null;
        ao aoVar10 = null;
        ao aoVar11 = null;
        au auVar = null;
        ao aoVar12 = null;
        ao aoVar13 = null;
        ao aoVar14 = null;
        ao aoVar15 = null;
        ao aoVar16 = null;
        switch (i4) {
            case 1:
                InterfaceC1812b lime = BinderC1814d.lime(parcel.readStrongBinder());
                zzdh zzdhVar = (zzdh) aa.alpha(parcel, zzdh.CREATOR);
                long readLong = parcel.readLong();
                aa.bravo(parcel);
                initialize(lime, zzdhVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long readLong2 = parcel.readLong();
                aa.bravo(parcel);
                logEvent(readString, readString2, bundle, z2, z10, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof ao) {
                        aoVar = (ao) queryLocalInterface;
                    } else {
                        aoVar = new an(readStrongBinder);
                    }
                }
                ao aoVar17 = aoVar;
                long readLong3 = parcel.readLong();
                aa.bravo(parcel);
                logEventAndBundle(readString3, readString4, bundle2, aoVar17, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC1812b lime2 = BinderC1814d.lime(parcel.readStrongBinder());
                ClassLoader classLoader = aa.alpha;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                long readLong4 = parcel.readLong();
                aa.bravo(parcel);
                setUserProperty(readString5, readString6, lime2, z11, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = aa.alpha;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof ao) {
                        aoVar16 = (ao) queryLocalInterface2;
                    } else {
                        aoVar16 = new an(readStrongBinder2);
                    }
                }
                aa.bravo(parcel);
                getUserProperties(readString7, readString8, z11, aoVar16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof ao) {
                        aoVar15 = (ao) queryLocalInterface3;
                    } else {
                        aoVar15 = new an(readStrongBinder3);
                    }
                }
                aa.bravo(parcel);
                getMaxUserProperties(readString9, aoVar15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                aa.bravo(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                aa.bravo(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                aa.bravo(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof ao) {
                        aoVar14 = (ao) queryLocalInterface4;
                    } else {
                        aoVar14 = new an(readStrongBinder4);
                    }
                }
                aa.bravo(parcel);
                getConditionalUserProperties(readString13, readString14, aoVar14);
                break;
            case 11:
                ClassLoader classLoader3 = aa.alpha;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                long readLong7 = parcel.readLong();
                aa.bravo(parcel);
                setMeasurementEnabled(z11, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                aa.bravo(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                aa.bravo(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                aa.bravo(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                InterfaceC1812b lime3 = BinderC1814d.lime(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                aa.bravo(parcel);
                setCurrentScreen(lime3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof ao) {
                        aoVar13 = (ao) queryLocalInterface5;
                    } else {
                        aoVar13 = new an(readStrongBinder5);
                    }
                }
                aa.bravo(parcel);
                getCurrentScreenName(aoVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof ao) {
                        aoVar12 = (ao) queryLocalInterface6;
                    } else {
                        aoVar12 = new an(readStrongBinder6);
                    }
                }
                aa.bravo(parcel);
                getCurrentScreenClass(aoVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof au) {
                        auVar = (au) queryLocalInterface7;
                    } else {
                        auVar = new AbstractC1394y(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                    }
                }
                aa.bravo(parcel);
                setInstanceIdProvider(auVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof ao) {
                        aoVar11 = (ao) queryLocalInterface8;
                    } else {
                        aoVar11 = new an(readStrongBinder8);
                    }
                }
                aa.bravo(parcel);
                getCachedAppInstanceId(aoVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof ao) {
                        aoVar10 = (ao) queryLocalInterface9;
                    } else {
                        aoVar10 = new an(readStrongBinder9);
                    }
                }
                aa.bravo(parcel);
                getAppInstanceId(aoVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof ao) {
                        aoVar9 = (ao) queryLocalInterface10;
                    } else {
                        aoVar9 = new an(readStrongBinder10);
                    }
                }
                aa.bravo(parcel);
                getGmpAppId(aoVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof ao) {
                        aoVar8 = (ao) queryLocalInterface11;
                    } else {
                        aoVar8 = new an(readStrongBinder11);
                    }
                }
                aa.bravo(parcel);
                generateEventId(aoVar8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                aa.bravo(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                aa.bravo(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                InterfaceC1812b lime4 = BinderC1814d.lime(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                aa.bravo(parcel);
                onActivityStarted(lime4, readLong14);
                break;
            case 26:
                InterfaceC1812b lime5 = BinderC1814d.lime(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                aa.bravo(parcel);
                onActivityStopped(lime5, readLong15);
                break;
            case 27:
                InterfaceC1812b lime6 = BinderC1814d.lime(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                aa.bravo(parcel);
                onActivityCreated(lime6, bundle5, readLong16);
                break;
            case 28:
                InterfaceC1812b lime7 = BinderC1814d.lime(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                aa.bravo(parcel);
                onActivityDestroyed(lime7, readLong17);
                break;
            case 29:
                InterfaceC1812b lime8 = BinderC1814d.lime(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                aa.bravo(parcel);
                onActivityPaused(lime8, readLong18);
                break;
            case 30:
                InterfaceC1812b lime9 = BinderC1814d.lime(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                aa.bravo(parcel);
                onActivityResumed(lime9, readLong19);
                break;
            case 31:
                InterfaceC1812b lime10 = BinderC1814d.lime(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof ao) {
                        aoVar7 = (ao) queryLocalInterface12;
                    } else {
                        aoVar7 = new an(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                aa.bravo(parcel);
                onActivitySaveInstanceState(lime10, aoVar7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof ao) {
                        aoVar6 = (ao) queryLocalInterface13;
                    } else {
                        aoVar6 = new an(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                aa.bravo(parcel);
                performAction(bundle6, aoVar6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC1812b lime11 = BinderC1814d.lime(parcel.readStrongBinder());
                InterfaceC1812b lime12 = BinderC1814d.lime(parcel.readStrongBinder());
                InterfaceC1812b lime13 = BinderC1814d.lime(parcel.readStrongBinder());
                aa.bravo(parcel);
                logHealthData(readInt, readString19, lime11, lime12, lime13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof as) {
                        asVar3 = (as) queryLocalInterface14;
                    } else {
                        asVar3 = new ar(readStrongBinder14);
                    }
                }
                aa.bravo(parcel);
                setEventInterceptor(asVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof as) {
                        asVar2 = (as) queryLocalInterface15;
                    } else {
                        asVar2 = new ar(readStrongBinder15);
                    }
                }
                aa.bravo(parcel);
                registerOnMeasurementEventListener(asVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof as) {
                        asVar = (as) queryLocalInterface16;
                    } else {
                        asVar = new ar(readStrongBinder16);
                    }
                }
                aa.bravo(parcel);
                unregisterOnMeasurementEventListener(asVar);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(aa.alpha);
                aa.bravo(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof ao) {
                        aoVar5 = (ao) queryLocalInterface17;
                    } else {
                        aoVar5 = new an(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                aa.bravo(parcel);
                getTestFlag(aoVar5, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = aa.alpha;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                aa.bravo(parcel);
                setDataCollectionEnabled(z11);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof ao) {
                        aoVar4 = (ao) queryLocalInterface18;
                    } else {
                        aoVar4 = new an(readStrongBinder18);
                    }
                }
                aa.bravo(parcel);
                isDataCollectionEnabled(aoVar4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                aa.bravo(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                aa.bravo(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                aa.bravo(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                aa.bravo(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof ao) {
                        aoVar3 = (ao) queryLocalInterface19;
                    } else {
                        aoVar3 = new an(readStrongBinder19);
                    }
                }
                aa.bravo(parcel);
                getSessionId(aoVar3);
                break;
            case 48:
                Intent intent = (Intent) aa.alpha(parcel, Intent.CREATOR);
                aa.bravo(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdj zzdjVar = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                aa.bravo(parcel);
                setCurrentScreenByScionActivityInfo(zzdjVar, readString20, readString21, readLong25);
                break;
            case 51:
                zzdj zzdjVar2 = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                long readLong26 = parcel.readLong();
                aa.bravo(parcel);
                onActivityStartedByScionActivityInfo(zzdjVar2, readLong26);
                break;
            case 52:
                zzdj zzdjVar3 = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                long readLong27 = parcel.readLong();
                aa.bravo(parcel);
                onActivityStoppedByScionActivityInfo(zzdjVar3, readLong27);
                break;
            case 53:
                zzdj zzdjVar4 = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                Bundle bundle10 = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                aa.bravo(parcel);
                onActivityCreatedByScionActivityInfo(zzdjVar4, bundle10, readLong28);
                break;
            case 54:
                zzdj zzdjVar5 = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                long readLong29 = parcel.readLong();
                aa.bravo(parcel);
                onActivityDestroyedByScionActivityInfo(zzdjVar5, readLong29);
                break;
            case 55:
                zzdj zzdjVar6 = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                long readLong30 = parcel.readLong();
                aa.bravo(parcel);
                onActivityPausedByScionActivityInfo(zzdjVar6, readLong30);
                break;
            case 56:
                zzdj zzdjVar7 = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                long readLong31 = parcel.readLong();
                aa.bravo(parcel);
                onActivityResumedByScionActivityInfo(zzdjVar7, readLong31);
                break;
            case 57:
                zzdj zzdjVar8 = (zzdj) aa.alpha(parcel, zzdj.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface20 instanceof ao) {
                        aoVar2 = (ao) queryLocalInterface20;
                    } else {
                        aoVar2 = new an(readStrongBinder20);
                    }
                }
                long readLong32 = parcel.readLong();
                aa.bravo(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdjVar8, aoVar2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    if (queryLocalInterface21 instanceof aq) {
                        aqVar = (aq) queryLocalInterface21;
                    } else {
                        aqVar = new AbstractC1394y(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 0);
                    }
                }
                aa.bravo(parcel);
                retrieveAndUploadBatches(aqVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
