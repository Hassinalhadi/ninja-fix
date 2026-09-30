package com.incognia.internal;

import android.os.SystemClock;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Ha {
    public Ha(W6 w62) {
    }

    public final zhK W(CellInfo cellInfo) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        String valueOf5;
        String valueOf6;
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
            YQT yqt = YQT.f9991b;
            int cid = cellIdentity.getCid();
            int lac = cellIdentity.getLac();
            int dbm = cellSignalStrength.getDbm();
            long b2 = b(cellInfoGsm);
            CnH cnH = CnH.f8484b;
            if (CnH.b(cnH, 28, 0, 2)) {
                valueOf5 = cellIdentity.getMccString();
            } else {
                valueOf5 = String.valueOf(cellIdentity.getMcc());
            }
            String str = valueOf5;
            if (CnH.b(cnH, 28, 0, 2)) {
                valueOf6 = cellIdentity.getMncString();
            } else {
                valueOf6 = String.valueOf(cellIdentity.getMnc());
            }
            return new zhK(yqt, cid, lac, dbm, b2, str, valueOf6);
        }
        if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity2 = cellInfoLte.getCellIdentity();
            CellSignalStrengthLte cellSignalStrength2 = cellInfoLte.getCellSignalStrength();
            t3i t3iVar = t3i.f11352b;
            int ci = cellIdentity2.getCi();
            int tac = cellIdentity2.getTac();
            int dbm2 = cellSignalStrength2.getDbm();
            long b4 = b(cellInfoLte);
            CnH cnH2 = CnH.f8484b;
            if (CnH.b(cnH2, 28, 0, 2)) {
                valueOf3 = cellIdentity2.getMccString();
            } else {
                valueOf3 = String.valueOf(cellIdentity2.getMcc());
            }
            String str2 = valueOf3;
            if (CnH.b(cnH2, 28, 0, 2)) {
                valueOf4 = cellIdentity2.getMncString();
            } else {
                valueOf4 = String.valueOf(cellIdentity2.getMnc());
            }
            return new zhK(t3iVar, ci, tac, dbm2, b4, str2, valueOf4);
        }
        if (cellInfo instanceof CellInfoWcdma) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            CellSignalStrengthWcdma cellSignalStrength3 = cellInfoWcdma.getCellSignalStrength();
            Da0 da0 = Da0.f8536b;
            int cid2 = cellIdentity3.getCid();
            int lac2 = cellIdentity3.getLac();
            int dbm3 = cellSignalStrength3.getDbm();
            long b6 = b(cellInfoWcdma);
            CnH cnH3 = CnH.f8484b;
            if (CnH.b(cnH3, 28, 0, 2)) {
                valueOf = cellIdentity3.getMccString();
            } else {
                valueOf = String.valueOf(cellIdentity3.getMcc());
            }
            String str3 = valueOf;
            if (CnH.b(cnH3, 28, 0, 2)) {
                valueOf2 = cellIdentity3.getMncString();
            } else {
                valueOf2 = String.valueOf(cellIdentity3.getMnc());
            }
            return new zhK(da0, cid2, lac2, dbm3, b6, str3, valueOf2);
        }
        return null;
    }

    public final long b(CellInfo cellInfo) {
        long millis;
        if (CnH.b(CnH.f8484b, 30, 0, 2)) {
            millis = cellInfo.getTimestampMillis();
        } else {
            millis = TimeUnit.NANOSECONDS.toMillis(cellInfo.getTimeStamp());
        }
        return (System.currentTimeMillis() + millis) - SystemClock.elapsedRealtime();
    }
}
