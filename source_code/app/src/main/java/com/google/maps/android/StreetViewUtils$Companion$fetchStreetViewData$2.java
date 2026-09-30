package com.google.maps.android;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import av.q;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2734o6;
import vf.ab;

@e(c = "com.google.maps.android.StreetViewUtils$Companion$fetchStreetViewData$2", f = "StreetViewUtil.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "Lcom/google/maps/android/Status;", "<anonymous>", "(Lvf/ab;)Lcom/google/maps/android/Status;"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes2.dex */
public final class StreetViewUtils$Companion$fetchStreetViewData$2 extends i implements l {
    final /* synthetic */ String $urlString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreetViewUtils$Companion$fetchStreetViewData$2(String str, c<? super StreetViewUtils$Companion$fetchStreetViewData$2> cVar) {
        super(2, cVar);
        this.$urlString = str;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new StreetViewUtils$Companion$fetchStreetViewData$2(this.$urlString, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        ResponseStreetView deserializeResponse;
        a aVar = a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.$urlString).openConnection());
                Intrinsics.charlie(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    try {
                        String delta = AbstractC2734o6.delta(bufferedReader);
                        bufferedReader.close();
                        bufferedReader.close();
                        inputStream.close();
                        deserializeResponse = StreetViewUtils.INSTANCE.deserializeResponse(delta);
                        return deserializeResponse.getStatus();
                    } finally {
                    }
                } else {
                    throw new IOException("HTTP Error: " + responseCode);
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new IOException(q.echo("Network error: ", e.getMessage()));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Status> cVar) {
        return ((StreetViewUtils$Companion$fetchStreetViewData$2) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
