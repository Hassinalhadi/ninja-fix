package com.incognia.internal;

import com.google.android.material.datepicker.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AZ implements L46 {

    /* renamed from: J, reason: collision with root package name */
    public static final String f8364J = (String) wGk.ss.getValue();
    public static final String PqK = (String) wGk.dA.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f8365V = (String) wGk.rz.getValue();
    public static final String olU = (String) wGk.WP.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final Om f8366W;

    /* renamed from: b, reason: collision with root package name */
    public final String f8367b;

    /* renamed from: f9, reason: collision with root package name */
    public final List f8368f9;
    public final jNy gmP;
    public final long sVU;

    public AZ(String str, Om om, List list, long j5, jNy jny) {
        this.f8367b = str;
        this.f8366W = om;
        this.f8368f9 = list;
        this.sVU = j5;
        this.gmP = jny;
    }

    public final JSONObject b() {
        String str = NWf.f9221b;
        Om om = this.f8366W;
        JSONObject jSONObject = new JSONObject();
        Object obj = om.f9350b;
        if (obj != null) {
            jSONObject.put(NWf.f9221b, obj);
        }
        Object obj2 = om.f9346W;
        if (obj2 != null) {
            jSONObject.put(NWf.f9217W, obj2);
        }
        Object obj3 = om.f9353f9;
        if (obj3 != null) {
            jSONObject.put(NWf.f9224f9, obj3);
        }
        Object obj4 = om.sVU;
        if (obj4 != null) {
            jSONObject.put(NWf.sVU, obj4);
        }
        TL tl = om.gmP;
        if (tl != null) {
            String str2 = NWf.gmP;
            String str3 = em6.f10389b;
            JSONObject jSONObject2 = new JSONObject();
            if (tl.f9665b != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = tl.f9665b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put(em6.f10389b, jSONArray);
            }
            String str4 = tl.f9664W;
            if (str4 != null) {
                jSONObject2.put(em6.f10388W, str4);
            }
            jSONObject.put(str2, jSONObject2);
        }
        VJU vju = om.f9336J;
        if (vju != null) {
            String str5 = NWf.f9207J;
            String str6 = nt.f10975b;
            JSONObject jSONObject3 = new JSONObject();
            Long l10 = vju.f9770b;
            if (l10 != null) {
                jSONObject3.put(nt.f10975b, l10.longValue());
            }
            Long l11 = vju.f9769W;
            if (l11 != null) {
                jSONObject3.put(nt.f10974W, l11.longValue());
            }
            Long l12 = vju.f9771f9;
            if (l12 != null) {
                jSONObject3.put(nt.f10976f9, l12.longValue());
            }
            String str7 = vju.sVU;
            if (str7 != null) {
                jSONObject3.put(nt.sVU, str7);
            }
            jSONObject3.put(nt.gmP, vju.gmP);
            String str8 = vju.f9768J;
            if (str8 != null) {
                jSONObject3.put(nt.f10973J, str8);
            }
            if (vju.PqK != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = vju.PqK.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((String) it2.next());
                }
                jSONObject3.put(nt.PqK, jSONArray2);
            }
            jSONObject.put(str5, jSONObject3);
        }
        Mh mh = om.PqK;
        if (mh != null) {
            String str9 = NWf.PqK;
            String str10 = Gc.f8800b;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(Gc.f8800b, mh.f9162b);
            jSONObject4.put(Gc.f8799W, mh.f9161W);
            jSONObject4.put(Gc.f8801f9, mh.f9163f9);
            jSONObject4.put(Gc.sVU, mh.sVU);
            jSONObject4.put(Gc.gmP, mh.gmP);
            jSONObject4.put(Gc.f8796J, mh.f9158J);
            jSONObject4.put(Gc.PqK, mh.PqK);
            jSONObject4.put(Gc.f8798V, mh.f9160V);
            String str11 = mh.olU;
            if (str11 != null) {
                jSONObject4.put(Gc.olU, str11);
            }
            Integer num = mh.f9159R;
            if (num != null) {
                jSONObject4.put(Gc.f8797R, num.intValue());
            }
            jSONObject.put(str9, jSONObject4);
        }
        s0 s0Var = om.f9345V;
        if (s0Var != null) {
            String str12 = NWf.f9216V;
            String str13 = Kdw.f9016b;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(Kdw.f9016b, s0Var.f11255b);
            jSONObject5.put(Kdw.f9015W, s0Var.f11254W);
            jSONObject.put(str12, jSONObject5);
        }
        Object obj5 = om.olU;
        if (obj5 != null) {
            jSONObject.put(NWf.olU, obj5);
        }
        Object obj6 = om.f9343R;
        if (obj6 != null) {
            jSONObject.put(NWf.f9214R, obj6);
        }
        DdD ddD = om.DOu;
        if (ddD != null) {
            String str14 = NWf.DOu;
            String str15 = GV.f8782b;
            JSONObject jSONObject6 = new JSONObject();
            String str16 = ddD.f8547b;
            if (str16 != null) {
                jSONObject6.put(GV.f8782b, str16);
            }
            String str17 = ddD.f8544W;
            if (str17 != null) {
                jSONObject6.put(GV.f8779W, str17);
            }
            String str18 = ddD.f8548f9;
            if (str18 != null) {
                jSONObject6.put(GV.f8783f9, str18);
            }
            String str19 = ddD.sVU;
            if (str19 != null) {
                jSONObject6.put(GV.sVU, str19);
            }
            String str20 = ddD.gmP;
            if (str20 != null) {
                jSONObject6.put(GV.gmP, str20);
            }
            String str21 = ddD.f8539J;
            if (str21 != null) {
                jSONObject6.put(GV.f8774J, str21);
            }
            String str22 = ddD.PqK;
            if (str22 != null) {
                jSONObject6.put(GV.PqK, str22);
            }
            String str23 = ddD.f8543V;
            if (str23 != null) {
                jSONObject6.put(GV.f8778V, str23);
            }
            Integer num2 = ddD.olU;
            if (num2 != null) {
                jSONObject6.put(GV.olU, num2.intValue());
            }
            String str24 = ddD.f8542R;
            if (str24 != null) {
                jSONObject6.put(GV.f8777R, str24);
            }
            String str25 = ddD.DOu;
            if (str25 != null) {
                jSONObject6.put(GV.DOu, str25);
            }
            String str26 = ddD.IB;
            if (str26 != null) {
                jSONObject6.put(GV.IB, str26);
            }
            String str27 = ddD.Qs;
            if (str27 != null) {
                jSONObject6.put(GV.Qs, str27);
            }
            String str28 = ddD.f8538E;
            if (str28 != null) {
                jSONObject6.put(GV.f8773E, str28);
            }
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = ddD.f8549n9.iterator();
            while (it3.hasNext()) {
                jSONArray3.put((String) it3.next());
            }
            jSONObject6.put(GV.f8784n9, jSONArray3);
            if (ddD.f8545Y != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator it4 = ddD.f8545Y.iterator();
                while (it4.hasNext()) {
                    jSONArray4.put((String) it4.next());
                }
                jSONObject6.put(GV.f8780Y, jSONArray4);
            }
            if (ddD.f8541P != null) {
                JSONArray jSONArray5 = new JSONArray();
                Iterator it5 = ddD.f8541P.iterator();
                while (it5.hasNext()) {
                    jSONArray5.put((String) it5.next());
                }
                jSONObject6.put(GV.f8776P, jSONArray5);
            }
            String str29 = ddD.f8540L;
            if (str29 != null) {
                jSONObject6.put(GV.f8775L, str29);
            }
            jSONObject6.put(GV.FL, ddD.FL);
            String str30 = ddD.f8546ar;
            if (str30 != null) {
                jSONObject6.put(GV.f8781ar, str30);
            }
            String str31 = ddD.a2F;
            if (str31 != null) {
                jSONObject6.put(GV.a2F, str31);
            }
            jSONObject.put(str14, jSONObject6);
        }
        rKz rkz = om.IB;
        if (rkz != null) {
            String str32 = NWf.IB;
            String str33 = F6i.f8648b;
            JSONObject jSONObject7 = new JSONObject();
            String str34 = rkz.f11223b;
            if (str34 != null) {
                jSONObject7.put(F6i.f8648b, str34);
            }
            String str35 = rkz.f11222W;
            if (str35 != null) {
                jSONObject7.put(F6i.f8647W, str35);
            }
            String str36 = rkz.f11224f9;
            if (str36 != null) {
                jSONObject7.put(F6i.f8649f9, str36);
            }
            String str37 = rkz.sVU;
            if (str37 != null) {
                jSONObject7.put(F6i.sVU, str37);
            }
            String str38 = rkz.gmP;
            if (str38 != null) {
                jSONObject7.put(F6i.gmP, str38);
            }
            String str39 = rkz.f11219J;
            if (str39 != null) {
                jSONObject7.put(F6i.f8644J, str39);
            }
            String str40 = rkz.PqK;
            if (str40 != null) {
                jSONObject7.put(F6i.PqK, str40);
            }
            String str41 = rkz.f11221V;
            if (str41 != null) {
                jSONObject7.put(F6i.f8646V, str41);
            }
            String str42 = rkz.olU;
            if (str42 != null) {
                jSONObject7.put(F6i.olU, str42);
            }
            String str43 = rkz.f11220R;
            if (str43 != null) {
                jSONObject7.put(F6i.f8645R, str43);
            }
            String str44 = rkz.DOu;
            if (str44 != null) {
                jSONObject7.put(F6i.DOu, str44);
            }
            jSONObject.put(str32, jSONObject7);
        }
        Object obj7 = om.Qs;
        if (obj7 != null) {
            jSONObject.put(NWf.Qs, obj7);
        }
        Object obj8 = om.f9332E;
        if (obj8 != null) {
            jSONObject.put(NWf.f9203E, obj8);
        }
        ao aoVar = om.f9356n9;
        if (aoVar != null) {
            String str45 = NWf.f9227n9;
            String str46 = H6.f8823b;
            JSONObject jSONObject8 = new JSONObject();
            k7Q k7q = aoVar.f10114b;
            if (k7q != null) {
                jSONObject8.put(H6.f8823b, nO.b(k7q));
            }
            NnB nnB = aoVar.f10113W;
            if (nnB != null) {
                jSONObject8.put(H6.f8822W, bU.b(nnB));
            }
            jSONObject.put(str45, jSONObject8);
        }
        FzF fzF = om.f9347Y;
        if (fzF != null) {
            String str47 = NWf.f9218Y;
            String str48 = Yr.f10010b;
            JSONObject jSONObject9 = new JSONObject();
            k7Q k7q2 = fzF.f8743b;
            if (k7q2 != null) {
                jSONObject9.put(Yr.f10010b, nO.b(k7q2));
            }
            zm zmVar = fzF.f8742W;
            if (zmVar != null) {
                String str49 = Yr.f10009W;
                String str50 = d2b.f10272b;
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.put(d2b.f10272b, zmVar.f11944b);
                jSONObject10.put(d2b.f10271W, zmVar.f11943W);
                Long l13 = zmVar.f11945f9;
                if (l13 != null) {
                    jSONObject10.put(d2b.f10273f9, l13.longValue());
                }
                jSONObject9.put(str49, jSONObject10);
            }
            jSONObject.put(str47, jSONObject9);
        }
        OH oh = om.f9341P;
        if (oh != null) {
            String str51 = NWf.f9212P;
            String str52 = tuN.f11427b;
            JSONObject jSONObject11 = new JSONObject();
            k7Q k7q3 = oh.f9295b;
            if (k7q3 != null) {
                jSONObject11.put(tuN.f11427b, nO.b(k7q3));
            }
            NnB nnB2 = oh.f9294W;
            if (nnB2 != null) {
                jSONObject11.put(tuN.f11426W, bU.b(nnB2));
            }
            jSONObject.put(str51, jSONObject11);
        }
        EG7 eg7 = om.f9338L;
        if (eg7 != null) {
            jSONObject.put(NWf.f9209L, Xj.b(eg7));
        }
        gQi gqi = om.FL;
        if (gqi != null) {
            jSONObject.put(NWf.FL, lpx.b(gqi));
        }
        OME ome = om.f9349ar;
        if (ome != null) {
            jSONObject.put(NWf.f9220ar, Z6m.b(ome));
        }
        IlU ilU = om.a2F;
        if (ilU != null) {
            jSONObject.put(NWf.a2F, MB.b(ilU));
        }
        Y2r y2r = om.f9334H;
        if (y2r != null) {
            jSONObject.put(NWf.f9205H, bb.b(y2r));
        }
        K0 k02 = om.H02;
        if (k02 != null) {
            jSONObject.put(NWf.H02, v05.b(k02));
        }
        Ip7 ip7 = om.jgi;
        if (ip7 != null) {
            jSONObject.put(NWf.jgi, PYw.b(ip7));
        }
        rx4 rx4Var = om.f9337K;
        if (rx4Var != null) {
            jSONObject.put(NWf.f9208K, qss.b(rx4Var));
        }
        RUd rUd = om.qnE;
        if (rUd != null) {
            jSONObject.put(NWf.qnE, MSd.b(rUd));
        }
        jW jWVar = om.f9359s0;
        if (jWVar != null) {
            jSONObject.put(NWf.f9230s0, GfQ.b(jWVar));
        }
        JBP jbp = om.eeB;
        if (jbp != null) {
            jSONObject.put(NWf.eeB, Ink.b(jbp));
        }
        qfn qfnVar = om.Gw;
        if (qfnVar != null) {
            jSONObject.put(NWf.Gw, o3Y.b(qfnVar));
        }
        int i4 = 0;
        if (om.f9333G != null) {
            JSONArray jSONArray6 = new JSONArray();
            ArrayList arrayList = om.f9333G;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj9 = arrayList.get(i5);
                i5++;
                jSONArray6.put(Rht.b((hW4) obj9));
            }
            jSONObject.put(NWf.f9204G, jSONArray6);
        }
        bXV bxv = om.Pk;
        if (bxv != null) {
            jSONObject.put(NWf.Pk, d2i.b(bxv));
        }
        Long l14 = om.fI;
        if (l14 != null) {
            jSONObject.put(NWf.fI, l14.longValue());
        }
        Long l15 = om.WdK;
        if (l15 != null) {
            jSONObject.put(NWf.WdK, l15.longValue());
        }
        fKN fkn = om.Sn;
        if (fkn != null) {
            jSONObject.put(NWf.Sn, ES.b(fkn));
        }
        xf7 xf7Var = om.jG;
        if (xf7Var != null) {
            jSONObject.put(NWf.jG, Vx.b(xf7Var));
        }
        hCR hcr = om.oI;
        if (hcr != null) {
            jSONObject.put(NWf.oI, LxD.b(hcr));
        }
        if (om.iMc != null) {
            JSONArray jSONArray7 = new JSONArray();
            ArrayList arrayList2 = om.iMc;
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj10 = arrayList2.get(i10);
                i10++;
                jSONArray7.put(pIB.b((zhK) obj10));
            }
            jSONObject.put(NWf.iMc, jSONArray7);
        }
        gh ghVar = om.vZZ;
        if (ghVar != null) {
            jSONObject.put(NWf.vZZ, Xy.b(ghVar));
        }
        uK uKVar = om.f9354i;
        if (uKVar != null) {
            jSONObject.put(NWf.f9225i, mTX.b(uKVar));
        }
        D d4 = om.eHc;
        if (d4 != null) {
            jSONObject.put(NWf.eHc, X4G.b(d4));
        }
        SO so = om.f9344S;
        if (so != null) {
            String str53 = NWf.f9215S;
            String str54 = u24.f11439b;
            JSONObject jSONObject12 = new JSONObject();
            Long l16 = so.f9595b;
            if (l16 != null) {
                jSONObject12.put(u24.f11439b, l16.longValue());
            }
            Long l17 = so.f9594W;
            if (l17 != null) {
                jSONObject12.put(u24.f11438W, l17.longValue());
            }
            jSONObject.put(str53, jSONObject12);
        }
        Kq kq = om.mn;
        if (kq != null) {
            jSONObject.put(NWf.mn, AlL.b(kq));
        }
        fKw fkw = om.Uj;
        if (fkw != null) {
            jSONObject.put(NWf.Uj, TBu.b(fkw));
        }
        XOD xod = om.VL;
        if (xod != null) {
            jSONObject.put(NWf.VL, hc6.b(xod));
        }
        Object obj11 = om.wcf;
        if (obj11 != null) {
            jSONObject.put(NWf.wcf, obj11);
        }
        Object obj12 = om.f9339M;
        if (obj12 != null) {
            jSONObject.put(NWf.f9210M, obj12);
        }
        LA0 la0 = om.f9357r;
        if (la0 != null) {
            jSONObject.put(NWf.f9228r, Opd.b(la0));
        }
        XOw xOw = om.s1O;
        if (xOw != null) {
            jSONObject.put(NWf.s1O, hf.b(xOw));
        }
        HLa hLa = om.Lu;
        if (hLa != null) {
            jSONObject.put(NWf.Lu, ALD.b(hLa));
        }
        if (om.f9335H8 != null) {
            JSONArray jSONArray8 = new JSONArray();
            ArrayList arrayList3 = om.f9335H8;
            int size3 = arrayList3.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj13 = arrayList3.get(i11);
                i11++;
                jSONArray8.put(ff0.b((pBF) obj13));
            }
            jSONObject.put(NWf.f9206H8, jSONArray8);
        }
        Object obj14 = om.n4S;
        if (obj14 != null) {
            jSONObject.put(NWf.n4S, obj14);
        }
        hvw hvwVar = om.CM5;
        if (hvwVar != null) {
            jSONObject.put(NWf.CM5, Pej.b(hvwVar));
        }
        Zyk zyk = om.Q;
        if (zyk != null) {
            jSONObject.put(NWf.Q, Qvm.b(zyk));
        }
        Object obj15 = om.Mo1;
        if (obj15 != null) {
            jSONObject.put(NWf.Mo1, obj15);
        }
        Boolean bool = om.nK;
        if (bool != null) {
            jSONObject.put(NWf.nK, bool.booleanValue());
        }
        py pyVar = om.AL;
        if (pyVar != null) {
            jSONObject.put(NWf.AL, Gmd.b(pyVar));
        }
        Ye8 ye8 = om.OyQ;
        if (ye8 != null) {
            jSONObject.put(NWf.OyQ, u2L.b(ye8));
        }
        oVD ovd = om.f9365z;
        if (ovd != null) {
            jSONObject.put(NWf.f9236z, Unn.b(ovd));
        }
        p8 p8Var = om.C;
        if (p8Var != null) {
            jSONObject.put(NWf.C, l8M.b(p8Var));
        }
        Boolean bool2 = om.OJ;
        if (bool2 != null) {
            jSONObject.put(NWf.OJ, bool2.booleanValue());
        }
        mqI mqi = om.TF1;
        if (mqi != null) {
            jSONObject.put(NWf.TF1, WsE.b(mqi));
        }
        FCF fcf = om.mi;
        if (fcf != null) {
            jSONObject.put(NWf.mi, uXH.b(fcf));
        }
        if (om.f9351b8 != null) {
            JSONArray jSONArray9 = new JSONArray();
            Iterator it6 = om.f9351b8.iterator();
            while (it6.hasNext()) {
                jSONArray9.put(uNM.b((MM) it6.next()));
            }
            jSONObject.put(NWf.f9222b8, jSONArray9);
        }
        N6W n6w = om.nT;
        if (n6w != null) {
            jSONObject.put(NWf.nT, MXa.b(n6w));
        }
        vY vYVar = om.hod;
        if (vYVar != null) {
            jSONObject.put(NWf.hod, Fmy.b(vYVar));
        }
        Boolean bool3 = om.Ni;
        if (bool3 != null) {
            jSONObject.put(NWf.Ni, bool3.booleanValue());
        }
        Object obj16 = om.f9348Y3;
        if (obj16 != null) {
            jSONObject.put(NWf.f9219Y3, obj16);
        }
        Object obj17 = om.iM;
        if (obj17 != null) {
            jSONObject.put(NWf.iM, obj17);
        }
        Boolean bool4 = om.f9363xg;
        if (bool4 != null) {
            jSONObject.put(NWf.f9234xg, bool4.booleanValue());
        }
        Object obj18 = om.Wdw;
        if (obj18 != null) {
            jSONObject.put(NWf.Wdw, obj18);
        }
        Object obj19 = om.jQN;
        if (obj19 != null) {
            jSONObject.put(NWf.jQN, obj19);
        }
        Object obj20 = om.UhN;
        if (obj20 != null) {
            jSONObject.put(NWf.UhN, obj20);
        }
        if (om.zX != null) {
            JSONArray jSONArray10 = new JSONArray();
            ArrayList arrayList4 = om.zX;
            int size4 = arrayList4.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj21 = arrayList4.get(i12);
                i12++;
                jSONArray10.put((String) obj21);
            }
            jSONObject.put(NWf.zX, jSONArray10);
        }
        if (om.f9340O != null) {
            JSONArray jSONArray11 = new JSONArray();
            ArrayList arrayList5 = om.f9340O;
            int size5 = arrayList5.size();
            int i13 = 0;
            while (i13 < size5) {
                Object obj22 = arrayList5.get(i13);
                i13++;
                jSONArray11.put((String) obj22);
            }
            jSONObject.put(NWf.f9211O, jSONArray11);
        }
        if (om.f9364y != null) {
            JSONArray jSONArray12 = new JSONArray();
            ArrayList arrayList6 = om.f9364y;
            int size6 = arrayList6.size();
            int i14 = 0;
            while (i14 < size6) {
                Object obj23 = arrayList6.get(i14);
                i14++;
                jSONArray12.put((String) obj23);
            }
            jSONObject.put(NWf.f9235y, jSONArray12);
        }
        if (om.pTL != null) {
            JSONArray jSONArray13 = new JSONArray();
            ArrayList arrayList7 = om.pTL;
            int size7 = arrayList7.size();
            int i15 = 0;
            while (i15 < size7) {
                Object obj24 = arrayList7.get(i15);
                i15++;
                jSONArray13.put((String) obj24);
            }
            jSONObject.put(NWf.pTL, jSONArray13);
        }
        Object obj25 = om.PRS;
        if (obj25 != null) {
            jSONObject.put(NWf.PRS, obj25);
        }
        Integer num3 = om.GT;
        if (num3 != null) {
            jSONObject.put(NWf.GT, num3.intValue());
        }
        Object obj26 = om.k8u;
        if (obj26 != null) {
            jSONObject.put(NWf.k8u, obj26);
        }
        ORV orv = om.oRC;
        if (orv != null) {
            jSONObject.put(NWf.oRC, AMm.b(orv));
        }
        if (om.f9358s != null) {
            JSONArray jSONArray14 = new JSONArray();
            Iterator it7 = om.f9358s.iterator();
            while (it7.hasNext()) {
                jSONArray14.put(byU.b((zVT) it7.next()));
            }
            jSONObject.put(NWf.f9229s, jSONArray14);
        }
        P6 p62 = om.YaL;
        if (p62 != null) {
            String str55 = NWf.YaL;
            String str56 = GbW.f8794b;
            JSONObject jSONObject13 = new JSONObject();
            JSONObject jSONObject14 = new JSONObject();
            for (Map.Entry entry : p62.f9388b.entrySet()) {
                jSONObject14.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
            }
            jSONObject13.put(GbW.f8794b, jSONObject14);
            jSONObject.put(str55, jSONObject13);
        }
        if (om.Btp != null) {
            JSONArray jSONArray15 = new JSONArray();
            Iterator it8 = om.Btp.iterator();
            while (it8.hasNext()) {
                jSONArray15.put((String) it8.next());
            }
            jSONObject.put(NWf.Btp, jSONArray15);
        }
        GW gw = om.el;
        if (gw != null) {
            jSONObject.put(NWf.el, yOi.b(gw));
        }
        G4 g42 = om.j43;
        if (g42 != null) {
            jSONObject.put(NWf.j43, yq.b(g42));
        }
        Integer num4 = om.JE;
        if (num4 != null) {
            jSONObject.put(NWf.JE, num4.intValue());
        }
        if (om.f9352d != null) {
            JSONArray jSONArray16 = new JSONArray();
            for (sh shVar : om.f9352d) {
                String str57 = wJ.f11740b;
                JSONObject jSONObject15 = new JSONObject();
                jSONObject15.put(wJ.f11740b, shVar.f11317b);
                jSONObject15.put(wJ.f11739W, shVar.f11316W);
                String str58 = shVar.f11318f9;
                if (str58 != null) {
                    jSONObject15.put(wJ.f11741f9, str58);
                }
                jSONArray16.put(jSONObject15);
            }
            jSONObject.put(NWf.f9223d, jSONArray16);
        }
        if (om.f9361w != null) {
            JSONObject jSONObject16 = new JSONObject();
            for (Map.Entry entry2 : om.f9361w.entrySet()) {
                jSONObject16.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject.put(NWf.f9232w, jSONObject16);
        }
        if (om.nMp != null) {
            JSONArray jSONArray17 = new JSONArray();
            Iterator it9 = om.nMp.iterator();
            while (it9.hasNext()) {
                jSONArray17.put((String) it9.next());
            }
            jSONObject.put(NWf.nMp, jSONArray17);
        }
        N8 n82 = om.i2a;
        if (n82 != null) {
            jSONObject.put(NWf.i2a, q.b(n82));
        }
        Boolean bool5 = om.kTC;
        if (bool5 != null) {
            jSONObject.put(NWf.kTC, bool5.booleanValue());
        }
        Object obj27 = om.grA;
        if (obj27 != null) {
            jSONObject.put(NWf.grA, obj27);
        }
        Integer num5 = om.rkR;
        if (num5 != null) {
            jSONObject.put(NWf.rkR, num5.intValue());
        }
        Object obj28 = om.f9362x;
        if (obj28 != null) {
            jSONObject.put(NWf.f9233x, obj28);
        }
        Object obj29 = om.f9342P7;
        if (obj29 != null) {
            jSONObject.put(NWf.f9213P7, obj29);
        }
        Object obj30 = om.As;
        if (obj30 != null) {
            jSONObject.put(NWf.As, obj30);
        }
        Boolean bool6 = om.gG;
        if (bool6 != null) {
            jSONObject.put(NWf.gG, bool6.booleanValue());
        }
        if (om.sA != null) {
            JSONArray jSONArray18 = new JSONArray();
            Iterator it10 = om.sA.iterator();
            while (it10.hasNext()) {
                jSONArray18.put(asQ.b((Z1e) it10.next()));
            }
            jSONObject.put(NWf.sA, jSONArray18);
        }
        if (om.Hz != null) {
            JSONArray jSONArray19 = new JSONArray();
            Iterator it11 = om.Hz.iterator();
            while (it11.hasNext()) {
                jSONArray19.put(jKj.b((Ve) it11.next()));
            }
            jSONObject.put(NWf.Hz, jSONArray19);
        }
        Object obj31 = om.f9360u;
        if (obj31 != null) {
            jSONObject.put(NWf.f9231u, obj31);
        }
        if (om.lCi != null) {
            JSONArray jSONArray20 = new JSONArray();
            Iterator it12 = om.lCi.iterator();
            while (it12.hasNext()) {
                jSONArray20.put(Yyr.b((s8) it12.next()));
            }
            jSONObject.put(NWf.lCi, jSONArray20);
        }
        if (om.f9355k != null) {
            JSONArray jSONArray21 = new JSONArray();
            ArrayList arrayList8 = om.f9355k;
            int size8 = arrayList8.size();
            while (i4 < size8) {
                Object obj32 = arrayList8.get(i4);
                i4++;
                c7p c7pVar = (c7p) obj32;
                String str59 = M9r.f9104b;
                JSONObject jSONObject17 = new JSONObject();
                jSONObject17.put(M9r.f9104b, c7pVar.f10225b);
                jSONObject17.put(M9r.f9103W, c7pVar.f10224W);
                jSONArray21.put(jSONObject17);
            }
            jSONObject.put(NWf.f9226k, jSONArray21);
        }
        Object obj33 = om.bCl;
        if (obj33 != null) {
            jSONObject.put(NWf.bCl, obj33);
        }
        if (jSONObject.length() > 0) {
            jSONObject.put(f8364J, this.f8367b);
            String str60 = PqK;
            List list = this.f8368f9;
            Ej ej = Ej.f8625b;
            JSONArray jSONArray22 = new JSONArray();
            Iterator it13 = list.iterator();
            while (it13.hasNext()) {
                jSONArray22.put(ej.invoke(it13.next()));
            }
            jSONObject.put(str60, jSONArray22);
            jSONObject.put(f8365V, this.sVU);
            String str61 = olU;
            String str62 = pdK.f11086b;
            jNy jny = this.gmP;
            JSONObject jSONObject18 = new JSONObject();
            jSONObject18.put(pdK.f11086b, jny.f10683b);
            jSONObject18.put(pdK.f11085W, jny.f10682W);
            Object obj34 = jny.f10684f9;
            if (obj34 != null) {
                jSONObject18.put(pdK.f11087f9, obj34);
            }
            Long l18 = jny.sVU;
            if (l18 != null) {
                jSONObject18.put(pdK.sVU, l18.longValue());
            }
            Long l19 = jny.gmP;
            if (l19 != null) {
                jSONObject18.put(pdK.gmP, l19.longValue());
            }
            if (jny.f10681J != null) {
                JSONArray jSONArray23 = new JSONArray();
                for (C3K c3k : jny.f10681J) {
                    String str63 = uVa.f11476b;
                    JSONObject jSONObject19 = new JSONObject();
                    jSONObject19.put(uVa.f11476b, c3k.f8434b);
                    Long l20 = c3k.f8433W;
                    if (l20 != null) {
                        jSONObject19.put(uVa.f11475W, l20.longValue());
                    }
                    Long l21 = c3k.f8435f9;
                    if (l21 != null) {
                        jSONObject19.put(uVa.f11477f9, l21.longValue());
                    }
                    Long l22 = c3k.sVU;
                    if (l22 != null) {
                        jSONObject19.put(uVa.sVU, l22.longValue());
                    }
                    jSONArray23.put(jSONObject19);
                }
                jSONObject18.put(pdK.f11084J, jSONArray23);
            }
            jSONObject.put(str61, jSONObject18);
            return jSONObject;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AZ)) {
            return false;
        }
        AZ az = (AZ) obj;
        if (Intrinsics.areEqual(this.f8367b, az.f8367b) && Intrinsics.areEqual(this.f8366W, az.f8366W) && Intrinsics.areEqual(this.f8368f9, az.f8368f9) && this.sVU == az.sVU && Intrinsics.areEqual(this.gmP, az.gmP)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.gmP.hashCode() + lci.b(this.sVU, j.golf((this.f8366W.hashCode() + (this.f8367b.hashCode() * 31)) * 31, 31, this.f8368f9), 31);
    }
}
