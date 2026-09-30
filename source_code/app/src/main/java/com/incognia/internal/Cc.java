package com.incognia.internal;

import Ld.j;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.io.FilesKt;
import kotlin.k;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cc {

    /* renamed from: f9, reason: collision with root package name */
    public static final List f8461f9 = CollectionsKt.listOf((String) wGk.l4b.getValue(), (String) wGk.SM6.getValue(), (String) wGk.f11704m6.getValue(), (String) wGk.PCv.getValue(), (String) wGk.f11610C1.getValue(), (String) wGk.KVb.getValue(), (String) wGk.V9r.getValue(), (String) wGk.YX.getValue());
    public static final String sVU = (String) wGk.jm.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final FW f8462W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f8463b;

    public Cc(S0A s0a, FW fw) {
        this.f8463b = s0a;
        this.f8462W = fw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Set b() {
        kotlin.collections.u uVar;
        LinkedHashSet C;
        j jVar;
        String str;
        Context context;
        boolean optBoolean = ((JSONObject) this.f8463b.f9574b.get()).optBoolean((String) wGk.roT.getValue(), true);
        kotlin.collections.u uVar2 = kotlin.collections.u.alpha;
        if (!optBoolean) {
            return uVar2;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            S0A s0a = this.f8463b;
            String str2 = (String) wGk.Ez.getValue();
            List list = f8461f9;
            C = CollectionsKt.C(s0a.b(str2, list));
            if (((JSONObject) this.f8463b.f9574b.get()).optBoolean((String) wGk.cPl.getValue(), false)) {
                C.addAll(list);
            }
            jVar = new j();
            try {
                context = OQ.f9304b;
            } catch (Throwable unused) {
                str = null;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            uVar = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (context != null) {
            String packageName = context.getPackageName();
            this.f8462W.getClass();
            str = ((Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data") + '/' + packageName) + sVU;
            if (str != null) {
                jVar.add(new File(str, (String) wGk.IH4.getValue()).getAbsolutePath());
                Iterator it = C.iterator();
                while (it.hasNext()) {
                    jVar.add(new File(str, ((String) wGk.IH4.getValue()) + File.separator + ((String) it.next())).getAbsolutePath());
                }
            }
            File lima = FilesKt.lima(Environment.getExternalStorageDirectory(), (String) wGk.lE.getValue());
            jVar.add(new File(lima, (String) wGk.IH4.getValue()).getAbsolutePath());
            Iterator it2 = C.iterator();
            while (it2.hasNext()) {
                jVar.add(new File(lima, ((String) wGk.IH4.getValue()) + File.separator + ((String) it2.next())).getAbsolutePath());
            }
            uVar = Result.m206constructorimpl(ab.bravo(jVar));
            if (!(uVar instanceof k)) {
                uVar2 = uVar;
            }
            return uVar2;
        }
        throw new NullPointerException("Using SDK context before initialization");
    }
}
