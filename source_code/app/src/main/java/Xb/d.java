package Xb;

import Fb.j;
import H9.m;
import Sb.k;
import Xd.l;
import android.app.Application;
import androidx.lifecycle.az;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import io.reactivex.Single;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import r3.C2492a;
import s6.W4;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements l {
    public final /* synthetic */ LinkedHashMap A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ AllAddressNoteViewModel C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ long f2253D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ az f2254E;
    public RequestBody alpha;
    public RequestBody purple;
    public RequestBody red;

    /* renamed from: s, reason: collision with root package name */
    public AllAddressNoteViewModel f2255s;
    public RequestBody silver;

    /* renamed from: t, reason: collision with root package name */
    public int f2256t;
    public RequestBody teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2257u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2258v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f2259w;
    public RequestBody white;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Double f2260x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Double f2261y;
    public RequestBody yellow;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f2262z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i4, int i5, String str, Double d4, Double d9, String str2, LinkedHashMap linkedHashMap, ArrayList arrayList, AllAddressNoteViewModel allAddressNoteViewModel, long j5, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.f2257u = i4;
        this.f2258v = i5;
        this.f2259w = str;
        this.f2260x = d4;
        this.f2261y = d9;
        this.f2262z = str2;
        this.A = linkedHashMap;
        this.B = arrayList;
        this.C = allAddressNoteViewModel;
        this.f2253D = j5;
        this.f2254E = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        az azVar = this.f2254E;
        return new d(this.f2257u, this.f2258v, this.f2259w, this.f2260x, this.f2261y, this.f2262z, this.A, this.B, this.C, this.f2253D, azVar, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.List, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [F9.j] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        az azVar;
        String str;
        az azVar2;
        String str2;
        RequestBody create;
        String str3;
        RequestBody create2;
        String str4;
        RequestBody create3;
        String str5;
        RequestBody requestBody;
        String str6;
        RequestBody requestBody2;
        RequestBody create4;
        String str7;
        RequestBody create5;
        ArrayList arrayList;
        RequestBody requestBody3;
        RequestBody requestBody4;
        RequestBody requestBody5;
        RequestBody requestBody6;
        MultipartBody.Part[] partArr;
        Object mike;
        RequestBody requestBody7;
        RequestBody requestBody8;
        AllAddressNoteViewModel allAddressNoteViewModel;
        String onHandleError;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f2256t;
        ?? r13 = this.f2254E;
        AllAddressNoteViewModel allAddressNoteViewModel2 = this.C;
        try {
        } catch (Exception e) {
            e = e;
            azVar = r13;
        }
        if (i4 != 0) {
            if (i4 == 1) {
                AllAddressNoteViewModel allAddressNoteViewModel3 = this.f2255s;
                requestBody7 = this.yellow;
                create4 = this.white;
                RequestBody requestBody9 = this.teal;
                RequestBody requestBody10 = this.silver;
                RequestBody requestBody11 = this.red;
                RequestBody requestBody12 = this.purple;
                requestBody8 = this.alpha;
                ResultKt.alpha(obj);
                str3 = "attachments[";
                create2 = requestBody12;
                str4 = "image/*";
                create3 = requestBody11;
                str6 = "upload";
                str5 = "fileLabel";
                str7 = "toString(...)";
                requestBody2 = requestBody9;
                requestBody = requestBody10;
                str2 = Constants.AES_SUFFIX;
                allAddressNoteViewModel = allAddressNoteViewModel3;
                azVar2 = r13;
                mike = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            RequestBody.Companion companion = RequestBody.INSTANCE;
            String valueOf = String.valueOf(this.f2257u);
            azVar2 = r13;
            try {
                MediaType.Companion companion2 = MediaType.INSTANCE;
                str2 = Constants.AES_SUFFIX;
                create = companion.create(valueOf, companion2.get("text/plain"));
                str3 = "attachments[";
                create2 = companion.create(String.valueOf(this.f2258v), companion2.get("text/plain"));
                str4 = "image/*";
                create3 = companion.create(this.f2259w, companion2.get("text/plain"));
                String d4 = this.f2260x.toString();
                str5 = "fileLabel";
                if (d4 != null) {
                    requestBody = companion.create(d4, companion2.get("text/plain"));
                } else {
                    requestBody = null;
                }
                String d9 = this.f2261y.toString();
                if (d9 != null) {
                    str6 = "upload";
                    requestBody2 = companion.create(d9, companion2.get("text/plain"));
                } else {
                    str6 = "upload";
                    requestBody2 = null;
                }
                create4 = companion.create(this.f2262z, companion2.get("text/plain"));
                LinkedHashMap linkedHashMap = this.A;
                JSONObject jSONObject = new JSONObject();
                for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                RequestBody.Companion companion3 = RequestBody.INSTANCE;
                String jSONObject2 = jSONObject.toString();
                Intrinsics.delta(jSONObject2, "toString(...)");
                str7 = "toString(...)";
                create5 = companion3.create(jSONObject2, MediaType.INSTANCE.get("application/json"));
                arrayList = this.B;
            } catch (Exception e4) {
                e = e4;
                str = Constants.KEY_MSG;
                azVar = azVar2;
                String onHandleError2 = allAddressNoteViewModel2.onHandleError(e);
                Intrinsics.echo(onHandleError2, str);
                azVar.postValue(new C2492a(0, onHandleError2));
                return Unit.INSTANCE;
            }
            if (arrayList != null) {
                Application context = allAddressNoteViewModel2.getApplication();
                Intrinsics.echo(context, "context");
                Application context2 = allAddressNoteViewModel2.getApplication();
                Intrinsics.echo(context2, "context");
                arrayList.size();
                c cVar = new c(arrayList, allAddressNoteViewModel2, null);
                this.alpha = create;
                this.purple = create2;
                this.red = create3;
                this.silver = requestBody;
                this.teal = requestBody2;
                this.white = create4;
                this.yellow = create5;
                this.f2255s = allAddressNoteViewModel2;
                this.f2256t = 1;
                mike = ad.mike(cVar, this);
                if (mike == aVar) {
                    return aVar;
                }
                requestBody7 = create5;
                requestBody8 = create;
                allAddressNoteViewModel = allAddressNoteViewModel2;
            } else {
                requestBody3 = create5;
                requestBody4 = requestBody2;
                requestBody5 = requestBody;
                requestBody6 = create4;
                partArr = null;
                try {
                    Single<ResponseBody> papa = allAddressNoteViewModel2.alpha.papa(create, create2, create3, requestBody5, requestBody4, requestBody6, requestBody3, this.f2253D, partArr);
                    azVar = azVar2;
                } catch (Exception e5) {
                    e = e5;
                    azVar = azVar2;
                }
                try {
                    Intrinsics.checkNotNull(papa.subscribe(new X9.f(1, new j(azVar, 18)), new X9.f(2, new a(azVar, allAddressNoteViewModel2, 0))));
                } catch (Exception e10) {
                    e = e10;
                    try {
                        I9.c.alpha();
                        onHandleError = allAddressNoteViewModel2.onHandleError(e);
                        str = Constants.KEY_MSG;
                    } catch (Exception e11) {
                        e = e11;
                        str = Constants.KEY_MSG;
                        String onHandleError22 = allAddressNoteViewModel2.onHandleError(e);
                        Intrinsics.echo(onHandleError22, str);
                        azVar.postValue(new C2492a(0, onHandleError22));
                        return Unit.INSTANCE;
                    }
                    try {
                        Intrinsics.echo(onHandleError, str);
                        azVar.postValue(new C2492a(0, onHandleError));
                    } catch (Exception e12) {
                        e = e12;
                        String onHandleError222 = allAddressNoteViewModel2.onHandleError(e);
                        Intrinsics.echo(onHandleError222, str);
                        azVar.postValue(new C2492a(0, onHandleError222));
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        List p4 = CollectionsKt.p((Iterable) mike, new k(6));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(p4, 10);
        r13 = new ArrayList(collectionSizeOrDefault);
        Iterator it2 = p4.iterator();
        while (it2.hasNext()) {
            r13.add((File) ((Pair) it2.next()).getSecond());
        }
        Iterator it3 = r13.iterator();
        RequestBody requestBody13 = create2;
        RequestBody requestBody14 = create3;
        long j5 = 0;
        while (it3.hasNext()) {
            j5 += ((File) it3.next()).length();
        }
        I9.b.foxtrot(allAddressNoteViewModel.getApplication(), "address_note", "validation");
        I9.b.alpha(allAddressNoteViewModel.getApplication(), "address_note", "validation");
        m charlie = ((F9.j) allAddressNoteViewModel.delta).charlie(r13);
        RequestBody requestBody15 = requestBody2;
        if (!(charlie instanceof H9.k)) {
            new Long(j5);
            new Long(10485760L);
            I9.c.foxtrot.set(Boolean.TRUE);
            String uuid = UUID.randomUUID().toString();
            Intrinsics.delta(uuid, str7);
            r13.size();
            I9.c.alpha.set(uuid);
            String str8 = str6;
            I9.b.foxtrot(allAddressNoteViewModel.getApplication(), "address_note", str8);
            I9.b.alpha(allAddressNoteViewModel.getApplication(), "address_note", str8);
            if (((File) CollectionsKt.green(r13)) != null) {
                Application context3 = allAddressNoteViewModel.getApplication();
                Intrinsics.echo(context3, "context");
            }
            I9.c.delta(System.currentTimeMillis());
            try {
                Iterator it4 = r13.iterator();
                int i5 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i10 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    File file = (File) next;
                    RequestBody requestBody16 = requestBody8;
                    new Long(file.length());
                    String str9 = str5;
                    Intrinsics.echo("address_note_" + i5, str9);
                    if (!file.exists()) {
                        file.getAbsolutePath();
                        Intrinsics.echo("address_note_" + i5, str9);
                    } else if (!file.canRead()) {
                        file.getAbsolutePath();
                        Intrinsics.echo("address_note_" + i5, str9);
                    }
                    str5 = str9;
                    i5 = i10;
                    requestBody8 = requestBody16;
                }
                RequestBody requestBody17 = requestBody8;
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(r13, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                Iterator it5 = r13.iterator();
                int i11 = 0;
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    File file2 = (File) next2;
                    String str10 = str4;
                    RequestBody create6 = RequestBody.INSTANCE.create(file2, MediaType.INSTANCE.parse(str10));
                    create6.contentLength();
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it6 = it5;
                    String str11 = str3;
                    sb2.append(str11);
                    sb2.append(i11);
                    String str12 = str2;
                    sb2.append(str12);
                    String partName = sb2.toString();
                    file2.getName();
                    Intrinsics.echo(partName, "partName");
                    arrayList2.add(MultipartBody.Part.INSTANCE.createFormData(str11 + i11 + str12, file2.getName(), create6));
                    str3 = str11;
                    i11 = i12;
                    it5 = it6;
                    str2 = str12;
                    str4 = str10;
                }
                MultipartBody.Part[] partArr2 = (MultipartBody.Part[]) arrayList2.toArray(new MultipartBody.Part[0]);
                ArrayList arrayList3 = new ArrayList();
                Iterator it7 = r13.iterator();
                int i13 = 0;
                while (it7.hasNext()) {
                    Object next3 = it7.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ThreadLocal threadLocal = I9.c.alpha;
                    Long bravo = I9.c.bravo("address_note_" + i13);
                    if (bravo != null) {
                        arrayList3.add(bravo);
                    }
                    i13 = i14;
                }
                Iterator it8 = r13.iterator();
                int i15 = 0;
                while (it8.hasNext()) {
                    Object next4 = it8.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ThreadLocal threadLocal2 = I9.c.alpha;
                    I9.c.charlie(((File) next4).length(), "address_note_" + i15);
                    i15 = i16;
                }
                r13.size();
                create2 = requestBody13;
                requestBody5 = requestBody;
                requestBody3 = requestBody7;
                requestBody6 = create4;
                create3 = requestBody14;
                create = requestBody17;
                requestBody4 = requestBody15;
                partArr = partArr2;
                Single<ResponseBody> papa2 = allAddressNoteViewModel2.alpha.papa(create, create2, create3, requestBody5, requestBody4, requestBody6, requestBody3, this.f2253D, partArr);
                azVar = azVar2;
                Intrinsics.checkNotNull(papa2.subscribe(new X9.f(1, new j(azVar, 18)), new X9.f(2, new a(azVar, allAddressNoteViewModel2, 0))));
                return Unit.INSTANCE;
            } catch (Exception e13) {
                I9.c.alpha();
                throw e13;
            }
        }
        r13.size();
        new Long(j5);
        new Long(10485760L);
        ((H9.k) charlie).alpha.toString();
        throw new Exception(W4.alpha(allAddressNoteViewModel.getApplication(), ((H9.k) charlie).alpha));
    }
}
